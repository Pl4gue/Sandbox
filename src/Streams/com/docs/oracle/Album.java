package Streams.com.docs.oracle;

import java.util.ArrayList;

/**
 * Project "Sandbox"
 * "Album.java" created by David Wu on Wed,12.07.17.
 */

public class Album {
    public ArrayList<Track> tracks=new ArrayList<>();
    public String name;

    public Album(String name,int... ratings) {
        this.name = name;
        for (int i: ratings
             ) {
            tracks.add(new Track(i));
        }
    }
}

class Track {
    Track(int i) {
        rating = i;
    }
    int rating;
}
/**
 * End of Album.java
 */