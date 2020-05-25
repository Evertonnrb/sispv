package com.sispv.bean;

import lombok.Getter;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class CadastroProdutoBean implements Serializable {

    @Getter
    private List<Integer> itens;

    public CadastroProdutoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }
}
