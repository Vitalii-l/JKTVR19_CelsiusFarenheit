/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfarenheit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    void run() {
        System.out.print("Введите температуру в градусах по Цельсию: ");
        Scanner scanner = new Scanner(System.in);
        int tCelsius = 0;
        tCelsius = scanner.nextInt();
        
        int tFarenheit = 5/9*tCelsius+32;
        System.out.print(tCelsius);
        System.out.print(" градусов Цельсия = ");
        System.out.print(tFarenheit);
        System.out.println(" градусов Фаренгейта");

    }
}
