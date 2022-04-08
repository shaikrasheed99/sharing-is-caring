public class Friend {
    private final int chocolates;
    private Friend friend;

    public Friend(int chocolates) {
        this.chocolates = chocolates;
    }

    public void makeFriend(Friend other) {
        this.friend = other;
    }

    public void share(SharingService sharingService) {
        if (hasChocolatesGreaterThanTwo()) sharingService.share(friend);
    }

    private boolean hasChocolatesGreaterThanTwo() {
        return chocolates >= 2;
    }
}
