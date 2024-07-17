class NetFlix{
static String top10Movies[] = {"Gangs of Godavari", "Lapata ladies", "article370", "Shaitaan", "Crew", "safe house", "Bade Miyan Chote Miya", "under Paris", "focus", "spider-man"};
static String hindiMovies[] = {"Dunki", "jawan", "OMG", "Darlings", "GanguBai", "shehazada", "khufiya", "GumRaah", "Bhakshak", "Mimi", "83", "mili", "Hit", "Bulbul", "Major", "Jersey", "Queen", "Ok Jaanu", "Dhak Dhak", "Talaash", "Sanju", "Om shanti om", "Malang", "Malaal", "Raees"};
public static void main(String[] ottPlatform){
String englishSeries[] = {"Bridgerton", "Money Heist", "my demon", "vampire dairy", "king land", "Hidden Love", "never Have i Ever", "She", "Friends", "suits", "Lucifer", "anyone but you", "love at first sight", 
"Beast", "johhny english", "the english patient", "purple hearts", "NowHere", "Red Notice", "under paris", "man vs bee", "Bad boys", "After everything", "no hard feelings", "the notebook"};
String koreanSeries[] = {"hierarchy", "queen of tears", "destined with you", "my demon", "crash course", "Hidden love", "frankly speaking", "a time called you", "true beauty", "crash landing on you",
 "see you in next life", "celebrity", "behind your touch", "first love", "mask girl", "little women", "castway diva", "my holo love", "doctor chaa", "the glory"};
 System.out.println("the top 10 movies are");
for(int index = 0; index < top10Movies.length; index++){
	System.out.println(top10Movies[index]);
}
System.out.println("the hindi movies are");
for(int index = 0; index < hindiMovies.length; index++){
	System.out.println(hindiMovies[index]);
}
System.out.println("the english series are");
for(int index = 0; index < englishSeries.length; index++){
	System.out.println(englishSeries[index]);
}
System.out.println("the koreanSeries are");
for(int index = 0; index < koreanSeries.length; index++){
	System.out.println(koreanSeries[index]);
}

}
}

