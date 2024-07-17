class RedChilliesEntertainmentRunner {


public static void main(String []actt){
	

boolean namesactors = RedChilliesEntertainment.addMovieActors("Ranbir Kapoor");
   System.out.println("The Actors Name Are :- "+namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Yash");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Kiccha Sudeep");
  System.out.println("The Actors Name Are :- "+namesactors );
  namesactors = RedChilliesEntertainment.addMovieActors("Tiger Shroff");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Akshay Kumar");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Ranveer Sing");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Harrdy Sandhu");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("John Abraham");
  System.out.println("The Actors Name Are :- "+ namesactors);
  namesactors = RedChilliesEntertainment.addMovieActors("Varun Dhawan");
  System.out.println("The Actors Name Are :- "+ namesactors);
  
  
  boolean act = RedChilliesEntertainment.update("Harrdy Sandhu","shahrukh khan");
  System.out.println("The Actors Name Are"+act);

 // RedChilliesEntertainment.deleteActorName();
  RedChilliesEntertainment.deleteActorName("Harrdy Sandhu");
						RedChilliesEntertainment.getMovieActors();
}

}