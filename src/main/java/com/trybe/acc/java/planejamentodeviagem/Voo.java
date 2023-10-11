package com.trybe.acc.java.planejamentodeviagem;

/**
 * Classe Voo.
 */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    return duracaoDouble.intValue();
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    return "Embarque no dia: " + embarque + "\nSaindo de: " + origem + "\nIndo para: "
        + destino + "\nDesembarque no dia: " + desembarque;
  }
}
