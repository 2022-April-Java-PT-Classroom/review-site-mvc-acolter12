package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {

    Map<Long, Reviews> reviewsList = new HashMap<>();

    public ReviewsRepository() {
        Reviews Halloween = new Reviews(1L, "Halloween", 1978,"../images/halloween1.jpeg","Slasher", "10/10 Great classic horror movie. Number one reason why I never babysat as a teen.");
        Reviews TheBlairWitchProject = new Reviews(2L,"The Blair Witch Project", 1999,"../images/blair-witch.jpeg", "Found Footage", "8/10 Don't mess with local legends!");
        Reviews TexasChainsawMassacre = new Reviews(3L, "The Texas Chainsaw Massacre (Remake)", 2004,"../images/texas-chainsaw-massacre.jpeg", "Slasher", "9/10 I will never, ever step foot in Texas!");
        Reviews EvilDead2 = new Reviews(4L, "Evil Dead 2", 1987,"../images/evil-dead-2.jpeg", "Horror Comedy", "7/10 Did not know this movie was a comedy the first time I watched this. (:");
        Reviews TheStrangers = new Reviews(5L, "The Strangers", 2008, "../images/strangers.jpg", "Home Invasion", "7.5/10 Slow-burn, but worth the watch!");

        reviewsList.put(Halloween.getId(), Halloween);
        reviewsList.put(TheBlairWitchProject.getId(), TheBlairWitchProject);
        reviewsList.put(TexasChainsawMassacre.getId(), TexasChainsawMassacre);
        reviewsList.put(EvilDead2.getId(), EvilDead2);
        reviewsList.put(TheStrangers.getId(), TheStrangers);
    }
    public ReviewsRepository(Reviews ...reviewsToAdd) {
        for(Reviews review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Reviews findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Reviews> findAll() {
        return reviewsList.values();
    }
}