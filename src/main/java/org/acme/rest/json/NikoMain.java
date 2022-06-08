package org.acme.rest.json;

import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.Quarkus;

@QuarkusMain
public class NikoMain {

    public static void main(String ... args) {
        System.out.println("Running NikoMain main method");
        Quarkus.run(args);
    }
}