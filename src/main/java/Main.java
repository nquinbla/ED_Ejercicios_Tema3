import java.util.Scanner;

import A_ObjTresDimensiones.Main_A;
import B_Fecha.Main_B;
import C_NumRacional.Main_C;
import D_NumComplejo.Main_D;
import E_InfoPersona.Main_E;

import F_Contraseña.Main_F;
import G_GuerraMarcianos.Main_G;
import H_ResolvedorRaíces.Main_H;
import I_ExtensionRootResolver.Main_I;
import J_Empresa.Main_J;
import K_CuentaBancaria.Main_K;
import L_FechaPT2.Main_L;
import M_Raíces.Main_M;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("a) Ejecutar main_a");
            System.out.println("b) Ejecutar main_b");
            System.out.println("c) Ejecutar main_c");
            System.out.println("d) Ejecutar main_d");
            System.out.println("e) Ejecutar main_e");
            System.out.println("f) Ejecutar main_f");
            System.out.println("g) Ejecutar main_g");
            System.out.println("h) Ejecutar main_h");
            System.out.println("i) Ejecutar main_i");
            System.out.println("j) Ejecutar main_j");
            System.out.println("k) Ejecutar main_k");
            System.out.println("l) Ejecutar main_l");
            System.out.println("m) Ejecutar main_m");
            System.out.println("q) Salir");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "a":
                    Main_A.main(args);
                    break;
                case "b":
                    Main_B.main(args);
                    break;
                case "c":
                    Main_C.main(args);
                    break;
                case "d":
                    Main_D.main(args);
                    break;
                case "e":
                    Main_E.main(args);
                    break;
                case "f":
                    Main_F.main(args);
                    break;
                case "g":
                    Main_G.main(args);
                    break;
                case "h":
                    Main_H.main(args);
                    break;
                case "i":
                    Main_I.main(args);
                    break;
                case "j":
                    Main_J.main(args);
                    break;
                case "k":
                    Main_K.main(args);
                    break;
                case "l":
                    Main_L.main(args);
                    break;
                case "m":
                    Main_M.main(args);
                    break;
                case "q":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no reconocida");
            }
        }
    }
}