public class Interface {
    public static void main(String[] args) {
        // Queen queen = new Queen();
        // queen.moves();

        // King king = new King();
        // king.moves();

        Bear black = new Bear();
        black.eat();

    }    
}

// ----------------> EXAMPLE 1 <-----------------------------------------------
// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, Left, Right, Diagonal (in all four direction!)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, Left, Right");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, Left, Right, Diagonal by one step!");
//     }
// }

// ----------------> EXAMPLE 2 <-----------------------------------------------

interface Carnivorous{
    void eat();
}

interface Herbivorous{
    void eat();
}

class Bear implements Carnivorous, Herbivorous{
    public void eat(){
        System.out.println("Eats both plants and meats.");
    }
}
