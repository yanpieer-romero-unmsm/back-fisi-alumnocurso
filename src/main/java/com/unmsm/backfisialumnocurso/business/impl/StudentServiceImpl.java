package com.unmsm.backfisialumnocurso.business.impl;

import com.unmsm.backfisialumnocurso.business.StudentService;
import com.unmsm.backfisialumnocurso.dao.StudentDao;
import com.unmsm.backfisialumnocurso.model.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

  private final StudentDao dao;

  @Override
  public StudentDto findScoresByCode(Long code) {
    return dao.findScoresByCode(code);
  }

  @Override
  public List<StudentDto> findAll() {
    return dao.findAll();
  }

}
