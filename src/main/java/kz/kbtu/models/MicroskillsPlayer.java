package kz.kbtu.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class MicroskillsPlayer {
    private int crosshairPlacement;
    private int sprayControl;
    private int aimSpeed;
    private int aimAccuracy;
    private int flickShot;
    private int fastScope;
    private int noScope;
    private int scopedAccuracy;
    private int scopedCrosshairPlacement;
    private int movement;
    private int gameSense;
    private int clutch;
    private int utilityUsage;

}
