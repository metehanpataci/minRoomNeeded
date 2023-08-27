package org.mp.services;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

public interface IRoomSchedular <T extends Comparable<T>>{

    Integer minNeededRoom(ArrayList<Interval<T>> ints);


}
