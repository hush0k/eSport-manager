package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.*;
import lombok.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Builder.Default
    @EqualsAndHashCode.Include
    private final String id = IdGenerator.generateId("player");

    private String name;
    private String surname;
    private String nickname;
    private String image;
    private int age;
    private CountryCode nationality;
    private Gender gender;
    private int price;
    private int salary;
    private Role role;
    @Builder.Default
    private Map<MapPool, List<Positions>> positions = new HashMap<>();

    @Builder.Default
    private MicroskillsPlayer microskills = new MicroskillsPlayer();
    @Builder.Default
    private MacroskillsPlayer macroskills  = new MacroskillsPlayer();



}
