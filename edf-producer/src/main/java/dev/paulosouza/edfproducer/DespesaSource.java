package dev.paulosouza.edfproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DespesaSource {

    String OUTPUT = "output";

    @Output(DespesaSource.OUTPUT)
    MessageChannel output();

}
