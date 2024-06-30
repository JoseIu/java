package ejercicios_colecciones;

import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<String>();

        listado.add("Sara");
        listado.add("Vincent");
        listado.add("Jose");
        System.out.println(listado);
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }

        listado.remove(listado.size()-1);
        System.out.println(listado);

        System.out.println("-------------SETS--------");


        Set<Integer> numneros = new HashSet<Integer>();
        numneros.add(1);
        numneros.add(2);
        numneros.add(3);
        System.out.println(numneros);


        System.out.println("-------------maps-------");

        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(0,"Sara");
        map.put(1,"Vincent");
        map.put(2,"Jose");
        System.out.println(map);

        map.forEach((key, value)->{
            System.out.println("Key: " + key + " Valor: " + value);
        });


    }
}
