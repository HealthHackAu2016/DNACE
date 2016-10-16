
//@Authors Angela Mao & Louis Janse van Rensburg

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/** Outputs chords of a chosen scale from the first two letters of the first DNA string
 *  (chord) every two times.
 *  Outputs arpeggio of the same scale from first letter of the second DNA string (arpeggio).
 *  Output into csv file to use with csv to midi.
 */

public class convertGATACA {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Initialize strings of DNA to be used
        String chord = "TGTTTCTGTTGGTGCCTGGGTTGCTCTTTCTTTGGGTTTCTCAGAAACGCCTATTAATTTCTACCGACTTAATCACCTTTATAATCCTTTCCCTGCTCCCCCTTCTGAATCTCCGGGCCGAGAATGAAAATCCCGAAATAGACAGTATGAGTATTAAATCTGATACACCTAGACCACAATATGACATGGGCCAATATCACTCCACCCCCTATGATTTTGCGATATGAGATTTCTTTGACGATTGACACGGTGTCCCAGGATGGATGTTGTCAATGTCAGAGATCTCTTCAGGGTGGCGAACGGAGCTTTTCGAATATAGTGTCTTTAGCGCGCTTGAGTAGCGGGCGTTGCCAGGAATATATTCATTTTACGACCACGTGTTCACGATTCACTATATTCTTTGGGTCTTTCTTGACATTGTGCCAACTACCGCCCAGTCTCTCATTGGTGTGTATGCGTTTCGAACGCGCGTCGCAGGCTTTTTTCCCAACCCCCCGCCTCAGGTAAGTGAATTCAACTCCCTTAAGTACGGGAAGTCTGGTATCTACGTATGTCAACTCCGTCTAATACTCTGTCGTCGATTTCGTAGGAGAATCCCACAGAATCAAACCGATGTAAAAAGGCCACGTGGCTTTACTCCCGTAAAAGTAATATCTCCGGTGCCCGCATGCCAATCGAGTCGCTAATGCCACGGAATAAAGGTAATTATGCCAATCTGAAATATGTGCATACGTTTGTCACGCGCCGACCCAAGGTTAATTTTATCGACTGACGGACTTTTCTTAACGGCTTCGACGTCTAAGCTCTGTAAAGATGACGAGAAGTTCACCGGGCATGAAACCCATTTTAACACACTTCCGACTTTTGTAGCATAACGTTCCTGGGCCCTACTTTTAACCGGACCCTCATGAAATTGTTATAATTCATGGTTTTAAAACGTCAGCTGGTGCTTATTTAATAAGGCGAAATCATACTAAGTATATTAGTCGTTCCAGTTTTATCCTCCAATCACTGTCTCCCTACTTTTCCTAAGTCTCGAGACCCGATTCGCATTACCACCTTCATCCGGATATTTTTTCACACTTTACCTCTCAGCCCCGCCGATCGGTCAATCTCTCGTTCTTCCATTGACTTAATCAAAAAGTGCTAAAAGGGAGTCGCACTCAAAATGACGAATCACCTACATTTACATCTTTCTAGCGTTAAATAGTTTGTTATCTTTTACGAGAACGGTAGAGTATCCCGCAGTTACAATGAAGTTTTATATCTATAAAAACGAGACTACCTCTGTAAAATAACGAATTTTTTGTGTGCTCAATATTTTTCTGTAAGTATAGCGAGATTAAATAACTATGACTTCTTTAAAACTAGCACAAGTTTTCCAGGAATGAATCAGATCAGCCGAAGTTTTACCCATTTTCTTAGATACAGAGGGGCCATGCCGCTATTACCTCTTAGTGACTTATGCAGGCTTTTCGGGCTCGTTTAGCATAAGGAACACTGAGCGATCTCGGAGCATGAATTGTGTCTCTGAAGTTCGAACAGGTAAGGGAGTTATCAACAACTAGCGGTTATTTAGACTTATTTCATAACCTTGGGACTCTCTATAGTGCAAAATTTTATAGAGATAGAAGATTTCGCACTCCGTTCGTGAAATTAATGATATCTTTTCCTTTCCTCAATTCGGACGCGTAATACGCAAAAAATATAATGTAATCCTCCAGTAACGGCTAGACTATAATGATCGCGGCTTTAAAAGTAAGCTGCGCTGGGATCTACAAGTTAACTTAGGGTTTTTTGGTAATACACACAGGATCTGAGAGTTCGTGATTATGCGTAACTATACTGAAGATCAACGAAAACGAATTCAGCCCTGATACTTAGATTGTAACTCCACGACTTCATCAGCGCTACTCGATGATTTAACCTTTCTCGCCGTAATCGGGCAAGTTATTGCAGTCAATTCAGAATAATTCAGATCTTAAGTTTTGTCTTTATCAATATCGCGGCCTATATCATATTATCCGCATGGCCCGAAACCGAAACCGAGAGTTCGATCCAATTGGCTTTCGCTTCACATCACGTTCGTACTTTTCAAAGCTACTTCTTCATTTATACTCCGACACTTATGCTTAATCATCGTAAGCGTCGTTAAATGCACTATGGATTCAGTCGTACTCCGCGCTGTTACTCGCCGCCAATTATCTCCAGTCAAGCGATGGGAGATTTATGCTAGGTAGAGGCTGCCAGTTCTTTCGTTGGAAATCAGGACAGTTTGCGACGATTGCAGATCTGCCCACCAATGACGGCATTCCCACACTTTGCTATTAATATGACATAAGTGACAGTCAATTCGTTATAGCCTTGATTATCCGACATTACACTTTCGGACGGGGCGACTATCGACTTTATGTAGGAACCGCTTCACTGACCAACTACTCCTTATATCTCTCTTATTAGTGCCCTTTTGATTCTTTACCAACAGGCGTACTATAATTAGTCCCCTTCAACTATCGACCGTCCGCTCCATACGATCGCGGTATTATCATTTCCTGATCTCTATTGAGTGGTTTCTCGCGTATTTTATTCCAATTTAACATTAATAATGTCGAGACTCACAAGGAATATAATTCAGGTATTTCACACCTCCATTCCACTTCCTGACCGCCGGGTCATTCGCGTGAGCGTTATGTCGCCCGTGAGCTTTCTGTTATGTTTCTGCTCTACTTG";
        String arpeggio = "GAAATCTTTGCTCATATTGCTCATCCACGATGATGACATTGTTGAAAGTAAAGAAGAAAACCGTGCTGTATTAACAGAAGGCGAACTTGAATTTATAGGCGGTCTATGACTTTGTTTGAGAAGAAGCAATGACAGATATCAGTATAGTTAAAGATTATTAGAATGTAGAAGAAAACAAATTTTATAGATTACGAAGTAGACATTTAAAACCACGTTATTACTGAAGGTTTTTCTATGATACGTCTGAAACGATTGAGTCCACAATGTCGAGCCAAATTAACCGTTGTTAAGGGTTTAACTAACTGATAGGCGAAGTATGCGTACAACTTTACGAACAAGTTAGCACAGTGGCTATGGTTGTGGTGTACCTAAGTACACAAATTGGCGTTGACGTCGTCCACATAGTTTGAAAAATTACTTCGATCACATCGTAGACGTAGAAATTAGACAATATCGAATTAACAAAGGGTACAATTAACAAATCGTGACGTTAGCACACGGAATCGTACGGGACCAGTGTTTATGCGACTAACAACACCTAAAAGAAGGCGTTAGAAATAGGAAATTCTTTGCATGGTCGGTAGCGAAGTAGTATAAGACGTCATACGAGTTTTGAAATTAGGCTTACTAACAGATACTGAGGCTCATTGCTTAGCAAAGAATCCGCAGTTATGAAGTACTATTAGACGGCCTACAAAGTTTTACCTAACAATGTACAAATATCAAATCGACGTCGTGCATTGTAACAACCTGGTGGTTATAGTTATAAAGTTACGGAAGCAGGTAGCAATCGTCGCAAACGTTGTCAAACAACCTTACCTATTTAATTGATGATGGTATAGTTAATGTCCATATACAACAAGACTATTAAGTAATTTACGACGCCAAATAAAGCCTAGTCGATTTACGGTGGTACTCTTGCGCCATTACAAATTGTGCCGGTAGTAATAAAGACCTTTTACACAATTCAGACTTTGTCTTGCTGTACAGTATGTAAACGAAGTAGATTATATGCAAATCATGGTGGTCAACTTATATTAAGTATTAAATTAACGCAATTGCGAAATCGTTTGAGATGTTATGGGACATACGCTCTAATGCGAGTTTTATCGAACGAAGTAGTGTATGTATGAGGAATAAATGTTAAATCGTTATTGTGAACCTATTATTACATGAGTTAAAATGAAGAGAAGATTAACAAGAAAACTTAGCAGGCCAGATTATAGTGTAACAGAGACAAGTTATGCCGGAGGGCATATGGTGTTAGTTGTATTACATGACAGCTTGGTCATTATCATAGCGGTGATACTATACGAACCGGATAACGCAGTTAGGGGAATATAAAGCCGTTATCTCTACCTACATATAAGTTATAAAATGGAAGTTTACTTCGATTATTTAGACCTGGTTAATCTGCGTACATCGGTCGATTTTATTAGGTGAGATGGAATAGAAATAAATTATTACAATGATTTACAACAAGTATGCGACGAAAACTTAGTTTAACAAAACCAAGTAATTATATTTGTCCTTATAGCACGAAAAACGAGATGAACTGTTTGCGTAAACTACTAGGCATATCGCGGCATTGAAGTTATAAAGTTCAAAAGGACTAAGTTGTACGAGTTGATATAAAGTTTCAATGAAGGACTTGGACTACGTTTAGCGTTAAATTGGTAACAATGGTATGGGGGTTGTTAAGTTAACGTCAACTGAGTAAAAAGTGTTATACTGGTTAAACTATTCGAAGGTGTAAAACAGACGATTTAGAAGTTTCGCGCACTACGTTCATTGGCATGGCTTTATGGGGTACAAATTTTACAATATGTAAAGTAAACACAGATATAACGGAACAACAACATTGGTTAGTTTATAAAACTGGCCAACCTTTACACATCATAGTTAAGATCGTCGTATAGGCCGACCGTTACGTGCACCTTATAAAGTATTTTGGAGGTGGTCATTATACTAAGTAACGGAATTATTTGAGCTGAAGAAAAATTCGTTCGTATTTAGTAAACTGTATATTAAATCAACCAAGATTTTTCTGTAGATATTTACCTGCTAATAGCTTCAAACTACGGTTTAGTTACGGACTAAGTAATTAATTAAACGCGTGATTTGACATAGGTAAACTTACTTACGGTGAACTGCGTTCAGGATAAGTCGTTGAACAGGGAGAAAGTGATGACTTGGTAGATGTATCAGTAGGAAAGTTGACGAGGTTGTCGTTTAGGCCGATGTAGTAAGTGGAAGCACTATGTAAAATCTAAAGTCGTCAGAGAGGTACGCTATTCACGTCATAAGCAAAGTTGCGTACGTAGTGATTATGGAAATTGTTAAACAAGTTATTGAAGTCCTTGTTGAAATAAACATCGCTACATTAGATTTTTATGTTACCAAGACGTGGACGACGAGTTCATGGGACTTATACCTTTGACAACCTATGGATCGTAGGCTCATCGATCAATCCGGGCGAACGCTGAGGCGAAACAGGTCTTTGATTTTAACGCACAGTAATCCTATTTAGTTTACATCGTGGCTTAGGTGGATTTGGGCCTATTGAAGAAATGCGTAGCATGCAAATTGTACTGATCTGTAAGAAAGATGTCGAAGTATTGGTACTTATAATGTGGTCTAACAAGTATACGAAATCTGTAAAATTTAAAGGGAGCGGAACATAGTTTTTCACAAACAAATCTTTATATAACGAAAATGAGCTACTGAATTTTAAGAATTAAACGAAGTATTAGTATATTGGGGACGTCCTATTAGAGGTCATTTGAAAGATGTATTCGTTTCTGTTTATGTTCCC";
        
