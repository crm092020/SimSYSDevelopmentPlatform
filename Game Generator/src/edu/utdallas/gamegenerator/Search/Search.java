package edu.utdallas.gamegenerator.Search;

/* 1) Initializes SearchComponents - LinkedList of criteria that can be searched.
 * 2) Initializes SearchInput - Creates a LinkedList of desired criteria.
 * 3) Initializes SearchAlgo - Uses SearchComponents List and SearchInput List for SearchAlgo
 * 4) Returns the Search Results as an array. 
 * */
public class Search {
	
	private SearchComponents searchcomponents;
	private SearchInput searchinput;
	private SearchAlgo searchalgo;
	private String[] allFiles = new String[6];
	

	public Search(){
		
		searchcomponents = new SearchComponents();
		searchinput = new SearchInput(searchcomponents);
		searchalgo = new SearchAlgo(searchinput.getSearchCriteria(), searchcomponents);
		allFiles=searchalgo.searchResults();
		
	}

	public String[] getAllFiles(){
		
		return allFiles;
	}

}