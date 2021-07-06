package dev.paulosouza.edf2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DespesaSink {

    String INPUT = "input";

    @Input(DespesaSink.INPUT)
    SubscribableChannel input();

}
