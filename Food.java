// Food class
class Food {
    // private instance variable
    private String description;
    
    // constructor to initialize description
    public Food(String description) {
        this.description = description;
    }
    
    // getter method for description
    public String getDescription() {
        return description;
    }
    
    // isHealthy method that always returns true
    public boolean isHealthy() {
        return true;
    }
}