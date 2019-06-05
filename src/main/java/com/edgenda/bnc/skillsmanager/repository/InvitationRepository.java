package com.edgenda.bnc.skillsmanager.repository;

import com.edgenda.bnc.skillsmanager.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Long>, CrudRepository<Invitation, Long> {

    Optional<Invitation> findById(Long id);

//    @Query("SELECT invitation FROM Invitation invitation JOIN invitation.guestId  WHERE invitation.guestId = ?1")
//    List<Invitation> findInvitationByGuest(Long guestId);
}
