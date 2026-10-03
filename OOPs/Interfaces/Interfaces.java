package Interfaces;

interface ChessPlayer {
    void move();  // method name fixed
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up,down,left,right,diagonal(in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void move() {
        System.out.println("up,down,left,right,diagonal(in all 4 dirns)");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}
