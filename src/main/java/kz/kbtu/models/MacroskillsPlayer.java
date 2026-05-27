package kz.kbtu.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MacroskillsPlayer {
    private int morale;
    private int stamina;
    private int authority;
    private int leadership;
    private int psychologicalStability;
    private int strategicThinking;
    private int decisionMaking;
    private int energy;
}
