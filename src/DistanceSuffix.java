public class DistanceSuffix {
        //create instance/reference of/to Type GetUserInfo
        GetUserInfo userData=new GetUserInfo();
        String distanceSuffixText;

    public void setDistanceSuffix(User user) {

        String str= user.getDistance();
        String suffix = str.replaceAll("\\d+","");
        if (suffix.equalsIgnoreCase("km")) {
            this.distanceSuffixText =suffix.toUpperCase() ;
        }
        else{
        System.exit(505);
        }
    }

    public String getDistanceSuffix() {
        return distanceSuffixText;
    }
}
