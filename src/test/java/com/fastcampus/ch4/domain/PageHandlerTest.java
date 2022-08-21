package com.fastcampus.ch4.domain;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PageHandlerTest {
    @Test
    public void test() {
        PageHandler ph = new PageHandler(250, 3);
        ph.print();
        System.out.println("ph = " + ph);

        assertTrue(ph.beginPage == 1);
    }

    @Test
    public void test2() {
        PageHandler ph = new PageHandler(312, 31);
        ph.print();
        System.out.println("ph = " + ph);

        assertTrue(ph.endPage == 31 );

    }

    @Test
    public void test3() {
        PageHandler ph = new PageHandler(255, 25);
        ph.print();
        System.out.println("ph = " + ph);

        assertTrue(ph.beginPage == 21);
        assertTrue(ph.endPage == 26);

    }
}

