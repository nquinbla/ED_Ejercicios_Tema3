package G_GuerraMarcianos;

import java.util.ArrayList;
import java.util.List;

public class Main_G {
    public static void main(String[] args) {
        List<Marciano> marcianos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            marcianos.add(new Marciano());
        }

        List<Terrícola> terricolas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            terricolas.add(new Terrícola());
        }

        while (!marcianos.isEmpty() && !terricolas.isEmpty()) {
            for (Marciano marciano : marcianos) {
                if (!terricolas.isEmpty()) {
                    marciano.atacar(terricolas.get(0));
                    if (!terricolas.get(0).estaVivo()) {
                        terricolas.remove(0);
                    }
                }
            }

            for (Terrícola terricola : terricolas) {
                if (!marcianos.isEmpty()) {
                    terricola.atacar(marcianos.get(0));
                    if (!marcianos.get(0).estaVivo()) {
                        marcianos.remove(0);
                    }
                }
            }
        }

        if (marcianos.isEmpty()) {
            System.out.println("Los terrícolas ganaron la guerra.");
        } else {
            System.out.println("Los marcianos ganaron la guerra.");
        }
    }
}