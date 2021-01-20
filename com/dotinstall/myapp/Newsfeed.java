import java.util.Arrays;

public class Newsfeed {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Newsfeed() {
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public String[] getTopics() {
        return topics;
    }

    public String getTopic() {
        return topics[0];
    }

    public void viewTopic(int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}