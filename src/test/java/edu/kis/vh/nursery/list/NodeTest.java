package edu.kis.vh.nursery.list;

import junit.framework.TestCase;
import org.junit.Assert;

public class NodeTest extends TestCase {

    public void testGetValue() {
        Node node = new Node(2);
        int test_value = 2;
        int result = node.getValue();
        Assert.assertEquals(test_value, result);
    }

}