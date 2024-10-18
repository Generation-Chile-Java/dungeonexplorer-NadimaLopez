public class Salas {
    public static class emptyRoom implements Room {
        @Override
        public void enter(Player player) {
            System.out.println("¡Aqui no hay nada! Estraste a una sala vacía. Explora más!!!");
        }
    }
    public static class SalaObjeto implements Room {
        private gameObjects objeto;
        public SalaObjeto(gameObjects Objeto) {
            this.objeto = Objeto;
        }
        @Override
        public void enter(Player player) {
            System.out.println("¡Encontraste " + objeto.getName() + " , se ha guardado en tu inventario!" );
            player.coleccion(objeto);
        }
    }
    public static class SalaEnemigo implements Room {
        private String Enemigo;
        private int Damage;
        public SalaEnemigo(String Enemigo, int Damage) {
            this.Enemigo = Enemigo;
            this.Damage = Damage;
        }
        @Override
        public void enter(Player player) {
            System.out.println("¡OH NO! ¡Has encontrado un " + Enemigo + " !, Has perdido puntos de vida :( ");
            player.takeDamage(Damage);
        }
    }

}
