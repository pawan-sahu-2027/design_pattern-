package factory.dropdown;

public class IosDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("IosDropDown showDropDown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("IosDropDown clickDropDown");
    }
}
