package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.*;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Player {
    @Builder.Default
    @EqualsAndHashCode.Include
    private final String id = IdGenerator.generateId("player");

    private String name;
    private String surname;
    private String nickname;
    // image
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
