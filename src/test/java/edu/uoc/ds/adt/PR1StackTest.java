package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        for (Integer c = 0; c < 15; c++) {
            pr1q.push(c*c+c*3+2);
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());
        //lo relleno con un for para ahorrar lineas de codigo
        for (int i =pr1q.CAPACITY-1; i>=0 ; i--) {

            Assert.assertEquals ((Integer) Funcion.funcion(i), pr1q.pop());
        }

        assertEquals(0, this.pr1q.getStack().size());
    }
}
