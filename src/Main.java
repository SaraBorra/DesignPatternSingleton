//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creazione e stampa delle informazioni dell'utente di default
        User user1 = new User();
        user1.stampaInfo();

        // Utilizzo del Singleton per gestire un altro User
        UserManager userManager = UserManager.getInstance();
        User userSingleton = userManager.getUser();
        // Cambiare le informazioni e stamparle
        userSingleton.setNome("Mario Rossi");
        userSingleton.setEta(30);
        userSingleton.stampaInfo();
    }
}
