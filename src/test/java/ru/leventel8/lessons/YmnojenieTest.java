package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YmnojenieTest {
    /**
     * проверка умножения
     * с помощью рекурсии
     */
    @Test
    public void testMult() {

        Ymnojenie ymnojenie = new Ymnojenie();              // создаем объект
        assertEquals(10,ymnojenie.mult(5,2));   // сравниваем ожидаемое значение с возвращаемым

    }//end testMult()

    /**
     * проверка возведения в степень
     * с помощью рекурсии
     */
    @Test
    public void testPower() {
        Ymnojenie ymnojenie = new Ymnojenie();
        assertEquals(25,ymnojenie.power(5,2));
    }//end testPower()

}//end class YmnojenieTest