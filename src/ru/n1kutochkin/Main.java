package ru.n1kutochkin;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser(in.nextLine());

        if (parser.getResult().isPresent()) {
           System.out.println(parser.getResult().get().getResult());
        } else {
            throw new Exception();
        }
    }
}
