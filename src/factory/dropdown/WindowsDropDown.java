package factory.dropdown;

public class WindowsDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("WindowsDropDown showDropDown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("WindowsDropDown clickDropDown");
    }
}
