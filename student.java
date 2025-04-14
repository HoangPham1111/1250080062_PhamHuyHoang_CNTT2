package LABTUAN2;
public class student {
    private String stID;
    private String stName;
    private String stClass;
    public student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }
    public student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    public student(student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }
    public String getStID() {
        return stID;
    }
    public void setStID(String stID) {
        this.stID = stID;
    }
    public String getStName() {
        return stName;
    }
    public void setStName(String stName) {
        this.stName = stName;
    }
    public String getStClass() {
        return stClass;
    }
    public void setStClass(String stClass) {
        this.stClass = stClass;
    }
    public String toString() {
        return "Student ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}
