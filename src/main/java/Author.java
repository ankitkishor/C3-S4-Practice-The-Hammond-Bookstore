/*
 * Author : Ankit Kishor
 * Date: 08-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Author  {
    private String authorName;
    private String penName;

    public Author() {
    }

    public Author(String authorName, String penName) {
        this.authorName = authorName;
        this.penName = penName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", penName='" + penName + '\'' +
                '}';
    }
}
