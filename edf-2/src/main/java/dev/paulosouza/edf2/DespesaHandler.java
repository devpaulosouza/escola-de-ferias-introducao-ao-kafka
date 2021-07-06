package dev.paulosouza.edf2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@EnableBinding({ DespesaSink.class })
public class DespesaHandler {

    @StreamListener(target = DespesaSink.INPUT)
    public void eventTest(@Payload String payload) {
        log.info("Evento test recebido. Payload: {}", payload);
    }


}
