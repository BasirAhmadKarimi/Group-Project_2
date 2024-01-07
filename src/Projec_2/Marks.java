package Projec_2;
/*
   We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
    */
public abstract class Marks {

  abstract   double  getPercentage();

}
class A extends Marks{
    double subjectEnglish, subjectHistory, subjectMath;

    public A(double subjectEnglish, double subjectHistory, double subjectMath) {
        this.subjectEnglish = subjectEnglish;
        this.subjectHistory = subjectHistory;
        this.subjectMath = subjectMath;
    }

    @Override
    double getPercentage() {
        return (subjectEnglish+subjectHistory+subjectMath)/3;
    }
}
class B extends Marks{
    double subjectEnglish;
    double subjectHistory;
    double subjectMath;
    double subjectArt;

    public B(double subjectEnglish, double subjectHistory, double subjectMath, double subjectArt) {
        this.subjectEnglish = subjectEnglish;
        this.subjectHistory = subjectHistory;
        this.subjectMath = subjectMath;
        this.subjectArt = subjectArt;
    }

    @Override
    double getPercentage() {
        return (subjectArt+subjectEnglish+subjectHistory+subjectMath)/4;
    }

    public static void main(String[] args) {
        A a=new A(99,66,89);
        B b=new B(100,96,79,93);
        System.out.println("The average of student A for all subjects is "+a.getPercentage());
        System.out.println("The average of studnent B  for all the subjects is "+b.getPercentage());
    }
}