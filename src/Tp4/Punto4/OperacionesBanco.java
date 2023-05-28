package Tp4.Punto4;

public class OperacionesBanco {
    public static void main(String[] args) {
                CCC CCC_1  = new CCC( 25000, "Roman");
                CCC CCC_2  = new CCC(15000, "Agus");
                System.out.println();

                CCC_1.RealizarTransferenciaEntreCuentas(CCC_1, CCC_2, 10000);
                

                System.out.println();
                System.out.println(CCC_1.getDatosCuenta());
                System.out.println();
                System.out.println(CCC_2.getDatosCuenta());
        }

    }

