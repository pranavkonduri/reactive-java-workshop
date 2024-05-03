package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
//        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux()
                .map(user -> user.getFirstName())
                .subscribe(user -> System.out.println(user));

        // Event hangs until we decide to close the thread
        System.out.println("Press a key to end");
        System.in.read();
    }

}
