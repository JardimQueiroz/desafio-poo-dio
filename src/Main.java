import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricão curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricão curso JavaScript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setDate(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Ifood Java Developer");
        bootcamp.setDescicao("Descrição Bootcampo Ifood Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJardison = new Dev();
        devJardison.setNome("Jardison");
        devJardison.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJardison.getConteudosInscritos());
        devJardison.progredir();
        devJardison.progredir();
        devJardison.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJardison.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJardison.getConteudosConcruidos());
        System.out.println("XP: " + devJardison.calcularTotalXp());
        System.out.println("-----------------------------");

        Dev devMaria = new Dev();
        devJardison.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + devMaria.getConteudosConcruidos());
        System.out.println("Conteudos Inscritos" + devMaria.getConteudosInscritos());
        System.out.println("XP: " + devMaria.calcularTotalXp());




    }
}
