package parentchild2;

    abstract class Parent {
        void print() {
            println();
        }

        abstract void println();
    }
    class Child extends Parent{
        @Override
        void println(){
            System.out.println("println");
        }

    }
