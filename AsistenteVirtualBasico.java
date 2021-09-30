package Expo_final;

public class AsistenteVirtualBasico {
    static double [] OtoñoInvierno = {6,500,500,285,200};
    static double [] PrimaveraVerano = {16,700,350,800,250};
    static int [] cant_riegosMes = {4,7,8,12,10};
    static String [] cultivos = {"lechuga","papa","camote","fresas","zanahoria"};
    static String [] insecticida = {"Fertilizante","Guano de corral","Guano de corral","Fertilizante","Fertilizante"};


    static String [] meses= {"EN","FE","MA","AB","MY","JN","JL","AG","SE","OC","NO","DI"};


    static String[] correos = {"trabajador1@BioAgro.pe","trabajador2@BioAgro.pe","trabajador3@BioAgro.pe","trabajador4@BioAgro.pe","jefeSupervisor@BioAgro.pe"};

    public static void main(String[] args) {
        System.out.println("__________BIOAGRO________");
        System.out.println("________________________-");
        System.out.println("___ALARMA PARA RIEGO MANUAL___");
        System.out.println("_________________________");

        IndicadorDeRiegoEnElMes("EN", "fresas");


    }


    static void IndicadorDeRiegoEnElMes(String Mes, String Cultivo){

        Boolean esTemporadaHumeda = false;

        double cantAgua = 0;
        String tipo_insecticida="";
        int cantVecesRiego = 0;

        for (int i=0; i<meses.length;i++){
            if (meses[i].equals(Mes)){
                if(i >=0 && i<3){//Verano
                    esTemporadaHumeda = false;
                }else if(i >=3 && i < 6){//Otoño
                    esTemporadaHumeda = true;
                }else if(i >=6 && i < 9){//Invierno
                    esTemporadaHumeda = true;
                }else if(i >=9 && i < 12){//Primavera
                    esTemporadaHumeda = false;
                }
            }
        }
        for (int i=0; i<cultivos.length;i++){
            if (cultivos[i].equals( Cultivo)) {

                tipo_insecticida = insecticida[i];
                cantVecesRiego = cant_riegosMes[i];
                if (esTemporadaHumeda){
                    cantAgua=OtoñoInvierno[i];
                }else{
                    cantAgua=PrimaveraVerano[i];
                    cantVecesRiego = cantVecesRiego *2;
                }
            }
        }



        System.out.println("Para el Mes de : " +Mes+ ", se deben realizar riegos en "+ cantVecesRiego +" ocaciones para el cultivo '" +Cultivo+ "' con la cantidad de "+ cantAgua +"mm" + "con " + tipo_insecticida );


        for (int i=0; i<correos.length;i++){
            System.out.println("Mensaje enviado a "+correos[i]);
        }

    }
}
