package junit.diretorio;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)   //testes web
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class Teste {


}