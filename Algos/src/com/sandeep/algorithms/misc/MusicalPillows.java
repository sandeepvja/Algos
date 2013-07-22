package com.sandeep.algorithms.misc;

import java.util.HashMap;

/*
 * Problem Statement
In a family party, people are playing the musical pillow game 
in which people sit in a circle. Starting from the first person, 
they transfer the pillow to the person to their left. For simplicity, 
we’ll assume that people are assigned an integer tag 
from 1 to n (which is the total number of people) in the clockwise manner, 
so that during the game pillow is passed in the increasing sequence of. 
When game starts, a song is played and the person with the pillow at the end of the song, 
is eliminated and game starts again till there is only one person is left, 
which is declared as the winner of the game.
You are give total number of people playing the game 
and the duration of the song in seconds. 
If game starts with pillow being put on a table
 & person1 (person with tag number 1)picking it up
 (at the end of first second [time], pillow will be with person1) 
 and each person takes one second to transfer the pillow to the next person, 
 you have to tell which person (tag number) which will win the game. 
 */
public class MusicalPillows {

	/**
	 * @param args
	 */
	public static int getWinner(int input1,int input2)
    {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		int eliminatedCount=0;
		for(int i = 1; ; i++) {
			if(i > input1) {
				i = i % input1; 
			}
			if(!map.containsKey(i)){
				count++;
				if(count == input2) {
					map.put(i, i);
					System.out.println("Eliminated: "+i);
					eliminatedCount++;
					count = 0;
				}
				if(eliminatedCount == input1 - 1){
					break;
				}
			}
		}
		int returnVal = 0;
		for(int i = 1; i <= input1; i++) {
			if(!map.containsKey(i)){
				returnVal = i;
			}
		}
		return returnVal;
    }
	public static void main(String[] args) {
		System.out.println(MusicalPillows.getWinner(5, 2));
	}

}
