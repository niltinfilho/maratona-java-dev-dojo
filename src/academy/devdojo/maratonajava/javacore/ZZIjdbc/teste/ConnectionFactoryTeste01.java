package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTeste01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(6);
//        ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        System.out.println("Producers found: " + producers);
    }
}
