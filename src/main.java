import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class main {
    
    static InputStreamReader isr = new InputStreamReader(System.in); 
    static BufferedReader br = new BufferedReader(isr); 
    
    public static void main(String[] args) throws IOException {
        while (true) { 
            System.out.println("==================================");
            System.out.println("1 | Mengubah Output String"); 
            System.out.println("2 | Menentukan Nilai Skor Akhir"); 
            System.out.println("3 | Exit"); 
            System.out.println("==================================");
            System.out.print("Enter Your Choice: "); 
            int login = Integer.parseInt(br.readLine()); 
            switch (login) { 
                case 1: 
                    menusatu(); 
                    break; 
                case 2: 
                    menudua(); 
                    break; 
                case 3: 
                    
                    System.exit(0); 
                    break; 
                default: 
                    System.out.println("You Have Entered an Invalid Input. Please Try Again."); 
                    break; 
            } 
        } 
    }         
    
    //Untuk Pilihan Menu 1
    static void menusatu() throws IOException { 
        String sentence = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis"; 
        String outputOne = sentence.substring(0, 36); 
        String outputTwo = sentence.substring(0, 36).toLowerCase(); 
        String outputThree = sentence.substring(0, 36).toUpperCase(); 
        String outputFour = sentence.substring(25, 36); 
        String outputFive = sentence.substring(37, 63); 
        System.out.println("==================================");
        System.out.println("1 | " + outputOne); 
        System.out.println("2 | " + outputTwo); 
        System.out.println("3 | " + outputThree); 
        System.out.println("4 | " + outputFour); 
        System.out.println("5 | " + outputFive); 
        System.out.println("==================================");
        System.out.print("Press [enter] to continue..."); 
        new java.util.Scanner(System.in).nextLine(); 
        } 
    
    //Untuk Pilihan Menu 2
    static void menudua() throws IOException { 
        String mataKuliah, nilai; 
        int kehadiran = 0, kontribusiKehadiran = 0; 
        double nilaiUTS = 0, nilaiUAS = 0, skorAkhir = 0; 
        boolean validInput = false; 
        System.out.println("==================================");
        System.out.print("Enter the Course Name: "); 
        mataKuliah = br.readLine(); 
        while (!validInput) { 
            try { 
                System.out.print("Enter the Number of Attendance: "); 
                kehadiran = Integer.parseInt(br.readLine()); 
                if (kehadiran < 0) { 
                System.out.println("The Input You Entered is Invalid. Attendance cannot be less than 0."); 
                } else if (kehadiran < 3) { 
                    kontribusiKehadiran = 0; 
                } else if (kehadiran >= 3 && kehadiran <= 4) { 
                    kontribusiKehadiran = 60; 
                } else if (kehadiran >= 5 && kehadiran <= 6) { 
                    kontribusiKehadiran = 80; 
                } else { 
                    kontribusiKehadiran = 100; 
                } 
                validInput = true; 
            } catch (NumberFormatException | IOException e) { 
                System.out.println("==================================");
                System.out.println("The Input You Entered is Invalid."); 
                System.out.println("==================================");
            } 
        } 
        validInput = false; 
        while (!validInput) { 
            try { 
                System.out.print("Enter Midterm Exam Scores: "); 
                nilaiUTS = Double.parseDouble(br.readLine()); 
                if (nilaiUTS >= 0 && nilaiUTS <= 100) { 
                    validInput = true; 
                } else { 
                    System.out.println("==================================");
                    System.out.println("The Input You Entered is Invalid. Please enter a value between 0 and 100."); 
                    System.out.println("==================================");
                } 
            } catch (NumberFormatException | IOException e) { 
                System.out.println("==================================");
                System.out.println("The Input You Entered is Invalid."); 
                System.out.println("==================================");
            } 
        } 
        validInput = false; 
        while (!validInput) { 
            try { 
                System.out.print("Enter Final Exam Scores: "); 
                nilaiUAS = Double.parseDouble(br.readLine()); 
                if (nilaiUAS >= 0 && nilaiUAS <= 100) { 
                validInput = true; 
                } else { 
                    System.out.println("==================================");
                    System.out.println("The Input You Entered is Invalid. Please enter a value between 0 and 100."); 
                    System.out.println("==================================");
                } 
            } catch (NumberFormatException | IOException e) { 
                System.out.println("==================================");
                System.out.println("The Input You Entered is Invalid."); 
                System.out.println("==================================");
            } 
        } 
        skorAkhir = (kontribusiKehadiran * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5); 
        if (skorAkhir >= 85 && kehadiran <= 100) { 
            nilai = "A"; 
        } else if (skorAkhir >= 70 && kehadiran <= 84) { 
            nilai = "B"; 
        } else if (skorAkhir >= 60 && kehadiran <= 69) { 
            nilai = "C"; 
        } else if (skorAkhir >= 50 && kehadiran <= 59) { 
            nilai = "D"; 
        } else { 
            nilai = "E"; 
        } 
        System.out.println("==================================");
        System.out.println("Course Name: " + mataKuliah); 
        System.out.println("Final Score: " + skorAkhir); 
        System.out.println("Grade: " + nilai); 
        System.out.println("==================================");
        System.out.print("Press [enter] to continue..."); 
        new java.util.Scanner(System.in).nextLine(); 
    }
}
