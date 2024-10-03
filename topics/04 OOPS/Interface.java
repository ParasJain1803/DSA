class Interface {
    public static void main (String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPieces {
    void moves();
}

class Queen implements ChessPieces {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPieces {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class Bishop implements ChessPieces {
    public void moves() {
        System.out.println("diagonal");
    }
}

class Knight implements ChessPieces {
    public void moves() {
        System.out.println("L");
    }
}

class King implements ChessPieces {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (upto one square)");
    }
}

class Pawn implements ChessPieces {
    public void moves() {
        System.out.println("up, down, diagonal when capturing - (upto one square)");
    }
}