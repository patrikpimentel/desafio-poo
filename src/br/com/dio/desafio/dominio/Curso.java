package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private List<Aula> aulas;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
	aulas = new ArrayList<>();
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    

    public List<Aula> getAulas() {
        return aulas;
    }

    public void addAulas(List<Aula> aulas) {
        this.aulas.addAll(aulas);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
