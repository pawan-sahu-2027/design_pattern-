package factory;

import factory.button.Button;
import factory.dropdown.DropDown;

public interface UiFactory {
     Button createButton();
     DropDown createDropDown();
}
