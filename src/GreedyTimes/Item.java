package GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;

public class Item {
    private LinkedHashMap<String, Long> item;

    public Item() {
        this.item = new LinkedHashMap<>();
    }

    public boolean containsKey(String itemName) {
        return item.containsKey(itemName);
    }

    public void put(String itemName, long amount) {
        this.item.put(itemName, amount);
    }

    public long get(String itemName) {
        return this.item.get(itemName);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        this.item.entrySet()
                .stream().sorted((e1, e2) -> e2.getKey()
                .compareTo(e1.getKey()))
                .forEach(i -> result.append("##")
                        .append(i.getKey())
                        .append(" - ").append(i.getValue())
                        .append(System.lineSeparator()));

        return result.toString();
    }

    public Collection<Long> values() {
        return this.item.values();
    }
}
