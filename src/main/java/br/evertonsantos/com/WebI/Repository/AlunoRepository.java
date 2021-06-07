package br.evertonsantos.com.WebI.Repository;

import java.util.List;

import br.evertonsantos.com.WebI.Model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

}
