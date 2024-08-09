public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Create a USSocket and USCharger
        USSocket usSocket = new USSocket();
        USCharger usCharger = new USCharger();

        // Now let's use the USCharger in a EuropeanSocket
        EuropeanSocket europeanSocket = new EuropeanToUSAdapter(usSocket);

        // Charge using the adapter
        usCharger.charge(usSocket); // Using USSocket directly
        europeanSocket.plugIn(); // Using EuropeanSocket via adapter
        System.out.println("Charging using US Charger with a European Socket.");
    }
}

