package com.example.prakpbp10;

import java.util.ArrayList;

public class MoviesData {
    private static final String[] movieTitles = {
            "Black Panther: Wakanda Forever",
            "Black Adam",
            "ONE PIECE FILM RED",
            "Ticket to Paradise",
            "The Bad Guys",
            "Lyle, Lyle, Crocodile"
    };

    private static final String[] movieDescriptions = {
            "Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.",
            "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.",
            "Uta — the most beloved singer in the world. Her voice, which she sings with while concealing her true identity, has been described as “otherworldly.” She will appear in public for the first time at a live concert. As the venue fills with all kinds of Uta fans — excited pirates, the Navy watching closely, and the Straw Hats led by Luffy who simply came to enjoy her sonorous performance — the voice that the whole world has been waiting for is about to resound.",
            "A divorced couple teams up and travels to Bali to stop their daughter from making the same mistake they think they made 25 years ago.",
            "When the Bad Guys, a crew of criminal animals, are finally caught after years of heists and being the world’s most-wanted villains, Mr. Wolf brokers a deal to save them all from prison.",
            "When the Primm family moves to New York City, their young son Josh struggles to adapt to his new school and new friends. All of that changes when he discovers Lyle — a singing crocodile who loves baths, caviar and great music — living in the attic of his new home. But when Lyle’s existence is threatened by evil neighbor Mr. Grumps, the Primms must band together to show the world that family can come from the most unexpected places."
    };

    private static final int[] moviePosterImages = {
            R.drawable.black_panther,
            R.drawable.black_adam,
            R.drawable.one_piece,
            R.drawable.ticket_to_paradise,
            R.drawable.bad_guys,
            R.drawable.lyle_lyle_crocodile
    };

    static ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieTitles.length; i++) {
            Movie movie = new Movie();
            movie.setTitle(movieTitles[i]);
            movie.setDescription(movieDescriptions[i]);
            movie.setPosterImage(moviePosterImages[i]);

            movies.add(movie);
        }

        return movies;
    }
}
