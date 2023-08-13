package com.online.world.homeworld.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "LEVEL_MODEL", schema = "HOME_WORLD")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LevelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigDecimal ide;

    @Column
    private BigDecimal level;

    @Column
    private BigDecimal experienceNeeded;

    @Column
    private BigDecimal tier;

    @Builder
    public LevelModel(BigDecimal level, BigDecimal experienceNeeded, BigDecimal tier) {
        this.level = level;
        this.experienceNeeded = experienceNeeded;
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LevelModel levelModel = (LevelModel) o;
        return ide != null && Objects.equals(ide, levelModel.ide);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
