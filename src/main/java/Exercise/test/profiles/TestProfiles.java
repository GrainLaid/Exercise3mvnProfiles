package Exercise.test.profiles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProfiles {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ContextProfiles.xml");

        Profiles profiles = context.getBean("ProfilesBean", Profiles.class);

        ActivationProfiles activationProfiles = new ActivationProfiles(profiles);

        activationProfiles.oututProfiles();

        context.close();
    }
}
