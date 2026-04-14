public class CooldownLimiter extends RateLimiter {
    long cooldownTimeMillis;
    long lastRequestTime;

    public CooldownLimiter(String userId, long cooldownTimeMillis) {
        super(userId);
        this.cooldownTimeMillis = cooldownTimeMillis;
        this.lastRequestTime = 0;
    }

    @Override
    public boolean allowRequest() {
        long currentTime = System.currentTimeMillis();

        if (currentTime - lastRequestTime >= cooldownTimeMillis) {
            lastRequestTime = currentTime;
            System.out.println("✅ [Cooldown] Request allowed for " + userId);
            return true;
        } else {
            long timeLeft = cooldownTimeMillis - (currentTime - lastRequestTime);
            System.out.println("❌ [Cooldown] Too fast! " + userId + " must wait " + timeLeft + "ms.");
            return false;
        }
    }
}