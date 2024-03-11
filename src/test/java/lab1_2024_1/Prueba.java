package lab1_2024_1;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.tp24.ApplicationRunner;
import org.tp24.repository.Clientes;

public class Prueba {
    @Test
    public void test1(){
        ApplicationRunner applicationRunner = new ApplicationRunner();
        applicationRunner.run();
        Clientes nombreGenerico1 = new Clientes("123", "Pepito", "Perez", LocalDate.of(1999, 9, 19), "En su casa", -1);
        
    }
}
