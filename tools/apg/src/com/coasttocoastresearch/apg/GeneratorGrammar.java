package com.coasttocoastresearch.apg;

import com.coasttocoastresearch.apg.Grammar;
import java.io.PrintStream;
 /**
 * This is a sample of the Grammar class generated by APG.
 * <p>
 * The Generator is a Java APG Parser, just like the Parsers it generates.
 * The working version of GeneratorGrammar was generated from a bootstrap program
 * built with <a href="http://www.coasttocoastresearch.com/apg" target="_blank">APG version 6.1</a>.
 * This file, however, has been regenerated with the Generator itself.
 * That is, the Generator can now re-generate GeneratorGrammar.java. 
 * <p>
 * This file is an extension of the Grammar class which 
 * contains a number of members, member functions
 * and enums not contained in the base class. 
 */

public class GeneratorGrammar extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class (cast as the base class, Grammar) */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new GeneratorGrammar(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 46;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = 38, name = "alphanum" */
        ALPHANUM("alphanum", 38, 182, 10),
        /** id = 4, name = "Alternation" */
        ALTERNATION("Alternation", 4, 23, 6),
        /** id = 19, name = "AltOp" */
        ALTOP("AltOp", 19, 99, 3),
        /** id = 22, name = "AndOp" */
        ANDOP("AndOp", 22, 104, 1),
        /** id = 34, name = "Bin" */
        BIN("Bin", 34, 170, 3),
        /** id = 1, name = "BlankLine" */
        BLANKLINE("BlankLine", 1, 5, 4),
        /** id = 36, name = "bnum" */
        BNUM("bnum", 36, 175, 2),
        /** id = 20, name = "CatOp" */
        CATOP("CatOp", 20, 102, 1),
        /** id = 43, name = "comment" */
        COMMENT("comment", 43, 205, 6),
        /** id = 5, name = "Concatenation" */
        CONCATENATION("Concatenation", 5, 29, 7),
        /** id = 32, name = "Dec" */
        DEC("Dec", 32, 164, 3),
        /** id = 15, name = "DefinedAs" */
        DEFINEDAS("DefinedAs", 15, 91, 1),
        /** id = 35, name = "dnum" */
        DNUM("dnum", 35, 173, 2),
        /** id = 10, name = "Element" */
        ELEMENT("Element", 10, 61, 9),
        /** id = 0, name = "File" */
        FILE("File", 0, 0, 5),
        /** id = 40, name = "fsp" */
        FSP("fsp", 40, 196, 5),
        /** id = 11, name = "Group" */
        GROUP("Group", 11, 70, 6),
        /** id = 33, name = "Hex" */
        HEX("Hex", 33, 167, 3),
        /** id = 16, name = "IncAlt" */
        INCALT("IncAlt", 16, 92, 1),
        /** id = 45, name = "LineContinue" */
        LINECONTINUE("LineContinue", 45, 215, 5),
        /** id = 44, name = "LineEnd" */
        LINEEND("LineEnd", 44, 211, 4),
        /** id = 14, name = "NameDef" */
        NAMEDEF("NameDef", 14, 90, 1),
        /** id = 23, name = "NotOp" */
        NOTOP("NotOp", 23, 105, 1),
        /** id = 12, name = "Option" */
        OPTION("Option", 12, 76, 6),
        /** id = 41, name = "owsp" */
        OWSP("owsp", 41, 201, 2),
        /** id = 8, name = "Predicate" */
        PREDICATE("Predicate", 8, 43, 5),
        /** id = 13, name = "ProsVal" */
        PROSVAL("ProsVal", 13, 82, 8),
        /** id = 9, name = "Rep" */
        REP("Rep", 9, 48, 13),
        /** id = 29, name = "rep-max" */
        REP_MAX("rep-max", 29, 124, 2),
        /** id = 27, name = "rep-min" */
        REP_MIN("rep-min", 27, 120, 2),
        /** id = 28, name = "rep-min-max" */
        REP_MIN_MAX("rep-min-max", 28, 122, 2),
        /** id = 7, name = "Repeat" */
        REPEAT("Repeat", 7, 40, 3),
        /** id = 6, name = "Repetition" */
        REPETITION("Repetition", 6, 36, 4),
        /** id = 17, name = "RnmOp" */
        RNMOP("RnmOp", 17, 93, 1),
        /** id = 2, name = "Rule" */
        RULE("Rule", 2, 9, 10),
        /** id = 3, name = "RuleError" */
        RULEERROR("RuleError", 3, 19, 4),
        /** id = 39, name = "sp" */
        SP("sp", 39, 192, 4),
        /** id = 21, name = "StarOp" */
        STAROP("StarOp", 21, 103, 1),
        /** id = 25, name = "TbsOp" */
        TBSOP("TbsOp", 25, 109, 3),
        /** id = 31, name = "TbsString" */
        TBSSTRING("TbsString", 31, 142, 22),
        /** id = 26, name = "TlsOp" */
        TLSOP("TlsOp", 26, 112, 8),
        /** id = 24, name = "TrgOp" */
        TRGOP("TrgOp", 24, 106, 3),
        /** id = 30, name = "TrgRange" */
        TRGRANGE("TrgRange", 30, 126, 16),
        /** id = 18, name = "UdtOp" */
        UDTOP("UdtOp", 18, 94, 5),
        /** id = 42, name = "wsp" */
        WSP("wsp", 42, 203, 2),
        /** id = 37, name = "xnum" */
        XNUM("xnum", 37, 177, 5);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /**
         * @return the original grammar rule name.
         */
        public  String ruleName(){return name;}
        /**
         * @return the rule identifier.
         */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static GeneratorGrammar factoryInstance = null;
    private GeneratorGrammar(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[46];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
    	Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
    	Opcode[] op = new Opcode[220];
        op[0] = getOpcodeRep((char)0, Character.MAX_VALUE, 1);
        {int[] a = {2,3,4}; op[1] = getOpcodeAlt(a);}
        op[2] = getOpcodeRnm(1, 5); // BlankLine
        op[3] = getOpcodeRnm(2, 9); // Rule
        op[4] = getOpcodeRnm(3, 19); // RuleError
        {int[] a = {6,8}; op[5] = getOpcodeCat(a);}
        op[6] = getOpcodeRep((char)0, Character.MAX_VALUE, 7);
        op[7] = getOpcodeRnm(39, 192); // sp
        op[8] = getOpcodeRnm(44, 211); // LineEnd
        {int[] a = {10,11,12,15,16,17,18}; op[9] = getOpcodeCat(a);}
        op[10] = getOpcodeRnm(14, 90); // NameDef
        op[11] = getOpcodeRnm(41, 201); // owsp
        {int[] a = {13,14}; op[12] = getOpcodeAlt(a);}
        op[13] = getOpcodeRnm(16, 92); // IncAlt
        op[14] = getOpcodeRnm(15, 91); // DefinedAs
        op[15] = getOpcodeRnm(41, 201); // owsp
        op[16] = getOpcodeRnm(4, 23); // Alternation
        op[17] = getOpcodeRnm(41, 201); // owsp
        op[18] = getOpcodeRnm(44, 211); // LineEnd
        {int[] a = {20,22}; op[19] = getOpcodeCat(a);}
        op[20] = getOpcodeRep((char)0, Character.MAX_VALUE, 21);
        op[21] = getOpcodeRnm(40, 196); // fsp
        op[22] = getOpcodeRnm(44, 211); // LineEnd
        {int[] a = {24,25}; op[23] = getOpcodeCat(a);}
        op[24] = getOpcodeRnm(5, 29); // Concatenation
        op[25] = getOpcodeRep((char)0, Character.MAX_VALUE, 26);
        {int[] a = {27,28}; op[26] = getOpcodeCat(a);}
        op[27] = getOpcodeRnm(19, 99); // AltOp
        op[28] = getOpcodeRnm(5, 29); // Concatenation
        {int[] a = {30,31,32}; op[29] = getOpcodeCat(a);}
        op[30] = getOpcodeRnm(41, 201); // owsp
        op[31] = getOpcodeRnm(6, 36); // Repetition
        op[32] = getOpcodeRep((char)0, Character.MAX_VALUE, 33);
        {int[] a = {34,35}; op[33] = getOpcodeCat(a);}
        op[34] = getOpcodeRnm(20, 102); // CatOp
        op[35] = getOpcodeRnm(6, 36); // Repetition
        {int[] a = {37,38,39}; op[36] = getOpcodeAlt(a);}
        op[37] = getOpcodeRnm(7, 40); // Repeat
        op[38] = getOpcodeRnm(8, 43); // Predicate
        op[39] = getOpcodeRnm(10, 61); // Element
        {int[] a = {41,42}; op[40] = getOpcodeCat(a);}
        op[41] = getOpcodeRnm(9, 48); // Rep
        op[42] = getOpcodeRnm(10, 61); // Element
        {int[] a = {44,47}; op[43] = getOpcodeCat(a);}
        {int[] a = {45,46}; op[44] = getOpcodeAlt(a);}
        op[45] = getOpcodeRnm(22, 104); // AndOp
        op[46] = getOpcodeRnm(23, 105); // NotOp
        op[47] = getOpcodeRnm(10, 61); // Element
        {int[] a = {49,53,56,59,60}; op[48] = getOpcodeAlt(a);}
        {int[] a = {50,51,52}; op[49] = getOpcodeCat(a);}
        op[50] = getOpcodeRnm(27, 120); // rep-min
        op[51] = getOpcodeRnm(21, 103); // StarOp
        op[52] = getOpcodeRnm(29, 124); // rep-max
        {int[] a = {54,55}; op[53] = getOpcodeCat(a);}
        op[54] = getOpcodeRnm(27, 120); // rep-min
        op[55] = getOpcodeRnm(21, 103); // StarOp
        {int[] a = {57,58}; op[56] = getOpcodeCat(a);}
        op[57] = getOpcodeRnm(21, 103); // StarOp
        op[58] = getOpcodeRnm(29, 124); // rep-max
        op[59] = getOpcodeRnm(21, 103); // StarOp
        op[60] = getOpcodeRnm(28, 122); // rep-min-max
        {int[] a = {62,63,64,65,66,67,68,69}; op[61] = getOpcodeAlt(a);}
        op[62] = getOpcodeRnm(24, 106); // TrgOp
        op[63] = getOpcodeRnm(25, 109); // TbsOp
        op[64] = getOpcodeRnm(26, 112); // TlsOp
        op[65] = getOpcodeRnm(18, 94); // UdtOp
        op[66] = getOpcodeRnm(17, 93); // RnmOp
        op[67] = getOpcodeRnm(11, 70); // Group
        op[68] = getOpcodeRnm(12, 76); // Option
        op[69] = getOpcodeRnm(13, 82); // ProsVal
        {int[] a = {71,72,73,74,75}; op[70] = getOpcodeCat(a);}
        {char[] a = {40}; op[71] = getOpcodeTbs(a);}
        op[72] = getOpcodeRnm(41, 201); // owsp
        op[73] = getOpcodeRnm(4, 23); // Alternation
        op[74] = getOpcodeRnm(41, 201); // owsp
        {char[] a = {41}; op[75] = getOpcodeTbs(a);}
        {int[] a = {77,78,79,80,81}; op[76] = getOpcodeCat(a);}
        {char[] a = {91}; op[77] = getOpcodeTbs(a);}
        op[78] = getOpcodeRnm(41, 201); // owsp
        op[79] = getOpcodeRnm(4, 23); // Alternation
        op[80] = getOpcodeRnm(41, 201); // owsp
        {char[] a = {93}; op[81] = getOpcodeTbs(a);}
        {int[] a = {83,84,89}; op[82] = getOpcodeCat(a);}
        {char[] a = {60}; op[83] = getOpcodeTbs(a);}
        op[84] = getOpcodeRep((char)0, Character.MAX_VALUE, 85);
        {int[] a = {86,87,88}; op[85] = getOpcodeAlt(a);}
        op[86] = getOpcodeTrg((char)32, (char)61);
        op[87] = getOpcodeTrg((char)63, (char)127);
        {char[] a = {9}; op[88] = getOpcodeTbs(a);}
        {char[] a = {62}; op[89] = getOpcodeTbs(a);}
        op[90] = getOpcodeRnm(38, 182); // alphanum
        {char[] a = {61}; op[91] = getOpcodeTbs(a);}
        {char[] a = {61,47}; op[92] = getOpcodeTbs(a);}
        op[93] = getOpcodeRnm(38, 182); // alphanum
        {int[] a = {95,98}; op[94] = getOpcodeCat(a);}
        {int[] a = {96,97}; op[95] = getOpcodeAlt(a);}
        {char[] a = {117,95}; op[96] = getOpcodeTbs(a);}
        {char[] a = {101,95}; op[97] = getOpcodeTbs(a);}
        op[98] = getOpcodeRnm(38, 182); // alphanum
        {int[] a = {100,101}; op[99] = getOpcodeCat(a);}
        op[100] = getOpcodeRnm(41, 201); // owsp
        {char[] a = {47}; op[101] = getOpcodeTbs(a);}
        op[102] = getOpcodeRnm(42, 203); // wsp
        {char[] a = {42}; op[103] = getOpcodeTbs(a);}
        {char[] a = {38}; op[104] = getOpcodeTbs(a);}
        {char[] a = {33}; op[105] = getOpcodeTbs(a);}
        {int[] a = {107,108}; op[106] = getOpcodeCat(a);}
        {char[] a = {37}; op[107] = getOpcodeTbs(a);}
        op[108] = getOpcodeRnm(30, 126); // TrgRange
        {int[] a = {110,111}; op[109] = getOpcodeCat(a);}
        {char[] a = {37}; op[110] = getOpcodeTbs(a);}
        op[111] = getOpcodeRnm(31, 142); // TbsString
        {int[] a = {113,114,119}; op[112] = getOpcodeCat(a);}
        {char[] a = {34}; op[113] = getOpcodeTbs(a);}
        op[114] = getOpcodeRep((char)0, Character.MAX_VALUE, 115);
        {int[] a = {116,117,118}; op[115] = getOpcodeAlt(a);}
        op[116] = getOpcodeTrg((char)32, (char)33);
        op[117] = getOpcodeTrg((char)35, (char)127);
        {char[] a = {9}; op[118] = getOpcodeTbs(a);}
        {char[] a = {34}; op[119] = getOpcodeTbs(a);}
        op[120] = getOpcodeRep((char)1, Character.MAX_VALUE, 121);
        op[121] = getOpcodeTrg((char)48, (char)57);
        op[122] = getOpcodeRep((char)1, Character.MAX_VALUE, 123);
        op[123] = getOpcodeTrg((char)48, (char)57);
        op[124] = getOpcodeRep((char)1, Character.MAX_VALUE, 125);
        op[125] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {127,132,137}; op[126] = getOpcodeAlt(a);}
        {int[] a = {128,129,130,131}; op[127] = getOpcodeCat(a);}
        op[128] = getOpcodeRnm(32, 164); // Dec
        op[129] = getOpcodeRnm(35, 173); // dnum
        {char[] a = {45}; op[130] = getOpcodeTbs(a);}
        op[131] = getOpcodeRnm(35, 173); // dnum
        {int[] a = {133,134,135,136}; op[132] = getOpcodeCat(a);}
        op[133] = getOpcodeRnm(33, 167); // Hex
        op[134] = getOpcodeRnm(37, 177); // xnum
        {char[] a = {45}; op[135] = getOpcodeTbs(a);}
        op[136] = getOpcodeRnm(37, 177); // xnum
        {int[] a = {138,139,140,141}; op[137] = getOpcodeCat(a);}
        op[138] = getOpcodeRnm(34, 170); // Bin
        op[139] = getOpcodeRnm(36, 175); // bnum
        {char[] a = {45}; op[140] = getOpcodeTbs(a);}
        op[141] = getOpcodeRnm(36, 175); // bnum
        {int[] a = {143,150,157}; op[142] = getOpcodeAlt(a);}
        {int[] a = {144,145,146}; op[143] = getOpcodeCat(a);}
        op[144] = getOpcodeRnm(32, 164); // Dec
        op[145] = getOpcodeRnm(35, 173); // dnum
        op[146] = getOpcodeRep((char)0, Character.MAX_VALUE, 147);
        {int[] a = {148,149}; op[147] = getOpcodeCat(a);}
        {char[] a = {46}; op[148] = getOpcodeTbs(a);}
        op[149] = getOpcodeRnm(35, 173); // dnum
        {int[] a = {151,152,153}; op[150] = getOpcodeCat(a);}
        op[151] = getOpcodeRnm(33, 167); // Hex
        op[152] = getOpcodeRnm(37, 177); // xnum
        op[153] = getOpcodeRep((char)0, Character.MAX_VALUE, 154);
        {int[] a = {155,156}; op[154] = getOpcodeCat(a);}
        {char[] a = {46}; op[155] = getOpcodeTbs(a);}
        op[156] = getOpcodeRnm(37, 177); // xnum
        {int[] a = {158,159,160}; op[157] = getOpcodeCat(a);}
        op[158] = getOpcodeRnm(34, 170); // Bin
        op[159] = getOpcodeRnm(36, 175); // bnum
        op[160] = getOpcodeRep((char)0, Character.MAX_VALUE, 161);
        {int[] a = {162,163}; op[161] = getOpcodeCat(a);}
        {char[] a = {46}; op[162] = getOpcodeTbs(a);}
        op[163] = getOpcodeRnm(36, 175); // bnum
        {int[] a = {165,166}; op[164] = getOpcodeAlt(a);}
        {char[] a = {68}; op[165] = getOpcodeTbs(a);}
        {char[] a = {100}; op[166] = getOpcodeTbs(a);}
        {int[] a = {168,169}; op[167] = getOpcodeAlt(a);}
        {char[] a = {88}; op[168] = getOpcodeTbs(a);}
        {char[] a = {120}; op[169] = getOpcodeTbs(a);}
        {int[] a = {171,172}; op[170] = getOpcodeAlt(a);}
        {char[] a = {66}; op[171] = getOpcodeTbs(a);}
        {char[] a = {98}; op[172] = getOpcodeTbs(a);}
        op[173] = getOpcodeRep((char)1, Character.MAX_VALUE, 174);
        op[174] = getOpcodeTrg((char)48, (char)57);
        op[175] = getOpcodeRep((char)1, Character.MAX_VALUE, 176);
        op[176] = getOpcodeTrg((char)48, (char)49);
        op[177] = getOpcodeRep((char)1, Character.MAX_VALUE, 178);
        {int[] a = {179,180,181}; op[178] = getOpcodeAlt(a);}
        op[179] = getOpcodeTrg((char)48, (char)57);
        op[180] = getOpcodeTrg((char)65, (char)70);
        op[181] = getOpcodeTrg((char)97, (char)102);
        {int[] a = {183,186}; op[182] = getOpcodeCat(a);}
        {int[] a = {184,185}; op[183] = getOpcodeAlt(a);}
        op[184] = getOpcodeTrg((char)97, (char)122);
        op[185] = getOpcodeTrg((char)65, (char)90);
        op[186] = getOpcodeRep((char)0, Character.MAX_VALUE, 187);
        {int[] a = {188,189,190,191}; op[187] = getOpcodeAlt(a);}
        op[188] = getOpcodeTrg((char)97, (char)122);
        op[189] = getOpcodeTrg((char)65, (char)90);
        op[190] = getOpcodeTrg((char)48, (char)57);
        {char[] a = {45}; op[191] = getOpcodeTbs(a);}
        {int[] a = {193,194,195}; op[192] = getOpcodeAlt(a);}
        {char[] a = {32}; op[193] = getOpcodeTbs(a);}
        {char[] a = {9}; op[194] = getOpcodeTbs(a);}
        op[195] = getOpcodeRnm(43, 205); // comment
        {int[] a = {197,198,199,200}; op[196] = getOpcodeAlt(a);}
        {char[] a = {32}; op[197] = getOpcodeTbs(a);}
        {char[] a = {9}; op[198] = getOpcodeTbs(a);}
        op[199] = getOpcodeRnm(43, 205); // comment
        op[200] = getOpcodeRnm(45, 215); // LineContinue
        op[201] = getOpcodeRep((char)0, Character.MAX_VALUE, 202);
        op[202] = getOpcodeRnm(40, 196); // fsp
        op[203] = getOpcodeRep((char)1, Character.MAX_VALUE, 204);
        op[204] = getOpcodeRnm(40, 196); // fsp
        {int[] a = {206,207}; op[205] = getOpcodeCat(a);}
        {char[] a = {59}; op[206] = getOpcodeTbs(a);}
        op[207] = getOpcodeRep((char)0, Character.MAX_VALUE, 208);
        {int[] a = {209,210}; op[208] = getOpcodeAlt(a);}
        op[209] = getOpcodeTrg((char)32, (char)127);
        {char[] a = {9}; op[210] = getOpcodeTbs(a);}
        {int[] a = {212,213,214}; op[211] = getOpcodeAlt(a);}
        {char[] a = {13,10}; op[212] = getOpcodeTbs(a);}
        {char[] a = {10}; op[213] = getOpcodeTbs(a);}
        {char[] a = {13}; op[214] = getOpcodeTbs(a);}
        {int[] a = {216,217}; op[215] = getOpcodeCat(a);}
        op[216] = getOpcodeRnm(44, 211); // LineEnd
        {int[] a = {218,219}; op[217] = getOpcodeAlt(a);}
        {char[] a = {32}; op[218] = getOpcodeTbs(a);}
        {char[] a = {9}; op[219] = getOpcodeTbs(a);}
        return op;
    }

    /** Displays the original ABNF grammar syntax on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; com.coasttocoastresearch.apg.GeneratorGrammar");
        out.println(";");
        out.println(";********************************************************************");
        out.println(";  APG - an ABNF Parser Generator");
        out.println(";  Copyright (C) 2011 Coast to Coast Research, Inc.");
        out.println(";");
        out.println(";    author: Lowell D. Thomas");
        out.println(";            lowell@coasttocoastresearch.com");
        out.println(";            http://www.coasttocoastresearch.com");
        out.println(";");
        out.println(";   purpose: ABNF for SABNF");
        out.println(";");
        out.println(";*********************************************************************");
        out.println("; symbol alphabet is ASCII");
        out.println("; code points: 9, 10, 13, 32-126");
        out.println(";");
        out.println("File          = *(BlankLine/Rule/RuleError)");
        out.println("BlankLine     = *sp LineEnd");
        out.println("Rule          = NameDef owsp (IncAlt/DefinedAs) owsp Alternation owsp LineEnd");
        out.println("RuleError     = *fsp LineEnd");
        out.println("Alternation   = Concatenation *(AltOp Concatenation)");
        out.println("Concatenation = owsp Repetition *(CatOp Repetition)");
        out.println("Repetition    = Repeat / Predicate / Element");
        out.println("Repeat        = Rep Element");
        out.println("Predicate     = (AndOp / NotOp) Element");
        out.println("Rep           = (rep-min StarOp rep-max) /");
        out.println("                (rep-min StarOp)         /");
        out.println("                (StarOp rep-max)         /");
        out.println("                 StarOp                  /");
        out.println("                 rep-min-max");
        out.println("Element       = TrgOp   /");
        out.println("                TbsOp   /");
        out.println("                TlsOp   /");
        out.println("                UdtOp   /");
        out.println("                RnmOp   /");
        out.println("                Group   /");
        out.println("                Option  /");
        out.println("                ProsVal");
        out.println("Group         = %d40 owsp  Alternation owsp %d41");
        out.println("Option        = %d91 owsp Alternation owsp %d93");
        out.println("ProsVal       = %d60 *(%d32-61/%d63-127/%d9) %d62");
        out.println("");
        out.println("NameDef       = alphanum");
        out.println("DefinedAs     = %d61");
        out.println("IncAlt        = %d61.47");
        out.println("RnmOp         = alphanum");
        out.println("UdtOp         = (%d117.95/%d101.95) alphanum");
        out.println("AltOp         = owsp %d47");
        out.println("CatOp         = wsp");
        out.println("StarOp        = %d42");
        out.println("AndOp         = %d38");
        out.println("NotOp         = %d33");
        out.println("TrgOp         = %d37 TrgRange");
        out.println("TbsOp         = %d37 TbsString");
        out.println("TlsOp         = %d34 *(%d32-33/%d35-127/%d9) %d34");
        out.println("");
        out.println("rep-min       = 1*(%d48-57)");
        out.println("rep-min-max   = 1*(%d48-57)");
        out.println("rep-max       = 1*(%d48-57)");
        out.println("TrgRange      = (Dec dnum %d45 dnum) / (Hex xnum %d45 xnum) / (Bin bnum %d45 bnum)");
        out.println("TbsString     = (Dec dnum *(%d46 dnum)) / (Hex xnum *(%d46 xnum)) / (Bin bnum *(%d46 bnum))");
        out.println("Dec           = (%d68/%d100)");
        out.println("Hex           = (%d88/%d120)");
        out.println("Bin           = (%d66/%d98)");
        out.println("dnum          = 1*(%d48-57)");
        out.println("bnum          = 1*%d48-49");
        out.println("xnum          = 1*(%d48-57 / %d65-70 / %d97-102)");
        out.println("");
        out.println("; Basics");
        out.println("alphanum      = (%d97-122/%d65-90) *(%d97-122/%d65-90/%d48-57/%d45)");
        out.println("sp            = %d32    /");
        out.println("                %d9     /");
        out.println("                comment");
        out.println("fsp           = %d32    /");
        out.println("                %d9     /");
        out.println("                comment /");
        out.println("                LineContinue");
        out.println("owsp          = *fsp");
        out.println("wsp           = 1*fsp");
        out.println("comment       = %d59 *(%d32-127 / %d9)");
        out.println("LineEnd       = %d13.10 / %d10 /%d13");
        out.println("LineContinue  = LineEnd (%d32/%d9)");
    }
}