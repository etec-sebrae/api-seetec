package br.gov.sp.etec;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.entity.Curso;

@RestController
public class AlunoController {
	
	private Map<Integer, Curso> curso;
	
	@RequestMapping(value = "/listacursos")
	public ResponseEntity<List<Curso>> listaCurso(){
		
		curso =  new HashMap<Integer, Curso>();
		
		Curso mobile = new Curso(1, "mobile", "deenvolvimento mobile");
		Curso ds = new Curso(2, "Desenvolvimento Web", "deenvolvimento Web I");
				
		curso.put(1, mobile);
		curso.put(2, ds);
		
		return new ResponseEntity<List<Curso>>(new ArrayList<Curso>(curso.values()), HttpStatus.OK);
	}

}
