/*
 * 
 */
package io.github.marcondesnjr.pos.docker.banco.jdbc;

import io.github.marcondesnjr.pos.docker.banco.entidade.Pessoa;
import java.util.List;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public interface PessoaRepository {
    
    public List<Pessoa> readAll();
    public Pessoa create(Pessoa p);
    public void delete(Pessoa p);
    
}
