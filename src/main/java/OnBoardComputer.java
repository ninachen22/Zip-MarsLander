public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.Altitude > 1) { //if the alt is greater than 1
            //burn will be acceleration (m/s^2) plus 100 burn which decreases speed (velocity)
            burn = (status.Velocity * status.Velocity) / (2 * status.Altitude) + 100;
        } else {
            burn = 100; //else to maintain speed
        }
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
