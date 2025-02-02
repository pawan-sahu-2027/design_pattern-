package factory;

import factory.button.AndroidButton;
import factory.button.Button;
import factory.dropdown.AndroidDropDown;
import factory.dropdown.DropDown;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
