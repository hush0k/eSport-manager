package kz.kbtu.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Economy {
    private int transferMoney;
    private int monthlyBudget;
}
