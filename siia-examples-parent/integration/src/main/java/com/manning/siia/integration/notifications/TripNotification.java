package com.manning.siia.integration.notifications;

import com.manning.siia.domain.trip.Trip;

/**
 *
 * @author Iwein Fuld
 */
public class TripNotification {
    private final Trip trip;
    private final String message;

    public TripNotification(Trip trip, String message) {
        this.trip = trip;
        this.message = message;
    }
}
