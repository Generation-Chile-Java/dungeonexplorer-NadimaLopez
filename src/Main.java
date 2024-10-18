import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido jugador ¿Cual es tu nombre?");
            String name = sc.nextLine();
            Player player = new Player(name, 10);
            Room[] rooms = {
                    new Salas.emptyRoom(),
                    new Salas.SalaObjeto(new Objeto("una espada")),
                    new Salas.SalaEnemigo("Guardia Lanister", 1),
                    new Salas.SalaObjeto(new Objeto("un huevo Dragón")),
                    new Salas.SalaEnemigo("White Walker bebé", 1),
                    new Salas.SalaObjeto(new Objeto("una corona")),
                    new Salas.SalaEnemigo("Joffrey Baratheon", 3),
                    new Salas.SalaObjeto(new Objeto("una espada dragonGlass")),
                    new Salas.SalaEnemigo("White walker REY DE LA NOCHE", 5)


            };
            int roomIndex = 0;
            while (player.vidas() && roomIndex < rooms.length) {
                System.out.println("\n--- Turno " + (roomIndex + 1) + " ---");
                player.showStatus();

                System.out.println("Opciones de sala:");
                System.out.println("1. Sala 1" + rooms[roomIndex].getClass().getSimpleName());
                if (roomIndex + 1 < rooms.length) {
                    System.out.println("2. Sala 2" + rooms[roomIndex + 1].getClass().getSimpleName());
                }

                System.out.print("Elige una sala (1 o 2): ");
                int choice = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                if (choice == 1) {
                    rooms[roomIndex].enter(player);
                    roomIndex++;
                } else if (choice == 2 && roomIndex + 1 < rooms.length) {
                    rooms[roomIndex + 1].enter(player);
                    roomIndex += 2;
                } else {
                    System.out.println("Opción no válida. Elige nuevamente.");
                }
            }

            if (player.vidas()) {
                System.out.println("¡Ya exploraste todas las salas!, y los enemigos te ganaron, ¡¡preparate mejor para la otra!!");
            } else {
                System.out.println("¡Moriste! Fin del juego.");
            }

            sc.close();

        }
        }
