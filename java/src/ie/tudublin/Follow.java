package ie.tudublin;

public class Follow {

    String word;
    int count;

    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        String temp;
        temp = word + ": " + count;
        
        return temp;
    }
}

