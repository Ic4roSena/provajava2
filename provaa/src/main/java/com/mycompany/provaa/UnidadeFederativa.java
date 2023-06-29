/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.provaa;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA ("Bahia","BA"),
    SAO_PAULO ("São Paulo","SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro","RJ");
    
    private final String Texto;
    private final String Sigla;

    private UnidadeFederativa(String Texto, String Sigla) {
        this.Texto = Texto;
        this.Sigla = Sigla;
    }

    public String getTexto() {
        return Texto;
    }

    public String getSigla() {
        return Sigla;
    }

    
}
