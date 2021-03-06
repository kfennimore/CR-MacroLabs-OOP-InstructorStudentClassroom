package io.zipcoder.interfaces;

final class Students extends People <Student> {


    private final static Students INSTANCE = new Students();


    private Students() {

    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public Student[] getStudentArray() {

        Student[] arrayofStudent = new Student[getArray().length];
        for (int i = 0; i < arrayofStudent.length; i++) {
            arrayofStudent[i] = (Student)getArray()[i];
        }
        return arrayofStudent;
    }


    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }
}