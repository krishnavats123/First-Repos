public class String_conversions{
public static void main(String[] args) { 


//https://www.youtube.com/watch?v=1SJK4Y4axXs&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=14&pp=iAQB by harry
  
  
  
//LENGTH
    String name="KrIsHnA";
    int length=name.length();
    System.out.println(length);

//TO LOWER CASE
    String to_lower_case=name.toLowerCase();
    System.out.println(to_lower_case);

//TO UPPER CASE
    String to_upper_case=name.toUpperCase();
    System.out.println(to_upper_case);
    
//TRIMMING-to remove spaces form the string from both sides
    String trimmed=name.trim();
    System.out.println(trimmed);

//SUBSTRING-print string from the value assigned
    String Substringed_only_starting=name.substring(4);
    System.out.println(Substringed_only_starting);

//SUBSTRING-can also be use to assigned both starting and ending values
    String Substringed_both_starting_and_ending=name.substring(2, 5);
    System.out.println(Substringed_both_starting_and_ending);

//REPLACE-to replace characters
    String Replaced=name.replace('K','m');
    System.out.println(Replaced);

//Startswith-to check whether the string start from given characters
    Boolean Startswithh=name.startsWith("Kr");
    System.out.println(Startswithh);

//Endswith-to check whether the string ends from given characters 
    Boolean Endswithh=name.endsWith("an");
    System.out.println(Endswithh);

//CHARACTER POSITION- by this we'll get the value of the given charatcer assigned to that position
    char Position=name.charAt(6);
    System.out.println(Position);

//Name INDEX-value in char of the assigned string 
    int INDEX=name.indexOf("s");
    System.out.println(INDEX);

//NAME INDEX-can also be used as to find the value of assigned string from assigned value if didnt found then (-1)
    int INDEX_BOTH=name.indexOf("K",3);
    System.out.println(INDEX_BOTH);
    
//LAST INDEX-returns the value form last of the assigned string
    int Last_Index=name.lastIndexOf("A");
    System.out.println(Last_Index);

//LAST INDEX-also used to return value of given string from given position
    int Last_Index_with_value=name.lastIndexOf("A", 5);
    System.out.println(Last_Index_with_value);

//Equals-to check whether the given string is equal? (case sensitive)
    Boolean Equality=name.equals("KrIsHnA");
System.out.println(Equality);

//Equals ignore case -check the equality irrespective(non case sensitive)
    Boolean Equality2=name.equalsIgnoreCase("Krishna");
    System.out.println(Equality2);

}
}
