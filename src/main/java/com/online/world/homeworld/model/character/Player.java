package com.online.world.homeworld.model.character;

import com.online.world.homeworld.model.stats.DerivedStat;
import com.online.world.homeworld.model.stats.PrimaryStat;
import com.online.world.homeworld.model.stats.SecondaryStat;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "PLAYER_MODEL", schema = "HOME-WORLD")
@Data
public class Player {

    @Id
    private String playerId;

    @Column
    private String playerName;

    @Embedded
    private PrimaryStat primaryStat;

    @Embedded
    private SecondaryStat secondaryStat;

    @Embedded
    private DerivedStat derivedStat;
}
