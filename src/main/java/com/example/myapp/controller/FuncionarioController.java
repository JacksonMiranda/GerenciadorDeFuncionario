package com.example.myapp.controller;

import com.example.myapp.model.Funcionario;
import com.example.myapp.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<Funcionario> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario funcionario) {
        service.addFuncionario(funcionario);
    }

    @PostMapping("/inserir-todos")
    public void inserirTodosFuncionarios() {
        service.inserirTodosFuncionarios();
    }

    @DeleteMapping("/{nome}")
    public void deleteFuncionario(@PathVariable String nome) {
        service.deleteFuncionario(nome);
    }

    @PostMapping("/aumento")
    public void aplicarAumento() {
        service.aplicarAumento();
    }

    @GetMapping("/agrupados")
    public Map<String, List<Funcionario>> agruparPorFuncao() {
        return service.agruparPorFuncao();
    }

    @GetMapping("/aniversariantes")
    public List<Funcionario> getAniversariantes(@RequestParam("meses") List<Integer> meses) {
        return service.getAniversariantes(meses.stream().mapToInt(Integer::intValue).toArray());
    }

    @GetMapping("/mais-velho")
    public Funcionario getFuncionarioMaisVelho() {
        return service.getFuncionarioMaisVelho();
    }

    @GetMapping("/total-salarios")
    public BigDecimal getTotalSalarios() {
        return service.getTotalSalarios();
    }

    @GetMapping("/ordem-alfabetica")
    public List<Funcionario> getFuncionariosOrdemAlfabetica() {
        return service.getFuncionariosOrdemAlfabetica();
    }

    @GetMapping("/salarios-minimos")
    public List<Map<String, Object>> getSalariosMinimos() {
        return service.getSalariosMinimos();
    }
}
