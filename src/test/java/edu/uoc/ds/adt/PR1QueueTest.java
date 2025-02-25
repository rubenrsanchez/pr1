package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        //aqui he modificado la longitud a 15, tal y como se ve en el documento pdf y cambiando los chars por integers
        for (Integer c = 0; c < 15; c++) {
            pr1q.add(c*c+3*c+2);

        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        //Aqui he tenido que quitar -1 a this.pr1q.CAPACITy-1 porque si no me daba un error en valor esperado, ya que esperaba un valor menor al size
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());
        //lo relleno con un for para ahorrar lineas de codigo
        for (int i =0; i<pr1q.CAPACITY ; i++) {
           Assert.assertEquals((Integer) Funcion.funcion(i), pr1q.poll());
        }

        assertEquals(0, this.pr1q.getQueue().size());
    }

}
