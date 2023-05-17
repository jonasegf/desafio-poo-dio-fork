import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso muito top");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso incrivelmente top");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria top de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonas = new Dev();
        devJonas.setNome("Camila");
        devJonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonas:" + devJonas.getConteudosInscritos());
        devJonas.progredir();
        devJonas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonas:" + devJonas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jonas:" + devJonas.getConteudosConcluidos());
        System.out.println("XP:" + devJonas.calcularTotalXp());
    }

}
