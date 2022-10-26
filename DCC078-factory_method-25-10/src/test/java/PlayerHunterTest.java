import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHunterTest {

    @Test
    void hunterShouldBeAttack() {
        IPlayer player = PlayerFactory.getPlayer("PlayerHunter");
        assertEquals("Hunter has attacked!", player.attack());
    }

    @Test
    void hunterShouldBeDefend() {
        IPlayer player = PlayerFactory.getPlayer("PlayerHunter");
        assertEquals("Hunter has attacked!", player.attack());
    }
}