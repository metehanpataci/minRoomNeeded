package org.mp.services;


import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

@Builder
public class RoomScheduler<T extends Comparable<T>> implements IRoomSchedular{
    @Override
    public Integer minNeededRoom(ArrayList ints) {
        // Sort the interval according to their start times
        ints.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return ((Integer)o1.getStart()).compareTo((Integer)o2.getStart());
            }


        });

        // Scan list by using min heap
        PriorityQueue <Interval> pq = new PriorityQueue<>();
        pq.offer((Interval)ints.get(0));

        Iterator it = ints.iterator();
        it.next();

        while(it.hasNext()){

            Interval currInterval = (Interval)it.next();

            if(((Integer)currInterval.getStart()).compareTo((Integer)pq.peek().getEnd()) >= 0) {
                pq.poll();
            }

            pq.offer(currInterval);

        }

        return pq.size();
    }


    //private Interval<T, T> intervals;





}
