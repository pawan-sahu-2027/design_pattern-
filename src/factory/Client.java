package factory;

import factory.button.Button;
import factory.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {
//        UiFactory uiFactory = new WindowsUiFactory();
//        Button button = uiFactory.createButton();
//        DropDown dropDown = uiFactory.createDropDown();
//        button.clickButton();
//        dropDown.clickDropDown();
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getUiFactory("Windows");
        Button button = uiFactory.createButton();
        button.clickButton();
        DropDown dropDown = uiFactory.createDropDown();
        dropDown.clickDropDown();
    }
}
