package utill;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

    private static EntityManagerSingleton instance = new EntityManagerSingleton();

    private EntityManagerSingleton() {
    }

    public static EntityManagerSingleton getInstance() {

        if (instance == null) {
            instance = new EntityManagerSingleton();
        }
        return instance;
    }

    private static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("webLibrary");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}