package bites.examples;

public class Quiz {
    String questionOne;
    String questionTwo;

    public Quiz( String questionOne, String questionTwo) {
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    public String getQuestionOne() {
        return this.questionOne;
    }

    public String getQuestionTwo() {
        return this.questionTwo;
    }

    public static void main( String[] args ) {
        Quiz quiz = new Quiz("What is 1+1?", "What is 2+2?");
        System.out.println( quiz.getQuestionOne() );
        System.out.println( quiz.getQuestionTwo() );
    }

}
