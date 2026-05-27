package kz.kbtu.models;

import kz.kbtu.enums.Circumstance;
import kz.kbtu.enums.KillingType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Builder
public class Action {
    private Player killer;
    private Player assistant;
    private Player victim;
    private ArrayList<Circumstance> circumstances;
    private KillingType killingType;
}
