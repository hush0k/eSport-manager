package kz.kbtu.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Economy {
    private int transferMoney;
    private int monthlyBudget;
}
