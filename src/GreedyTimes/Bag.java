package GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private long gold;
    private long gem;
    private long cash;
    private long capacity;
    private LinkedHashMap<String, Item> bag;

    public Bag(long capacity) {
        bag = new LinkedHashMap<>();
        this.capacity = capacity;
        long gold = 0;
        long gem = 0;
        long cash = 0;
    }

    public void putItems(String[] items) {
        for (int i = 0; i < items.length; i += 2) {
            String itemName = items[i];
            long amount = Long.parseLong(items[i + 1]);

            String currentItem = findItem(itemName);

            if (currentItem.equals("")) {
                continue;
            } /*else if (capacity < bag.values()
                    .stream()
                    .forEach(it -> it.values().stream().mapToLong(e -> e))
                    .sum() + amount) {
                continue;
            }*/

            switch (currentItem) {
                case "Gem":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gold")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gem")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(currentItem)) {
                bag.put((currentItem), new Item());
            }

            if (!bag.get(currentItem).containsKey(itemName)) {
                bag.get(currentItem).put(itemName, 0L);
            }


            bag.get(currentItem).put(itemName, bag.get(currentItem).get(itemName) + amount);
            if (currentItem.equals("Gold")) {
                this.gold += amount;
            } else if (currentItem.equals("Gem")) {
                this.gem += amount;
            } else if (currentItem.equals("Cash")) {
                this.cash += amount;
            }
        }
    }

    private String findItem(String itemName) {
        String theItemIs = "";
        if (itemName.length() == 3) {
            theItemIs = "Cash";
        } else if (itemName.toLowerCase().endsWith("gem")) {
            theItemIs = "Gem";
        } else if (itemName.toLowerCase().equals("gold")) {
            theItemIs = "Gold";
        }
        return theItemIs;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry <String, Item> item : bag.entrySet()) {
            Long sumValues = item.getValue().values().stream().mapToLong(l -> l).sum();
            result.append(String.format("<%s> $%s", item.getKey(), sumValues));
            result.append(System.lineSeparator());

            result.append(item.getValue().toString());
        }

        return result.toString().trim();
    }
    
    
}
