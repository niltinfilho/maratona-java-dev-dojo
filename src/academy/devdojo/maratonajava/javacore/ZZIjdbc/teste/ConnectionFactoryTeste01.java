package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTeste01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerService.save(producer);
        ProducerService.delete(6);
    }
}
