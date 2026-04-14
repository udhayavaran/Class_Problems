public class TrialLimiter extends RateLimiter {
    int maxRequests;
    int currentRequests;

    public TrialLimiter(String userId, int maxRequests) {
        super(userId);
        this.maxRequests = maxRequests;
        this.currentRequests = 0;
    }

    @Override
    public boolean allowRequest() {
        if (currentRequests < maxRequests) {
            currentRequests++;
            System.out.println("✅ [Trial] Request " + currentRequests + " allowed for " + userId);
            return true;
        } else {
            System.out.println("❌ [Trial] Limit reached! " + userId + " must upgrade.");
            return false;
        }
    }
}