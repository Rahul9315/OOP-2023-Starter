package ie.tudublin;


import java.util.ArrayList;

import javax.swing.text.TableView.TableRow;

public class Word {
    
    String word;
    ArrayList<Follow> follows;

    public Word(String word) 
    {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }




    public Word(DANI dani, TableRow r) {
    }




    public String getWord() 
    {
        return word;
    }



    public ArrayList<Follow> getFollows() {
        return follows;
    }



    public void addFollow(Follow follow) {
        follows.add(follow);
    }



    public String toString() {
        StringBuilder sBuild = new StringBuilder();
        

        
        for (Follow follow : follows) {
            sBuild.append(follow.toString() + ", ");
        }
        
        return sBuild.toString();
    }

















}
