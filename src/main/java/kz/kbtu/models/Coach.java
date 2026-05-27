package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.CountryCode;
import kz.kbtu.enums.Gender;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Coach {
    @EqualsAndHashCode.Include
    @Builder.Default
    private String id = IdGenerator.generateId("coach");

    private String name;
    private String surname;
    private String nickname;
    //image
    private int age;
    private CountryCode nationality;
    private int price;
    private int salary;
    private Gender gender;

    @Builder.Default
    private CoachSkills coachSkills = new CoachSkills();
}
