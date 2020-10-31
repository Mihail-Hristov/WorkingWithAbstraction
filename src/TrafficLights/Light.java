package TrafficLights;

public enum Light {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String nextColor;

    Light(String nextColor) {
        this.nextColor = nextColor;
    }

    public String getNextColor() {
        return this.nextColor;
    }
}