        //Set variables for write loops into csv
        int valueOne = 0;		//value for the chord
        int valueTwo = 0;
        int valueThree = 0;
        int valueFour = 0;
        int valueFive = 0; 		//value for the arpeggio note (quarter note)
        int kickDrum = 23;      //value for the kick sound of SynthDrum
        
        //Initialise notes of chosen scale: using D enigmatic scale
        int d = 50;
        int dSharp = 51;
        int fSharp = 54;
        int gSharp = 56;
        int aSharp = 58;
        int c = 60 + 24;
        int cSharp = 61;
        
        //Tick counter
        int k = 0;
        
        //Line counter
        int counter = 1;
        
        //Begin writing to file
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();
        
        /*-------------------------------------------*/
        /*---------------GENERATE HEADER-------------*/
        /*-------------------------------------------*/
        sb.append("Timing Resolution (pulses per quarter note)");
        sb.append('\n');
        sb.append("4");
        sb.append('\n');		//enter new line of spreadsheet
        
        //Generate header for a 3 note chord
        for (int i = 0; i < 3; i++) {
            sb.append("Instrument");
            sb.append(',');         //tab to next cell of spreadsheet
            sb.append("11");            //Changeable: Instrument number
            sb.append(',');
            sb.append("Vibraphone");      //Changeable: Instrument name
            sb.append(',');
        }
        
