package bean;

public class Qanda {

    private int quizid;
    private String title;
    private String level;
    private String genre;
    private String orderno;

    public int getQuizid() {
        return quizid;
    }
    public String getTitle() {
        return title;
    }
    public String getLevel() {
        return level;
    }
    public String getGenre() {
        return genre;
    }
    public String getOrderno() {
        return orderno;
    }

    public void setQuizid(int quizid) {
        this.quizid=quizid;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public void setLevel(String level) {
        this.level=level;
    }
    public void setGenre(String genre) {
        this.genre=genre;
    }
    public void setOrderno(String orderno) {
        this.orderno=orderno;
    }
}   