package com.company.T014;

import java.util.ArrayList;
import java.util.Random;

public class Vector {
    public Vector(int x, int y, int z) {
    }
    public double Length(int x, int y, int z) {
            return Math.sqrt(x*x + y*y + z*z);
    }
    public double ScalarMultiplication(int x1, int y1, int z1, int x2, int y2, int z2) {
        return x1*x2 + y1*y2 + z1*z2;
    }
    public double CalculateCosAngle(int x1, int y1, int z1, int x2, int y2, int z2) {
        return ScalarMultiplication(x1, y1,  z1,  x2,  y2,  z2)/Length(x1, y1, y2) * Length(x2, y2, z2);
    }
    public final Vector VectorSum(int x1, int y1, int z1, int x2, int y2, int z2) {
        int x3, y3, z3;
        x3 = x1 + x2;
        y3 = y1 + y2;
        z3 = z1 + z2;
        return new Vector(x3, y3, z3);
    }
    public final Vector VectorDifference(int x1, int y1, int z1, int x2, int y2, int z2) {
        int x3, y3, z3;
        x3 = x1 - x2;
        y3 = y1 - y2;
        z3 = z1 - z2;
        return new Vector(x3, y3, z3);
    }
    public static ArrayList<Vector> randomVectors(int N) {
        ArrayList<Vector> randomVectorsArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            randomVectorsArray.set(i, new Vector(r.nextInt(), r.nextInt(), r.nextInt()));
        }
        return randomVectorsArray;
    }
}
