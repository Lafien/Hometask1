class NestedLoops {

    static String rectangle() {
        String mess = "";


        for (int i = 1; i < 6; i++) {
            for (int j = -5; j < 0; j++) {
                mess += "#";
            }
            mess += "\n";
        }

        return mess;
    }

    static String triangleClassic() {
        String mess = "";
        for (int i = 8; i >= 0; i--) {
            for (int j = i; j < 8; j++) {
                mess += "#";
            }
            mess += "\n";
        }
        mess += "\n";
        return mess;
    }

    static String triangleReverse() {
        String mess = "";
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                mess += "#";
            }
            mess += "\n";
        }
        mess += "\n ";
        return mess;
    }

    static String emptySquare() {
        String mess = "";
        for (int i = 0; i <= 6; i++) {
            if (i == 0 || i == 6) {
                for (int j = 1; j <= 7; j++) {
                    mess += "#";
                }
            } else {
                mess += "#";
                for (int j = 1; j <= 12; j++) {
                    mess += " ";
                }
                mess += "#";
            }
            mess += "\n";
        }
        mess += "\n";
        return mess;
    }

}