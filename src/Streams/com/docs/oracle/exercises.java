package Streams.com.docs.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project "Sandbox"
 * "exercises.java" created by David Wu on Wed,12.07.17.
 */

public class exercises {
    private static ArrayList<Person> roster = new ArrayList<>();
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
/*        System.out.print("OLD:"+"\n");
        oneOld();
        System.out.print("\nNEW:"+"\n");*/
//        oneNew();
        System.out.print("OLD:"+"\n");
        twoOld();
        System.out.print("\nNEW:"+"\n");
        twoNew();
    }


    static void setRoster() {
        roster.add(new Person(Person.SEX.FEMALE, "Katerina"));
        roster.add(new Person(Person.SEX.MALE, "David"));
        roster.add(new Person(Person.SEX.FEMALE, "Kaja"));
        roster.add(new Person(Person.SEX.MALE, "Daniel"));
        roster.add(new Person(Person.SEX.MALE, "Nils"));
        roster.add(new Person(Person.SEX.FEMALE, "Lea"));
        roster.add(new Person(Person.SEX.FEMALE, "Anna"));
        roster.add(new Person(Person.SEX.MALE, "Anton"));
        roster.add(new Person(Person.SEX.FEMALE, "Helena"));
        roster.add(new Person(Person.SEX.FEMALE, "Pauline"));
        roster.add(new Person(Person.SEX.MALE, "Armin"));
        roster.add(new Person(Person.SEX.FEMALE, "Paula"));
    }

    static void oneOld() {
        setRoster();
        for (Person p : roster) {
            if (p.getGender() == Person.SEX.MALE) {
                System.out.println(p.getName());
            }
        }
    }

    static void oneNew() {
        setRoster();
        System.out.println("Exercise one:");
        roster
                .stream()
                .filter(person -> person.getGender() == Person.SEX.MALE)
                .forEach(person -> System.out.println(person.getName()));
    }


    static void setAlbum() {
        albums.add(new Album("Album1", 3, 5, 2, 3, 5, 1, 5, 1, 3, 2, 4, 5));
        albums.add(new Album("Album2", 1, 2, 2, 3, 5, 1, 5, 1, 3, 3, 3, 3));
        albums.add(new Album("Album3", 3, 5, 3, 2, 4, 4, 4, 4, 4, 1, 1, 2, 4, 4));
        albums.add(new Album("Album4", 1, 2, 3, 3, 2, 1, 2, 2, 2, 1, 3, 3, 2, 5));
    }

    static void twoOld() {
        setAlbum();
        List<Album> favs = new ArrayList<>();
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.name.compareTo(a2.name);
            }});
        favs.forEach(album -> System.out.println(album.name));
    }

    static void twoNew() {
        setAlbum();
        List<Album> favs = albums
                .stream()
                .filter(album -> album.tracks.stream().anyMatch(track -> track.rating >= 4))
                .sorted(Comparator.comparing(a -> a.name))
                .collect(Collectors.toList());
        favs.forEach(album -> System.out.println(album.name));
    }


}

/**
 * End of exercises.java
 */