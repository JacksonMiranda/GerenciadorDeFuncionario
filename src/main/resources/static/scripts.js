const apiUrl = 'http://localhost:8080/api/funcionarios';

async function inserirTodosFuncionarios() {
    await fetch(apiUrl + '/inserir-todos', {
        method: 'POST'
    });
    alert("Funcionários inseridos com sucesso!");
    getAllFuncionarios();
}

async function removerFuncionario() {
    const nome = "João";
    await fetch(`${apiUrl}/${nome}`, {
        method: 'DELETE'
    });
    alert("Funcionário removido com sucesso!");
    getAllFuncionarios();
}

async function getAllFuncionarios() {
    const response = await fetch(apiUrl);
    const data = await response.json();
    displayFuncionarios(data);
}

async function aplicarAumento() {
    await fetch(apiUrl + '/aumento', {
        method: 'POST'
    });
    alert("Aumento de 10% aplicado com sucesso!");
    getAllFuncionarios();
}

async function agruparPorFuncao() {
    const response = await fetch(apiUrl + '/agrupados');
    const data = await response.json();
    displayFuncionariosAgrupados(data);
}

async function getAniversariantes() {
    const response = await fetch(apiUrl + '/aniversariantes?meses=10&meses=12');
    const data = await response.json();
    displayFuncionarios(data);
}

async function getFuncionarioMaisVelho() {
    const response = await fetch(apiUrl + '/mais-velho');
    const data = await response.json();
    displayFuncionarioMaisVelho(data);
}

async function getTotalSalarios() {
    const response = await fetch(apiUrl + '/total-salarios');
    const data = await response.text();
    document.getElementById('result').innerHTML = `<h3>Total dos Salários: R$ ${formatCurrency(data)}</h3>`;
}

async function getFuncionariosOrdemAlfabetica() {
    const response = await fetch(apiUrl + '/ordem-alfabetica');
    const data = await response.json();
    displayFuncionarios(data);
}

async function getSalariosMinimos() {
    const response = await fetch(apiUrl + '/salarios-minimos');
    const data = await response.json();
    displaySalariosMinimos(data);
}

function displayFuncionarios(data) {
    let table = `<table>
                    <tr>
                        <th>Nome</th>
                        <th>Data Nascimento</th>
                        <th>Salário</th>
                        <th>Função</th>
                    </tr>`;
    data.forEach(func => {
        table += `<tr>
                    <td>${func.nome}</td>
                    <td>${formatDate(func.dataNascimento)}</td>
                    <td>${formatCurrency(func.salario)}</td>
                    <td>${func.funcao}</td>
                  </tr>`;
    });
    table += `</table>`;
    document.getElementById('result').innerHTML = table;
}

function displayFuncionariosAgrupados(data) {
    let table = `<table>
                    <tr>
                        <th>Função</th>
                        <th>Nome</th>
                        <th>Data Nascimento</th>
                        <th>Salário</th>
                    </tr>`;
    for (const [funcao, funcs] of Object.entries(data)) {
        funcs.forEach(func => {
            table += `<tr>
                        <td>${funcao}</td>
                        <td>${func.nome}</td>
                        <td>${formatDate(func.dataNascimento)}</td>
                        <td>${formatCurrency(func.salario)}</td>
                      </tr>`;
        });
    }
    table += `</table>`;
    document.getElementById('result').innerHTML = table;
}

function displayFuncionarioMaisVelho(func) {
    let table = `<table>
                    <tr>
                        <th>Nome</th>
                        <th>Idade</th>
                    </tr>
                    <tr>
                        <td>${func.nome}</td>
                        <td>${calculateAge(func.dataNascimento)}</td>
                    </tr>
                </table>`;
    document.getElementById('result').innerHTML = table;
}

function displaySalariosMinimos(data) {
    let table = `<table>
                    <tr>
                        <th>Nome</th>
                        <th>Salários Mínimos</th>
                    </tr>`;
    data.forEach(item => {
        table += `<tr>
                    <td>${item.nome}</td>
                    <td>${item.salariosMinimos.toFixed(2)}</td>
                  </tr>`;
    });
    table += `</table>`;
    document.getElementById('result').innerHTML = table;
}

function formatDate(date) {
    const [year, month, day] = date.split('-');
    return `${day}/${month}/${year}`;
}

function formatCurrency(value) {
    return parseFloat(value).toLocaleString('de-DE', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
}

function calculateAge(birthDate) {
    const birth = new Date(birthDate);
    const now = new Date();
    let age = now.getFullYear() - birth.getFullYear();
    const m = now.getMonth() - birth.getMonth();
    if (m < 0 || (m === 0 && now.getDate() < birth.getDate())) {
        age--;
    }
    return age;
}
