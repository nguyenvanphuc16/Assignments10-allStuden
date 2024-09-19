package Student_ver5;

import java.util.ArrayList;

class PersonList {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addStudent(Student student) {
        personList.add(student);
        student.addPerson();
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
        teacher.addPerson();
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            person.updatePerson(id);
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
        System.out.println("Person deleted.");
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }

    public void checkBookBorrowing() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }
}
