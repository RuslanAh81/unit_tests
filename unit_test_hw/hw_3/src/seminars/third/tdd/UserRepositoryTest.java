package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    @Test
    public void testLogoutNotAdminAdminUsers() {
        User adminUser = new User("admin", "adminpass", true);
        User regularUser1 = new User("user1", "userpass1", false);
        User regularUser2 = new User("user2", "userpass2", false);

        adminUser.authenticate("admin", "adminpass");
        regularUser1.authenticate("user1", "userpass1");
        regularUser2.authenticate("user2", "userpass2");

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        userRepository.logoutNotAdminAdminUsers();

        assertTrue(adminUser.isAuthenticate);
        assertFalse(regularUser1.isAuthenticate);
        assertFalse(regularUser2.isAuthenticate);

    }
}

