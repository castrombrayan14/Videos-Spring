package com.everis.servicioA.feignController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.entity.ClassesStudent;
import com.everis.servicioA.entity.StudentBean;
import com.everis.servicioA.feignService.StudentFeignService;


@RestController
@RequestMapping
public class ClassesFeignController {
	
	@Autowired
	private StudentFeignService studentFeignService;
	
	@GetMapping("/liststudentfeign")
	public List<StudentBean> listStudent() {
		
		return studentFeignService.listStudent();
		
	}
	
	@GetMapping("/find/{id}")
	public  List<StudentBean> listStudentxId(@PathVariable int id){
		
		
		return studentFeignService.listStudentxId(id);
	}

	@GetMapping("/{id}")
	public ClassesStudent listStudentxClases(@PathVariable int id){
		
		
		return studentFeignService.listStudentxClases(id);
	}

	
/*	@PostMapping("/saveClasses")
	public Classes saveClasses(@RequestBody Classes classes) {
		
		return classesServiceImpl.saveClasses(classes)	;
	} 
	
	
	@PutMapping("/classes/{id}")
	public Classes updateStudent(@RequestBody Classes classes,@PathVariable int id) {
		
		Classes classesCurrent =classesServiceImpl.findByClassId(id);
	
		 falta crear los set 
		 
		
	
		
		return 	classesServiceImpl.saveClasses(classesCurrent);
		
	}
	
	     @DeleteMapping("/classes/{id}")
	    public void deleteClasses(@PathVariable int id) {
	    	 
	    	 classesServiceImpl.delete(id);
		
	}
	
	*/

}
