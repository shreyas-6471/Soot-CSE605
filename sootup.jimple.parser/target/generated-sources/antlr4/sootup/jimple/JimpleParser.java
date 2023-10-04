// Generated from sootup/jimple/Jimple.g4 by ANTLR 4.9.3
package sootup.jimple;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, LINE_COMMENT=28, LONG_COMMENT=29, STRING_CONSTANT=30, 
		CLASS=31, EXTENDS=32, IMPLEMENTS=33, BREAKPOINT=34, CASE=35, CATCH=36, 
		CMP=37, CMPG=38, CMPL=39, DEFAULT=40, ENTERMONITOR=41, EXITMONITOR=42, 
		GOTO=43, IF=44, INSTANCEOF=45, LENGTHOF=46, SWITCH=47, NEG=48, NEWARRAY=49, 
		NEWMULTIARRAY=50, NEW=51, NOP=52, RETURN=53, RET=54, NONSTATIC_INVOKE=55, 
		STATICINVOKE=56, DYNAMICINVOKE=57, THROWS=58, THROW=59, NULL=60, FROM=61, 
		TO=62, WITH=63, COMMA=64, L_BRACE=65, R_BRACE=66, SEMICOLON=67, L_BRACKET=68, 
		R_BRACKET=69, L_PAREN=70, R_PAREN=71, COLON=72, DOT=73, EQUALS=74, COLON_EQUALS=75, 
		AND=76, OR=77, XOR=78, MOD=79, CMPEQ=80, CMPNE=81, CMPGT=82, CMPGE=83, 
		CMPLT=84, CMPLE=85, SHL=86, SHR=87, USHR=88, PLUS=89, MINUS=90, MULT=91, 
		DIV=92, QUOTE=93, BOOL_CONSTANT=94, FLOAT_CONSTANT=95, DEC_CONSTANT=96, 
		HEX_CONSTANT=97, IDENTIFIER=98, BLANK=99;
	public static final int
		RULE_identifier = 0, RULE_integer_constant = 1, RULE_file = 2, RULE_importItem = 3, 
		RULE_common_modifier = 4, RULE_class_modifier = 5, RULE_method_modifier = 6, 
		RULE_field_modifier = 7, RULE_file_type = 8, RULE_extends_clause = 9, 
		RULE_implements_clause = 10, RULE_type = 11, RULE_type_list = 12, RULE_member = 13, 
		RULE_field = 14, RULE_method = 15, RULE_method_name = 16, RULE_throws_clause = 17, 
		RULE_method_body = 18, RULE_method_body_contents = 19, RULE_trap_clauses = 20, 
		RULE_statements = 21, RULE_declarations = 22, RULE_declaration = 23, RULE_statement = 24, 
		RULE_stmt = 25, RULE_assignments = 26, RULE_identity_ref = 27, RULE_case_stmt = 28, 
		RULE_case_label = 29, RULE_goto_stmt = 30, RULE_trap_clause = 31, RULE_value = 32, 
		RULE_bool_expr = 33, RULE_invoke_expr = 34, RULE_binop_expr = 35, RULE_unop_expr = 36, 
		RULE_method_subsignature = 37, RULE_method_signature = 38, RULE_reference = 39, 
		RULE_field_signature = 40, RULE_array_descriptor = 41, RULE_arg_list = 42, 
		RULE_immediate = 43, RULE_constant = 44, RULE_binop = 45, RULE_unop = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "integer_constant", "file", "importItem", "common_modifier", 
			"class_modifier", "method_modifier", "field_modifier", "file_type", "extends_clause", 
			"implements_clause", "type", "type_list", "member", "field", "method", 
			"method_name", "throws_clause", "method_body", "method_body_contents", 
			"trap_clauses", "statements", "declarations", "declaration", "statement", 
			"stmt", "assignments", "identity_ref", "case_stmt", "case_label", "goto_stmt", 
			"trap_clause", "value", "bool_expr", "invoke_expr", "binop_expr", "unop_expr", 
			"method_subsignature", "method_signature", "reference", "field_signature", 
			"array_descriptor", "arg_list", "immediate", "constant", "binop", "unop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'L'", "'import'", "'final'", "'public'", "'protected'", "'private'", 
			"'static'", "'enum'", "'synthetic'", "'abstract'", "'super'", "'native'", 
			"'synchronized'", "'varargs'", "'bridge'", "'strictfp'", "'transient'", 
			"'volatile'", "'interface'", "'annotation interface'", "'<init>'", "'<clinit>'", 
			"'@parameter'", "'@this:'", "'@caughtexception'", "'handle:'", "'methodtype:'", 
			null, null, null, "'class'", "'extends'", "'implements'", "'breakpoint'", 
			"'case'", "'catch'", "'cmp'", "'cmpg'", "'cmpl'", "'default'", "'entermonitor'", 
			"'exitmonitor'", "'goto'", "'if'", "'instanceof'", "'lengthof'", null, 
			"'neg'", "'newarray'", "'newmultiarray'", "'new'", "'nop'", "'return'", 
			"'ret'", null, "'staticinvoke'", "'dynamicinvoke'", "'throws'", "'throw'", 
			"'null'", "'from'", "'to'", "'with'", "','", "'{'", "'}'", "';'", "'['", 
			"']'", "'('", "')'", "':'", "'.'", "'='", "':='", "'&'", "'|'", "'^'", 
			"'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'<<'", "'>>'", 
			"'>>>'", "'+'", "'-'", "'*'", "'/'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "LINE_COMMENT", "LONG_COMMENT", "STRING_CONSTANT", 
			"CLASS", "EXTENDS", "IMPLEMENTS", "BREAKPOINT", "CASE", "CATCH", "CMP", 
			"CMPG", "CMPL", "DEFAULT", "ENTERMONITOR", "EXITMONITOR", "GOTO", "IF", 
			"INSTANCEOF", "LENGTHOF", "SWITCH", "NEG", "NEWARRAY", "NEWMULTIARRAY", 
			"NEW", "NOP", "RETURN", "RET", "NONSTATIC_INVOKE", "STATICINVOKE", "DYNAMICINVOKE", 
			"THROWS", "THROW", "NULL", "FROM", "TO", "WITH", "COMMA", "L_BRACE", 
			"R_BRACE", "SEMICOLON", "L_BRACKET", "R_BRACKET", "L_PAREN", "R_PAREN", 
			"COLON", "DOT", "EQUALS", "COLON_EQUALS", "AND", "OR", "XOR", "MOD", 
			"CMPEQ", "CMPNE", "CMPGT", "CMPGE", "CMPLT", "CMPLE", "SHL", "SHR", "USHR", 
			"PLUS", "MINUS", "MULT", "DIV", "QUOTE", "BOOL_CONSTANT", "FLOAT_CONSTANT", 
			"DEC_CONSTANT", "HEX_CONSTANT", "IDENTIFIER", "BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JimpleParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constantContext extends ParserRuleContext {
		public TerminalNode DEC_CONSTANT() { return getToken(JimpleParser.DEC_CONSTANT, 0); }
		public TerminalNode HEX_CONSTANT() { return getToken(JimpleParser.HEX_CONSTANT, 0); }
		public TerminalNode PLUS() { return getToken(JimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JimpleParser.MINUS, 0); }
		public Integer_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterInteger_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitInteger_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitInteger_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_constantContext integer_constant() throws RecognitionException {
		Integer_constantContext _localctx = new Integer_constantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(99);
			_la = _input.LA(1);
			if ( !(_la==DEC_CONSTANT || _la==HEX_CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(100);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public Token classname;
		public File_typeContext file_type() {
			return getRuleContext(File_typeContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(JimpleParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(JimpleParser.R_BRACE, 0); }
		public TerminalNode EOF() { return getToken(JimpleParser.EOF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JimpleParser.IDENTIFIER, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<Class_modifierContext> class_modifier() {
			return getRuleContexts(Class_modifierContext.class);
		}
		public Class_modifierContext class_modifier(int i) {
			return getRuleContext(Class_modifierContext.class,i);
		}
		public Extends_clauseContext extends_clause() {
			return getRuleContext(Extends_clauseContext.class,0);
		}
		public Implements_clauseContext implements_clause() {
			return getRuleContext(Implements_clauseContext.class,0);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(103);
				importItem();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(109);
				class_modifier();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			file_type();
			setState(116);
			((FileContext)_localctx).classname = match(IDENTIFIER);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(117);
				extends_clause();
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(120);
				implements_clause();
				}
			}

			setState(123);
			match(L_BRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(124);
				member();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(R_BRACE);
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportItemContext extends ParserRuleContext {
		public IdentifierContext location;
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__1);
			setState(134);
			((ImportItemContext)_localctx).location = identifier();
			setState(135);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_modifierContext extends ParserRuleContext {
		public Common_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterCommon_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitCommon_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitCommon_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_modifierContext common_modifier() throws RecognitionException {
		Common_modifierContext _localctx = new Common_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_common_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_modifierContext extends ParserRuleContext {
		public Common_modifierContext common_modifier() {
			return getRuleContext(Common_modifierContext.class,0);
		}
		public Class_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterClass_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitClass_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitClass_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_modifierContext class_modifier() throws RecognitionException {
		Class_modifierContext _localctx = new Class_modifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_modifier);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				common_modifier();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_modifierContext extends ParserRuleContext {
		public Common_modifierContext common_modifier() {
			return getRuleContext(Common_modifierContext.class,0);
		}
		public Method_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_modifierContext method_modifier() throws RecognitionException {
		Method_modifierContext _localctx = new Method_modifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_modifier);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				common_modifier();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__9);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_modifierContext extends ParserRuleContext {
		public Common_modifierContext common_modifier() {
			return getRuleContext(Common_modifierContext.class,0);
		}
		public Field_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterField_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitField_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitField_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_modifierContext field_modifier() throws RecognitionException {
		Field_modifierContext _localctx = new Field_modifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_modifier);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				common_modifier();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_typeContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JimpleParser.CLASS, 0); }
		public File_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterFile_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitFile_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitFile_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_typeContext file_type() throws RecognitionException {
		File_typeContext _localctx = new File_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_file_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << CLASS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extends_clauseContext extends ParserRuleContext {
		public IdentifierContext classname;
		public TerminalNode EXTENDS() { return getToken(JimpleParser.EXTENDS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Extends_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterExtends_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitExtends_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitExtends_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extends_clauseContext extends_clause() throws RecognitionException {
		Extends_clauseContext _localctx = new Extends_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extends_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(EXTENDS);
			setState(161);
			((Extends_clauseContext)_localctx).classname = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implements_clauseContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(JimpleParser.IMPLEMENTS, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Implements_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterImplements_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitImplements_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitImplements_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implements_clauseContext implements_clause() throws RecognitionException {
		Implements_clauseContext _localctx = new Implements_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_implements_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IMPLEMENTS);
			setState(164);
			type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> L_BRACKET() { return getTokens(JimpleParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(JimpleParser.L_BRACKET, i);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(JimpleParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(JimpleParser.R_BRACKET, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			identifier();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_BRACKET) {
				{
				{
				setState(167);
				match(L_BRACKET);
				setState(168);
				match(R_BRACKET);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JimpleParser.COMMA, i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterType_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitType_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitType_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			type();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				type();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_member);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				method();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public List<Field_modifierContext> field_modifier() {
			return getRuleContexts(Field_modifierContext.class);
		}
		public Field_modifierContext field_modifier(int i) {
			return getRuleContext(Field_modifierContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(186);
				field_modifier();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			type();
			setState(193);
			identifier();
			setState(194);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Method_subsignatureContext method_subsignature() {
			return getRuleContext(Method_subsignatureContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<Method_modifierContext> method_modifier() {
			return getRuleContexts(Method_modifierContext.class);
		}
		public Method_modifierContext method_modifier(int i) {
			return getRuleContext(Method_modifierContext.class,i);
		}
		public Throws_clauseContext throws_clause() {
			return getRuleContext(Throws_clauseContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(196);
				method_modifier();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			method_subsignature();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(203);
				throws_clause();
				}
			}

			setState(206);
			method_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_name);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__21);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_clauseContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JimpleParser.THROWS, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Throws_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterThrows_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitThrows_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitThrows_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_clauseContext throws_clause() throws RecognitionException {
		Throws_clauseContext _localctx = new Throws_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_throws_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(THROWS);
			setState(214);
			type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public TerminalNode L_BRACE() { return getToken(JimpleParser.L_BRACE, 0); }
		public Method_body_contentsContext method_body_contents() {
			return getRuleContext(Method_body_contentsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JimpleParser.R_BRACE, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_body);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(SEMICOLON);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(L_BRACE);
				setState(218);
				method_body_contents();
				setState(219);
				match(R_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_body_contentsContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Trap_clausesContext trap_clauses() {
			return getRuleContext(Trap_clausesContext.class,0);
		}
		public Method_body_contentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_body_contents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_body_contents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_body_contents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_body_contentsContext method_body_contents() throws RecognitionException {
		Method_body_contentsContext _localctx = new Method_body_contentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_method_body_contents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			declarations();
			setState(224);
			statements();
			setState(225);
			trap_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trap_clausesContext extends ParserRuleContext {
		public List<Trap_clauseContext> trap_clause() {
			return getRuleContexts(Trap_clauseContext.class);
		}
		public Trap_clauseContext trap_clause(int i) {
			return getRuleContext(Trap_clauseContext.class,i);
		}
		public Trap_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trap_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterTrap_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitTrap_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitTrap_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trap_clausesContext trap_clauses() throws RecognitionException {
		Trap_clausesContext _localctx = new Trap_clausesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trap_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(227);
				trap_clause();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAKPOINT) | (1L << ENTERMONITOR) | (1L << EXITMONITOR) | (1L << GOTO) | (1L << IF) | (1L << SWITCH) | (1L << NOP) | (1L << RETURN) | (1L << RET) | (1L << NONSTATIC_INVOKE) | (1L << STATICINVOKE) | (1L << DYNAMICINVOKE) | (1L << THROW))) != 0) || _la==CMPLT || _la==IDENTIFIER) {
				{
				{
				setState(233);
				statement();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					declaration();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			type();
			setState(246);
			arg_list();
			setState(247);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IdentifierContext label_name;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(JimpleParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(249);
				((StatementContext)_localctx).label_name = identifier();
				setState(250);
				match(COLON);
				}
				break;
			}
			setState(254);
			stmt();
			setState(255);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public TerminalNode IF() { return getToken(JimpleParser.IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Invoke_exprContext invoke_expr() {
			return getRuleContext(Invoke_exprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(JimpleParser.RETURN, 0); }
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JimpleParser.SWITCH, 0); }
		public TerminalNode L_PAREN() { return getToken(JimpleParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JimpleParser.R_PAREN, 0); }
		public TerminalNode L_BRACE() { return getToken(JimpleParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(JimpleParser.R_BRACE, 0); }
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public TerminalNode RET() { return getToken(JimpleParser.RET, 0); }
		public TerminalNode THROW() { return getToken(JimpleParser.THROW, 0); }
		public TerminalNode ENTERMONITOR() { return getToken(JimpleParser.ENTERMONITOR, 0); }
		public TerminalNode EXITMONITOR() { return getToken(JimpleParser.EXITMONITOR, 0); }
		public TerminalNode NOP() { return getToken(JimpleParser.NOP, 0); }
		public TerminalNode BREAKPOINT() { return getToken(JimpleParser.BREAKPOINT, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stmt);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMPLT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				assignments();
				}
				break;
			case GOTO:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(258);
					match(IF);
					setState(259);
					bool_expr();
					}
				}

				setState(262);
				goto_stmt();
				}
				break;
			case NONSTATIC_INVOKE:
			case STATICINVOKE:
			case DYNAMICINVOKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				invoke_expr();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(RETURN);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(265);
					immediate();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(SWITCH);
				setState(269);
				match(L_PAREN);
				setState(270);
				immediate();
				setState(271);
				match(R_PAREN);
				setState(272);
				match(L_BRACE);
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					case_stmt();
					}
					}
					setState(276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(278);
				match(R_BRACE);
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				match(RET);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(281);
					immediate();
					}
				}

				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(THROW);
				setState(285);
				immediate();
				}
				break;
			case ENTERMONITOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				match(ENTERMONITOR);
				setState(287);
				immediate();
				}
				break;
			case EXITMONITOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(288);
				match(EXITMONITOR);
				setState(289);
				immediate();
				}
				break;
			case NOP:
				enterOuterAlt(_localctx, 10);
				{
				setState(290);
				match(NOP);
				}
				break;
			case BREAKPOINT:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				match(BREAKPOINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentsContext extends ParserRuleContext {
		public IdentifierContext local;
		public TerminalNode COLON_EQUALS() { return getToken(JimpleParser.COLON_EQUALS, 0); }
		public Identity_refContext identity_ref() {
			return getRuleContext(Identity_refContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(JimpleParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignments);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((AssignmentsContext)_localctx).local = identifier();
				setState(295);
				match(COLON_EQUALS);
				setState(296);
				identity_ref();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(298);
					reference();
					}
					break;
				case 2:
					{
					setState(299);
					((AssignmentsContext)_localctx).local = identifier();
					}
					break;
				}
				setState(302);
				match(EQUALS);
				setState(303);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identity_refContext extends ParserRuleContext {
		public Token parameter_idx;
		public Token caught;
		public TerminalNode COLON() { return getToken(JimpleParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DEC_CONSTANT() { return getToken(JimpleParser.DEC_CONSTANT, 0); }
		public Identity_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identity_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterIdentity_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitIdentity_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitIdentity_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identity_refContext identity_ref() throws RecognitionException {
		Identity_refContext _localctx = new Identity_refContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identity_ref);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__22);
				setState(308);
				((Identity_refContext)_localctx).parameter_idx = match(DEC_CONSTANT);
				setState(309);
				match(COLON);
				setState(310);
				type();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__23);
				setState(312);
				type();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				((Identity_refContext)_localctx).caught = match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JimpleParser.COLON, 0); }
		public Goto_stmtContext goto_stmt() {
			return getRuleContext(Goto_stmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitCase_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			case_label();
			setState(317);
			match(COLON);
			setState(318);
			goto_stmt();
			setState(319);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JimpleParser.CASE, 0); }
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JimpleParser.DEFAULT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_case_label);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(CASE);
				setState(322);
				integer_constant();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Goto_stmtContext extends ParserRuleContext {
		public IdentifierContext label_name;
		public TerminalNode GOTO() { return getToken(JimpleParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Goto_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterGoto_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitGoto_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitGoto_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_stmtContext goto_stmt() throws RecognitionException {
		Goto_stmtContext _localctx = new Goto_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_goto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(GOTO);
			setState(327);
			((Goto_stmtContext)_localctx).label_name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trap_clauseContext extends ParserRuleContext {
		public IdentifierContext exceptiontype;
		public IdentifierContext from;
		public IdentifierContext to;
		public IdentifierContext with;
		public TerminalNode CATCH() { return getToken(JimpleParser.CATCH, 0); }
		public TerminalNode FROM() { return getToken(JimpleParser.FROM, 0); }
		public TerminalNode TO() { return getToken(JimpleParser.TO, 0); }
		public TerminalNode WITH() { return getToken(JimpleParser.WITH, 0); }
		public TerminalNode SEMICOLON() { return getToken(JimpleParser.SEMICOLON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Trap_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trap_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterTrap_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitTrap_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitTrap_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trap_clauseContext trap_clause() throws RecognitionException {
		Trap_clauseContext _localctx = new Trap_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_trap_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(CATCH);
			setState(330);
			((Trap_clauseContext)_localctx).exceptiontype = identifier();
			setState(331);
			match(FROM);
			setState(332);
			((Trap_clauseContext)_localctx).from = identifier();
			setState(333);
			match(TO);
			setState(334);
			((Trap_clauseContext)_localctx).to = identifier();
			setState(335);
			match(WITH);
			setState(336);
			((Trap_clauseContext)_localctx).with = identifier();
			setState(337);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext base_type;
		public TypeContext array_type;
		public TypeContext multiarray_type;
		public TypeContext nonvoid_cast;
		public ImmediateContext op;
		public TypeContext nonvoid_type;
		public List<ImmediateContext> immediate() {
			return getRuleContexts(ImmediateContext.class);
		}
		public ImmediateContext immediate(int i) {
			return getRuleContext(ImmediateContext.class,i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JimpleParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NEWARRAY() { return getToken(JimpleParser.NEWARRAY, 0); }
		public TerminalNode L_PAREN() { return getToken(JimpleParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JimpleParser.R_PAREN, 0); }
		public Array_descriptorContext array_descriptor() {
			return getRuleContext(Array_descriptorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NEWMULTIARRAY() { return getToken(JimpleParser.NEWMULTIARRAY, 0); }
		public List<TerminalNode> L_BRACKET() { return getTokens(JimpleParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(JimpleParser.L_BRACKET, i);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(JimpleParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(JimpleParser.R_BRACKET, i);
		}
		public TerminalNode INSTANCEOF() { return getToken(JimpleParser.INSTANCEOF, 0); }
		public Binop_exprContext binop_expr() {
			return getRuleContext(Binop_exprContext.class,0);
		}
		public Invoke_exprContext invoke_expr() {
			return getRuleContext(Invoke_exprContext.class,0);
		}
		public Unop_exprContext unop_expr() {
			return getRuleContext(Unop_exprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_value);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				immediate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(NEW);
				setState(342);
				((ValueContext)_localctx).base_type = identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(NEWARRAY);
				setState(344);
				match(L_PAREN);
				setState(345);
				((ValueContext)_localctx).array_type = type();
				setState(346);
				match(R_PAREN);
				setState(347);
				array_descriptor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				match(NEWMULTIARRAY);
				setState(350);
				match(L_PAREN);
				setState(351);
				((ValueContext)_localctx).multiarray_type = type();
				setState(352);
				match(R_PAREN);
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(353);
					match(L_BRACKET);
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
						{
						setState(354);
						immediate();
						}
					}

					setState(357);
					match(R_BRACKET);
					}
					}
					setState(360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_BRACKET );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(L_PAREN);
				setState(363);
				((ValueContext)_localctx).nonvoid_cast = type();
				setState(364);
				match(R_PAREN);
				setState(365);
				((ValueContext)_localctx).op = immediate();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				((ValueContext)_localctx).op = immediate();
				setState(368);
				match(INSTANCEOF);
				setState(369);
				((ValueContext)_localctx).nonvoid_type = type();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				binop_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				invoke_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				unop_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public Binop_exprContext binop_expr() {
			return getRuleContext(Binop_exprContext.class,0);
		}
		public Unop_exprContext unop_expr() {
			return getRuleContext(Unop_exprContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bool_expr);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case STRING_CONSTANT:
			case CLASS:
			case NULL:
			case PLUS:
			case MINUS:
			case BOOL_CONSTANT:
			case FLOAT_CONSTANT:
			case DEC_CONSTANT:
			case HEX_CONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				binop_expr();
				}
				break;
			case LENGTHOF:
			case NEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				unop_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invoke_exprContext extends ParserRuleContext {
		public Token nonstaticinvoke;
		public IdentifierContext local_name;
		public Token staticinvoke;
		public Token dynamicinvoke;
		public Token unnamed_method_name;
		public TypeContext name;
		public Type_listContext parameter_list;
		public Arg_listContext dyn_args;
		public Method_signatureContext bsm;
		public Arg_listContext staticargs;
		public TerminalNode DOT() { return getToken(JimpleParser.DOT, 0); }
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public List<TerminalNode> L_PAREN() { return getTokens(JimpleParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(JimpleParser.L_PAREN, i);
		}
		public List<TerminalNode> R_PAREN() { return getTokens(JimpleParser.R_PAREN); }
		public TerminalNode R_PAREN(int i) {
			return getToken(JimpleParser.R_PAREN, i);
		}
		public TerminalNode NONSTATIC_INVOKE() { return getToken(JimpleParser.NONSTATIC_INVOKE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Arg_listContext> arg_list() {
			return getRuleContexts(Arg_listContext.class);
		}
		public Arg_listContext arg_list(int i) {
			return getRuleContext(Arg_listContext.class,i);
		}
		public TerminalNode STATICINVOKE() { return getToken(JimpleParser.STATICINVOKE, 0); }
		public TerminalNode CMPLT() { return getToken(JimpleParser.CMPLT, 0); }
		public TerminalNode CMPGT() { return getToken(JimpleParser.CMPGT, 0); }
		public TerminalNode DYNAMICINVOKE() { return getToken(JimpleParser.DYNAMICINVOKE, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(JimpleParser.STRING_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Invoke_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterInvoke_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitInvoke_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitInvoke_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invoke_exprContext invoke_expr() throws RecognitionException {
		Invoke_exprContext _localctx = new Invoke_exprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_invoke_expr);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONSTATIC_INVOKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((Invoke_exprContext)_localctx).nonstaticinvoke = match(NONSTATIC_INVOKE);
				setState(381);
				((Invoke_exprContext)_localctx).local_name = identifier();
				setState(382);
				match(DOT);
				setState(383);
				method_signature();
				setState(384);
				match(L_PAREN);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(385);
					arg_list();
					}
				}

				setState(388);
				match(R_PAREN);
				}
				break;
			case STATICINVOKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((Invoke_exprContext)_localctx).staticinvoke = match(STATICINVOKE);
				setState(391);
				method_signature();
				setState(392);
				match(L_PAREN);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(393);
					arg_list();
					}
				}

				setState(396);
				match(R_PAREN);
				}
				break;
			case DYNAMICINVOKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				((Invoke_exprContext)_localctx).dynamicinvoke = match(DYNAMICINVOKE);
				setState(399);
				((Invoke_exprContext)_localctx).unnamed_method_name = match(STRING_CONSTANT);
				setState(400);
				match(CMPLT);
				setState(401);
				((Invoke_exprContext)_localctx).name = type();
				setState(402);
				match(L_PAREN);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(403);
					((Invoke_exprContext)_localctx).parameter_list = type_list();
					}
				}

				setState(406);
				match(R_PAREN);
				setState(407);
				match(CMPGT);
				setState(408);
				match(L_PAREN);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(409);
					((Invoke_exprContext)_localctx).dyn_args = arg_list();
					}
				}

				setState(412);
				match(R_PAREN);
				setState(413);
				((Invoke_exprContext)_localctx).bsm = method_signature();
				setState(414);
				match(L_PAREN);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << STRING_CONSTANT) | (1L << CLASS) | (1L << NULL))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (PLUS - 89)) | (1L << (MINUS - 89)) | (1L << (BOOL_CONSTANT - 89)) | (1L << (FLOAT_CONSTANT - 89)) | (1L << (DEC_CONSTANT - 89)) | (1L << (HEX_CONSTANT - 89)) | (1L << (IDENTIFIER - 89)))) != 0)) {
					{
					setState(415);
					((Invoke_exprContext)_localctx).staticargs = arg_list();
					}
				}

				setState(418);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binop_exprContext extends ParserRuleContext {
		public ImmediateContext left;
		public ImmediateContext right;
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public List<ImmediateContext> immediate() {
			return getRuleContexts(ImmediateContext.class);
		}
		public ImmediateContext immediate(int i) {
			return getRuleContext(ImmediateContext.class,i);
		}
		public Binop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterBinop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitBinop_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitBinop_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binop_exprContext binop_expr() throws RecognitionException {
		Binop_exprContext _localctx = new Binop_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_binop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			((Binop_exprContext)_localctx).left = immediate();
			setState(423);
			binop();
			setState(424);
			((Binop_exprContext)_localctx).right = immediate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unop_exprContext extends ParserRuleContext {
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Unop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterUnop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitUnop_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitUnop_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unop_exprContext unop_expr() throws RecognitionException {
		Unop_exprContext _localctx = new Unop_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			unop();
			setState(427);
			immediate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_subsignatureContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(JimpleParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(JimpleParser.R_PAREN, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Method_subsignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_subsignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_subsignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_subsignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_subsignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_subsignatureContext method_subsignature() throws RecognitionException {
		Method_subsignatureContext _localctx = new Method_subsignatureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_method_subsignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			type();
			setState(430);
			method_name();
			setState(431);
			match(L_PAREN);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(432);
				type_list();
				}
			}

			setState(435);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_signatureContext extends ParserRuleContext {
		public IdentifierContext class_name;
		public TerminalNode CMPLT() { return getToken(JimpleParser.CMPLT, 0); }
		public TerminalNode COLON() { return getToken(JimpleParser.COLON, 0); }
		public Method_subsignatureContext method_subsignature() {
			return getRuleContext(Method_subsignatureContext.class,0);
		}
		public TerminalNode CMPGT() { return getToken(JimpleParser.CMPGT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Method_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterMethod_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitMethod_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitMethod_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_signatureContext method_signature() throws RecognitionException {
		Method_signatureContext _localctx = new Method_signatureContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_method_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(CMPLT);
			setState(438);
			((Method_signatureContext)_localctx).class_name = identifier();
			setState(439);
			match(COLON);
			setState(440);
			method_subsignature();
			setState(441);
			match(CMPGT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_descriptorContext array_descriptor() {
			return getRuleContext(Array_descriptorContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JimpleParser.DOT, 0); }
		public Field_signatureContext field_signature() {
			return getRuleContext(Field_signatureContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_reference);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				identifier();
				setState(444);
				array_descriptor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				identifier();
				setState(447);
				match(DOT);
				setState(448);
				field_signature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				field_signature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_signatureContext extends ParserRuleContext {
		public IdentifierContext classname;
		public IdentifierContext fieldname;
		public TerminalNode CMPLT() { return getToken(JimpleParser.CMPLT, 0); }
		public TerminalNode COLON() { return getToken(JimpleParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CMPGT() { return getToken(JimpleParser.CMPGT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Field_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterField_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitField_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitField_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_signatureContext field_signature() throws RecognitionException {
		Field_signatureContext _localctx = new Field_signatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_field_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(CMPLT);
			setState(454);
			((Field_signatureContext)_localctx).classname = identifier();
			setState(455);
			match(COLON);
			setState(456);
			type();
			setState(457);
			((Field_signatureContext)_localctx).fieldname = identifier();
			setState(458);
			match(CMPGT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_descriptorContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(JimpleParser.L_BRACKET, 0); }
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(JimpleParser.R_BRACKET, 0); }
		public Array_descriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterArray_descriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitArray_descriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitArray_descriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_descriptorContext array_descriptor() throws RecognitionException {
		Array_descriptorContext _localctx = new Array_descriptorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_array_descriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(L_BRACKET);
			setState(461);
			immediate();
			setState(462);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public List<ImmediateContext> immediate() {
			return getRuleContexts(ImmediateContext.class);
		}
		public ImmediateContext immediate(int i) {
			return getRuleContext(ImmediateContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JimpleParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			immediate();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				immediate();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmediateContext extends ParserRuleContext {
		public IdentifierContext local;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_immediate);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				((ImmediateContext)_localctx).local = identifier();
				}
				break;
			case T__25:
			case T__26:
			case STRING_CONSTANT:
			case CLASS:
			case NULL:
			case PLUS:
			case MINUS:
			case BOOL_CONSTANT:
			case FLOAT_CONSTANT:
			case DEC_CONSTANT:
			case HEX_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token methodhandle;
		public Token methodtype;
		public TerminalNode BOOL_CONSTANT() { return getToken(JimpleParser.BOOL_CONSTANT, 0); }
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public TerminalNode FLOAT_CONSTANT() { return getToken(JimpleParser.FLOAT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(JimpleParser.STRING_CONSTANT, 0); }
		public TerminalNode CLASS() { return getToken(JimpleParser.CLASS, 0); }
		public TerminalNode NULL() { return getToken(JimpleParser.NULL, 0); }
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Method_subsignatureContext method_subsignature() {
			return getRuleContext(Method_subsignatureContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constant);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(BOOL_CONSTANT);
				}
				break;
			case PLUS:
			case MINUS:
			case DEC_CONSTANT:
			case HEX_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				integer_constant();
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(STRING_CONSTANT);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(CLASS);
				setState(481);
				match(STRING_CONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				match(NULL);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(483);
				((ConstantContext)_localctx).methodhandle = match(T__25);
				setState(484);
				method_signature();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				((ConstantContext)_localctx).methodtype = match(T__26);
				setState(486);
				method_subsignature();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(JimpleParser.AND, 0); }
		public TerminalNode OR() { return getToken(JimpleParser.OR, 0); }
		public TerminalNode XOR() { return getToken(JimpleParser.XOR, 0); }
		public TerminalNode CMP() { return getToken(JimpleParser.CMP, 0); }
		public TerminalNode CMPG() { return getToken(JimpleParser.CMPG, 0); }
		public TerminalNode CMPL() { return getToken(JimpleParser.CMPL, 0); }
		public TerminalNode CMPEQ() { return getToken(JimpleParser.CMPEQ, 0); }
		public TerminalNode CMPNE() { return getToken(JimpleParser.CMPNE, 0); }
		public TerminalNode CMPGT() { return getToken(JimpleParser.CMPGT, 0); }
		public TerminalNode CMPGE() { return getToken(JimpleParser.CMPGE, 0); }
		public TerminalNode CMPLT() { return getToken(JimpleParser.CMPLT, 0); }
		public TerminalNode CMPLE() { return getToken(JimpleParser.CMPLE, 0); }
		public TerminalNode SHL() { return getToken(JimpleParser.SHL, 0); }
		public TerminalNode SHR() { return getToken(JimpleParser.SHR, 0); }
		public TerminalNode USHR() { return getToken(JimpleParser.USHR, 0); }
		public TerminalNode PLUS() { return getToken(JimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JimpleParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(JimpleParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JimpleParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JimpleParser.MOD, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (CMP - 37)) | (1L << (CMPG - 37)) | (1L << (CMPL - 37)) | (1L << (AND - 37)) | (1L << (OR - 37)) | (1L << (XOR - 37)) | (1L << (MOD - 37)) | (1L << (CMPEQ - 37)) | (1L << (CMPNE - 37)) | (1L << (CMPGT - 37)) | (1L << (CMPGE - 37)) | (1L << (CMPLT - 37)) | (1L << (CMPLE - 37)) | (1L << (SHL - 37)) | (1L << (SHR - 37)) | (1L << (USHR - 37)) | (1L << (PLUS - 37)) | (1L << (MINUS - 37)) | (1L << (MULT - 37)) | (1L << (DIV - 37)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode LENGTHOF() { return getToken(JimpleParser.LENGTHOF, 0); }
		public TerminalNode NEG() { return getToken(JimpleParser.NEG, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JimpleListener ) ((JimpleListener)listener).exitUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JimpleVisitor ) return ((JimpleVisitor<? extends T>)visitor).visitUnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==LENGTHOF || _la==NEG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u01f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\5\3d\n\3\3\3\3\3\5\3h\n\3"+
		"\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4\7\4q\n\4\f\4\16\4t\13\4\3\4\3\4\3\4\5"+
		"\4y\n\4\3\4\5\4|\n\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\16\3"+
		"\16\3\16\7\16\u00b4\n\16\f\16\16\16\u00b7\13\16\3\17\3\17\5\17\u00bb\n"+
		"\17\3\20\7\20\u00be\n\20\f\20\16\20\u00c1\13\20\3\20\3\20\3\20\3\20\3"+
		"\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\3\21\3\21\5\21\u00cf\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25\3\26\7\26\u00e7\n\26\f"+
		"\26\16\26\u00ea\13\26\3\27\7\27\u00ed\n\27\f\27\16\27\u00f0\13\27\3\30"+
		"\7\30\u00f3\n\30\f\30\16\30\u00f6\13\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\5\32\u00ff\n\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0107\n\33\3"+
		"\33\3\33\3\33\3\33\5\33\u010d\n\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33"+
		"\u0115\n\33\r\33\16\33\u0116\3\33\3\33\3\33\3\33\5\33\u011d\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0127\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u012f\n\34\3\34\3\34\3\34\5\34\u0134\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u013d\n\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u0147\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0166"+
		"\n\"\3\"\6\"\u0169\n\"\r\"\16\"\u016a\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0179\n\"\3#\3#\5#\u017d\n#\3$\3$\3$\3$\3$\3$\5$"+
		"\u0185\n$\3$\3$\3$\3$\3$\3$\5$\u018d\n$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0197"+
		"\n$\3$\3$\3$\3$\5$\u019d\n$\3$\3$\3$\3$\5$\u01a3\n$\3$\3$\5$\u01a7\n$"+
		"\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01b4\n\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01c6\n)\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3,\3,\3,\7,\u01d6\n,\f,\16,\u01d9\13,\3-\3-\5-\u01dd\n-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01ea\n.\3/\3/\3\60\3\60\3\60\2\2\61\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^\2\b\3\2[\\\3\2bc\3\2\5\13\4\2\25\26!!\4\2\')N^\4\2\60\60\62"+
		"\62\2\u0210\2`\3\2\2\2\4c\3\2\2\2\6l\3\2\2\2\b\u0087\3\2\2\2\n\u008b\3"+
		"\2\2\2\f\u0090\3\2\2\2\16\u0099\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2"+
		"\2\2\24\u00a2\3\2\2\2\26\u00a5\3\2\2\2\30\u00a8\3\2\2\2\32\u00b0\3\2\2"+
		"\2\34\u00ba\3\2\2\2\36\u00bf\3\2\2\2 \u00c9\3\2\2\2\"\u00d5\3\2\2\2$\u00d7"+
		"\3\2\2\2&\u00df\3\2\2\2(\u00e1\3\2\2\2*\u00e8\3\2\2\2,\u00ee\3\2\2\2."+
		"\u00f4\3\2\2\2\60\u00f7\3\2\2\2\62\u00fe\3\2\2\2\64\u0126\3\2\2\2\66\u0133"+
		"\3\2\2\28\u013c\3\2\2\2:\u013e\3\2\2\2<\u0146\3\2\2\2>\u0148\3\2\2\2@"+
		"\u014b\3\2\2\2B\u0178\3\2\2\2D\u017c\3\2\2\2F\u01a6\3\2\2\2H\u01a8\3\2"+
		"\2\2J\u01ac\3\2\2\2L\u01af\3\2\2\2N\u01b7\3\2\2\2P\u01c5\3\2\2\2R\u01c7"+
		"\3\2\2\2T\u01ce\3\2\2\2V\u01d2\3\2\2\2X\u01dc\3\2\2\2Z\u01e9\3\2\2\2\\"+
		"\u01eb\3\2\2\2^\u01ed\3\2\2\2`a\7d\2\2a\3\3\2\2\2bd\t\2\2\2cb\3\2\2\2"+
		"cd\3\2\2\2de\3\2\2\2eg\t\3\2\2fh\7\3\2\2gf\3\2\2\2gh\3\2\2\2h\5\3\2\2"+
		"\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2\2nl\3\2\2"+
		"\2oq\5\f\7\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2"+
		"\2uv\5\22\n\2vx\7d\2\2wy\5\24\13\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\26"+
		"\f\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7C\2\2~\u0080\5\34\17\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7D\2\2\u0085\u0086\7\2"+
		"\2\3\u0086\7\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5\2\2\2\u0089\u008a"+
		"\7E\2\2\u008a\t\3\2\2\2\u008b\u008c\t\4\2\2\u008c\13\3\2\2\2\u008d\u0091"+
		"\5\n\6\2\u008e\u0091\7\f\2\2\u008f\u0091\7\r\2\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\r\3\2\2\2\u0092\u009a\5\n\6\2"+
		"\u0093\u009a\7\f\2\2\u0094\u009a\7\16\2\2\u0095\u009a\7\17\2\2\u0096\u009a"+
		"\7\20\2\2\u0097\u009a\7\21\2\2\u0098\u009a\7\22\2\2\u0099\u0092\3\2\2"+
		"\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\17\3\2\2\2\u009b"+
		"\u009f\5\n\6\2\u009c\u009f\7\23\2\2\u009d\u009f\7\24\2\2\u009e\u009b\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2\2\2\u00a0"+
		"\u00a1\t\5\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\5\2\2"+
		"\2\u00a4\25\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\5\32\16\2\u00a7\27"+
		"\3\2\2\2\u00a8\u00ad\5\2\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ac\7G\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5\30\r\2\u00b1\u00b2"+
		"\7B\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8\u00bb\5\36\20\2\u00b9\u00bb\5 \21\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00be\5\20\t\2\u00bd\u00bc\3\2\2"+
		"\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c4\5\2\2\2"+
		"\u00c4\u00c5\7E\2\2\u00c5\37\3\2\2\2\u00c6\u00c8\5\16\b\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5L\'\2\u00cd\u00cf\5$\23"+
		"\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\5&\24\2\u00d1!\3\2\2\2\u00d2\u00d6\7\27\2\2\u00d3\u00d6\7\30\2\2\u00d4"+
		"\u00d6\5\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6#\3\2\2\2\u00d7\u00d8\7<\2\2\u00d8\u00d9\5\32\16\2\u00d9%\3"+
		"\2\2\2\u00da\u00e0\7E\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\5(\25\2\u00dd"+
		"\u00de\7D\2\2\u00de\u00e0\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2"+
		"\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\5.\30\2\u00e2\u00e3\5,\27\2\u00e3\u00e4"+
		"\5*\26\2\u00e4)\3\2\2\2\u00e5\u00e7\5@!\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ed\5\62\32\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef-\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f3\5\60\31\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f7\u00f8\5\30\r\2\u00f8\u00f9\5V,\2\u00f9\u00fa\7E\2\2\u00fa"+
		"\61\3\2\2\2\u00fb\u00fc\5\2\2\2\u00fc\u00fd\7J\2\2\u00fd\u00ff\3\2\2\2"+
		"\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\5\64\33\2\u0101\u0102\7E\2\2\u0102\63\3\2\2\2\u0103\u0127\5\66\34\2\u0104"+
		"\u0105\7.\2\2\u0105\u0107\5D#\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0127\5> \2\u0109\u0127\5F$\2\u010a\u010c"+
		"\7\67\2\2\u010b\u010d\5X-\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0127\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\7H\2\2\u0110\u0111\5X"+
		"-\2\u0111\u0112\7I\2\2\u0112\u0114\7C\2\2\u0113\u0115\5:\36\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7D\2\2\u0119\u0127\3\2\2\2\u011a\u011c\78\2"+
		"\2\u011b\u011d\5X-\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0127"+
		"\3\2\2\2\u011e\u011f\7=\2\2\u011f\u0127\5X-\2\u0120\u0121\7+\2\2\u0121"+
		"\u0127\5X-\2\u0122\u0123\7,\2\2\u0123\u0127\5X-\2\u0124\u0127\7\66\2\2"+
		"\u0125\u0127\7$\2\2\u0126\u0103\3\2\2\2\u0126\u0106\3\2\2\2\u0126\u0109"+
		"\3\2\2\2\u0126\u010a\3\2\2\2\u0126\u010e\3\2\2\2\u0126\u011a\3\2\2\2\u0126"+
		"\u011e\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0125\3\2\2\2\u0127\65\3\2\2\2\u0128\u0129\5\2\2\2\u0129\u012a"+
		"\7M\2\2\u012a\u012b\58\35\2\u012b\u0134\3\2\2\2\u012c\u012f\5P)\2\u012d"+
		"\u012f\5\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\7L\2\2\u0131\u0132\5B\"\2\u0132\u0134\3\2\2\2\u0133\u0128"+
		"\3\2\2\2\u0133\u012e\3\2\2\2\u0134\67\3\2\2\2\u0135\u0136\7\31\2\2\u0136"+
		"\u0137\7b\2\2\u0137\u0138\7J\2\2\u0138\u013d\5\30\r\2\u0139\u013a\7\32"+
		"\2\2\u013a\u013d\5\30\r\2\u013b\u013d\7\33\2\2\u013c\u0135\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013b\3\2\2\2\u013d9\3\2\2\2\u013e\u013f\5<\37\2"+
		"\u013f\u0140\7J\2\2\u0140\u0141\5> \2\u0141\u0142\7E\2\2\u0142;\3\2\2"+
		"\2\u0143\u0144\7%\2\2\u0144\u0147\5\4\3\2\u0145\u0147\7*\2\2\u0146\u0143"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147=\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014a"+
		"\5\2\2\2\u014a?\3\2\2\2\u014b\u014c\7&\2\2\u014c\u014d\5\2\2\2\u014d\u014e"+
		"\7?\2\2\u014e\u014f\5\2\2\2\u014f\u0150\7@\2\2\u0150\u0151\5\2\2\2\u0151"+
		"\u0152\7A\2\2\u0152\u0153\5\2\2\2\u0153\u0154\7E\2\2\u0154A\3\2\2\2\u0155"+
		"\u0179\5X-\2\u0156\u0179\5P)\2\u0157\u0158\7\65\2\2\u0158\u0179\5\2\2"+
		"\2\u0159\u015a\7\63\2\2\u015a\u015b\7H\2\2\u015b\u015c\5\30\r\2\u015c"+
		"\u015d\7I\2\2\u015d\u015e\5T+\2\u015e\u0179\3\2\2\2\u015f\u0160\7\64\2"+
		"\2\u0160\u0161\7H\2\2\u0161\u0162\5\30\r\2\u0162\u0168\7I\2\2\u0163\u0165"+
		"\7F\2\2\u0164\u0166\5X-\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\7G\2\2\u0168\u0163\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0179\3\2\2\2\u016c"+
		"\u016d\7H\2\2\u016d\u016e\5\30\r\2\u016e\u016f\7I\2\2\u016f\u0170\5X-"+
		"\2\u0170\u0179\3\2\2\2\u0171\u0172\5X-\2\u0172\u0173\7/\2\2\u0173\u0174"+
		"\5\30\r\2\u0174\u0179\3\2\2\2\u0175\u0179\5H%\2\u0176\u0179\5F$\2\u0177"+
		"\u0179\5J&\2\u0178\u0155\3\2\2\2\u0178\u0156\3\2\2\2\u0178\u0157\3\2\2"+
		"\2\u0178\u0159\3\2\2\2\u0178\u015f\3\2\2\2\u0178\u016c\3\2\2\2\u0178\u0171"+
		"\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"C\3\2\2\2\u017a\u017d\5H%\2\u017b\u017d\5J&\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017dE\3\2\2\2\u017e\u017f\79\2\2\u017f\u0180\5\2\2\2\u0180"+
		"\u0181\7K\2\2\u0181\u0182\5N(\2\u0182\u0184\7H\2\2\u0183\u0185\5V,\2\u0184"+
		"\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7I"+
		"\2\2\u0187\u01a7\3\2\2\2\u0188\u0189\7:\2\2\u0189\u018a\5N(\2\u018a\u018c"+
		"\7H\2\2\u018b\u018d\5V,\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7I\2\2\u018f\u01a7\3\2\2\2\u0190\u0191\7;\2"+
		"\2\u0191\u0192\7 \2\2\u0192\u0193\7V\2\2\u0193\u0194\5\30\r\2\u0194\u0196"+
		"\7H\2\2\u0195\u0197\5\32\16\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2"+
		"\u0197\u0198\3\2\2\2\u0198\u0199\7I\2\2\u0199\u019a\7T\2\2\u019a\u019c"+
		"\7H\2\2\u019b\u019d\5V,\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7I\2\2\u019f\u01a0\5N(\2\u01a0\u01a2\7H\2\2"+
		"\u01a1\u01a3\5V,\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\7I\2\2\u01a5\u01a7\3\2\2\2\u01a6\u017e\3\2\2\2\u01a6"+
		"\u0188\3\2\2\2\u01a6\u0190\3\2\2\2\u01a7G\3\2\2\2\u01a8\u01a9\5X-\2\u01a9"+
		"\u01aa\5\\/\2\u01aa\u01ab\5X-\2\u01abI\3\2\2\2\u01ac\u01ad\5^\60\2\u01ad"+
		"\u01ae\5X-\2\u01aeK\3\2\2\2\u01af\u01b0\5\30\r\2\u01b0\u01b1\5\"\22\2"+
		"\u01b1\u01b3\7H\2\2\u01b2\u01b4\5\32\16\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7I\2\2\u01b6M\3\2\2\2\u01b7\u01b8"+
		"\7V\2\2\u01b8\u01b9\5\2\2\2\u01b9\u01ba\7J\2\2\u01ba\u01bb\5L\'\2\u01bb"+
		"\u01bc\7T\2\2\u01bcO\3\2\2\2\u01bd\u01be\5\2\2\2\u01be\u01bf\5T+\2\u01bf"+
		"\u01c6\3\2\2\2\u01c0\u01c1\5\2\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c3\5R*"+
		"\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\5R*\2\u01c5\u01bd\3\2\2\2\u01c5\u01c0"+
		"\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6Q\3\2\2\2\u01c7\u01c8\7V\2\2\u01c8\u01c9"+
		"\5\2\2\2\u01c9\u01ca\7J\2\2\u01ca\u01cb\5\30\r\2\u01cb\u01cc\5\2\2\2\u01cc"+
		"\u01cd\7T\2\2\u01cdS\3\2\2\2\u01ce\u01cf\7F\2\2\u01cf\u01d0\5X-\2\u01d0"+
		"\u01d1\7G\2\2\u01d1U\3\2\2\2\u01d2\u01d7\5X-\2\u01d3\u01d4\7B\2\2\u01d4"+
		"\u01d6\5X-\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8W\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd"+
		"\5\2\2\2\u01db\u01dd\5Z.\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"Y\3\2\2\2\u01de\u01ea\7`\2\2\u01df\u01ea\5\4\3\2\u01e0\u01ea\7a\2\2\u01e1"+
		"\u01ea\7 \2\2\u01e2\u01e3\7!\2\2\u01e3\u01ea\7 \2\2\u01e4\u01ea\7>\2\2"+
		"\u01e5\u01e6\7\34\2\2\u01e6\u01ea\5N(\2\u01e7\u01e8\7\35\2\2\u01e8\u01ea"+
		"\5L\'\2\u01e9\u01de\3\2\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e0\3\2\2\2\u01e9"+
		"\u01e1\3\2\2\2\u01e9\u01e2\3\2\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e5\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01ea[\3\2\2\2\u01eb\u01ec\t\6\2\2\u01ec]\3\2"+
		"\2\2\u01ed\u01ee\t\7\2\2\u01ee_\3\2\2\2\60cglrx{\u0081\u0090\u0099\u009e"+
		"\u00ad\u00b5\u00ba\u00bf\u00c9\u00ce\u00d5\u00df\u00e8\u00ee\u00f4\u00fe"+
		"\u0106\u010c\u0116\u011c\u0126\u012e\u0133\u013c\u0146\u0165\u016a\u0178"+
		"\u017c\u0184\u018c\u0196\u019c\u01a2\u01a6\u01b3\u01c5\u01d7\u01dc\u01e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}