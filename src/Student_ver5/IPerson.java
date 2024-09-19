package Student_ver5;

import java.util.Date;

interface IPerson {

    void addPerson();

    void updatePerson(String id);

    void displayInfo();
}

abstract class Person implements IPerson {

    protected String id;
    protected String fullName;
    protected Date dateOfBirth;
    protected Date bookBorrowDate;
    protected Date bookReturnDate;

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public abstract void addPerson();

    public abstract void updatePerson(String id);

    public abstract void displayInfo();

    public boolean isBookOverdue() {
        long differenceInDays = (bookReturnDate.getTime() - bookBorrowDate.getTime()) / (1000 * 60 * 60 * 24);
        return differenceInDays >= 30;
    }
}
