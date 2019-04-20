package com.adalto.anotao;

public class Produto {

    private int idProduto, quantidade, idReferencia;
    private String nomeProduto, preco;

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", quantidade=" + quantidade +
                ", idReferencia=" + idReferencia +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
