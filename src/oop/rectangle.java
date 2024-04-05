package oop;

public class rectangle {
    double width, height;
    double getArea() {
        return width * height;
    }

    boolean isSquare() {
//        if (width == height) {
//            return true;
//        } else {
//            return false;
//        }
        return width == height;
    }
}
