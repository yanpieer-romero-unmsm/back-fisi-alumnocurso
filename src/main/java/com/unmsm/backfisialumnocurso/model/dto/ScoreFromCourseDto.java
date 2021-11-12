package com.unmsm.backfisialumnocurso.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ScoreFromCourseDto {

  private String code;

  private String course;

  private Integer score;
}
