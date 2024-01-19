package io.github.j1vctr.quarkussocial.rest.dto;

public class CreateUserRequest {
    private String nome;
    private Integer idade;

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return idade;
    }

    public void setAge(Integer idade) {
        this.idade = idade;
    }
}
