package com.everis.servicioA.feignService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.servicioA.entity.StudentBean;

@FeignClient(name = "servicio-students")
public interface StudentFeignService {
	
@GetMapping(value = "/liststudents")
List<StudentBean> listStudent();	
	
@GetMapping(value = "/liststudents/{id}")
StudentBean listStudentxId(@PathVariable("id") int id);

}
