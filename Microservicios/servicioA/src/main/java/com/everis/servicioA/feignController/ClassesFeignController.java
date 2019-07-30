package com.everis.servicioA.feignController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.StudentBean;
import com.everis.servicioA.feignService.StudentFeignService;

@RestController
@RequestMapping
public class ClassesFeignController {
	
	@Autowired
	private StudentFeignService studentFeignService;
	
	@GetMapping("/listStudent")
	public List<StudentBean> listStudent() {
		
		return studentFeignService.listStudent();
	}
	

	@GetMapping("/find/{id}")
	public StudentBean listStudentxId(@PathVariable int id) {
		
		return studentFeignService.listStudentxId(id);
	}

}
