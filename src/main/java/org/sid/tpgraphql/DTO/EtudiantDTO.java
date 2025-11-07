package org.sid.tpgraphql.DTO;

import org.sid.tpgraphql.enums.Genre;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }
