package com.sispv.bean;

import lombok.Getter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {

    @Getter
    private List<Integer> produtosFiltrados;

    public PesquisaProdutosBean() {
        this.produtosFiltrados = new ArrayList<>();
        for (int i = 0; i < 50; i++ ){
            produtosFiltrados.add(i);
        }
    }


}
