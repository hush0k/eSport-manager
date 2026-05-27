package kz.kbtu.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@Builder
public class RoundHistory {
    private Map<Integer, Action> action;

}
