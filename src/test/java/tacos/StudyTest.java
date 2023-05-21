package tacos;

import org.junit.jupiter.api.Test;

public class StudyTest {

    @Test
    void extendsTest() {
        Child child = new Child();
        child.test2();
        System.out.println("==============");
        Parent parent = new Parent();
        parent.test2();
        System.out.println("==============");

        new Child("testing...");
    }

    static class Parent {

        public Parent() {
            System.out.println("Parent 생성자~!~!");
        }

        public Parent(String arg1) {
            System.out.println("Parent arg " + arg1);
        }

        public void test1() {
            System.out.println("parent test1~!");
        }

        public void test2() {
            System.out.println("parent test2~!");
            this.test1();
        }
    }

    static class Child extends Parent {
        public Child() {
            System.out.println("Child 생성자~!~!");
        }
        public Child(String arg1) {
            System.out.println("Child arg " + arg1);
        }

        @Override
        public void test1() {
            System.out.println("child test1~!");
        }

        @Override
        public void test2() {
            super.test2();
        }
    }
}
