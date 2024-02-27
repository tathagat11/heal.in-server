package in.app.heal.aux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuxDepressionTestDTO {
  private Integer id;
  private String question;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
}
