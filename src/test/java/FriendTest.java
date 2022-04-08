import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FriendTest {
    @Test
    void shouldAbleToShareChocolateWithAnotherFriend() {
        Friend friendOne = new Friend(4);
        Friend friendTwo = new Friend(0);
        SharingService mockedSharingService = mock(SharingService.class);

        friendOne.makeFriend(friendTwo);
        friendOne.share(mockedSharingService);

        verify(mockedSharingService, times(1)).share(friendTwo);
    }
}
