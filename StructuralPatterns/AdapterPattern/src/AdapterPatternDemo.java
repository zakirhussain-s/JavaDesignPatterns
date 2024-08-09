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

//Explanation
//USSocket: Represents the US power socket.
//USCharger: The charger that works with the US socket.
//EuropeanSocket: The interface for a European power socket.
//EuropeanToUSAdapter: The adapter that allows a US charger to be plugged into a European socket.