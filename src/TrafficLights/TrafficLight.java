package TrafficLights;

public enum TrafficLight {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String nextColor;

    TrafficLight(String nextColor) {
        this.nextColor = nextColor;
    }

    public String getNextColor() {
        return this.nextColor;
    }
}
