package com.study.java.srventrega.amqp;

import com.study.java.srventrega.dto.PagamentoDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.study.java.srventrega.utils.ConstantsUltils.RAABIT_FILA_PAGAMENTO_ENTREGA;

@Log4j2
@Component
public class PagamentoListener {

    @RabbitListener(queues = RAABIT_FILA_PAGAMENTO_ENTREGA)
    public void recebeMessage(PagamentoDto pgto){
        log.info("<<--->>Pedido Rabbit {}", pgto);
    }

}
