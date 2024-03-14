package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage( String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYearOfCreation() {
        return this.yearOfCreation;
    }
    public String getCreator() {
        return this.creator;
    }

    public static void main( String[] args ) {
        ProgrammingLanguage language = new ProgrammingLanguage("C++", 1979, "Bjarne Stroustrup");
        System.out.println( language.getName() );
        System.out.println( language.getYearOfCreation() );
        System.out.println( language.getCreator() );
    }

}
