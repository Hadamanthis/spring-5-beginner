package br.com.geno.chapter2;

import java.io.PrintStream;

public interface Greeter {

    void setPrintStream(PrintStream printStream);

    void greet();
}
