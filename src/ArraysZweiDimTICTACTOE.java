import java.util.Scanner;

public class ArraysZweiDimTICTACTOE {
    public static void main(String [] args){
        String A0 = "empty";
        String A1 = "empty";
        String A2 = "empty";
        String B0 = "empty";
        String B1 = "empty";
        String B2 = "empty";
        String C0 = "empty";
        String C1 = "empty";
        String C2 = "empty";

        int counter =0;

        String[][] spielFeld = new String[3][3];
        System.out.println("Lass uns TIC-TAC-TOE spielen"
                +           "\n" + "Du kannst in die Felder A=(oben links) bis C0(unten rechts setzen)"
                +           "\n" + "Es beginnt X dann ist 0 an der Reihe"
                +           "\n" + "Wer 3 Symbol in einer Reihe Horizontal, Diagonal oder Vertical hat, hat gewonnen!"
                +           "\n" + "X beginnt! Bitte gib dein Feld mit A0, A1,A2,B0 usw. an!");
        for(int i=0; i< spielFeld.length; i++){
            for(int i1=0; i1< spielFeld.length; i1++){
                spielFeld[i][i1]=   " . ";
            }
        }

        for (int i=0; i<spielFeld.length; i++){
            for(int i1=0; i1<spielFeld.length; i1++){
                System.out.print(spielFeld[i][i1] + "\t" + "\t");
            }
            System.out.println();
            System.out.println();
        }

        while ( A0.contains("empty") ||
                A1.contains("empty") ||
                A2.contains("empty") ||
                B0.contains("empty") ||
                B1.contains("empty") ||
                B2.contains("empty") ||
                C0.contains("empty") ||
                C1.contains("empty") ||
                C2.contains("empty") ){
                    counter ++;

                    Scanner scanner = new Scanner(System.in);
                    if(counter % 2 != 0){
                        System.out.println("X ist an der Reihe!");
                        String xin = scanner.next();
                        xin.toLowerCase();
                        if(xin.equals("A0")){
                            A0 = "X";
                            spielFeld[0][0] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }
                        //for A1
                        if(xin.equals("A1")){
                            A1 = "X";
                            spielFeld[0][1] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for A2
                        if(xin.equals("A2")){
                            A2 = "X";
                            spielFeld[0][2] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for B0
                        if(xin.equals("B0")){
                            B0 = "X";
                            spielFeld[0][0] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for B1
                        if(xin.equals("B1")){
                            B1 = "X";
                            spielFeld[1][0] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for B2
                        if(xin.equals("B2")){
                            B2 = "X";
                            spielFeld[2][0] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for C0
                        if(xin.equals("C0")){
                            C0 = "X";
                            spielFeld[1][0] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for C1
                        if(xin.equals("C1")){
                            C1 = "X";
                            spielFeld[1][1] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }

                        //for C2
                        if(xin.equals("C2")){
                            C2 = "X";
                            spielFeld[1][2] = "X";

                            for (int i=0; i<spielFeld.length; i++){
                                for (int i1=0; i1<spielFeld.length; i1++){
                                    System.out.print(spielFeld[i][i1] + "\t" + "\t");
                                }
                                System.out.println();
                                System.out.println();
                            }
                        }
            }
        }

    }
}
