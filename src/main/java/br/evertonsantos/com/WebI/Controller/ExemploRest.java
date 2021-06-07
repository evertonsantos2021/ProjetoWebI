package br.evertonsantos.com.WebI.Controller;

import br.evertonsantos.com.WebI.Model.Aluno;
import br.evertonsantos.com.WebI.Service.AlunoService;
import br.evertonsantos.com.WebI.dto.AlunoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("exemplo")
public class ExemploRest {

   @Autowired
   private AlunoService alunoService;
   @RequestMapping (value = "/olamundo", method = RequestMethod.GET)
   public Object olamundo() {
      AlunoDTO aluno = new AlunoDTO();
      aluno.setMatricula("12345");
      aluno.setNome("Everton Santos");
      aluno.setFone("79 9 9997-3083");
      aluno.setEndereco("Travesa do Asilo, 45");
      return aluno;
   }

   @RequestMapping(value = "/novoAluno", method = RequestMethod.POST)
   public Object novoAluno(@RequestBody Aluno aluno) throws Exception {
      alunoService.cadastrar(aluno);
      return aluno;
   }

   @RequestMapping(value = "/novoAluno", method = RequestMethod.GET)
   public Object getAllAlunos() throws Exception {
      return alunoService.getAll();
   }
}
