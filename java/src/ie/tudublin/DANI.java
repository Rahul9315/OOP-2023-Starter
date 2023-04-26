package ie.tudublin;

import java.util.ArrayList;



import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void loadFile()
	{
		String[] sentences = loadStrings("small.txt");
		for (String line : lines) {
            String[] words = split(line, ' ');

			
		}
		//Table t = loadTable("small.txt","header");
		for (TableRow r:t.rows())
		{
			Word w = new Word(this, r);
			follows.add(w);
		}
	}

	ArrayList<Word> follows = new ArrayList<>();

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		for ( Word word : follows)
		{
			text(ARGS_HIDE_STOP, X, Y, X, Y);
		}
		
		text("hi", width/2, height/2);//to check
        
	}
}



