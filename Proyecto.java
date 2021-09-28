package Expo_final;

public class Proyecto {
    static double [] OtoñoInvierno = {6,500,500,285,200};//por lamina de riego
    static double [] PrimaveraVerano = {16,700,350,800,250};//por lamina de riego
    static String [] cultivos = {"lechuga","papa","camote","fresas","zanahoria"};
    static String [] insecticida = {"Fertilizante","Guano de corral","Guano de corral","Fertilizante","Fertilizante"};


    public static void main(String[] args) {
        System.out.println("__________BIOAGRO________");
        System.out.println("________________________-");
        System.out.println("___RIESGO AUTOMATIZADO___");
        System.out.println("_________________________");
        System.out.println("__________PLANTA 1_______");
        System.out.println("La cantidad de agua que necesita el cultivo por lamina de riego es:"+cantAguaRiego("lechuga","Otoño")+"mm");
        System.out.println("Este cultivo necesita de:"+tipoFertilizante("lechuga"));
        System.out.println("__________PLANTA 2_______");
        System.out.println("La cantidad de agua que necesita el cultivo por lamina de riego es:"+cantAguaRiego("camote","Verano")+"mm");
        System.out.println("Este cultivo necesita de:"+tipoFertilizante("camote"));
        System.out.println("__________PLANTA 3_______");
        System.out.println("La cantidad de agua que necesita el cultivo por lamina de riego es:"+cantAguaRiego("fresas","Otoño")+"mm");
        System.out.println("Este cultivo necesita de:"+tipoFertilizante("fresas"));
    }

    static double cantAguaRiego(String cultivo, String EstacionAño){

        double resultado = 0;

        System.out.println("Lamina de Riego para el cultivo de:"+cultivo);
        for (int i=0; i<cultivos.length;i++){
            if (EstacionAño=="Otoño" || EstacionAño=="Invierno"){
                if (cultivos[i]== cultivo){
                    resultado=OtoñoInvierno[i];
                }
            }
            if (EstacionAño=="Verano" || EstacionAño=="Primavera"){
                if (cultivos[i]== cultivo){
                    resultado=PrimaveraVerano[i];
                }
            }

        }

        return resultado;
    }
    static String tipoFertilizante(String cultivo){
        String resultado="";
        for (int i=0; i<cultivos.length;i++){
            if (cultivos[i]== cultivo){
                resultado=insecticida[i];
            }
        }
        return resultado;
    }
}
