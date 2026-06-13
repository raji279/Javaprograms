import java.util.Arrays;

class Job {
    char id;
    int deadline, profit;

    Job(char id, int d, int p) {
        this.id = id;
        deadline = d;
        profit = p;
    }
}

public class greedy {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 50),
            new Job('C', 2, 10),
            new Job('D', 1, 20)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 2;
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        int totalProfit = 0;

        for (int i = 0; i < jobs.length; i++) {
            for (int j = jobs[i].deadline - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs[i].id;
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }

        System.out.println("Selected Jobs:");
        for (char c : result) {
            System.out.println(c);
        }

        System.out.println("Total Profit: " + totalProfit);
    }
}