package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemain2() {
        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemain3() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
