import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework {

    @Test
    public void test() {
        Integer viceslennijProcent = vicislitjProcentOtCisla(200,3);
        Assertions.assertEquals(6, viceslennijProcent);
        Integer poscitannijRashodTopliva = poscitatjRashodTopliva(100, 5 );
        Assertions.assertEquals(20, poscitannijRashodTopliva);
    }

    private Integer vicislitjProcentOtCisla(Integer cislo, Integer procent) {
        Integer otvet = cislo * procent / 100;
        System.out.println(otvet);
        return otvet;
    }

    private Integer poscitatjRashodTopliva(Integer rasstojanie, Integer objem) {
            Integer otvet = rasstojanie / objem;
            System.out.println(otvet);
            return otvet;
    }
}

