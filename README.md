
# imp-q2-and-q3
ListComparer Project
Overview
This project implements a Java class named ListComparer that processes two lists using the 2n-1 position selection logic. The class takes a list of integers and a list of strings as input, and returns a new list containing elements from the string list that are positioned at indices following the 2n-1 formula (where n=1,2,3,...).
Class Description
ListComparer contains the following key components:
Methods

processLists(List<Integer> list1, List<String> list2): Processes the two input lists and returns a new list containing elements from list2 positioned at 2n-1 indices.
main(String[] args): A demonstration method that creates sample lists and shows how the processing works.

2n-1 Logic
The class implements the 2n-1 position selection logic, which works as follows:

For n=1: Position = 1 (index 1, second element)
For n=2: Position = 3 (index 3, fourth element)
For n=3: Position = 5 (index 5, sixth element)
And so on...

Example
Given the input list:
javaList<String> list2 = Arrays.asList(
    "apple", "banana", "cherry", "date", "fig", "grape", 
    "apple", "banana", "cherry", "date", "fig", "grape",
    "kiwi", "lemon", "mango", "nectarine", "orange"
);
The result list will be:
["banana", "date", "grape", "banana", "date", "grape", "lemon", "nectarine"]
These are the elements at positions 1, 3, 5, 7, 9, 11, 13, 15 (using zero-based indexing).
Usage
To use this class:

Include the ListComparer class in your project
Create two lists - one of integers and one of strings
Call the processLists method with these lists as arguments:

javaList<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<String> list2 = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
List<String> result = ListComparer.processLists(list1, list2);
Requirements

Java 8 or higher
No external dependencies

Author
Paata Shvelidze
Version
1.0 (May 15, 2025)
