package TrafficLights;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
    private List<String> lights;

    public TrafficLight(String[] arr) {
        this.lights = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            this.lights.add(i, Light.valueOf(arr[i]).name());
        }
    }

    public void update() {
        for (int i = 0; i < this.lights.size(); i++) {
            lights.set(i, Light.valueOf(lights.get(i)).getNextColor());
        }
    }

    @Override
    public String toString() {
        return String.join(" ", this.lights);
    }
}
