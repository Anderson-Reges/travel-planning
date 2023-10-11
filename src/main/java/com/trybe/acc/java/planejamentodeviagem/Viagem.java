package com.trybe.acc.java.planejamentodeviagem;

/**
 * Classe Viagem.
 */
public class Viagem {
  private final String embarque;
  private final String origem;
  private final String destino;
  private final double distanciaKm;
  private final Voo voo;

  /**
   * Método construtor da classe.
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.destino = destino;
    this.embarque = embarque;
    this.origem = origem;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em média 700 km a cada hora
  public int retornarDuracaoVoo() {
    return (int) this.distanciaKm / 700;
  }

  /**
   * Método para retorno da informaçao da viagem.
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    return this.voo.retornarInformacaoVoo(
        embarque, origem, tempoViagem.retonarDesembarqueHorarioLocalDestino(), destino
    );
  }
}
