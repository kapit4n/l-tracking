class UserProfile {
    private String name;
    private String[] skills;

    public UserProfile(String name) {
        this.name = name;
        this.skills = new String[]{"Software Developer", "Java", "Scala"};
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String[] getSkills() { return this.skills; };
    public void setSkills(String[] skills) { this.skills = skills; }

    public String toString() {
        String res = "";
        res += this.name + "\n";
        res += "skills: ";
        for(String skill: this.skills) res += skill + ", ";
        return res;
    }
}