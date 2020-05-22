package com.sispv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    private Long matricula;
    private String nome;
    private Date dataAdmissao;
    private BigDecimal salario;
}
