// Generated from langageCours.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langageCoursParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, DIGIT=5, VARIABLE=6;
	public static final int
		RULE_boolean_type = 0, RULE_integer_number = 1, RULE_affectation = 2;
	public static final String[] ruleNames = {
		"boolean_type", "integer_number", "affectation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WS", "DIGIT", "VARIABLE"
	};
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
	public String getGrammarFileName() { return "langageCours.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langageCoursParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Boolean_typeContext extends ParserRuleContext {
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).enterBoolean_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).exitBoolean_type(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boolean_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Integer_numberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(langageCoursParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(langageCoursParser.DIGIT, i);
		}
		public Integer_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).enterInteger_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).exitInteger_number(this);
		}
	}

	public final Integer_numberContext integer_number() throws RecognitionException {
		Integer_numberContext _localctx = new Integer_numberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				match(DIGIT);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class AffectationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(langageCoursParser.VARIABLE, 0); }
		public Integer_numberContext integer_number() {
			return getRuleContext(Integer_numberContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langageCoursListener ) ((langageCoursListener)listener).exitAffectation(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_affectation);
		try {
			setState(17);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(VARIABLE);
				setState(14);
				match(T__2);
				setState(15);
				integer_number();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				boolean_type();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\26\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\6\3\f\n\3\r\3\16\3\r\3\4\3\4\3\4\3\4\5\4\24\n"+
		"\4\3\4\2\2\5\2\4\6\2\3\3\2\3\4\24\2\b\3\2\2\2\4\13\3\2\2\2\6\23\3\2\2"+
		"\2\b\t\t\2\2\2\t\3\3\2\2\2\n\f\7\7\2\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3"+
		"\2\2\2\r\16\3\2\2\2\16\5\3\2\2\2\17\20\7\b\2\2\20\21\7\5\2\2\21\24\5\4"+
		"\3\2\22\24\5\2\2\2\23\17\3\2\2\2\23\22\3\2\2\2\24\7\3\2\2\2\4\r\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}