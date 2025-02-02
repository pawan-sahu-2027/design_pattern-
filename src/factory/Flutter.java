package factory;

public class Flutter {
    void refreshUI(){
        System.out.println("Flutter refreshUI");
    }
    void setTheme(){
        System.out.println("Flutter setTheme");
    }

    public UiFactory getUiFactory(String platform){
        if(platform.equalsIgnoreCase("windows")){
            return new WindowsUiFactory();
        } else if(platform.equalsIgnoreCase("ios")){
            return new IosUiFactory();
        } else if(platform.equalsIgnoreCase("android")){
            return new AndroidUiFactory();
        }
        return null;
    }

}
