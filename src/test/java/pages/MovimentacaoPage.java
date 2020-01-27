package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class MovimentacaoPage extends BasePage {

    public void inserirDataMovimentacao(String data){
        escrever("data_transacao", data);
    }

    public void inserirDataPagamento(String data){
        escrever("data_pagamento", data);
    }

    public void inserirDescricao(String descricao)
    {
        escrever("descricao", descricao);
    }

    public void inserirInteressado(String interessado) {
        escrever("interessado", interessado);
    }

    public void inserirValor(String valor){
        escrever("valor", valor);
    }
    public void inserirConta(String conta){
        selecionarCombo("conta", conta);
    }

    public void inserirStatusPago() {
        clicarRadio("status_pago");
    }

    public void clicarSalvar(){
        clicarBotao(By.xpath("//button[.='Salvar']"));
    }

    public String pegarMensagemDeSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

}
