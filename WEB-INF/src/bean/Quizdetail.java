package bean;

public class Quizdetail {
    private int quizdetailid;
    private int quizid;
    private String issue;
    private String note1;
    private String note2;
    private String note3;
    private String note4;

    public int getQuizdetailid() {
        return quizdetailid;
    }
    public int getQuizid() {
        return quizid;
    }
    public String getIssue() {
        return issue;
    }
    public String getNote1() {
        return note1;
    }
    public String getNote2() {
        return note2;
    }
    public String getNote3() {
        return note3;
    }
    public String getNote4() {
        return note4;
    }

    public void setQuizdetailid(int quizdetailid) {
        this.quizdetailid=quizdetailid;
    }
    public void setQuizid(int quizid) {
        this.quizid=quizid;
    }
    public void setIssue(String issue) {
        this.issue=issue;
    }
    public void setNote1(String note1) {
        this.note1=note1;
    }
    public void setNote2(String note2) {
        this.note2=note2;
    }
    public void setNote3(String note3) {
        this.note3=note3;
    }
    public void setNote4(String note4) {
        this.note4=note4;
    }
}