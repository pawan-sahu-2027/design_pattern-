package factory;

import factory.button.Button;
import factory.button.WindowsButton;
import factory.dropdown.DropDown;
import factory.dropdown.WindowsDropDown;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
