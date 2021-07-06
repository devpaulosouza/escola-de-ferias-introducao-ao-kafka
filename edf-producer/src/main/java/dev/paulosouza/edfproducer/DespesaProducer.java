package dev.paulosouza.edfproducer;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class DespesaProducer {

    private final DespesaSource despesaSource;

    public DespesaProducer(DespesaSource despesaSource) {
        this.despesaSource = despesaSource;
    }

    public void sendEvent(String payload) {
        Message<String> message = MessageBuilder.withPayload(payload).build();
        despesaSource.output().send(message);
    }

}
