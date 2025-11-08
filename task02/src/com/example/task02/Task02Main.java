package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int currentByte;
        boolean lastWasCarriageReturn = false;
        while((currentByte = System.in.read()) != -1) {
            if (currentByte == 13) {
                if (lastWasCarriageReturn) System.out.write(13);
                lastWasCarriageReturn = true;
            }
            else if (currentByte == 10) {
                if (lastWasCarriageReturn) {
                    System.out.write(10);
                    lastWasCarriageReturn = false;
                }
                else System.out.write(10);
            }
            else {
                if (lastWasCarriageReturn) {
                    System.out.write(13);
                    lastWasCarriageReturn= false;
                }
                System.out.write(currentByte);
            }
        }

        if (lastWasCarriageReturn) System.out.write(13);
        System.out.flush();
    }
}
