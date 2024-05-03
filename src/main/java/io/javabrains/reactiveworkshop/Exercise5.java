package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()
        ReactiveSources.intNumberMono().subscribe();
        ReactiveSources.userMono().subscribe();


        // Subscribe to a flux using the error and completion hooks
        ReactiveSources.intNumbersFlux().subscribe(
                number -> System.out.println(number),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }
}