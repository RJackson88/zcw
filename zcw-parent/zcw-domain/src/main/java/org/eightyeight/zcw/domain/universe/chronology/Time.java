package org.eightyeight.zcw.domain.universe.chronology;

import org.neo4j.ogm.annotation.NodeEntity;
import java.time.LocalTime;

/**
 * Created by rickjackson on 3/25/17.
 */
@NodeEntity(label = "Time")
public final class Time {
    public static final LocalTime MIN = LocalTime.MIN;
    public static final LocalTime MAX = LocalTime.MAX;
    public static final LocalTime MIDNIGHT = LocalTime.MIDNIGHT;
    public static final LocalTime NOON = LocalTime.NOON;
}
