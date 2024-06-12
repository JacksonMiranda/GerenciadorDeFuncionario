package com.example.myapp.service;

import com.example.myapp.model.Funcionario;
import com.example.myapp.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {
    private static final BigDecimal SALARIO_MINIMO = new BigDecimal("1212.00");

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getAll() {
        return repository.findAll();
    }

    public void addFuncionario(Funcionario funcionario) {
        if (repository.findByNome(funcionario.getNome()) == null) {
            repository.save(funcionario);
        }
    }

    public void inserirTodosFuncionarios() {
        List<Funcionario> funcionarios = List.of(
            new Funcionario("Maria", LocalDate.parse("2000-10-18"), new BigDecimal("2009.44"), "Operador"),
            new Funcionario("João", LocalDate.parse("1990-05-12"), new BigDecimal("2284.38"), "Operador"),
            new Funcionario("Caio", LocalDate.parse("1961-05-02"), new BigDecimal("9836.14"), "Coordenador"),
            new Funcionario("Miguel", LocalDate.parse("1988-10-14"), new BigDecimal("19119.88"), "Diretor"),
            new Funcionario("Alice", LocalDate.parse("1995-01-05"), new BigDecimal("2234.68"), "Recepcionista"),
            new Funcionario("Heitor", LocalDate.parse("1999-11-19"), new BigDecimal("1582.72"), "Operador"),
            new Funcionario("Arthur", LocalDate.parse("1993-03-31"), new BigDecimal("4071.84"), "Contador"),
            new Funcionario("Laura", LocalDate.parse("1994-07-08"), new BigDecimal("3017.45"), "Gerente"),
            new Funcionario("Heloísa", LocalDate.parse("2003-05-24"), new BigDecimal("1606.85"), "Eletricista"),
            new Funcionario("Helena", LocalDate.parse("1996-09-02"), new BigDecimal("2799.93"), "Gerente")
        );
        for (Funcionario funcionario : funcionarios) {
            if (repository.findByNome(funcionario.getNome()) == null) {
                repository.save(funcionario);
            }
        }
    }

    public void deleteFuncionario(String nome) {
        repository.deleteByName(nome);
    }

    public void aplicarAumento() {
        BigDecimal aumento = new BigDecimal("0.10");
        repository.findAll().forEach(f -> f.setSalario(f.getSalario().multiply(BigDecimal.ONE.add(aumento))));
    }

    public Map<String, List<Funcionario>> agruparPorFuncao() {
        return repository.findAll().stream().collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public List<Funcionario> getAniversariantes(int... meses) {
        List<Integer> listaMeses = Arrays.stream(meses).boxed().collect(Collectors.toList());
        return repository.findAll().stream()
                .filter(f -> listaMeses.contains(f.getDataNascimento().getMonthValue()))
                .collect(Collectors.toList());
    }

    public Funcionario getFuncionarioMaisVelho() {
        return repository.findAll().stream()
                .min((f1, f2) -> f1.getDataNascimento().compareTo(f2.getDataNascimento()))
                .orElse(null);
    }

    public BigDecimal getTotalSalarios() {
        return repository.findAll().stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<Funcionario> getFuncionariosOrdemAlfabetica() {
        return repository.findAll().stream()
                .sorted((f1, f2) -> f1.getNome().compareToIgnoreCase(f2.getNome()))
                .collect(Collectors.toList());
    }


    public List<Map<String, Object>> getSalariosMinimos() {
        return repository.findAll().stream()
                .map(f -> {
                    Map<String, Object> map = Map.of(
                            "nome", f.getNome(),
                            "salariosMinimos", f.getSalario().divide(SALARIO_MINIMO, 2, BigDecimal.ROUND_HALF_EVEN)
                    );
                    return map;
                })
                .collect(Collectors.toList());
    }
}
