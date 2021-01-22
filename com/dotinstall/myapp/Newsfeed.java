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

    public int getNumTopics() {
        return topics.length;
    }

    public void viewTopic(int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args) {
        Newsfeed feed;
        if (args[0].equals("Human")) {
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Newsfeed(humanTopics);
        } else if(args[0].equals("Robot")) {
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Newsfeed(robotTopics);
        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Newsfeed(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
        
        Newsfeed sampleFeed = new Newsfeed();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
        System.out.println("The number of topics is " + sampleFeed.getNumTopics());
    }
}