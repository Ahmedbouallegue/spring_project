package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);

    Reservation getReservationById(Long id);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

    List<Reservation> getAllReservations();
}
