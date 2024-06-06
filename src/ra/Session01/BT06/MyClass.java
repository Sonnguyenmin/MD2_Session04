package ra.Session01.BT06;

public class MyClass {
    private  String myString;

    public MyClass() {
    }

    public MyClass(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "myString='" + this.myString + '\'' +
                '}';
    }
}
