package factory;

import factory.button.Button;
import factory.button.IosButton;
import factory.dropdown.DropDown;
import factory.dropdown.IosDropDown;

public class IosUiFactory implements  UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
