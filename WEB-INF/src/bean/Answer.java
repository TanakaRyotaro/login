package bean;

public class Answer {

    private int answerid;
    private int quizid;
    private String judge;
    private String description;
    private String note1;

    public int getAnswerid() {
        return answerid;
    }
    public int getQuizid() {
        return quizid;
    }
    public String getJudge() {
        return judge;
    }
    public String getDescription() {
        return description;
    }
    public String getNote1() {
        return note1;
    }

    public void setAnswerid(int answerid) {
        this.answerid=answerid;
    }
    public void setQuizid(int quizid) {
        this.quizid=quizid;
    }
    public void setJudge(String judge) {
        this.judge=judge;
    }
    public void setDescription(String description) {
        this.description=description;
    }
    public void setNote1(String note1) {
        this.note1=note1;
    }
}