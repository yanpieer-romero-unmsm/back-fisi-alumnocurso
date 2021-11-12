package com.unmsm.backfisialumnocurso.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

import static com.unmsm.backfisialumnocurso.util.constant.RegexConstant.ANY_STRING;

@Builder
@Setter
@Getter
public class StudentDto implements Serializable {

  @JsonProperty(value = "code")
  private Long code;

  @JsonProperty(value = "name")
  @Pattern(regexp = ANY_STRING)
  @Size(min = 5, max = 300)
  private String name;

  @JsonProperty(value = "lastName")
  @Pattern(regexp = ANY_STRING)
  @Size(min = 5, max = 300)
  private String lastName;

  @JsonProperty(value = "listOfScoresByCourse")
  private List<ScoreFromCourseDto> listOfScoresByCourse;

}