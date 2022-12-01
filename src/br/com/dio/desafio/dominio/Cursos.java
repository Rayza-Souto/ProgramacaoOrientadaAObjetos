package br.com.dio.desafio.dominio;


public class Cursos extends Conteudo {

    private double cargaHoraria; 
    
    public Cursos() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos [titulo=" + getTitulo() + ", descricao=" + 
        getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }



    


}
