package com.company;

public class TestMap3 {
    public static void main(String[] args) {
        int i;
        Integer freq;
        String s;

        Map<String, Integer> M = new Map<String, Integer>();

      /* -------------------------------------------------------
         Enter arg strings into the Map along with frequency
 	 ------------------------------------------------------- */
        String[] arg = {"USA", "USA", "UK","CHINA","FRANCE","RUSSIA"};

        for (i = 0; i < arg.length; i++)
        {
            s = arg[i];

            freq = M.get(s);

            if ( freq == null )
            {
                M.put(s, 1);
            }
            else
            {
                M.put(s, freq.intValue() + 1);
            }

            System.out.println("After processing `" + arg[i] + "':");
            System.out.println(M);
            System.out.println();
        }

        System.out.println("=========================");
        System.out.println(M.size() + " distinct words:");

        System.out.println(M);
    }
}
