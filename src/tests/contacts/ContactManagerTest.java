package contacts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactManagerTest {
    ContactManager SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new ContactManager();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addContact() {
        int i = 0;
        SUT .addContact(new Contact("Pim","pim@gmail.com","063757367563"));
    }

    @Test
    public void searchContact() {
        SUT.searchContact();
    }

    @Test
    public void getFriendsCount() {
        System.out.println(SUT.friendsCount);
    }
}

