/**
 *
 */
package com.allendowney.thinkdast;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }

    @Test
    public void addTest() {
        mylist.add(1, 10);

        assertThat(mylist.get(1), is(10));
        assertThat(mylist.get(2), is(2));
        assertThat(mylist.size(), is(4));
    }

    @Test
    public void indexOfTest() {
        assertThat(mylist.indexOf(null), is(-1));
        mylist.add(10);
        assertThat(mylist.indexOf(1), is(0));
        assertThat(mylist.indexOf(10), is(3));
        mylist.add(null);
        assertThat(mylist.indexOf(null), is(4));
    }

    @Test
    public void removeTest() {
        mylist.remove(2);
        assertThat(mylist.size(), is(2));
        assertThat(mylist.indexOf(3), is(-1));
    }
}
