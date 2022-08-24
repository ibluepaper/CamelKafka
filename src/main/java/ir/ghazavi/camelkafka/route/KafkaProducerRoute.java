package ir.ghazavi.camelkafka.route;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducerRoute extends RouteBuilder {
    private final Random random;
    @Override
    public void configure() {
        from("timer://foo?period=10000")
                .process(
                        (exchange) -> exchange.getIn().setBody(String.valueOf(random.nextInt(100)))
                )
                .to("kafka:test-topic?brokers=localhost:9092");
    }
}
