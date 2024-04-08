package com.study.java.srventrega.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConstantsUltils implements Serializable {

    public static final String RAABIT_FILA_PAGAMENTO_ENTREGA = "pagamento.entrega";

    public static final String RAABIT_EX_PAGAMENTO = "pagamentos.ex";

    public static final String RAABIT_EX_DLX = "pagamentos.dlx";

    public static final String RAABIT_FILA_PAGAMENTO_ENTREGA_DLQ = "pagamento.entrega-dlq";
}
