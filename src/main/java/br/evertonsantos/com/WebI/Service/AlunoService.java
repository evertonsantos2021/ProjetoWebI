package br.evertonsantos.com.WebI.Service;

import br.evertonsantos.com.WebI.Model.Aluno;
import br.evertonsantos.com.WebI.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    public void cadastrar (Aluno aluno) throws Exception {
        if (aluno == null) {
            throw new Exception("Aluno Nulo !");
        }
        alunoRepository.save(aluno);
    }

    public List<Aluno> getAll() {
        return (List<Aluno>)alunoRepository.findAll();
    }
}
