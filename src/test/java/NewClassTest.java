import com.mycompany.mavenproject1.Model.abc;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class NewClassTest {
    @Test
    @DisplayName("abc listeleme testi")
    void abcListeleTest() throws Exception {
        abc a = new abc();
        final ArrayList<abc> s = a.listele();
        final abc expected[]= {new abc(1,"qwe","qwe"), new abc(2,"asd","asd")};
        
        for(int i=0; i<expected.length; i++) {
             Assertions.assertEquals(expected[i].x, s.get(i).x,"abc listeleme testi x"+i+" degeri uyusmuyor");
             Assertions.assertEquals(expected[i].a, s.get(i).a,"abc listeleme testi a"+i+" degeri uyusmuyor");
             Assertions.assertEquals(expected[i].b, s.get(i).b,"abc listeleme testi b"+i+" degeri uyusmuyor");
        }
    }
    
    //https://github.com/junit-team/junit5-samples/blob/main/junit5-jupiter-starter-maven/src/test/java/com/example/project/CalculatorTests.java
}
