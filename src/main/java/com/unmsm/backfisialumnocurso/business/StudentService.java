package com.unmsm.backfisialumnocurso.business;

import com.unmsm.backfisialumnocurso.model.dto.StudentDto;

import java.util.List;

public interface StudentService {

  StudentDto findScoresByCode(Long code);

  List<StudentDto> findAll();
}
