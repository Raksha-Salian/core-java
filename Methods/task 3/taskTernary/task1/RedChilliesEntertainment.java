import java.util.*;
class RedChilliesEntertainment{
	static String movieActors[] = {null,null,null,null,null,null,null,null,null};
	static int index ;
	// Create Operation
	public static boolean addMovieActors(String actorNames){
	System.out.println("The Actors Name is Creating");
	boolean isActorsNameCreated = false;
	if (actorNames != null ){
		movieActors[index]=actorNames;
		index++;
		isActorsNameCreated = true;
	}else{
		System.out.println("Please Provide Actors Names");	
	}
	return isActorsNameCreated;
	}
	
	// Read Operation 
	public static void getMovieActors(){
		System.out.println("The RedChilliesEntertainment Actors Are ");
	    for (String movieActor : movieActors){
		 System.out.println(movieActor);
	
	    }
	}
	// UpDate Operation
	public static boolean update(String oldList ,String newList){
		boolean isActorsNameUpdated = false;
		for( int index = 0;  index < movieActors.length; index++ ){
			if( oldList == movieActors [index]){
				movieActors[index]= newList;
				isActorsNameUpdated= true;	
			}
		}
		if (isActorsNameUpdated ==false){
			System.out.println(oldList +"Not Found");
		}
		return isActorsNameUpdated;
	
	}
	
	public static boolean deleteActorName(String deleteActorName){
	
	boolean isDeleteActorName=false;
	int newIndex,oldIndex;
	for(newIndex=0, oldIndex=0; oldIndex<movieActors.length;oldIndex++){
		if(deleteActorName != movieActors[oldIndex]){
			
			movieActors[newIndex]=movieActors[oldIndex];
			newIndex++;		
		}	
	}
	movieActors=Arrays.copyOf(movieActors,newIndex);
	if(movieActors!=null)
		isDeleteActorName=true;
		if(isDeleteActorName==false)
		System.out.println(deleteActorName+" not deleted chat ");
return isDeleteActorName;
}
	
}