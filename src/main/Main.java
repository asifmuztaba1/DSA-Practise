package main;

import datastructure.DSAArrays;
import complexity.ComplexityAnalyzer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DSAArrays arrays = new DSAArrays(new int[]{0, 1, 2, 3, 4});

        // Create an instance of ComplexityAnalyzer
        ComplexityAnalyzer<int[]> analyzer = new ComplexityAnalyzer<>();

        // Define an operation that calls the rotateArray method
        ComplexityAnalyzer.Operation<int[]> rotateOperation = input -> {
            int position = 1; // Specify the rotation position
            arrays.rotateArray(position);
        };

        // Analyze the time and space complexity of the rotate operation
        analyzer.analyzeOperation(rotateOperation, arrays.getElement());
        long elapsedTime = analyzer.getElapsedTime();

        // Use the static method to get the time complexity
        System.out.println("Time Complexity: " + ComplexityAnalyzer.getTimeComplexity(elapsedTime, arrays.getElement().length));
    }
}
