package br.com.aula;

public class Fila {
    private No inicio;
    private No fim;

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(Paciente paciente) {
        No novoNo = new No(paciente);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public Paciente desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Paciente pacienteAtendido = inicio.getPaciente();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return pacienteAtendido;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.getPaciente());
            atual = atual.getProximo();
        }
    }
}