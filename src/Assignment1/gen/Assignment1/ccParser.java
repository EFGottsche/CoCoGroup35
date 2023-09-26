// Generated from C:/Users/esben/Desktop/Skoleting/Sem 5/CoCo/CoCoGroup35/src/Assignment1\cc.g4 by ANTLR 4.10.1
package Assignment1.gen.Assignment1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, INT=15, FLOAT=16, 
		EQUALS=17, WHITESPACE=18, COMMENT=19, LONGCOMMENT=20;
	public static final int
		RULE_start = 0, RULE_hardware = 1, RULE_input = 2, RULE_output = 3, RULE_latch = 4, 
		RULE_latches = 5, RULE_update = 6, RULE_updates = 7, RULE_simulate = 8, 
		RULE_simulations = 9, RULE_exp = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hardware", "input", "output", "latch", "latches", "update", 
			"updates", "simulate", "simulations", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'->'", 
			"'.update'", "'='", "'.simulate'", "'!'", "'&&'", "'||'", "'('", "')'", 
			null, null, null, "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "INT", "FLOAT", "EQUALS", "WHITESPACE", "COMMENT", 
			"LONGCOMMENT"
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(ccParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ccParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ccParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ccParser.FLOAT, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ccParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ccParser.WHITESPACE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ccParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ccParser.COMMENT, i);
		}
		public List<TerminalNode> LONGCOMMENT() { return getTokens(ccParser.LONGCOMMENT); }
		public TerminalNode LONGCOMMENT(int i) {
			return getToken(ccParser.LONGCOMMENT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ccParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ccParser.EQUALS, i);
		}
		public List<UpdateContext> update() {
			return getRuleContexts(UpdateContext.class);
		}
		public UpdateContext update(int i) {
			return getRuleContext(UpdateContext.class,i);
		}
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public List<SimulateContext> simulate() {
			return getRuleContexts(SimulateContext.class);
		}
		public SimulateContext simulate(int i) {
			return getRuleContext(SimulateContext.class,i);
		}
		public List<HardwareContext> hardware() {
			return getRuleContexts(HardwareContext.class);
		}
		public HardwareContext hardware(int i) {
			return getRuleContext(HardwareContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER) | (1L << INT) | (1L << FLOAT) | (1L << EQUALS) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << LONGCOMMENT))) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(22);
					match(IDENTIFIER);
					}
					break;
				case INT:
					{
					setState(23);
					match(INT);
					}
					break;
				case FLOAT:
					{
					setState(24);
					match(FLOAT);
					}
					break;
				case WHITESPACE:
					{
					setState(25);
					match(WHITESPACE);
					}
					break;
				case COMMENT:
					{
					setState(26);
					match(COMMENT);
					}
					break;
				case LONGCOMMENT:
					{
					setState(27);
					match(LONGCOMMENT);
					}
					break;
				case EQUALS:
					{
					setState(28);
					match(EQUALS);
					}
					break;
				case T__5:
					{
					setState(29);
					update();
					}
					break;
				case T__3:
					{
					setState(30);
					latch();
					}
					break;
				case T__7:
					{
					setState(31);
					simulate();
					}
					break;
				case T__0:
					{
					setState(32);
					hardware();
					}
					break;
				case T__1:
					{
					setState(33);
					input();
					}
					break;
				case T__2:
					{
					setState(34);
					output();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class HardwareContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitHardware(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hardware);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(44); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(43);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(50); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(49);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(52); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OutputContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LatchContext extends ParserRuleContext {
		public List<LatchesContext> latches() {
			return getRuleContexts(LatchesContext.class);
		}
		public LatchesContext latches(int i) {
			return getRuleContext(LatchesContext.class,i);
		}
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__3);
			setState(62); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					latches();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LatchesContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_latches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			exp(0);
			setState(67);
			match(T__4);
			setState(68);
			exp(0);
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

	public static class UpdateContext extends ParserRuleContext {
		public List<UpdatesContext> updates() {
			return getRuleContexts(UpdatesContext.class);
		}
		public UpdatesContext updates(int i) {
			return getRuleContext(UpdatesContext.class,i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					updates();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UpdatesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__6);
			setState(78);
			exp(0);
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

	public static class SimulateContext extends ParserRuleContext {
		public List<SimulationsContext> simulations() {
			return getRuleContexts(SimulationsContext.class);
		}
		public SimulationsContext simulations(int i) {
			return getRuleContext(SimulationsContext.class,i);
		}
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simulate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__7);
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
					simulations();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SimulationsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode INT() { return getToken(ccParser.INT, 0); }
		public SimulationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSimulations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSimulations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSimulations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulationsContext simulations() throws RecognitionException {
		SimulationsContext _localctx = new SimulationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simulations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			exp(0);
			setState(87);
			match(T__6);
			setState(88);
			match(INT);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExpContext {
		public Token op;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParathesisContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParathesisContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterParathesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitParathesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitParathesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExpContext {
		public Token i;
		public TerminalNode INT() { return getToken(ccParser.INT, 0); }
		public ConstantContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOrContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BoolOrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BoolAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocateContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AllocateContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAllocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAllocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAllocate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				((VariableContext)_localctx).x = match(IDENTIFIER);
				}
				break;
			case INT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				((ConstantContext)_localctx).i = match(INT);
				}
				break;
			case T__8:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				((NotContext)_localctx).op = match(T__8);
				setState(94);
				((NotContext)_localctx).e = exp(5);
				}
				break;
			case T__11:
				{
				_localctx = new ParathesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__11);
				setState(96);
				((ParathesisContext)_localctx).e = exp(0);
				setState(97);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BoolAndContext(new ExpContext(_parentctx, _parentState));
						((BoolAndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((BoolAndContext)_localctx).op = match(T__9);
						setState(103);
						((BoolAndContext)_localctx).e2 = exp(5);
						}
						break;
					case 2:
						{
						_localctx = new BoolOrContext(new ExpContext(_parentctx, _parentState));
						((BoolOrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						((BoolOrContext)_localctx).op = match(T__10);
						setState(106);
						((BoolOrContext)_localctx).e2 = exp(4);
						}
						break;
					case 3:
						{
						_localctx = new AllocateContext(new ExpContext(_parentctx, _parentState));
						((AllocateContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						((AllocateContext)_localctx).op = match(T__4);
						setState(109);
						((AllocateContext)_localctx).e2 = exp(3);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b"+
		"\u0000\n\u0000\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0002\u0001\u0002"+
		"\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0003\u0001\u0003\u0004"+
		"\u00039\b\u0003\u000b\u0003\f\u0003:\u0001\u0004\u0001\u0004\u0004\u0004"+
		"?\b\u0004\u000b\u0004\f\u0004@\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0004\u0006I\b\u0006\u000b\u0006\f\u0006"+
		"J\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004"+
		"\bS\b\b\u000b\b\f\bT\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nd\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\no\b\n\n\n\f\nr\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u0081\u0000%\u0001\u0000"+
		"\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000"+
		"\u00066\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nB\u0001\u0000"+
		"\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000"+
		"\u0010P\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014c"+
		"\u0001\u0000\u0000\u0000\u0016$\u0005\u000e\u0000\u0000\u0017$\u0005\u000f"+
		"\u0000\u0000\u0018$\u0005\u0010\u0000\u0000\u0019$\u0005\u0012\u0000\u0000"+
		"\u001a$\u0005\u0013\u0000\u0000\u001b$\u0005\u0014\u0000\u0000\u001c$"+
		"\u0005\u0011\u0000\u0000\u001d$\u0003\f\u0006\u0000\u001e$\u0003\b\u0004"+
		"\u0000\u001f$\u0003\u0010\b\u0000 $\u0003\u0002\u0001\u0000!$\u0003\u0004"+
		"\u0002\u0000\"$\u0003\u0006\u0003\u0000#\u0016\u0001\u0000\u0000\u0000"+
		"#\u0017\u0001\u0000\u0000\u0000#\u0018\u0001\u0000\u0000\u0000#\u0019"+
		"\u0001\u0000\u0000\u0000#\u001a\u0001\u0000\u0000\u0000#\u001b\u0001\u0000"+
		"\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000\u0000"+
		"#\u001e\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000"+
		"$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000"+
		"\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*,\u0005\u0001\u0000\u0000"+
		"+-\u0005\u000e\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001"+
		"\u0000\u0000\u000002\u0005\u0002\u0000\u000013\u0005\u000e\u0000\u0000"+
		"21\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000068\u0005"+
		"\u0003\u0000\u000079\u0005\u000e\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;\u0007\u0001\u0000\u0000\u0000<>\u0005\u0004\u0000\u0000=?\u0003"+
		"\n\u0005\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000"+
		"BC\u0003\u0014\n\u0000CD\u0005\u0005\u0000\u0000DE\u0003\u0014\n\u0000"+
		"E\u000b\u0001\u0000\u0000\u0000FH\u0005\u0006\u0000\u0000GI\u0003\u000e"+
		"\u0007\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000"+
		"LM\u0005\u000e\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0003\u0014\n\u0000"+
		"O\u000f\u0001\u0000\u0000\u0000PR\u0005\b\u0000\u0000QS\u0003\u0012\t"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0011\u0001\u0000\u0000\u0000"+
		"VW\u0003\u0014\n\u0000WX\u0005\u0007\u0000\u0000XY\u0005\u000f\u0000\u0000"+
		"Y\u0013\u0001\u0000\u0000\u0000Z[\u0006\n\uffff\uffff\u0000[d\u0005\u000e"+
		"\u0000\u0000\\d\u0005\u000f\u0000\u0000]^\u0005\t\u0000\u0000^d\u0003"+
		"\u0014\n\u0005_`\u0005\f\u0000\u0000`a\u0003\u0014\n\u0000ab\u0005\r\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c\\\u0001\u0000"+
		"\u0000\u0000c]\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000dp\u0001"+
		"\u0000\u0000\u0000ef\n\u0004\u0000\u0000fg\u0005\n\u0000\u0000go\u0003"+
		"\u0014\n\u0005hi\n\u0003\u0000\u0000ij\u0005\u000b\u0000\u0000jo\u0003"+
		"\u0014\n\u0004kl\n\u0002\u0000\u0000lm\u0005\u0005\u0000\u0000mo\u0003"+
		"\u0014\n\u0003ne\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000nk\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u0015\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000\u000b#%.4:@JTcnp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}