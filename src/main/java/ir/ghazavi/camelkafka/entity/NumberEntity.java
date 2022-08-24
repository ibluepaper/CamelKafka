package ir.ghazavi.camelkafka.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NumberEntity {
    @Id
    @GeneratedValue
    private final Long id = null;
    @Column(nullable = false)
    private int number;
}