        //Generate header for the arpeggio instrument
        sb.append("Instrument");
        sb.append(',');
        sb.append("107");            //Changeable: Instrument number
        sb.append(',');
        sb.append("Koto");      //Changeable: Instrument name
        sb.append(',');
        
        //Generate header for kickdrum
        sb.append("Instrument");
        sb.append(',');
        sb.append("115");            //Changeable: Instrument number
        sb.append(',');
        sb.append("Woodblock");      //Changeable: Instrument name
        sb.append('\n');
        
        //Generate column titles for instruments
        for (int i = 0; i < 5; i++) {
            sb.append("Tick");
            sb.append(',');
            sb.append("Note (0-127)");
            sb.append(',');
            sb.append("Velocity (0-127)");
            sb.append(',');
        }
        sb.append('\n');
        
        //Take first two characters of string and converts to a chord/arpeggio
        while (chord.length() >= 4 && arpeggio.length() >= 4) {
            String sub = chord.substring(0, 2);
            
            if (sub.equals("GA") || sub.equals("GT")) {			//play Cdim
                valueOne = c;
                valueTwo = dSharp;
                valueThree = fSharp;
                valueFour = valueOne + 12;		//for the octave above note only found in melody
            } else if (sub.equals("GC") || sub.equals("GG")) { 	//play Daug
                valueOne = d;
                valueTwo = fSharp;
                valueThree = aSharp;
                valueFour = valueOne + 12;
            } else if (sub.equals("TT") || sub.equals("TA")
                       || sub.equals("CT")) {					//play D#m
                valueOne = dSharp;
                valueTwo = fSharp;
                valueThree = aSharp;
                valueFour = valueOne + 12;
            } else if (sub.equals("TC") || sub.equals("TG") ||
                       sub.equals("CA")) { 					//play F#
                valueOne = fSharp;
                valueTwo = aSharp;
                valueThree = cSharp;
                valueFour = valueOne + 12;
            } else if (sub.equals("AA") || sub.equals("AC")) {	//play F#Aug
                valueOne = fSharp;
                valueTwo = aSharp;
                valueThree = c;
                valueFour = valueOne + 12;
            } else if (sub.equals("AT") || sub.equals("AG")) {	//play G#
                valueOne = gSharp;
                valueTwo = c;
                valueThree = dSharp;
                valueFour = valueOne + 12;
            } else if (sub.equals("CC") || sub.equals("CG")) {	//play A#Aug
                valueOne = aSharp;
                valueTwo = d;
                valueThree = fSharp;
                valueFour = valueOne + 12;
            }
            
            //Fill in values of csv with converted DNA
            for (int i = 0; i < 8; i++) {
                sb.append(k);
                sb.append(',');
                if (counter == 1 || counter % 8 == 0 || (counter - 1) % 8 == 0) {
                    sb.append(valueOne);
                    sb.append(',');
                    if (counter % 2 != 0) {
                        sb.append("90");
                    } else if (counter % 2 == 0) {
                        sb.append("0");
                    }
                    sb.append(',');
                    
                    sb.append(k);
                    sb.append(',');
                    sb.append(valueTwo);
                    sb.append(',');
                    if (counter % 2 != 0) {
                        sb.append("90");
                    } else if (counter % 2 == 0) {
                        sb.append("0");
                    }
                    sb.append(',');
                    
                    sb.append(k);
                    sb.append(',');
                    sb.append(valueThree);
                    sb.append(',');
                    if (counter % 2 != 0) {
                        sb.append("90");
                    } else if (counter % 2 == 0) {
                        sb.append("0");
                    }
                    sb.append(',');
                } else if (counter % 8 != 0 || (counter - 1) % 8 != 0){
                    int count = 0;
                    while (count < 8) {
                        sb.append(',');
                        count++;
                    }
                }
                
                //Find corresponding note to letter
                sb.append(k);
                sb.append(',');
                char letter = arpeggio.charAt(0);
                if (letter == 'A') {
                    valueFive = valueOne + 12;
                } else if (letter == 'G') {
                    valueFive = valueTwo + 12;
                } else if (letter == 'T') {
                    valueFive = valueThree + 12;
                } else if (letter == 'C') {
                    valueFive = valueFour + 12;
                }
                sb.append(valueFive);
                sb.append(',');
                
                
                //Find velocity
                if (counter % 2 == 0) {
                    sb.append("0");
                    arpeggio = arpeggio.substring(1);
                } else if (counter % 2 != 0) {
                    sb.append("100");
                }
                sb.append(',');
                
                sb.append(k);
                sb.append(',');
                sb.append(kickDrum);
                sb.append(',');
                if (counter % 2 != 0) {
                    sb.append("120");
                    k++;
                } else if (counter % 2 == 0) {
                    sb.append("0");
                }
                sb.append(',');
                
                sb.append('\n');
                counter++;
            }
            
            //remove first four letters of DNA
            chord = chord.substring(4);
        }
        pw.write(sb.toString());
        pw.close();
    }
}
