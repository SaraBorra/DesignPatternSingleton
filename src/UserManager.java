public class UserManager {
    private static UserManager instance;
    private User user;

    private UserManager() {
        user = new User(); // Creazione dell'istanza User all'interno del Singleton
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }
}
