import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<gameObjects> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " recibiste " + damage + " puntos de daño. Te quedan " + health +" vidas" );
    }
    public void coleccion(gameObjects objets) {
        inventory.add(objets);
        System.out.println("Recogiste " + objets.getName() );
    }
    public boolean vidas() {
        return health > 0;
    }
    public void showStatus() {
        System.out.println(name + " tienes " + health + " puntos de vida");
    }
}
