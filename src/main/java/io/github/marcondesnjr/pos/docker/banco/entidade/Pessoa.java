
package io.github.marcondesnjr.pos.docker.banco.entidade;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
