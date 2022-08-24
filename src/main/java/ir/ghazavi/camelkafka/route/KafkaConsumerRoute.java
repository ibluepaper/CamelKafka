package ir.ghazavi.camelkafka.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:test-topic?brokers=localhost:9092")
                .to("bean:numberService?method=sum");
    }
}
