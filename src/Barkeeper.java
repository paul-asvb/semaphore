/**
 * Created by paul on 29/01/2018.
 */
public class Barkeeper {
    public Barkeeper(Semaphore Bestell_Wunsch, Semaphore Getränk_fertig) {
        while (true) {
            //auf Bestellung warten
            Bestell_Wunsch.signal();

            Getränk_fertig.my_wait();
            //Fertigstellung signalisieren
            // <Getränk an den Gast geben>;
        }
    }
}
