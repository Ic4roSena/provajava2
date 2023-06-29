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
public class Gerente extends CargodeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
    }

    @Override
    public String toString() {
        return super.toString()+ "Gerente{" + '}';
    }
    
}
