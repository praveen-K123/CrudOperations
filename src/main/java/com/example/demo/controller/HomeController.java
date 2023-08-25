package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class HomeController {
	@Autowired
	private StudentRepository studentRepository;
	private Object nodeCheckerService;
	//get the return type
	@GetMapping("/")
	public String index() {
		return "my name is pravveen";
	}
	//save the data
	@PostMapping("/praveen")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	//getall the data
	@GetMapping("/pavi")
	public List<Student> getAll(){
		List<Student> studentList=studentRepository.findAll();
		return studentList;
	}
	//delete the particularid data 
	@DeleteMapping("/sagar/{rollNo}")
	public String deleteStudent(@PathVariable int rollNo) {
	 Student jj=studentRepository.findById(rollNo).get();
	 if(jj!=null)
	 studentRepository.delete(jj);
		return"deleted";
	}
	//update the particularid data 
	@PutMapping("/naveen")
	public Student updateStudentData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	//ckeck the particularid data
	@GetMapping("/pav/{rollNo}")
	public Student getStudentData(@PathVariable int rollNo){
		Optional<Student> dd=studentRepository.findById(rollNo);
		Student ff=dd.get();
		return ff;
	}
	//chenge the particular data
	@PatchMapping("/vinay/{rollNo}")
	public Student patchData(@PathVariable int rollNo,@RequestBody Student student) {
		Optional<Student> gg=studentRepository.findById(rollNo);
		gg.get().setName(student.getName());
		gg.get().setAddress(student.getAddress());
		gg.get().setEmail(student.getEmail());
		Student hh=studentRepository.save(gg.get());
		return hh;
	}

}
