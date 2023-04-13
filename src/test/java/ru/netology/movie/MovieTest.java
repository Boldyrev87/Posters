package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test

    public void test() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Dracula 1992");
        manager.addMovie("Speed 1994");
        manager.addMovie("The Devil's Advocate 1997");
        manager.addMovie("Matrix 1999");
        manager.addMovie("Constantine 2005");
        manager.addMovie("John Wick 2014");
        manager.addMovie("Ballerina 2024");

        String[] actual = manager.findLast();
        String[] expected = {"Ballerina 2024", "John Wick 2014", "Constantine 2005", "Matrix 1999", "The Devil's Advocate 1997"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        ManagerMovie manager = new ManagerMovie(7);

        manager.addMovie("Dracula 1992");
        manager.addMovie("Speed 1994");
        manager.addMovie("The Devil's Advocate 1997");
        manager.addMovie("Matrix 1999");
        manager.addMovie("Constantine 2005");
        manager.addMovie("John Wick 2014");
        manager.addMovie("Ballerina 2024");

        String[] actual = manager.findLast();
        String[] expected = {"Ballerina 2024", "John Wick 2014", "Constantine 2005", "Matrix 1999", "The Devil's Advocate 1997", "Speed 1994", "Dracula 1992"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        ManagerMovie manager = new ManagerMovie(6);

        manager.addMovie("Dracula 1992");
        manager.addMovie("Speed 1994");
        manager.addMovie("The Devil's Advocate 1997");
        manager.addMovie("Matrix 1999");
        manager.addMovie("Constantine 2005");
        manager.addMovie("John Wick 2014");
        manager.addMovie("Ballerina 2024");

        String[] actual = manager.findLast();
        String[] expected = {"Ballerina 2024", "John Wick 2014", "Constantine 2005", "Matrix 1999", "The Devil's Advocate 1997", "Speed 1994"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        ManagerMovie manager = new ManagerMovie(3);

        manager.addMovie("Dracula 1992");
        manager.addMovie("Speed 1994");
        manager.addMovie("The Devil's Advocate 1997");
        manager.addMovie("Matrix 1999");
        manager.addMovie("Constantine 2005");
        manager.addMovie("John Wick 2014");
        manager.addMovie("Ballerina 2024");

        String[] actual = manager.findLast();
        String[] expected = {"Ballerina 2024", "John Wick 2014", "Constantine 2005"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test5() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Dracula 1992");
        manager.addMovie("Speed 1994");
        manager.addMovie("The Devil's Advocate 1997");
        manager.addMovie("Matrix 1999");
        manager.addMovie("Constantine 2005");
        manager.addMovie("John Wick 2014");
        manager.addMovie("Ballerina 2024");

        String[] actual = manager.findAll();
        String[] expected = {"Dracula 1992", "Speed 1994", "The Devil's Advocate 1997", "Matrix 1999", "Constantine 2005", "John Wick 2014", "Ballerina 2024"};
        Assertions.assertArrayEquals(expected, actual);

    }
}
