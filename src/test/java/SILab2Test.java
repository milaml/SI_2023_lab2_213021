import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void EveryBranchTest() {
       RuntimeException ex;
       ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

       List<User> allUsers = new ArrayList<>();
        allUsers.add(new User(null,"123456!.", "finki@ukim.mk"));
        assertEquals(false, SILab2.function(new User(null, "123456!.", "finki@ukim.mk"), allUsers));


     List<User> allUsers1 = new ArrayList<>();
        allUsers1.add(new User("Mila","password","finkiukim"));
        assertFalse(SILab2.function(new User("Mila", "mila123", "finki@ukim.mk"), allUsers1));

      List<User> allUsers2 = new ArrayList<>();
        allUsers2.add(new User("Mila","1234567890221","bilosto"));
        assertEquals(false, SILab2.function(new User("Mila","123456789008","mila123"),allUsers2 ));

         List<User> allUsers3 = new ArrayList<>();
         allUsers3.add(new User("Mila","mila mladenoskaa", "finkuukim"));
       assertEquals(false, SILab2.function(new User("Mila","mila mladenovska","mila123"),allUsers3));

    }
    @Test
    public void MultipleConditionTest() {

        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Mila", null, "bilosto"), null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Mila", "password", null), null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertFalse(SILab2.function(new User("Mila", "password", "bilosto"), null));

    }


}


