package Magical_Arena;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    public void startFight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker, defender;
            if (playerA.getHealth() < playerB.getHealth()) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }
            takeTurn(attacker, defender);
        }

        if (!playerA.isAlive()) {
            System.out.println("Player A has died. Player B wins!");
        } else {
            System.out.println("Player B has died. Player A wins!");
        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int damageDealt = attacker.getAttack() * attackRoll;
        int damageDefended = defender.getStrength() * defendRoll;
        int damageTaken = Math.max(0, damageDealt - damageDefended);

        defender.setHealth(defender.getHealth() - damageTaken);

        System.out.println("Attacker rolled: " + attackRoll + " -> Damage: " + damageDealt);
        System.out.println("Defender rolled: " + defendRoll + " -> Defended: " + damageDefended);
        System.out.println("Defender takes " + damageTaken + " damage. Remaining health: " + defender.getHealth());
    }
}
