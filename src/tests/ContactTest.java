package tests;
import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import contacts.*;
public class ContactTest {

    ContactManager myContactsManager = new ContactManager();
    @Test
    public void contactShouldBeAdded(){
        int i = myContactsManager.getFriendsCount();
        myContactsManager.addContact(new Contact("Pim","pim@gmail.com","063757367563"));
        Assert.assertEquals(i++, myContactsManager.getFriendsCount());
    }
}
