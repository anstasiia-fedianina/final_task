package ebay.helpers.impl;

import ebay.helpers.BaseHelper;
import ebay.pages.impl.RegistrationPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class RegistrationHelper extends BaseHelper<RegistrationPage> {
    public RegistrationHelper() {
        super(new RegistrationPage());
    }
public RegistrationHelper clickEmailField () {
        getPage().getEmailField().click();
        return this;
}
public RegistrationHelper clickAway () {
        getPage().getLoadableElement().click();
        return this;
}
    public RegistrationHelper clickPassField () {
        getPage().getPasswordField().click();
        return this;
    }
    public boolean checkEmptyEmailError() {
        return getPage().getEmailError().getText().contains("Please enter your email address.");
    }

    public boolean checkEmptyPassError() {
        return getPage().getEmailError().getText().contains("Please enter a password.");
    }

    public boolean checkSmallEmailError() {
        return getPage().getEmailError().getText().contains("Please enter your email address.");
    }

    public boolean checkSmallPassError() {
        return getPage().getEmailError().getText().contains("Please enter a password.");
    }
}
