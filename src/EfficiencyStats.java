import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class EfficiencyStats {
    public static StatsResult computeStats(ArrayList<Car> carList) {
        if (carList.isEmpty()) {
            return new StatsResult(0.0, 0.0, 0.0);
        }

        double sum = 0;
        ArrayList<Double> efficiencies = new ArrayList<>();

        for (Car car : carList) {
            double efficiency = car.getFuelEfficiency();
            sum += efficiency;
            efficiencies.add(efficiency);
        }

        Collections.sort(efficiencies);

        double mean = sum / carList.size();
        double median = calculateMedian(efficiencies);
        double mode = calculateMode(efficiencies);

        return new StatsResult(mean, median, mode);
    }

    private static double calculateMedian(ArrayList<Double> list) {
        int size = list.size();
        if (size % 2 == 0) {
            int mid = size / 2;
            return (list.get(mid - 1) + list.get(mid)) / 2.0;
        } else {
            return list.get(size / 2);
        }
    }

    private static double calculateMode(ArrayList<Double> list) {
        Map<Double, Integer> frequencyMap = new HashMap<>();

        for (double item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        double mode = 0;
        int maxFrequency = 0;

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mode;
    }
}

class StatsResult {
    public double mean;
    public double median;
    public double mode;

    public StatsResult(double mean, double median, double mode) {
        this.mean = mean;
        this.median = median;
        this.mode = mode;
    }
}

