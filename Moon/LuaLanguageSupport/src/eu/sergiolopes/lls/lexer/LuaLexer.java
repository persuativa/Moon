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
 * https://github.com/Knitter/Moon
 */
package eu.sergiolopes.lls.lexer;

import eu.sergiolopes.lls.lexer.jcc.LuaParserTokenManager;
import eu.sergiolopes.lls.lexer.jcc.SimpleCharStream;
import eu.sergiolopes.lls.lexer.jcc.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author sergio
 */
public class LuaLexer implements Lexer<LuaTokenId> {

    private LexerRestartInfo<LuaTokenId> info;
    private LuaParserTokenManager javaParserTokenManager;

    public LuaLexer(LexerRestartInfo<LuaTokenId> info) {
        this.info = info;
        SimpleCharStream stream = new SimpleCharStream(info.input());
        javaParserTokenManager = new LuaParserTokenManager(stream);
    }

    @Override
    public org.netbeans.api.lexer.Token<LuaTokenId> nextToken() {
        Token token = javaParserTokenManager.getNextToken();
        if (info.input().readLength() < 1) {
            return null;
        }
        return info.tokenFactory().createToken(LuaLanguageHierarchy.getToken(token.kind));
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
