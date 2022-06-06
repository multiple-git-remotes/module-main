package ua.in.sz.git.module;

import ua.in.sz.git.module.a.ModuleA;
import ua.in.sz.git.module.a.ModuleARefactor;
import ua.in.sz.git.module.b.ModuleB;

public class App {
    public static void main(String[] args) {
        System.out.println("main: " + App.class.getName());

        ModuleA.exec();

        ModuleB.exec();

        ModuleARefactor.exec();
    }
}
