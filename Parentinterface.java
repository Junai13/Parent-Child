package interfaceparent;


    abstract class Parentinterface {
        void print() {
            println();
        }

        abstract void println();
    }
    class Child extends Parentinterface {
        @Override
        void println() {
            System.out.println("println");
        }
    }
