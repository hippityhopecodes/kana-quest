package entities;

public class Player {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int level;
    private int experience;
    private int correctAnswers;
    private int totalAnswers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Player(String name) {
        // TODO
    }

    private void levelUp() {
        // TODO
    }

    public void gainExperience(int amount) {
        // TODO
    }

    public void takeDamage(int damage) {
        // TODO
    }

    public void heal(int amount) {
        // TODO
    }

    public boolean isAlive() {
       // TODO
       return false;
    }

    public void recordAnswer(boolean correct) {
        // TODO
    }
}
