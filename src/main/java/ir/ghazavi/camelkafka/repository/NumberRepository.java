package ir.ghazavi.camelkafka.repository;

import ir.ghazavi.camelkafka.entity.NumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
}
