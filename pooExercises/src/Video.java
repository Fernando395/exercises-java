public class Video implements VideoActions {
    private String title;
    private int assessment;
    private int views;
    private int likes;
    private boolean reproducing;

    public Video (String title) {
        this.title = title;
        this.assessment = 1;
        this.views = 0;
        this.likes = 0;
        this.reproducing = false;

    }

    @Override
    public void play() {
        if (!reproducing) {
            reproducing = true;
        }

    }

    @Override
    public void pause() {
        if (this.reproducing) {
            this.reproducing = false;
        }

    }

    @Override
    public void like() {
        this.likes++;

    }
}
