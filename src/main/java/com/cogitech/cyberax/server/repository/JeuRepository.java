package com.cogitech.cyberax.server.repository;

import com.cogitech.cyberax.server.domain.Jeu;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Jeu entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JeuRepository extends JpaRepository<Jeu, Long> {

}
