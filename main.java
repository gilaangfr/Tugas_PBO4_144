// Interface
interface Enemy {
    void attack();
}

// Abstract class
abstract class Monster {
    abstract void roar();
}

// Outer class
class Game {
    // Inner class
    class Goblin implements Enemy {
        @Override
        public void attack() {
            System.out.println("Goblin attacks with a club.");
        }
    }

    // Inner class
    class Dragon extends Monster {
        @Override
        void roar() {
            System.out.println("Dragon lets out a mighty roar.");
        }
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Game game = new Game();
        
        // Menggunakan inner class
        Game.Goblin goblin = game.new Goblin();
        goblin.attack();
        
        // Menggunakan abstract class
        Game.Dragon dragon = game.new Dragon();
        dragon.roar();
    }
}