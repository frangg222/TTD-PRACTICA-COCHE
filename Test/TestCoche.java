import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_crear_un_coche_su_velocidad_es_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void test_acelerar_un_coche_su_velocidad_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Francisco_andres_garcia_garcia(30);
       Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_decelerar_un_coche_su_velocidad_disminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_Francisco_andres_garcia_garcia(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_decelerar_un_coche_su_velocidad_no_puede_ser_menos_que_cero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar_Francisco_andres_garcia_garcia(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
