import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Test;
import org.mp.services.IRoomSchedular;
import org.mp.services.Interval;
import org.mp.services.RoomScheduler;

import javax.swing.tree.RowMapper;
import java.math.RoundingMode;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinRoomTester {



    private IRoomSchedular service = RoomScheduler.builder().build();

    @Test
    public void sequentialTimes(){

        ArrayList <Interval<Integer>> intervals = new ArrayList<>();

        intervals.add(new Interval<>(1,5));
        intervals.add(new Interval<>(4,10));
        intervals.add(new Interval<>(3,15));

        assertEquals(2,service.minNeededRoom(intervals));

    }
}
