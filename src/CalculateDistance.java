public class CalculateDistance {

    private GetUserInfo userInfo=new GetUserInfo();
    double miles;
    User user=userInfo.getUser();
    String km="";

    DistanceSuffix distanceSuffix=new DistanceSuffix();

    public String KilometreToMiles(User user){
        distanceSuffix.setDistanceSuffix(user);
        String localDist= user.getDistance();

        if(distanceSuffix.getDistanceSuffix().equalsIgnoreCase("km")){
            double i = (Double.parseDouble(localDist.replace("km","")) / 1.609);
            miles=i;

        }else if(distanceSuffix.getDistanceSuffix()!="km"){
            distanceSuffix.getDistanceSuffix();
        }
        return miles+" "+km;
    }
}
