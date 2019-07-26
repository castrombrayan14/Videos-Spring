package com.everis.servicioA.feignService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.entity.ClassesStudent;
import com.everis.servicioA.entity.StudentBean;
@FeignClient(name = "servicio-students")
public interface StudentFeignService {
	
	
@GetMapping(value = "/students")
List<StudentBean> listStudent();

@GetMapping(value = "/findStudent/{id}")
public ClassesStudent listStudentxClases(int id);
	

}
