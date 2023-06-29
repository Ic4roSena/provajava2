/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provaa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargodeConfianca{
    public final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
    }
    public double getPREMIO() {
        return PREMIO;
    }
    @Override
    public String toString() {
        return super.toString()+ "Bonificação de : " + PREMIO;
    }
}
