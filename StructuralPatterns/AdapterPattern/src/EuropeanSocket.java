// Target Interface: EuropeanSocket
interface EuropeanSocket {
    void plugIn();
}

// Adaptee: USSocket
class USSocket{
    void connect(){
        System.out.println("Connected to US Socket");
    }
}

// Client: USCharger
class USCharger{
    void charge(USSocket usSocket){
        usSocket.connect();
        System.out.println("Charging using US Charger.");
    }
}