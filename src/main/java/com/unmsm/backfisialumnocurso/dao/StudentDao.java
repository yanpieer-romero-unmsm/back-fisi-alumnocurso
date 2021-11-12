package com.unmsm.backfisialumnocurso.dao;

import com.unmsm.backfisialumnocurso.model.dto.StudentDto;

import java.util.List;


public interface StudentDao {

  StudentDto findScoresByCode(Long code);

  List<StudentDto> findAll();
}
