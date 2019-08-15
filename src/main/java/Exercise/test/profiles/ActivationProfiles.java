package Exercise.test.profiles;

public class ActivationProfiles {
    private Profiles profiles;

    public ActivationProfiles(Profiles profiles) {
        this.profiles = profiles;
    }

    public void oututProfiles() {
        System.out.println("Выбран " + profiles.getProfiles());
    }
}
