//leetcode 380, Insert Delete GetRandom O(1)

class RandomizedSet {
    List<Integer> list;               // stores the values
    Map<Integer, Integer> map;        // value -> index in list
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int idx = map.get(val);
        int lastVal = list.get(list.size() - 1);

        // Swap current with last element
        list.set(idx, lastVal);
        map.put(lastVal, idx);

        // Remove last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}
