package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        for (int c = 0; c < 9; c++) {
            pr1q.add(c);

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
        assertEquals(this.pr1q.CAPACITY-1, this.pr1q.getQueue().size());
        Integer funcion2;
        for (int i =0; i<pr1q.CAPACITY ; i++) {
            funcion2 = i*i+3*i+2;

            Assert.assertEquals(funcion2, pr1q.poll());
        }

        assertEquals(0, this.pr1q.getQueue().size());
    }

}
