public class NewsletterBuilder {
    private String title;
    private String body;
    private String footer;

    public NewsletterBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public NewsletterBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public NewsletterBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public Newsletter build() {
        return new Newsletter(title, body, footer);
    }

    public static class Newsletter {
        private final String title;
        private final String body;
        private final String footer;

        public Newsletter(String title, String body, String footer) {
            this.title = title;
            this.body = body;
            this.footer = footer;
        }

        public void print() {
            System.out.println("Title: " + title);
            System.out.println("Body: " + body);
            System.out.println("Footer: " + footer);
        }
    }
}
