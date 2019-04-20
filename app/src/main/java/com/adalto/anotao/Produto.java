package com.adalto.anotao;

public class Produto {

    private int idProduto, idReferencia;
    private String nomeProduto;

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", idReferencia=" + idReferencia +
                ", nomeProduto='" + nomeProduto + '\'' +
                '}';
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
