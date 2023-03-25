package com.example.jpa_bank.controller.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class TransactionDto {
    private Integer id;
    private String origen;
    private String destination;
    private int amount;
    private BigInteger transaccionId;
    private BigInteger cuentaDestino;
    private BigInteger cuentaOrigen;
    private int monto;

}
