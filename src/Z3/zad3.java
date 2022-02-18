package Z3;

import java.io.File;

public class zad3 {

    public static void main(String[] args) {

        String directory = "src/";
        String extension = ".pdf" + "";

        metoda(directory, extension);
    }

        public static void metoda (String directory, String extension){
            try {
                File tmp = new File(directory);
                String[] files = tmp.list((file, s) -> !s.endsWith(extension));
                if (files != null) {
                    for (String file : files) {
                        System.out.print(file + ",");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


