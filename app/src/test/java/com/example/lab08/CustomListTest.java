package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCityNotFound() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testHasCityEmptyList() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");
        assertFalse(list.hasCity(toronto));
    }

    @Test
    public void testHasCityMultipleCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City toronto = new City("Toronto", "ON");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(toronto);
        assertTrue(list.hasCity(edmonton));
        assertTrue(list.hasCity(calgary));
        assertTrue(list.hasCity(toronto));
    }
}
