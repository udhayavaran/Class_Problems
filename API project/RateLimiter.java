public abstract class RateLimiter {
    String userId;
    public RateLimiter(String userId) {
        this.userId = userId;
    }
    public abstract boolean allowRequest();
}