/**
 * Assignment 2 Question 1 SimCalculator class distributed to students
 *
 * SimCalculator takes in various information related to a SIM card and provides
 * a public method that calculates the cost of a call made using this SIM.
 *
 * @version 1.0
 */
public class SimCalculator {

    private int inNetworkRate; //# cents per second
    private int outNetworkRate; //# cents per second
    private String networkPrefix; //this is how we tell if the number is in the network
    private String networkName; //the name of the service provider

    /**
     * Construct a new SimCalculator object
     *
     * @param inRate cost per second of a call made from this SIM to a number in the network
     * @param outRate cost per second of a call made from this SIM to a number in the network
     * @param prefix network number prefix, e.g. "074", "082" etc.
     * @param networkName network name
     */
    public SimCalculator(int inRate, int outRate, String prefix, String networkName) {
        this.inNetworkRate = inRate;
        this.outNetworkRate = outRate;
        this.networkPrefix = prefix;
        this.networkName = networkName;
    }

    /**
     * Check if a number is in this SimCalculator's network
     *
     * @param number the number to check
     * @return true if the number is in the network, false otherwise
     */
    public boolean isInNetwork(String number) {
        return number.startsWith(this.networkPrefix);
    }

    /**
     * Set new rates on a SIM card
     * @param inRate the in-network rate
     * @param outRate the out of network rate
     */
    public void setRates(int inRate, int outRate) {
        this.inNetworkRate = (inRate);
        this.outNetworkRate = (outRate);
    }


    public String getNetworkName() {
        return networkName;
    }

    public int checkCallCost (String toNumber, int duration){
        
	 //The method will return an int representing the cost of a call, 
	 //which is the product of the duration of the call (in seconds) and 
	 //the rate that the cell phone company charges per second. The rate 
	 //being charged depends on whether the number being dialled 
	 //(the first parameter) is "in" or "out" of this network.
        
	 if (isInNetwork(toNumber)){
	 return (inNetworkRate*duration);
         }
	 else{
         return (outNetworkRate*duration);
	 }
	 }
}
