

package br.com.aula;

public class Paciente {
    private String nome;
    private int id;
    private static int proximoId = 1;

    public Paciente(String nome) {
        this.nome = nome;
        this.id = proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Paciente {ID: " + id + ", Nome: '" + nome + "'}";
    }
}