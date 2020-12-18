const Cliente = require('../models/cliente');

test('Propriedades da classe de cliente', () => {
    let cliente = new Cliente(1, "Danilo",  "418.825.350-90")
    expect(cliente.id).toBe(1);
    expect(cliente.nome).toBe("Danilo");
    expect(cliente.cpf).toBe("418.825.350-90");
});

test('Testando validação de CPF, válido', () => {
    let cliente = new Cliente()
    cliente.cpf = "418.825.350-90"
    expect(cliente.validarCPF()).toBe(true);
});

test('Testando validação de CPF, inválido', () => {
    let cliente = new Cliente()
    cliente.cpf = "418.825.350-10"
    expect(cliente.validarCPF()).toBe(false);
});

test('Testando cpf undefined', () => {
    let cliente = new Cliente()
    cliente.cpf = undefined
    expect(cliente.validarCPF()).toBe(false);
});

test('Testando cpf 11111111111', () => {
    let cliente = new Cliente()
    cliente.cpf = "11111111111"
    expect(cliente.validarCPF()).toBe(false);
});

test('Testando cpf maior que 11 caracteres 111111111111', () => {
    let cliente = new Cliente()
    cliente.cpf = "111111111111"
    expect(cliente.validarCPF()).toBe(false);
});

