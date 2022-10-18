# DSA-Project
A simple psuedocode/algorithm based project for creating a music player 

There is a file that contains the psuedocode of the whole project,simplified. The project which is the The music player has a playlist,a  tracklist, a repeat feature,a search feature and add/remove feature that  are all **initialised** in the code below:

initialize music player; 
initialize playlist;
initialize tracklist; 
initialize repeat function; 
initialize search function;
initialize add/remove function; 
play music player;
play tracks from playlist; 
repeat tracks as necessary; 
search for specific tracks;
add/remove tracks as necessary; 
exit 
end

**CREATING THE PLAYLIST**

function create_playlist()	// function for creating the playlist 
tracks := 100; 
linked_list := create_new_linked_list() ;
for i := 0 to tracks-1 do ;		//loop
add_track(linked_list, i); 		
end for;
return linked_list ;
end function;		//create playlist function ends

**PLAY TRACK**

function play_track(linked_list, track_number); 
current_track := linked_list.head ;
for i := 0 to track_number-1 do ;
current_track := current_track.next; 
end for ;
play_audio(current_track.data); 
end function;

**ADDING TRACK**

function add_track(linked_list, track_number);
new_track := create_new_track(track_number); 
if linked_list.head = null then;
linked_list.head := new_track ;
else 
current_track := linked_list.head; 
while current_track.next != null do; 
current_track := current_track.next; 
end while ;
current_track.next := new_track; 
end if ;
end function;

**REMOVE TRACK**

function remove_track(linked_list, track_number);
current_track := linked_list.head;
previous_track := null;
for i := 0 to track_number-1 do; 
previous_track := current_track; 
current_track := current_track.next; 
end for 
if previous_track = null then;
linked_list.head := current_track.next; 
else 
previous_track.next := current_track.next; 
end if 
end function

**SEARCH TRACK**

function search_playlist(linked_list, track_number);
current_track := linked_list.head;
while current_track != null do;
if current_track.data = track_number then;
return true;
end if 
current_track := current_track.next; 
end while;
return false; 
end function



Then, songs from the playlist are played on the music player. Searches for specific songs may be done, and the tracks are replayed as necessary. The last option is to add or delete tracks as needed
