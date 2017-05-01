package innerClass.practice;

/**
 * Created by carlosarosemena on 2017-04-30.
 */
public class scrumIssue {
    private String title;
    private double storyPoints;

    public scrumIssue(String title, double points){
        this.title = title;
        this.storyPoints = points;

    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return this.title+" "+this.storyPoints;
    }
}
