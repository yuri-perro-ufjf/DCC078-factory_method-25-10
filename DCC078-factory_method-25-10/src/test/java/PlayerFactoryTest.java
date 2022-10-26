import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerFactoryTest {

    @Test
    void shouldBeReturnExForInvalidPlayer() {
        try {
            IPlayer player = PlayerFactory.getPlayer("PlayerTank");
            fail();
        }catch (IllegalArgumentException ex){
            assertEquals("Invalid Player!", ex.getMessage());
        }
    }

    @Test
    void shouldBeReturnExForInvalidObjectPlayer() {
        try {
            IPlayer player = PlayerFactory.getPlayer("PlayerOrc");
            fail();
        }catch (IllegalArgumentException ex){
            assertEquals("Invalid object instance player!", ex.getMessage());
        }
    }
}