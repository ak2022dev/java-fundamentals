package bites.examples;

public class StoryBuilder {
    String plot;

    public StoryBuilder() {
        this.plot = "";
    }

    public void addPlotLine( String addToPlot ) {
        this.plot += addToPlot + "\n";
    }

    public String getPlot() {
        return this.plot;
    }

    public static void main( String[] args ) {
        StoryBuilder story = new StoryBuilder();
        story.addPlotLine("One day it was raining." );
        story.addPlotLine( "Then the sun came out." );
        story.addPlotLine( "So there was a beautiful rainbow in the sky!");
        System.out.println( story.getPlot() );
    }

}
