package com.unmsm.backfisialumnocurso.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ScoreFromCourse {

  private String code;

  private String course;

  private Integer score;
}
