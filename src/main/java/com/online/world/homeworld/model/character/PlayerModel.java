package com.online.world.homeworld.model.character;

import com.online.world.homeworld.model.level.PlayerLevel;
import com.online.world.homeworld.model.stats.DerivedStat;
import com.online.world.homeworld.model.stats.PrimaryStat;
import com.online.world.homeworld.model.stats.SecondaryStat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "PLAYER_MODEL")
@Data
public class PlayerModel {

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

    @Embedded
    private PlayerLevel playerLevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlayerModel player = (PlayerModel) o;
        return playerId != null && Objects.equals(playerId, player.playerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
