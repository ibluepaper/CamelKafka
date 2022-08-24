package ir.ghazavi.camelkafka.service;

import ir.ghazavi.camelkafka.entity.NumberEntity;
import ir.ghazavi.camelkafka.repository.NumberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NumberService {
    private final NumberRepository repository;
    public void sum(String num) {
        repository.save(new NumberEntity(Integer.parseInt(num)));
        if (repository.count() == 6) {
            log.info(String.valueOf(repository.findAll().stream().map(NumberEntity::getNumber).reduce(0, Integer::sum)));
            repository.deleteAllInBatch();
        }
    }
}
