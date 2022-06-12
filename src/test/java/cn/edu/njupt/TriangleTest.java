package cn.edu.njupt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle1, triangle2, triangle3, triangle4;

    @Before
    public void setUp() throws Exception {
        triangle1 = new Triangle(11, 4, 5);
        triangle2 = new Triangle(14, 19, 19);
        triangle3 = new Triangle(8, 10, 6);
        triangle4 = new Triangle(6, 6, 6);
    }

    @After
    public void tearDown() throws Exception {
        triangle1 = null;
        triangle2 = null;
        triangle3 = null;
        triangle4 = null;
    }

    @Test
    public void isTriangle() {
        Assert.assertFalse(Triangle.isTriangle(triangle1));
        Assert.assertTrue(Triangle.isTriangle(triangle2));
        Assert.assertTrue(Triangle.isTriangle(triangle3));
        Assert.assertTrue(Triangle.isTriangle(triangle4));
    }

    @Test
    public void getType() {
        Assert.assertEquals(Triangle.getType(triangle1), "不是三角形");
        Assert.assertEquals(Triangle.getType(triangle2), "等腰三角形");
        Assert.assertEquals(Triangle.getType(triangle3), "不等边三角形");
        Assert.assertEquals(Triangle.getType(triangle4), "等边三角形");
    }
}