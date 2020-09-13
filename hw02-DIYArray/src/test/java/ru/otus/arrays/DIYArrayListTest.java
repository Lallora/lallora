package ru.otus.arrays;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DIYArrayListTest {

    @BeforeAll
    public static void globalSetUp() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.print("@BeforeEach. ");
        System.out.println("Test class instance: " + Integer.toHexString(this.hashCode()));
    }

    @Test
    @DisplayName("Test method 'Add' from DIYArrayList collection")
    void testAdd(){
        System.out.println("@Test: Test method 'Add' from DIYArrayList collection");
        DIYArrayList<Integer> testList = new DIYArrayList<>(0);
        boolean actual = testList.add(5);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test method 'toString' from DIYArrayList collection")
    void testToString() {
        System.out.println("@Test: Test method 'toString' from DIYArrayList collection");
        DIYArrayList<Integer> testList = new DIYArrayList<>(0);
        for (int i=0;i<5;i++){
            testList.add(i);
        }
        String actual = testList.toString() ;
        String expected = "[0, 1, 2, 3, 4]";
        assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDown() {
        System.out.print("@AfterEach. ");
        System.out.println("Test class instance: " + Integer.toHexString(this.hashCode()));
    }

    @AfterAll
    public static void globalTearDown() {
        System.out.println("@AfterAll");
    }
}