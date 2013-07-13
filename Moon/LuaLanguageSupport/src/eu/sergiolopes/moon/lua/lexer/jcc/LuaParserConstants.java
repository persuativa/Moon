/* Generated By:JavaCC: Do not edit this line. LuaParserConstants.java */
/* 
 * This file is part of Moon, a Lua/Corona SDK group of modules for the 
 * NetBeans IDE.
 * 
 * Copyright (c) 2013, Sérgio Lopes
 * 
 * Moon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Moon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * http://www.sergiolopes.eu/moon
 */
package eu.sergiolopes.moon.lua.lexer.jcc;

/**
 * Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start()
 */
public interface LuaParserConstants {

    /**
     * End of File.
     */
    int EOF = 0;
    /**
     * RegularExpression Id.
     */
    int COMMENT = 17;
    /**
     * RegularExpression Id.
     */
    int LONGCOMMENT0 = 18;
    /**
     * RegularExpression Id.
     */
    int LONGCOMMENT1 = 19;
    /**
     * RegularExpression Id.
     */
    int LONGCOMMENT2 = 20;
    /**
     * RegularExpression Id.
     */
    int LONGCOMMENT3 = 21;
    /**
     * RegularExpression Id.
     */
    int LONGCOMMENTN = 22;
    /**
     * RegularExpression Id.
     */
    int LONGSTRING0 = 23;
    /**
     * RegularExpression Id.
     */
    int LONGSTRING1 = 24;
    /**
     * RegularExpression Id.
     */
    int LONGSTRING2 = 25;
    /**
     * RegularExpression Id.
     */
    int LONGSTRING3 = 26;
    /**
     * RegularExpression Id.
     */
    int LONGSTRINGN = 27;
    /**
     * RegularExpression Id.
     */
    int AND = 29;
    /**
     * RegularExpression Id.
     */
    int BREAK = 30;
    /**
     * RegularExpression Id.
     */
    int DO = 31;
    /**
     * RegularExpression Id.
     */
    int ELSE = 32;
    /**
     * RegularExpression Id.
     */
    int ELSEIF = 33;
    /**
     * RegularExpression Id.
     */
    int END = 34;
    /**
     * RegularExpression Id.
     */
    int FALSE = 35;
    /**
     * RegularExpression Id.
     */
    int FOR = 36;
    /**
     * RegularExpression Id.
     */
    int FUNCTION = 37;
    /**
     * RegularExpression Id.
     */
    int IF = 38;
    /**
     * RegularExpression Id.
     */
    int IN = 39;
    /**
     * RegularExpression Id.
     */
    int LOCAL = 40;
    /**
     * RegularExpression Id.
     */
    int NIL = 41;
    /**
     * RegularExpression Id.
     */
    int NOT = 42;
    /**
     * RegularExpression Id.
     */
    int OR = 43;
    /**
     * RegularExpression Id.
     */
    int RETURN = 44;
    /**
     * RegularExpression Id.
     */
    int REPEAT = 45;
    /**
     * RegularExpression Id.
     */
    int THEN = 46;
    /**
     * RegularExpression Id.
     */
    int TRUE = 47;
    /**
     * RegularExpression Id.
     */
    int UNTIL = 48;
    /**
     * RegularExpression Id.
     */
    int WHILE = 49;
    /**
     * RegularExpression Id.
     */
    int NAME = 50;
    /**
     * RegularExpression Id.
     */
    int NUMBER = 51;
    /**
     * RegularExpression Id.
     */
    int FLOAT = 52;
    /**
     * RegularExpression Id.
     */
    int DIGIT = 53;
    /**
     * RegularExpression Id.
     */
    int EXP = 54;
    /**
     * RegularExpression Id.
     */
    int HEX = 55;
    /**
     * RegularExpression Id.
     */
    int HEXDIGIT = 56;
    /**
     * RegularExpression Id.
     */
    int STRING = 57;
    /**
     * RegularExpression Id.
     */
    int CHARSTRING = 58;
    /**
     * RegularExpression Id.
     */
    int QUOTED = 59;
    /**
     * RegularExpression Id.
     */
    int DECIMAL = 60;
    /**
     * RegularExpression Id.
     */
    int UNICODE = 61;
    /**
     * RegularExpression Id.
     */
    int CHAR = 62;
    /**
     * RegularExpression Id.
     */
    int LF = 63;
    /**
     * Lexical state.
     */
    int DEFAULT = 0;
    /**
     * Lexical state.
     */
    int IN_COMMENT = 1;
    /**
     * Lexical state.
     */
    int IN_LC0 = 2;
    /**
     * Lexical state.
     */
    int IN_LC1 = 3;
    /**
     * Lexical state.
     */
    int IN_LC2 = 4;
    /**
     * Lexical state.
     */
    int IN_LC3 = 5;
    /**
     * Lexical state.
     */
    int IN_LCN = 6;
    /**
     * Lexical state.
     */
    int IN_LS0 = 7;
    /**
     * Lexical state.
     */
    int IN_LS1 = 8;
    /**
     * Lexical state.
     */
    int IN_LS2 = 9;
    /**
     * Lexical state.
     */
    int IN_LS3 = 10;
    /**
     * Lexical state.
     */
    int IN_LSN = 11;
    /**
     * Literal token values.
     */
    String[] tokenImage = {
        "<EOF>",
        "\" \"",
        "\"\\t\"",
        "\"\\n\"",
        "\"\\r\"",
        "\"\\f\"",
        "\"--[[\"",
        "\"--[=[\"",
        "\"--[==[\"",
        "\"--[===[\"",
        "<token of kind 10>",
        "\"[[\"",
        "\"[=[\"",
        "\"[==[\"",
        "\"[===[\"",
        "<token of kind 15>",
        "\"--\"",
        "<COMMENT>",
        "\"]]\"",
        "\"]=]\"",
        "\"]==]\"",
        "\"]===]\"",
        "<LONGCOMMENTN>",
        "\"]]\"",
        "\"]=]\"",
        "\"]==]\"",
        "\"]===]\"",
        "<LONGSTRINGN>",
        "<token of kind 28>",
        "\"and\"",
        "\"break\"",
        "\"do\"",
        "\"else\"",
        "\"elseif\"",
        "\"end\"",
        "\"false\"",
        "\"for\"",
        "\"function\"",
        "\"if\"",
        "\"in\"",
        "\"local\"",
        "\"nil\"",
        "\"not\"",
        "\"or\"",
        "\"return\"",
        "\"repeat\"",
        "\"then\"",
        "\"true\"",
        "\"until\"",
        "\"while\"",
        "<NAME>",
        "<NUMBER>",
        "<FLOAT>",
        "<DIGIT>",
        "<EXP>",
        "<HEX>",
        "<HEXDIGIT>",
        "<STRING>",
        "<CHARSTRING>",
        "<QUOTED>",
        "<DECIMAL>",
        "<UNICODE>",
        "<CHAR>",
        "<LF>",
        "\";\"",
        "\"=\"",
        "\",\"",
        "\".\"",
        "\":\"",
        "\"(\"",
        "\")\"",
        "\"[\"",
        "\"]\"",
        "\"...\"",
        "\"{\"",
        "\"}\"",
        "\"+\"",
        "\"-\"",
        "\"*\"",
        "\"/\"",
        "\"^\"",
        "\"%\"",
        "\"..\"",
        "\"<\"",
        "\"<=\"",
        "\">\"",
        "\">=\"",
        "\"==\"",
        "\"~=\"",
        "\"#\"",};
}
