package com.sispv.bean;

import lombok.Getter;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
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
