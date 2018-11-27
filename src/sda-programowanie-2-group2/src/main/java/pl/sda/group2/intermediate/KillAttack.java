package pl.sda.group2.intermediate;

class KillAttack implements AttackStrategy {
    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " zabil " +defender);
    }
}
