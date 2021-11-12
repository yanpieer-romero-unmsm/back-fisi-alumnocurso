package com.unmsm.backfisialumnocurso.web;

import com.unmsm.backfisialumnocurso.business.StudentService;
import com.unmsm.backfisialumnocurso.model.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo/business/v1/students")
public class StudentController {

  private final StudentService service;

  @GetMapping(produces = "application/json", value = "/{code}")
  public ResponseEntity<StudentDto> findById(@PathVariable(name = "code") Long code) {

    return ResponseEntity.ok(service.findScoresByCode(code));
  }

  @GetMapping(produces = "application/json")
  public ResponseEntity<List<StudentDto>> findAll() {

    return ResponseEntity.ok(service.findAll());
  }

}
