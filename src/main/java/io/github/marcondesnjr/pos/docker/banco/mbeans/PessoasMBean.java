/*
 * 
 */
package io.github.marcondesnjr.pos.docker.banco.mbeans;

import io.github.marcondesnjr.pos.docker.banco.entidade.Pessoa;
import io.github.marcondesnjr.pos.docker.banco.jdbc.PessoaRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
@Named(value = "pessoasMBean")
@RequestScoped
public class PessoasMBean {
    
    private String nome;
    private String cpf;
    
    private List<Pessoa> pessoas;
    @Inject
    private PessoaRepository pessoaRepository;
    
    /**
     * Creates a new instance of PessoasMBean
     */
    public PessoasMBean() {
        
    }
    
    @PostConstruct
    private void init(){
        this.pessoas = this.pessoaRepository.readAll();
    }
   
    
    public List<Pessoa> getPessoasCadastradas(){
        return this.pessoas;
    }
    
    public void cadastrarPessoa(){
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setCpf(cpf);
        this.pessoaRepository.create(p);
        update();
        this.nome="";
        this.cpf="";
    }
    
    public void deletarPessoa(Pessoa p){
        pessoaRepository.delete(p);
        update();
    }
    
    public void update(){
        init();
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

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public PessoaRepository getPessoaRepository() {
        return pessoaRepository;
    }

    public void setPessoaRepository(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    
    
    
}
