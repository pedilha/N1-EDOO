package br.com.aula;
import br.com.aula.No;
import br.com.aula.Paciente;

public class Pilha {
    private No topo;

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(Paciente paciente) {
        No novoNo = new No(paciente);
        if (!estaVazia()) {
            novoNo.setProximo(topo);
        }
        topo = novoNo;
    }

    public Paciente desempilhar() {
        if (estaVazia()) {
            return null;
        }
        Paciente pacienteAtendido = topo.getPaciente();
        topo = topo.getProximo();
        return pacienteAtendido;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getPaciente());
            atual = atual.getProximo();
        }
    }
}