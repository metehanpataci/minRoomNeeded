package org.mp.services;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Interval<T extends Comparable<T>> implements Comparable<Interval>{

    private T start;

    private T end;


    @Override
    public int compareTo(@NotNull Interval o) {
        return start.compareTo((T)o.start);
    }
}