
import java.util.Random;

public class IdkWhatToNameThisEither {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//create array of alphabet
			String[] availableCharsArray = new String[]{" ","a","b","c","d","e"
			                  ,"f","g","h","i","j","k"
			                  ,"l","m","n","o","p","q"
			                  ,"r","s","t","u","v","w"
			                  ,"x","y","z"};
			//create array of nouns
			String[] nounArray = new String[] {"God","A god","I","You","We","All humans"
					,"All entities present","All ghosts","Evil","THe old ones","The elders","The dragon","Old souls"
					,"Indigo children","Alien entities","Your Spouse","Your child","Your childeren","The Godess","A godess"
					,"Men","Women","A man","A woman","A soul","Death","Life", "A Wraith", "A Warlock", "A Witch", "A Wizard"
					,"A sorcerer","A polteirgeist","A wrake","A Demon","An Angel"};

			String[] adverbArray = new String[] {"is","was","is going to","never","forever","sometimes","evermore"
					,"has","hasn't"};
			String[] verbArray = new String[] {"died","lived","cursed","blessed","gave some energy","took some enery","read your mind"
					,"touched","ran away","ran towards you","floated to you","floated away","went to sleep","woke up"
					,"cried"," screamed" 
					,"attached to your body","attached to your bodies","invaded your mind","left your mind","disattached from you","disattached from yall"
					,"scratched you","scratched something.","is offended","is peaceful","is peaceful for now","is angry","is happy"
					,"is sad","missed you","misses you", "returned to heaven","returned to hell","returned to limbo"
					,"returned home","went into the light","went into the dark"};
			//randomly select characters and spaces
			int stringSize = 256;  // chars unit measurement
			String[] witchySays = new String[stringSize];

			Random random = new Random();
/*
			for(int x = stringSize -1;x>0;x--) 
			{*/
				//noun
			     int index0 = random.nextInt(nounArray.length);
			     String randomString0 = nounArray[index0];
					System.out.print(randomString0+" ");
			    //adverb 
				/*
			    int index1 = random.nextInt(adverbArray.length);
			     String randomString1 = adverbArray[index1];
			     System.out.print(randomString1+" ");*/
			    //verb 
			    int index2 = random.nextInt(verbArray.length);
			     String randomString2 = verbArray[index2];
			     System.out.print(randomString2);

				//print statement
				System.out.println(".");
				
				
			//}
					
	}

}
