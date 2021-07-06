package dev.paulosouza.edfproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("despesa")
@Slf4j
public class DespesaControler {

    private final DespesaProducer despesaProducer;

    public DespesaControler(DespesaProducer despesaProducer) {
        this.despesaProducer = despesaProducer;
    }


    @PostMapping
    public ResponseEntity<Void> sendEvent(@RequestBody String payload) {
        this.despesaProducer.sendEvent(payload);

        log.info("Enviando evento {}", payload);

        return ResponseEntity.noContent().build();
    }

}
