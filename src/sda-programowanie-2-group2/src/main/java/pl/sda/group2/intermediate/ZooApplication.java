package pl.sda.group2.intermediate;

class ZooApplication {
    public static void main(String[] args) {
        Bear polarBear1 = new PolarBear();
        Bear polarBear2 = new PolarBear();
        polarBear1.attack(polarBear2);
    }
}
