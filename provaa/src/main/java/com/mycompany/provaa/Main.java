/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.provaa;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Travessa","22","Proximo ao material de construção","41181-270","Salvador", UnidadeFederativa.BAHIA);
        Funcionario funcionario = new Funcionario("Rodrigues","54115151-51","11518118181818", endereco, Setor.JURIDICO, Genero.MASCULINO, 15151, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 24)) {};
        Motoboy motoboy = new Motoboy("2151151","Joaquin","15115811-18","1515515811", endereco, Setor.ENGENHARIA, Genero.MASCULINO, 20000, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MARCH, 30));
        Gerente gerente = new Gerente(Bonificacao.GERENTE,"Francisco","5151545841-55","6815845145", endereco, Setor.JURIDICO, Genero.MASCULINO, 50000, EstadoCivil.CASADO, LocalDate.of(1980, Month.MAY, 5));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR,"Marcos","448484848-48","44848441854", endereco, Setor.SAUDE, Genero.MASCULINO, 200000, EstadoCivil.SEPARADO, LocalDate.of(1988, Month.MARCH, 20));
        Engenheiro engenheiro = new Engenheiro("151548145215","Marta","8848849184-55","5181816", endereco, Setor.ENGENHARIA, Genero.FEMININO, 5000000, EstadoCivil.CASADO, LocalDate.of(1970, Month.MARCH, 20));
        
        
        System.out.println(endereco.toString());
        System.out.println(funcionario.toString());
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
        System.out.println(engenheiro.toString());
    }
}