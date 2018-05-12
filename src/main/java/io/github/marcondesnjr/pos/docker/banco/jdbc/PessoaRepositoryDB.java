
package io.github.marcondesnjr.pos.docker.banco.jdbc;

import io.github.marcondesnjr.pos.docker.banco.entidade.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class PessoaRepositoryDB implements PessoaRepository{

    @Inject
    private DataSource dataSource;
    private QueryRunner qr;
    
    @PostConstruct
    public void init(){
        qr = new QueryRunner(dataSource);
    }
    
    
    
    public PessoaRepositoryDB() {       
        
    }
    
    
    @Override
    public List<Pessoa> readAll(){
        String sql = "SELECT * FROM PESSOA";
        List<Pessoa> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<>(Pessoa.class));
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepositoryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Pessoa create(Pessoa p) {
        String sql = "INSERT INTO PESSOA(nome,cpf) VALUES (?,?)";
        Pessoa pessoa = null;
        try {
            pessoa = qr.insert(sql, new BeanHandler<>(Pessoa.class),p.getNome(),p.getCpf());
        } catch (SQLException ex) {
            Logger.getLogger(PessoaRepositoryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }
    
}
