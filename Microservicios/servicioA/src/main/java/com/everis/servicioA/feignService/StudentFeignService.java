package com.everis.servicioA.feignService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.everis.servicioA.entity.ClassesStudent;
import com.everis.servicioA.entity.StudentBean;

import feign.Param;
@FeignClient(name = "servicio-students")
public interface StudentFeignService {
	
	
@GetMapping(value = "/liststudents")
List<StudentBean> listStudent();

@GetMapping(value = "/findStudent/{id}")
List<StudentBean> listStudentxId(@Param("id")int id);


@GetMapping(value = "/findStudent/{id}")
public ClassesStudent listStudentxClases(int id);
	


}
