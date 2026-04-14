public class Main {
    public static void main(String[] args) throws InterruptedException {

        TrialLimiter user1 = new TrialLimiter("User_Alice", 3);
        CooldownLimiter user2 = new CooldownLimiter("User_Bob", 1000);

        System.out.println("--- Testing Alice (Trial Limiter) ---");
        simulateTraffic(user1, 4, 0);

        System.out.println("\n[Changing Alice's limits...]");
        user1.currentRequests = 0;
        user1.userId = "User_Alice_Changed";

        System.out.println("\n--- Testing Alice Again ---");
        simulateTraffic(user1, 2, 0);

        System.out.println("\n--- Testing Bob (Cooldown Limiter) ---");
        simulateTraffic(user2, 3, 400);
    }
    public static void simulateTraffic(RateLimiter limiter, int numberOfRequests, int sleepDelay) throws InterruptedException {
        for (int i = 0; i < numberOfRequests; i++) {
            limiter.allowRequest();

            if (sleepDelay > 0) {
                Thread.sleep(sleepDelay);
            }
        }
    }
}