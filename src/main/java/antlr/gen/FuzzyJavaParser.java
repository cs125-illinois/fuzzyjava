// Generated from /Users/arjunvnair/IdeaProjects/fuzzyjava/src/main/antlr/edu/illinois/cs/cs125/fuzzyjava/antlr/fuzzyjava/FuzzyJavaParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuzzyJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUZZY_LITERAL=1, FUZZY_COMPARISON=2, FUZZY_IDENTIFIER=3, ABSTRACT=4, ASSERT=5, 
		BOOLEAN=6, BREAK=7, BYTE=8, CASE=9, CATCH=10, CHAR=11, CLASS=12, CONST=13, 
		CONTINUE=14, DEFAULT=15, DO=16, DOUBLE=17, ELSE=18, ENUM=19, EXTENDS=20, 
		FINAL=21, FINALLY=22, FLOAT=23, FOR=24, IF=25, GOTO=26, IMPLEMENTS=27, 
		IMPORT=28, INSTANCEOF=29, INT=30, INTERFACE=31, LONG=32, NATIVE=33, NEW=34, 
		PACKAGE=35, PRIVATE=36, PROTECTED=37, PUBLIC=38, RETURN=39, SHORT=40, 
		STATIC=41, STRICTFP=42, SUPER=43, SWITCH=44, SYNCHRONIZED=45, THIS=46, 
		THROW=47, THROWS=48, TRANSIENT=49, TRY=50, VOID=51, VOLATILE=52, WHILE=53, 
		DECIMAL_LITERAL=54, HEX_LITERAL=55, OCT_LITERAL=56, BINARY_LITERAL=57, 
		FLOAT_LITERAL=58, HEX_FLOAT_LITERAL=59, BOOL_LITERAL=60, CHAR_LITERAL=61, 
		STRING_LITERAL=62, NULL_LITERAL=63, LPAREN=64, RPAREN=65, LBRACE=66, RBRACE=67, 
		LBRACK=68, RBRACK=69, SEMI=70, COMMA=71, DOT=72, ASSIGN=73, GT=74, LT=75, 
		BANG=76, TILDE=77, QUESTION=78, COLON=79, EQUAL=80, LE=81, GE=82, NOTEQUAL=83, 
		AND=84, OR=85, INC=86, DEC=87, ADD=88, SUB=89, MUL=90, DIV=91, BITAND=92, 
		BITOR=93, CARET=94, MOD=95, ADD_ASSIGN=96, SUB_ASSIGN=97, MUL_ASSIGN=98, 
		DIV_ASSIGN=99, AND_ASSIGN=100, OR_ASSIGN=101, XOR_ASSIGN=102, MOD_ASSIGN=103, 
		LSHIFT_ASSIGN=104, RSHIFT_ASSIGN=105, URSHIFT_ASSIGN=106, ARROW=107, COLONCOLON=108, 
		AT=109, ELLIPSIS=110, WS=111, COMMENT=112, LINE_COMMENT=113, IDENTIFIER=114;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_classOrInterfaceType = 39, 
		RULE_typeArgument = 40, RULE_qualifiedNameList = 41, RULE_formalParameters = 42, 
		RULE_formalParameterList = 43, RULE_formalParameter = 44, RULE_lastFormalParameter = 45, 
		RULE_qualifiedName = 46, RULE_literal = 47, RULE_integerLiteral = 48, 
		RULE_floatLiteral = 49, RULE_fuzzyLiteral = 50, RULE_annotation = 51, 
		RULE_elementValuePairs = 52, RULE_elementValuePair = 53, RULE_elementValue = 54, 
		RULE_elementValueArrayInitializer = 55, RULE_annotationTypeDeclaration = 56, 
		RULE_annotationTypeBody = 57, RULE_annotationTypeElementDeclaration = 58, 
		RULE_annotationTypeElementRest = 59, RULE_annotationMethodOrConstantRest = 60, 
		RULE_annotationMethodRest = 61, RULE_annotationConstantRest = 62, RULE_defaultValue = 63, 
		RULE_block = 64, RULE_blockStatement = 65, RULE_localVariableDeclaration = 66, 
		RULE_localTypeDeclaration = 67, RULE_statement = 68, RULE_catchClause = 69, 
		RULE_catchType = 70, RULE_finallyBlock = 71, RULE_resourceSpecification = 72, 
		RULE_resources = 73, RULE_resource = 74, RULE_switchBlockStatementGroup = 75, 
		RULE_switchLabel = 76, RULE_forControl = 77, RULE_forInit = 78, RULE_enhancedForControl = 79, 
		RULE_parExpression = 80, RULE_expressionList = 81, RULE_methodCall = 82, 
		RULE_fuzzyComparison = 83, RULE_expression = 84, RULE_lambdaExpression = 85, 
		RULE_lambdaParameters = 86, RULE_lambdaBody = 87, RULE_primary = 88, RULE_classType = 89, 
		RULE_creator = 90, RULE_createdName = 91, RULE_innerCreator = 92, RULE_arrayCreatorRest = 93, 
		RULE_classCreatorRest = 94, RULE_explicitGenericInvocation = 95, RULE_typeArgumentsOrDiamond = 96, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 97, RULE_nonWildcardTypeArguments = 98, 
		RULE_typeList = 99, RULE_typeType = 100, RULE_primitiveType = 101, RULE_typeArguments = 102, 
		RULE_superSuffix = 103, RULE_explicitGenericInvocationSuffix = 104, RULE_arguments = 105, 
		RULE_identifier = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "fuzzyLiteral", "annotation", "elementValuePairs", "elementValuePair", 
			"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "fuzzyComparison", "expression", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "classType", "creator", 
			"createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
			"explicitGenericInvocation", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"nonWildcardTypeArguments", "typeList", "typeType", "primitiveType", 
			"typeArguments", "superSuffix", "explicitGenericInvocationSuffix", "arguments", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'abstract'", "'assert'", "'boolean'", "'break'", 
			"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
			"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
			"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
			"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", null, null, null, null, null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUZZY_LITERAL", "FUZZY_COMPARISON", "FUZZY_IDENTIFIER", "ABSTRACT", 
			"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
			"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
			"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", 
			"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
			"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
			"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
			"TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "FuzzyJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FuzzyJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FuzzyJavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(214);
				packageDeclaration();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(217);
				importDeclaration();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(223);
				typeDeclaration();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(FuzzyJavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(231);
				annotation();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(PACKAGE);
			setState(238);
			qualifiedName();
			setState(239);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FuzzyJavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(FuzzyJavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(FuzzyJavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(FuzzyJavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IMPORT);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(242);
				match(STATIC);
				}
			}

			setState(245);
			qualifiedName();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(246);
				match(DOT);
				setState(247);
				match(MUL);
				}
			}

			setState(250);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(258);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(259);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(260);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(261);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(FuzzyJavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(FuzzyJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(FuzzyJavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(FuzzyJavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(FuzzyJavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(FuzzyJavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(FuzzyJavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(FuzzyJavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(FuzzyJavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(FuzzyJavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(FuzzyJavaParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				match(STRICTFP);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(FuzzyJavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FuzzyJavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(FuzzyJavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(FuzzyJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(CLASS);
			setState(289);
			identifier();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(290);
				typeParameters();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(293);
				match(EXTENDS);
				setState(294);
				typeType();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(297);
				match(IMPLEMENTS);
				setState(298);
				typeList();
				}
			}

			setState(301);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FuzzyJavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(FuzzyJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LT);
			setState(304);
			typeParameter();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				typeParameter();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(FuzzyJavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(314);
				annotation();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(IDENTIFIER);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(321);
				match(EXTENDS);
				setState(322);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(FuzzyJavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(FuzzyJavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			typeType();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(326);
				match(BITAND);
				setState(327);
				typeType();
				}
				}
				setState(332);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(FuzzyJavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(FuzzyJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FuzzyJavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ENUM);
			setState(334);
			identifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(335);
				match(IMPLEMENTS);
				setState(336);
				typeList();
				}
			}

			setState(339);
			match(LBRACE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUZZY_IDENTIFIER || _la==AT || _la==IDENTIFIER) {
				{
				setState(340);
				enumConstants();
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(343);
				match(COMMA);
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(346);
				enumBodyDeclarations();
				}
			}

			setState(349);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			enumConstant();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					match(COMMA);
					setState(353);
					enumConstant();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(359);
				annotation();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			identifier();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(366);
				arguments();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(369);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(SEMI);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(373);
				classBodyDeclaration();
				}
				}
				setState(378);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(FuzzyJavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(FuzzyJavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(INTERFACE);
			setState(380);
			identifier();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(381);
				typeParameters();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(384);
				match(EXTENDS);
				setState(385);
				typeList();
				}
			}

			setState(388);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LBRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(391);
				classBodyDeclaration();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(400);
				interfaceBodyDeclaration();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(FuzzyJavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(409);
					match(STATIC);
					}
				}

				setState(412);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(413);
						modifier();
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(419);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(430);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(FuzzyJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			typeTypeOrVoid();
			setState(434);
			identifier();
			setState(435);
			formalParameters();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(436);
				match(LBRACK);
				setState(437);
				match(RBRACK);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(443);
				match(THROWS);
				setState(444);
				qualifiedNameList();
				}
			}

			setState(447);
			methodBody();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FuzzyJavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			typeParameters();
			setState(458);
			methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			typeParameters();
			setState(461);
			constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(FuzzyJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			identifier();
			setState(464);
			formalParameters();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(465);
				match(THROWS);
				setState(466);
				qualifiedNameList();
				}
			}

			setState(469);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			typeType();
			setState(472);
			variableDeclarators();
			setState(473);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(475);
						modifier();
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(481);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(491);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			typeType();
			setState(495);
			constantDeclarator();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(496);
				match(COMMA);
				setState(497);
				constantDeclarator();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(IDENTIFIER);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(506);
				match(LBRACK);
				setState(507);
				match(RBRACK);
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(ASSIGN);
			setState(514);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(FuzzyJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					interfaceMethodModifier();
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(522);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(523);
				typeParameters();
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						annotation();
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(530);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(534);
			match(IDENTIFIER);
			setState(535);
			formalParameters();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(536);
				match(LBRACK);
				setState(537);
				match(RBRACK);
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(543);
				match(THROWS);
				setState(544);
				qualifiedNameList();
				}
			}

			setState(547);
			methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(FuzzyJavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(FuzzyJavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(FuzzyJavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(FuzzyJavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(FuzzyJavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			typeParameters();
			setState(558);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			variableDeclarator();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				variableDeclarator();
				}
				}
				setState(567);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			variableDeclaratorId();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(569);
				match(ASSIGN);
				setState(570);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			identifier();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(574);
				match(LBRACK);
				setState(575);
				match(RBRACK);
				}
				}
				setState(580);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				arrayInitializer();
				}
				break;
			case FUZZY_LITERAL:
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LBRACE);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(586);
				variableInitializer();
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						match(COMMA);
						setState(588);
						variableInitializer();
						}
						} 
					}
					setState(593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(594);
					match(COMMA);
					}
				}

				}
			}

			setState(599);
			match(RBRACE);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FuzzyJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FuzzyJavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			identifier();
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(602);
				typeArguments();
				}
				break;
			}
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(DOT);
					setState(606);
					identifier();
					setState(608);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(607);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(FuzzyJavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(FuzzyJavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(FuzzyJavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(QUESTION);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(617);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(618);
					typeType();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			qualifiedName();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(624);
				match(COMMA);
				setState(625);
				qualifiedName();
				}
				}
				setState(630);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAREN);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(632);
				formalParameterList();
				}
			}

			setState(635);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				formalParameter();
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(638);
						match(COMMA);
						setState(639);
						formalParameter();
						}
						} 
					}
					setState(644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(645);
					match(COMMA);
					setState(646);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					variableModifier();
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(658);
			typeType();
			setState(659);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(FuzzyJavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					variableModifier();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(667);
			typeType();
			setState(668);
			match(ELLIPSIS);
			setState(669);
			variableDeclaratorId();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FuzzyJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FuzzyJavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FuzzyJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FuzzyJavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(IDENTIFIER);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					match(DOT);
					setState(673);
					match(IDENTIFIER);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public FuzzyLiteralContext fuzzyLiteral() {
			return getRuleContext(FuzzyLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(FuzzyJavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FuzzyJavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(FuzzyJavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(FuzzyJavaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				floatLiteral();
				}
				break;
			case FUZZY_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				fuzzyLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(683);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(685);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(FuzzyJavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(FuzzyJavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(FuzzyJavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(FuzzyJavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(FuzzyJavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(FuzzyJavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class FuzzyLiteralContext extends ParserRuleContext {
		public TerminalNode FUZZY_LITERAL() { return getToken(FuzzyJavaParser.FUZZY_LITERAL, 0); }
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public FuzzyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuzzyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFuzzyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFuzzyLiteral(this);
		}
	}

	public final FuzzyLiteralContext fuzzyLiteral() throws RecognitionException {
		FuzzyLiteralContext _localctx = new FuzzyLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fuzzyLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(FUZZY_LITERAL);
			setState(693);
			match(ASSIGN);
			setState(694);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(FuzzyJavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(AT);
			setState(697);
			qualifiedName();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(698);
				match(LPAREN);
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(699);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(700);
					elementValue();
					}
					break;
				}
				setState(703);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			elementValuePair();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707);
				match(COMMA);
				setState(708);
				elementValuePair();
				}
				}
				setState(713);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(IDENTIFIER);
			setState(715);
			match(ASSIGN);
			setState(716);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValue);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(LBRACE);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(724);
				elementValue();
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(725);
						match(COMMA);
						setState(726);
						elementValue();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
			}

			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(734);
				match(COMMA);
				}
			}

			setState(737);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(FuzzyJavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(FuzzyJavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(AT);
			setState(740);
			match(INTERFACE);
			setState(741);
			match(IDENTIFIER);
			setState(742);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(LBRACE);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (SEMI - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(745);
				annotationTypeElementDeclaration();
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(753);
						modifier();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(759);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeElementRest);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				typeType();
				setState(764);
				annotationMethodOrConstantRest();
				setState(765);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				classDeclaration();
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(768);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				interfaceDeclaration();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(772);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				enumDeclaration();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(776);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				annotationTypeDeclaration();
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(780);
					match(SEMI);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationMethodOrConstantRest);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(IDENTIFIER);
			setState(790);
			match(LPAREN);
			setState(791);
			match(RPAREN);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(792);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(FuzzyJavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(DEFAULT);
			setState(798);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(LBRACE);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(801);
				blockStatement();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatement);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				localVariableDeclaration();
				setState(810);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					variableModifier();
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(822);
			typeType();
			setState(823);
			variableDeclarators();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(825);
					classOrInterfaceModifier();
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(833);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(831);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(832);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(FuzzyJavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(FuzzyJavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(FuzzyJavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FuzzyJavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(FuzzyJavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(FuzzyJavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(FuzzyJavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(FuzzyJavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(FuzzyJavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(FuzzyJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FuzzyJavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(FuzzyJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(FuzzyJavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(FuzzyJavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(FuzzyJavaParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(FuzzyJavaParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(ASSERT);
				setState(840);
				expression(0);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(841);
					match(COLON);
					setState(842);
					expression(0);
					}
				}

				setState(845);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(IF);
				setState(848);
				parExpression();
				setState(849);
				statement();
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(850);
					match(ELSE);
					setState(851);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(FOR);
				setState(855);
				match(LPAREN);
				setState(856);
				forControl();
				setState(857);
				match(RPAREN);
				setState(858);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				match(WHILE);
				setState(861);
				parExpression();
				setState(862);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				match(DO);
				setState(865);
				statement();
				setState(866);
				match(WHILE);
				setState(867);
				parExpression();
				setState(868);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870);
				match(TRY);
				setState(871);
				block();
				setState(881);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(873); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(872);
						catchClause();
						}
						}
						setState(875); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(877);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(880);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				match(TRY);
				setState(884);
				resourceSpecification();
				setState(885);
				block();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(886);
					catchClause();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(892);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(895);
				match(SWITCH);
				setState(896);
				parExpression();
				setState(897);
				match(LBRACE);
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(904);
					switchLabel();
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(912);
				match(SYNCHRONIZED);
				setState(913);
				parExpression();
				setState(914);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(916);
				match(RETURN);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(917);
					expression(0);
					}
				}

				setState(920);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(921);
				match(THROW);
				setState(922);
				expression(0);
				setState(923);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(925);
				match(BREAK);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(926);
					match(IDENTIFIER);
					}
				}

				setState(929);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(930);
				match(CONTINUE);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(931);
					match(IDENTIFIER);
					}
				}

				setState(934);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(935);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(936);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(937);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(939);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(940);
				match(COLON);
				setState(941);
				statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(FuzzyJavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(CATCH);
			setState(945);
			match(LPAREN);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(946);
				variableModifier();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			catchType();
			setState(953);
			match(IDENTIFIER);
			setState(954);
			match(RPAREN);
			setState(955);
			block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(FuzzyJavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(FuzzyJavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			qualifiedName();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(958);
				match(BITOR);
				setState(959);
				qualifiedName();
				}
				}
				setState(964);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(FuzzyJavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(FINALLY);
			setState(966);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FuzzyJavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(LPAREN);
			setState(969);
			resources();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(970);
				match(SEMI);
				}
			}

			setState(973);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(FuzzyJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FuzzyJavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			resource();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(976);
					match(SEMI);
					setState(977);
					resource();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(983);
				variableModifier();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			classOrInterfaceType();
			setState(990);
			variableDeclaratorId();
			setState(991);
			match(ASSIGN);
			setState(992);
			expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(994);
				switchLabel();
				}
				}
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1000); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(999);
				blockStatement();
				}
				}
				setState(1002); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(FuzzyJavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(FuzzyJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(FuzzyJavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchLabel);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(CASE);
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1005);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1006);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1009);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				match(DEFAULT);
				setState(1011);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(FuzzyJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FuzzyJavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forControl);
		int _la;
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1015);
					forInit();
					}
				}

				setState(1018);
				match(SEMI);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1019);
					expression(0);
					}
				}

				setState(1022);
				match(SEMI);
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1023);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forInit);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FuzzyJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1032);
					variableModifier();
					}
					} 
				}
				setState(1037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1038);
			typeType();
			setState(1039);
			variableDeclaratorId();
			setState(1040);
			match(COLON);
			setState(1041);
			expression(0);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(LPAREN);
			setState(1044);
			expression(0);
			setState(1045);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			expression(0);
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1048);
				match(COMMA);
				setState(1049);
				expression(0);
				}
				}
				setState(1054);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(FuzzyJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(FuzzyJavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_methodCall);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				identifier();
				setState(1056);
				match(LPAREN);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1057);
					expressionList();
					}
				}

				setState(1060);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				match(THIS);
				setState(1063);
				match(LPAREN);
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1064);
					expressionList();
					}
				}

				setState(1067);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1068);
				match(SUPER);
				setState(1069);
				match(LPAREN);
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1070);
					expressionList();
					}
				}

				setState(1073);
				match(RPAREN);
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

	public static class FuzzyComparisonContext extends ParserRuleContext {
		public TerminalNode FUZZY_COMPARISON() { return getToken(FuzzyJavaParser.FUZZY_COMPARISON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(FuzzyJavaParser.QUESTION, 0); }
		public FuzzyComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuzzyComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterFuzzyComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitFuzzyComparison(this);
		}
	}

	public final FuzzyComparisonContext fuzzyComparison() throws RecognitionException {
		FuzzyComparisonContext _localctx = new FuzzyComparisonContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_fuzzyComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(FUZZY_COMPARISON);
			setState(1077);
			match(IDENTIFIER);
			setState(1078);
			match(QUESTION);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(FuzzyJavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(FuzzyJavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(FuzzyJavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(FuzzyJavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FuzzyJavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(FuzzyJavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(FuzzyJavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(FuzzyJavaParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public FuzzyComparisonContext fuzzyComparison() {
			return getRuleContext(FuzzyComparisonContext.class,0);
		}
		public TerminalNode MUL() { return getToken(FuzzyJavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FuzzyJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FuzzyJavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(FuzzyJavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(FuzzyJavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(FuzzyJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(FuzzyJavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(FuzzyJavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(FuzzyJavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(FuzzyJavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(FuzzyJavaParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(FuzzyJavaParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(FuzzyJavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(FuzzyJavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(FuzzyJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(FuzzyJavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(FuzzyJavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(FuzzyJavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(FuzzyJavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FuzzyJavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(FuzzyJavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(FuzzyJavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FuzzyJavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(FuzzyJavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(FuzzyJavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(FuzzyJavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(FuzzyJavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(FuzzyJavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(FuzzyJavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FuzzyJavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(FuzzyJavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THIS() { return getToken(FuzzyJavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(FuzzyJavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(FuzzyJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FuzzyJavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(FuzzyJavaParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1081);
				primary();
				}
				break;
			case 2:
				{
				setState(1082);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1083);
				match(NEW);
				setState(1084);
				creator();
				}
				break;
			case 4:
				{
				setState(1085);
				match(LPAREN);
				setState(1086);
				typeType();
				setState(1087);
				match(RPAREN);
				setState(1088);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1090);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (INC - 86)) | (1L << (DEC - 86)) | (1L << (ADD - 86)) | (1L << (SUB - 86)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1091);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1092);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1093);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1094);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1095);
				typeType();
				setState(1096);
				match(COLONCOLON);
				setState(1102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1097);
						typeArguments();
						}
					}

					setState(1100);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1101);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1104);
				classType();
				setState(1105);
				match(COLONCOLON);
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1106);
					typeArguments();
					}
				}

				setState(1109);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1114);
						fuzzyComparison();
						setState(1115);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1118);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1119);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1121);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1122);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1123);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1131);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(1124);
							match(LT);
							setState(1125);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1126);
							match(GT);
							setState(1127);
							match(GT);
							setState(1128);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1129);
							match(GT);
							setState(1130);
							match(GT);
							}
							break;
						}
						setState(1133);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1135);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (GT - 74)) | (1L << (LT - 74)) | (1L << (LE - 74)) | (1L << (GE - 74)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1136);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1138);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1139);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1141);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1142);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1144);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1145);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1147);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1148);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1150);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1151);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1153);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1154);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1156);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1157);
						expression(0);
						setState(1158);
						match(COLON);
						setState(1159);
						expression(7);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1162);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (ASSIGN - 73)) | (1L << (ADD_ASSIGN - 73)) | (1L << (SUB_ASSIGN - 73)) | (1L << (MUL_ASSIGN - 73)) | (1L << (DIV_ASSIGN - 73)) | (1L << (AND_ASSIGN - 73)) | (1L << (OR_ASSIGN - 73)) | (1L << (XOR_ASSIGN - 73)) | (1L << (MOD_ASSIGN - 73)) | (1L << (LSHIFT_ASSIGN - 73)) | (1L << (RSHIFT_ASSIGN - 73)) | (1L << (URSHIFT_ASSIGN - 73)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1163);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1165);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1177);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1166);
							identifier();
							}
							break;
						case 2:
							{
							setState(1167);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1168);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1169);
							match(NEW);
							setState(1171);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1170);
								nonWildcardTypeArguments();
								}
							}

							setState(1173);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1174);
							match(SUPER);
							setState(1175);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1176);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1180);
						match(LBRACK);
						setState(1181);
						expression(0);
						setState(1182);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1185);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1187);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1188);
						typeType();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1190);
						match(COLONCOLON);
						setState(1192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1191);
							typeArguments();
							}
						}

						setState(1194);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(FuzzyJavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			lambdaParameters();
			setState(1201);
			match(ARROW);
			setState(1202);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FuzzyJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FuzzyJavaParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lambdaParameters);
		int _la;
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				match(LPAREN);
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1206);
					formalParameterList();
					}
				}

				setState(1209);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				match(LPAREN);
				setState(1211);
				match(IDENTIFIER);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1212);
					match(COMMA);
					setState(1213);
					match(IDENTIFIER);
					}
					}
					setState(1218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1219);
				match(RPAREN);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_lambdaBody);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_LITERAL:
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(FuzzyJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(FuzzyJavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FuzzyJavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(FuzzyJavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primary);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				match(LPAREN);
				setState(1227);
				expression(0);
				setState(1228);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1233);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1234);
				typeTypeOrVoid();
				setState(1235);
				match(DOT);
				setState(1236);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1238);
				nonWildcardTypeArguments();
				setState(1242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1239);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1240);
					match(THIS);
					setState(1241);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FuzzyJavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1246);
				classOrInterfaceType();
				setState(1247);
				match(DOT);
				}
				break;
			}
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1251);
				annotation();
				}
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1257);
			match(IDENTIFIER);
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1258);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_creator);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				nonWildcardTypeArguments();
				setState(1262);
				createdName();
				setState(1263);
				classCreatorRest();
				}
				break;
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				createdName();
				setState(1268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1266);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1267);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FuzzyJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FuzzyJavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_createdName);
		int _la;
		try {
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				identifier();
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1273);
					typeArgumentsOrDiamond();
					}
				}

				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1276);
					match(DOT);
					setState(1277);
					identifier();
					setState(1279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1278);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			identifier();
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1290);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1293);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(LBRACK);
			setState(1323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1296);
				match(RBRACK);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1297);
					match(LBRACK);
					setState(1298);
					match(RBRACK);
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1304);
				arrayInitializer();
				}
				break;
			case FUZZY_LITERAL:
			case FUZZY_IDENTIFIER:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1305);
				expression(0);
				setState(1306);
				match(RBRACK);
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1307);
						match(LBRACK);
						setState(1308);
						expression(0);
						setState(1309);
						match(RBRACK);
						}
						} 
					}
					setState(1315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1316);
						match(LBRACK);
						setState(1317);
						match(RBRACK);
						}
						} 
					}
					setState(1322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			arguments();
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1326);
				classBody();
				}
				break;
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			nonWildcardTypeArguments();
			setState(1330);
			explicitGenericInvocationSuffix();
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FuzzyJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(FuzzyJavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeArgumentsOrDiamond);
		try {
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(LT);
				setState(1333);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FuzzyJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(FuzzyJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(LT);
				setState(1338);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FuzzyJavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(FuzzyJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(LT);
			setState(1343);
			typeList();
			setState(1344);
			match(GT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			typeType();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1347);
				match(COMMA);
				setState(1348);
				typeType();
				}
				}
				setState(1353);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(FuzzyJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FuzzyJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FuzzyJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FuzzyJavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1354);
				annotation();
				}
			}

			setState(1359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUZZY_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(1357);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1358);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1361);
					match(LBRACK);
					setState(1362);
					match(RBRACK);
					}
					} 
				}
				setState(1367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(FuzzyJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(FuzzyJavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(FuzzyJavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(FuzzyJavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(FuzzyJavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(FuzzyJavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(FuzzyJavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(FuzzyJavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FuzzyJavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(FuzzyJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FuzzyJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FuzzyJavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			match(LT);
			setState(1371);
			typeArgument();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1372);
				match(COMMA);
				setState(1373);
				typeArgument();
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1379);
			match(GT);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FuzzyJavaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_superSuffix);
		try {
			setState(1387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(DOT);
				setState(1383);
				match(IDENTIFIER);
				setState(1385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1384);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(FuzzyJavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				match(SUPER);
				setState(1390);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				match(IDENTIFIER);
				setState(1392);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FuzzyJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FuzzyJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(LPAREN);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY_LITERAL) | (1L << FUZZY_IDENTIFIER) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1396);
				expressionList();
				}
			}

			setState(1399);
			match(RPAREN);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FuzzyJavaParser.IDENTIFIER, 0); }
		public TerminalNode FUZZY_IDENTIFIER() { return getToken(FuzzyJavaParser.FUZZY_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuzzyJavaParserListener ) ((FuzzyJavaParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_la = _input.LA(1);
			if ( !(_la==FUZZY_IDENTIFIER || _la==IDENTIFIER) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 84:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 13);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u057e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\5\2\u00da\n\2\3\2\7\2\u00dd\n\2\f\2\16\2\u00e0\13\2\3\2\7"+
		"\2\u00e3\n\2\f\2\16\2\u00e6\13\2\3\2\3\2\3\3\7\3\u00eb\n\3\f\3\16\3\u00ee"+
		"\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00f6\n\4\3\4\3\4\3\4\5\4\u00fb\n\4"+
		"\3\4\3\4\3\5\7\5\u0100\n\5\f\5\16\5\u0103\13\5\3\5\3\5\3\5\3\5\5\5\u0109"+
		"\n\5\3\5\5\5\u010c\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0113\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u011d\n\7\3\b\3\b\5\b\u0121\n\b\3\t\3\t\3\t\5\t"+
		"\u0126\n\t\3\t\3\t\5\t\u012a\n\t\3\t\3\t\5\t\u012e\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\n\u0136\n\n\f\n\16\n\u0139\13\n\3\n\3\n\3\13\7\13\u013e\n\13"+
		"\f\13\16\13\u0141\13\13\3\13\3\13\3\13\5\13\u0146\n\13\3\f\3\f\3\f\7\f"+
		"\u014b\n\f\f\f\16\f\u014e\13\f\3\r\3\r\3\r\3\r\5\r\u0154\n\r\3\r\3\r\5"+
		"\r\u0158\n\r\3\r\5\r\u015b\n\r\3\r\5\r\u015e\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u0165\n\16\f\16\16\16\u0168\13\16\3\17\7\17\u016b\n\17\f\17\16\17"+
		"\u016e\13\17\3\17\3\17\5\17\u0172\n\17\3\17\5\17\u0175\n\17\3\20\3\20"+
		"\7\20\u0179\n\20\f\20\16\20\u017c\13\20\3\21\3\21\3\21\5\21\u0181\n\21"+
		"\3\21\3\21\5\21\u0185\n\21\3\21\3\21\3\22\3\22\7\22\u018b\n\22\f\22\16"+
		"\22\u018e\13\22\3\22\3\22\3\23\3\23\7\23\u0194\n\23\f\23\16\23\u0197\13"+
		"\23\3\23\3\23\3\24\3\24\5\24\u019d\n\24\3\24\3\24\7\24\u01a1\n\24\f\24"+
		"\16\24\u01a4\13\24\3\24\5\24\u01a7\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u01b2\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01b9\n"+
		"\26\f\26\16\26\u01bc\13\26\3\26\3\26\5\26\u01c0\n\26\3\26\3\26\3\27\3"+
		"\27\5\27\u01c6\n\27\3\30\3\30\5\30\u01ca\n\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u01d6\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\7\35\u01df\n\35\f\35\16\35\u01e2\13\35\3\35\3\35\5\35\u01e6\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ef\n\36\3\37\3\37\3\37\3\37"+
		"\7\37\u01f5\n\37\f\37\16\37\u01f8\13\37\3\37\3\37\3 \3 \3 \7 \u01ff\n"+
		" \f \16 \u0202\13 \3 \3 \3 \3!\7!\u0208\n!\f!\16!\u020b\13!\3!\3!\3!\7"+
		"!\u0210\n!\f!\16!\u0213\13!\3!\3!\5!\u0217\n!\3!\3!\3!\3!\7!\u021d\n!"+
		"\f!\16!\u0220\13!\3!\3!\5!\u0224\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u022e\n\"\3#\3#\3#\3$\3$\3$\7$\u0236\n$\f$\16$\u0239\13$\3%\3%\3%\5%"+
		"\u023e\n%\3&\3&\3&\7&\u0243\n&\f&\16&\u0246\13&\3\'\3\'\5\'\u024a\n\'"+
		"\3(\3(\3(\3(\7(\u0250\n(\f(\16(\u0253\13(\3(\5(\u0256\n(\5(\u0258\n(\3"+
		"(\3(\3)\3)\5)\u025e\n)\3)\3)\3)\5)\u0263\n)\7)\u0265\n)\f)\16)\u0268\13"+
		")\3*\3*\3*\3*\5*\u026e\n*\5*\u0270\n*\3+\3+\3+\7+\u0275\n+\f+\16+\u0278"+
		"\13+\3,\3,\5,\u027c\n,\3,\3,\3-\3-\3-\7-\u0283\n-\f-\16-\u0286\13-\3-"+
		"\3-\5-\u028a\n-\3-\5-\u028d\n-\3.\7.\u0290\n.\f.\16.\u0293\13.\3.\3.\3"+
		".\3/\7/\u0299\n/\f/\16/\u029c\13/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u02a5"+
		"\n\60\f\60\16\60\u02a8\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02b1"+
		"\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u02c0\n\65\3\65\5\65\u02c3\n\65\3\66\3\66\3\66\7\66\u02c8\n\66\f"+
		"\66\16\66\u02cb\13\66\3\67\3\67\3\67\3\67\38\38\38\58\u02d4\n8\39\39\3"+
		"9\39\79\u02da\n9\f9\169\u02dd\139\59\u02df\n9\39\59\u02e2\n9\39\39\3:"+
		"\3:\3:\3:\3:\3;\3;\7;\u02ed\n;\f;\16;\u02f0\13;\3;\3;\3<\7<\u02f5\n<\f"+
		"<\16<\u02f8\13<\3<\3<\5<\u02fc\n<\3=\3=\3=\3=\3=\3=\5=\u0304\n=\3=\3="+
		"\5=\u0308\n=\3=\3=\5=\u030c\n=\3=\3=\5=\u0310\n=\5=\u0312\n=\3>\3>\5>"+
		"\u0316\n>\3?\3?\3?\3?\5?\u031c\n?\3@\3@\3A\3A\3A\3B\3B\7B\u0325\nB\fB"+
		"\16B\u0328\13B\3B\3B\3C\3C\3C\3C\3C\5C\u0331\nC\3D\7D\u0334\nD\fD\16D"+
		"\u0337\13D\3D\3D\3D\3E\7E\u033d\nE\fE\16E\u0340\13E\3E\3E\5E\u0344\nE"+
		"\3E\5E\u0347\nE\3F\3F\3F\3F\3F\5F\u034e\nF\3F\3F\3F\3F\3F\3F\3F\5F\u0357"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\6F\u036c"+
		"\nF\rF\16F\u036d\3F\5F\u0371\nF\3F\5F\u0374\nF\3F\3F\3F\3F\7F\u037a\n"+
		"F\fF\16F\u037d\13F\3F\5F\u0380\nF\3F\3F\3F\3F\7F\u0386\nF\fF\16F\u0389"+
		"\13F\3F\7F\u038c\nF\fF\16F\u038f\13F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0399"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\5F\u03a2\nF\3F\3F\3F\5F\u03a7\nF\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\5F\u03b1\nF\3G\3G\3G\7G\u03b6\nG\fG\16G\u03b9\13G\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\7H\u03c3\nH\fH\16H\u03c6\13H\3I\3I\3I\3J\3J\3J\5J\u03ce"+
		"\nJ\3J\3J\3K\3K\3K\7K\u03d5\nK\fK\16K\u03d8\13K\3L\7L\u03db\nL\fL\16L"+
		"\u03de\13L\3L\3L\3L\3L\3L\3M\6M\u03e6\nM\rM\16M\u03e7\3M\6M\u03eb\nM\r"+
		"M\16M\u03ec\3N\3N\3N\5N\u03f2\nN\3N\3N\3N\5N\u03f7\nN\3O\3O\5O\u03fb\n"+
		"O\3O\3O\5O\u03ff\nO\3O\3O\5O\u0403\nO\5O\u0405\nO\3P\3P\5P\u0409\nP\3"+
		"Q\7Q\u040c\nQ\fQ\16Q\u040f\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\7S"+
		"\u041d\nS\fS\16S\u0420\13S\3T\3T\3T\5T\u0425\nT\3T\3T\3T\3T\3T\5T\u042c"+
		"\nT\3T\3T\3T\3T\5T\u0432\nT\3T\5T\u0435\nT\3U\3U\3U\3U\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u044d\nV\3V\3V\5V\u0451\nV"+
		"\3V\3V\3V\5V\u0456\nV\3V\3V\5V\u045a\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\5V\u046e\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\5V\u0496\nV\3V\3V\3V\3V\5V\u049c\nV\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\5V\u04ab\nV\3V\7V\u04ae\nV\fV\16V\u04b1\13V\3W\3W\3"+
		"W\3W\3X\3X\3X\5X\u04ba\nX\3X\3X\3X\3X\3X\7X\u04c1\nX\fX\16X\u04c4\13X"+
		"\3X\5X\u04c7\nX\3Y\3Y\5Y\u04cb\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\5Z\u04dd\nZ\5Z\u04df\nZ\3[\3[\3[\5[\u04e4\n[\3[\7[\u04e7"+
		"\n[\f[\16[\u04ea\13[\3[\3[\5[\u04ee\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u04f7\n\\\5\\\u04f9\n\\\3]\3]\5]\u04fd\n]\3]\3]\3]\5]\u0502\n]\7]\u0504"+
		"\n]\f]\16]\u0507\13]\3]\5]\u050a\n]\3^\3^\5^\u050e\n^\3^\3^\3_\3_\3_\3"+
		"_\7_\u0516\n_\f_\16_\u0519\13_\3_\3_\3_\3_\3_\3_\3_\7_\u0522\n_\f_\16"+
		"_\u0525\13_\3_\3_\7_\u0529\n_\f_\16_\u052c\13_\5_\u052e\n_\3`\3`\5`\u0532"+
		"\n`\3a\3a\3a\3b\3b\3b\5b\u053a\nb\3c\3c\3c\5c\u053f\nc\3d\3d\3d\3d\3e"+
		"\3e\3e\7e\u0548\ne\fe\16e\u054b\13e\3f\5f\u054e\nf\3f\3f\5f\u0552\nf\3"+
		"f\3f\7f\u0556\nf\ff\16f\u0559\13f\3g\3g\3h\3h\3h\3h\7h\u0561\nh\fh\16"+
		"h\u0564\13h\3h\3h\3i\3i\3i\3i\5i\u056c\ni\5i\u056e\ni\3j\3j\3j\3j\5j\u0574"+
		"\nj\3k\3k\5k\u0578\nk\3k\3k\3l\3l\3l\2\3\u00aam\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\2\17\4\2\26\26"+
		"--\3\28;\3\2<=\3\2X[\3\2NO\4\2\\]aa\3\2Z[\4\2LMST\4\2RRUU\4\2KKbl\3\2"+
		"XY\n\2\b\b\n\n\r\r\23\23\31\31  \"\"**\4\2\5\5tt\2\u0616\2\u00d9\3\2\2"+
		"\2\4\u00ec\3\2\2\2\6\u00f3\3\2\2\2\b\u010b\3\2\2\2\n\u0112\3\2\2\2\f\u011c"+
		"\3\2\2\2\16\u0120\3\2\2\2\20\u0122\3\2\2\2\22\u0131\3\2\2\2\24\u013f\3"+
		"\2\2\2\26\u0147\3\2\2\2\30\u014f\3\2\2\2\32\u0161\3\2\2\2\34\u016c\3\2"+
		"\2\2\36\u0176\3\2\2\2 \u017d\3\2\2\2\"\u0188\3\2\2\2$\u0191\3\2\2\2&\u01a6"+
		"\3\2\2\2(\u01b1\3\2\2\2*\u01b3\3\2\2\2,\u01c5\3\2\2\2.\u01c9\3\2\2\2\60"+
		"\u01cb\3\2\2\2\62\u01ce\3\2\2\2\64\u01d1\3\2\2\2\66\u01d9\3\2\2\28\u01e5"+
		"\3\2\2\2:\u01ee\3\2\2\2<\u01f0\3\2\2\2>\u01fb\3\2\2\2@\u0209\3\2\2\2B"+
		"\u022d\3\2\2\2D\u022f\3\2\2\2F\u0232\3\2\2\2H\u023a\3\2\2\2J\u023f\3\2"+
		"\2\2L\u0249\3\2\2\2N\u024b\3\2\2\2P\u025b\3\2\2\2R\u026f\3\2\2\2T\u0271"+
		"\3\2\2\2V\u0279\3\2\2\2X\u028c\3\2\2\2Z\u0291\3\2\2\2\\\u029a\3\2\2\2"+
		"^\u02a1\3\2\2\2`\u02b0\3\2\2\2b\u02b2\3\2\2\2d\u02b4\3\2\2\2f\u02b6\3"+
		"\2\2\2h\u02ba\3\2\2\2j\u02c4\3\2\2\2l\u02cc\3\2\2\2n\u02d3\3\2\2\2p\u02d5"+
		"\3\2\2\2r\u02e5\3\2\2\2t\u02ea\3\2\2\2v\u02fb\3\2\2\2x\u0311\3\2\2\2z"+
		"\u0315\3\2\2\2|\u0317\3\2\2\2~\u031d\3\2\2\2\u0080\u031f\3\2\2\2\u0082"+
		"\u0322\3\2\2\2\u0084\u0330\3\2\2\2\u0086\u0335\3\2\2\2\u0088\u0346\3\2"+
		"\2\2\u008a\u03b0\3\2\2\2\u008c\u03b2\3\2\2\2\u008e\u03bf\3\2\2\2\u0090"+
		"\u03c7\3\2\2\2\u0092\u03ca\3\2\2\2\u0094\u03d1\3\2\2\2\u0096\u03dc\3\2"+
		"\2\2\u0098\u03e5\3\2\2\2\u009a\u03f6\3\2\2\2\u009c\u0404\3\2\2\2\u009e"+
		"\u0408\3\2\2\2\u00a0\u040d\3\2\2\2\u00a2\u0415\3\2\2\2\u00a4\u0419\3\2"+
		"\2\2\u00a6\u0434\3\2\2\2\u00a8\u0436\3\2\2\2\u00aa\u0459\3\2\2\2\u00ac"+
		"\u04b2\3\2\2\2\u00ae\u04c6\3\2\2\2\u00b0\u04ca\3\2\2\2\u00b2\u04de\3\2"+
		"\2\2\u00b4\u04e3\3\2\2\2\u00b6\u04f8\3\2\2\2\u00b8\u0509\3\2\2\2\u00ba"+
		"\u050b\3\2\2\2\u00bc\u0511\3\2\2\2\u00be\u052f\3\2\2\2\u00c0\u0533\3\2"+
		"\2\2\u00c2\u0539\3\2\2\2\u00c4\u053e\3\2\2\2\u00c6\u0540\3\2\2\2\u00c8"+
		"\u0544\3\2\2\2\u00ca\u054d\3\2\2\2\u00cc\u055a\3\2\2\2\u00ce\u055c\3\2"+
		"\2\2\u00d0\u056d\3\2\2\2\u00d2\u0573\3\2\2\2\u00d4\u0575\3\2\2\2\u00d6"+
		"\u057b\3\2\2\2\u00d8\u00da\5\4\3\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00de\3\2\2\2\u00db\u00dd\5\6\4\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e4\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5\b\5\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\2\2\3\u00e8\3\3\2\2\2\u00e9\u00eb"+
		"\5h\65\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7%"+
		"\2\2\u00f0\u00f1\5^\60\2\u00f1\u00f2\7H\2\2\u00f2\5\3\2\2\2\u00f3\u00f5"+
		"\7\36\2\2\u00f4\u00f6\7+\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fa\5^\60\2\u00f8\u00f9\7J\2\2\u00f9\u00fb\7\\"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7H\2\2\u00fd\7\3\2\2\2\u00fe\u0100\5\f\7\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0108"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0109\5\20\t\2\u0105\u0109\5\30\r\2"+
		"\u0106\u0109\5 \21\2\u0107\u0109\5r:\2\u0108\u0104\3\2\2\2\u0108\u0105"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u010c\7H\2\2\u010b\u0101\3\2\2\2\u010b\u010a\3\2\2\2\u010c\t\3\2\2\2"+
		"\u010d\u0113\5\f\7\2\u010e\u0113\7#\2\2\u010f\u0113\7/\2\2\u0110\u0113"+
		"\7\63\2\2\u0111\u0113\7\66\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2"+
		"\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\13"+
		"\3\2\2\2\u0114\u011d\5h\65\2\u0115\u011d\7(\2\2\u0116\u011d\7\'\2\2\u0117"+
		"\u011d\7&\2\2\u0118\u011d\7+\2\2\u0119\u011d\7\6\2\2\u011a\u011d\7\27"+
		"\2\2\u011b\u011d\7,\2\2\u011c\u0114\3\2\2\2\u011c\u0115\3\2\2\2\u011c"+
		"\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\r\3\2\2\2\u011e\u0121"+
		"\7\27\2\2\u011f\u0121\5h\65\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2"+
		"\u0121\17\3\2\2\2\u0122\u0123\7\16\2\2\u0123\u0125\5\u00d6l\2\u0124\u0126"+
		"\5\22\n\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2"+
		"\u0127\u0128\7\26\2\2\u0128\u012a\5\u00caf\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u012c\7\35\2\2\u012c\u012e\5"+
		"\u00c8e\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u0130\5\"\22\2\u0130\21\3\2\2\2\u0131\u0132\7M\2\2\u0132\u0137"+
		"\5\24\13\2\u0133\u0134\7I\2\2\u0134\u0136\5\24\13\2\u0135\u0133\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7L\2\2\u013b\23\3\2\2\2\u013c"+
		"\u013e\5h\65\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0145\7t\2\2\u0143\u0144\7\26\2\2\u0144\u0146\5\26\f\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\25\3\2\2\2\u0147\u014c\5\u00caf\2\u0148"+
		"\u0149\7^\2\2\u0149\u014b\5\u00caf\2\u014a\u0148\3\2\2\2\u014b\u014e\3"+
		"\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\27\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7\25\2\2\u0150\u0153\5\u00d6l\2\u0151\u0152"+
		"\7\35\2\2\u0152\u0154\5\u00c8e\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155\u0157\7D\2\2\u0156\u0158\5\32\16\2\u0157"+
		"\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\7I"+
		"\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\5\36\20\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u0160\7E\2\2\u0160\31\3\2\2\2\u0161\u0166\5\34\17\2\u0162"+
		"\u0163\7I\2\2\u0163\u0165\5\34\17\2\u0164\u0162\3\2\2\2\u0165\u0168\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\33\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\5h\65\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0171\5\u00d6l\2\u0170\u0172\5\u00d4k\2\u0171\u0170"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\5\"\22\2"+
		"\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\35\3\2\2\2\u0176\u017a"+
		"\7H\2\2\u0177\u0179\5&\24\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\37\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017e\7!\2\2\u017e\u0180\5\u00d6l\2\u017f\u0181\5\22\n\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0183\7\26"+
		"\2\2\u0183\u0185\5\u00c8e\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\5$\23\2\u0187!\3\2\2\2\u0188\u018c\7D\2\2\u0189"+
		"\u018b\5&\24\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\7E\2\2\u0190#\3\2\2\2\u0191\u0195\7D\2\2\u0192\u0194\58\35\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7E\2\2\u0199"+
		"%\3\2\2\2\u019a\u01a7\7H\2\2\u019b\u019d\7+\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a7\5\u0082B\2\u019f\u01a1"+
		"\5\n\6\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5("+
		"\25\2\u01a6\u019a\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7"+
		"\'\3\2\2\2\u01a8\u01b2\5*\26\2\u01a9\u01b2\5\60\31\2\u01aa\u01b2\5\66"+
		"\34\2\u01ab\u01b2\5\64\33\2\u01ac\u01b2\5\62\32\2\u01ad\u01b2\5 \21\2"+
		"\u01ae\u01b2\5r:\2\u01af\u01b2\5\20\t\2\u01b0\u01b2\5\30\r\2\u01b1\u01a8"+
		"\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b1\u01aa\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b1"+
		"\u01ac\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2)\3\2\2\2\u01b3\u01b4\5.\30\2\u01b4\u01b5"+
		"\5\u00d6l\2\u01b5\u01ba\5V,\2\u01b6\u01b7\7F\2\2\u01b7\u01b9\7G\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7\62\2\2\u01be"+
		"\u01c0\5T+\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2"+
		"\2\u01c1\u01c2\5,\27\2\u01c2+\3\2\2\2\u01c3\u01c6\5\u0082B\2\u01c4\u01c6"+
		"\7H\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6-\3\2\2\2\u01c7\u01ca"+
		"\5\u00caf\2\u01c8\u01ca\7\65\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2"+
		"\2\u01ca/\3\2\2\2\u01cb\u01cc\5\22\n\2\u01cc\u01cd\5*\26\2\u01cd\61\3"+
		"\2\2\2\u01ce\u01cf\5\22\n\2\u01cf\u01d0\5\64\33\2\u01d0\63\3\2\2\2\u01d1"+
		"\u01d2\5\u00d6l\2\u01d2\u01d5\5V,\2\u01d3\u01d4\7\62\2\2\u01d4\u01d6\5"+
		"T+\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\5\u0082B\2\u01d8\65\3\2\2\2\u01d9\u01da\5\u00caf\2\u01da\u01db"+
		"\5F$\2\u01db\u01dc\7H\2\2\u01dc\67\3\2\2\2\u01dd\u01df\5\n\6\2\u01de\u01dd"+
		"\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\5:\36\2\u01e4\u01e6\7H"+
		"\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e69\3\2\2\2\u01e7\u01ef"+
		"\5<\37\2\u01e8\u01ef\5@!\2\u01e9\u01ef\5D#\2\u01ea\u01ef\5 \21\2\u01eb"+
		"\u01ef\5r:\2\u01ec\u01ef\5\20\t\2\u01ed\u01ef\5\30\r\2\u01ee\u01e7\3\2"+
		"\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee"+
		"\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef;\3\2\2\2"+
		"\u01f0\u01f1\5\u00caf\2\u01f1\u01f6\5> \2\u01f2\u01f3\7I\2\2\u01f3\u01f5"+
		"\5> \2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7H"+
		"\2\2\u01fa=\3\2\2\2\u01fb\u0200\7t\2\2\u01fc\u01fd\7F\2\2\u01fd\u01ff"+
		"\7G\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7K"+
		"\2\2\u0204\u0205\5L\'\2\u0205?\3\2\2\2\u0206\u0208\5B\"\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0216\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0217\5.\30\2\u020d\u0211\5\22"+
		"\n\2\u020e\u0210\5h\65\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0215\5.\30\2\u0215\u0217\3\2\2\2\u0216\u020c\3\2\2\2\u0216"+
		"\u020d\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\7t\2\2\u0219\u021e\5V,"+
		"\2\u021a\u021b\7F\2\2\u021b\u021d\7G\2\2\u021c\u021a\3\2\2\2\u021d\u0220"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0222\7\62\2\2\u0222\u0224\5T+\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5,\27\2\u0226"+
		"A\3\2\2\2\u0227\u022e\5h\65\2\u0228\u022e\7(\2\2\u0229\u022e\7\6\2\2\u022a"+
		"\u022e\7\21\2\2\u022b\u022e\7+\2\2\u022c\u022e\7,\2\2\u022d\u0227\3\2"+
		"\2\2\u022d\u0228\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022eC\3\2\2\2\u022f\u0230\5\22\n\2"+
		"\u0230\u0231\5@!\2\u0231E\3\2\2\2\u0232\u0237\5H%\2\u0233\u0234\7I\2\2"+
		"\u0234\u0236\5H%\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238G\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023d\5J&\2\u023b\u023c\7K\2\2\u023c\u023e\5L\'\2\u023d\u023b\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023eI\3\2\2\2\u023f\u0244\5\u00d6l\2\u0240\u0241"+
		"\7F\2\2\u0241\u0243\7G\2\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245K\3\2\2\2\u0246\u0244\3\2\2\2"+
		"\u0247\u024a\5N(\2\u0248\u024a\5\u00aaV\2\u0249\u0247\3\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024aM\3\2\2\2\u024b\u0257\7D\2\2\u024c\u0251\5L\'\2\u024d\u024e"+
		"\7I\2\2\u024e\u0250\5L\'\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u0256\7I\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u024c\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025a\7E\2\2\u025aO\3\2\2\2\u025b\u025d\5\u00d6l\2\u025c\u025e"+
		"\5\u00ceh\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0266\3\2\2"+
		"\2\u025f\u0260\7J\2\2\u0260\u0262\5\u00d6l\2\u0261\u0263\5\u00ceh\2\u0262"+
		"\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u025f\3\2"+
		"\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"Q\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u0270\5\u00caf\2\u026a\u026d\7P\2"+
		"\2\u026b\u026c\t\2\2\2\u026c\u026e\5\u00caf\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0269\3\2\2\2\u026f\u026a\3\2"+
		"\2\2\u0270S\3\2\2\2\u0271\u0276\5^\60\2\u0272\u0273\7I\2\2\u0273\u0275"+
		"\5^\60\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277U\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7B\2\2\u027a"+
		"\u027c\5X-\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\7C\2\2\u027eW\3\2\2\2\u027f\u0284\5Z.\2\u0280\u0281\7I"+
		"\2\2\u0281\u0283\5Z.\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0289\3\2\2\2\u0286\u0284\3\2\2\2\u0287"+
		"\u0288\7I\2\2\u0288\u028a\5\\/\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u028d\3\2\2\2\u028b\u028d\5\\/\2\u028c\u027f\3\2\2\2\u028c\u028b"+
		"\3\2\2\2\u028dY\3\2\2\2\u028e\u0290\5\16\b\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0295\5\u00caf\2\u0295\u0296\5J&\2\u0296"+
		"[\3\2\2\2\u0297\u0299\5\16\b\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2"+
		"\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029d\u029e\5\u00caf\2\u029e\u029f\7p\2\2\u029f\u02a0\5J&\2\u02a0"+
		"]\3\2\2\2\u02a1\u02a6\7t\2\2\u02a2\u02a3\7J\2\2\u02a3\u02a5\7t\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7_\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02b1\5b\62\2\u02aa\u02b1"+
		"\5d\63\2\u02ab\u02b1\5f\64\2\u02ac\u02b1\7?\2\2\u02ad\u02b1\7@\2\2\u02ae"+
		"\u02b1\7>\2\2\u02af\u02b1\7A\2\2\u02b0\u02a9\3\2\2\2\u02b0\u02aa\3\2\2"+
		"\2\u02b0\u02ab\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1a\3\2\2\2\u02b2\u02b3\t\3\2\2\u02b3"+
		"c\3\2\2\2\u02b4\u02b5\t\4\2\2\u02b5e\3\2\2\2\u02b6\u02b7\7\3\2\2\u02b7"+
		"\u02b8\7K\2\2\u02b8\u02b9\7t\2\2\u02b9g\3\2\2\2\u02ba\u02bb\7o\2\2\u02bb"+
		"\u02c2\5^\60\2\u02bc\u02bf\7B\2\2\u02bd\u02c0\5j\66\2\u02be\u02c0\5n8"+
		"\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c3\7C\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"i\3\2\2\2\u02c4\u02c9\5l\67\2\u02c5\u02c6\7I\2\2\u02c6\u02c8\5l\67\2\u02c7"+
		"\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02cak\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7t\2\2\u02cd\u02ce"+
		"\7K\2\2\u02ce\u02cf\5n8\2\u02cfm\3\2\2\2\u02d0\u02d4\5\u00aaV\2\u02d1"+
		"\u02d4\5h\65\2\u02d2\u02d4\5p9\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2"+
		"\2\u02d3\u02d2\3\2\2\2\u02d4o\3\2\2\2\u02d5\u02de\7D\2\2\u02d6\u02db\5"+
		"n8\2\u02d7\u02d8\7I\2\2\u02d8\u02da\5n8\2\u02d9\u02d7\3\2\2\2\u02da\u02dd"+
		"\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02d6\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2"+
		"\2\2\u02e0\u02e2\7I\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e4\7E\2\2\u02e4q\3\2\2\2\u02e5\u02e6\7o\2\2\u02e6"+
		"\u02e7\7!\2\2\u02e7\u02e8\7t\2\2\u02e8\u02e9\5t;\2\u02e9s\3\2\2\2\u02ea"+
		"\u02ee\7D\2\2\u02eb\u02ed\5v<\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2"+
		"\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f1\u02f2\7E\2\2\u02f2u\3\2\2\2\u02f3\u02f5\5\n\6\2\u02f4\u02f3"+
		"\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\5x=\2\u02fa\u02fc\7H\2"+
		"\2\u02fb\u02f6\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fcw\3\2\2\2\u02fd\u02fe"+
		"\5\u00caf\2\u02fe\u02ff\5z>\2\u02ff\u0300\7H\2\2\u0300\u0312\3\2\2\2\u0301"+
		"\u0303\5\20\t\2\u0302\u0304\7H\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0312\3\2\2\2\u0305\u0307\5 \21\2\u0306\u0308\7H\2\2\u0307"+
		"\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0312\3\2\2\2\u0309\u030b\5\30"+
		"\r\2\u030a\u030c\7H\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u0312\3\2\2\2\u030d\u030f\5r:\2\u030e\u0310\7H\2\2\u030f\u030e\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u02fd\3\2\2\2\u0311\u0301"+
		"\3\2\2\2\u0311\u0305\3\2\2\2\u0311\u0309\3\2\2\2\u0311\u030d\3\2\2\2\u0312"+
		"y\3\2\2\2\u0313\u0316\5|?\2\u0314\u0316\5~@\2\u0315\u0313\3\2\2\2\u0315"+
		"\u0314\3\2\2\2\u0316{\3\2\2\2\u0317\u0318\7t\2\2\u0318\u0319\7B\2\2\u0319"+
		"\u031b\7C\2\2\u031a\u031c\5\u0080A\2\u031b\u031a\3\2\2\2\u031b\u031c\3"+
		"\2\2\2\u031c}\3\2\2\2\u031d\u031e\5F$\2\u031e\177\3\2\2\2\u031f\u0320"+
		"\7\21\2\2\u0320\u0321\5n8\2\u0321\u0081\3\2\2\2\u0322\u0326\7D\2\2\u0323"+
		"\u0325\5\u0084C\2\u0324\u0323\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329"+
		"\u032a\7E\2\2\u032a\u0083\3\2\2\2\u032b\u032c\5\u0086D\2\u032c\u032d\7"+
		"H\2\2\u032d\u0331\3\2\2\2\u032e\u0331\5\u008aF\2\u032f\u0331\5\u0088E"+
		"\2\u0330\u032b\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u0085"+
		"\3\2\2\2\u0332\u0334\5\16\b\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2"+
		"\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0335"+
		"\3\2\2\2\u0338\u0339\5\u00caf\2\u0339\u033a\5F$\2\u033a\u0087\3\2\2\2"+
		"\u033b\u033d\5\f\7\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0343\3\2\2\2\u0340\u033e\3\2\2\2\u0341"+
		"\u0344\5\20\t\2\u0342\u0344\5 \21\2\u0343\u0341\3\2\2\2\u0343\u0342\3"+
		"\2\2\2\u0344\u0347\3\2\2\2\u0345\u0347\7H\2\2\u0346\u033e\3\2\2\2\u0346"+
		"\u0345\3\2\2\2\u0347\u0089\3\2\2\2\u0348\u03b1\5\u0082B\2\u0349\u034a"+
		"\7\7\2\2\u034a\u034d\5\u00aaV\2\u034b\u034c\7Q\2\2\u034c\u034e\5\u00aa"+
		"V\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\7H\2\2\u0350\u03b1\3\2\2\2\u0351\u0352\7\33\2\2\u0352\u0353\5\u00a2"+
		"R\2\u0353\u0356\5\u008aF\2\u0354\u0355\7\24\2\2\u0355\u0357\5\u008aF\2"+
		"\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u03b1\3\2\2\2\u0358\u0359"+
		"\7\32\2\2\u0359\u035a\7B\2\2\u035a\u035b\5\u009cO\2\u035b\u035c\7C\2\2"+
		"\u035c\u035d\5\u008aF\2\u035d\u03b1\3\2\2\2\u035e\u035f\7\67\2\2\u035f"+
		"\u0360\5\u00a2R\2\u0360\u0361\5\u008aF\2\u0361\u03b1\3\2\2\2\u0362\u0363"+
		"\7\22\2\2\u0363\u0364\5\u008aF\2\u0364\u0365\7\67\2\2\u0365\u0366\5\u00a2"+
		"R\2\u0366\u0367\7H\2\2\u0367\u03b1\3\2\2\2\u0368\u0369\7\64\2\2\u0369"+
		"\u0373\5\u0082B\2\u036a\u036c\5\u008cG\2\u036b\u036a\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f"+
		"\u0371\5\u0090I\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0374"+
		"\3\2\2\2\u0372\u0374\5\u0090I\2\u0373\u036b\3\2\2\2\u0373\u0372\3\2\2"+
		"\2\u0374\u03b1\3\2\2\2\u0375\u0376\7\64\2\2\u0376\u0377\5\u0092J\2\u0377"+
		"\u037b\5\u0082B\2\u0378\u037a\5\u008cG\2\u0379\u0378\3\2\2\2\u037a\u037d"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037e\u0380\5\u0090I\2\u037f\u037e\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u03b1\3\2\2\2\u0381\u0382\7.\2\2\u0382\u0383\5\u00a2R\2"+
		"\u0383\u0387\7D\2\2\u0384\u0386\5\u0098M\2\u0385\u0384\3\2\2\2\u0386\u0389"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038d\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u038a\u038c\5\u009aN\2\u038b\u038a\3\2\2\2\u038c\u038f"+
		"\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u0390\u0391\7E\2\2\u0391\u03b1\3\2\2\2\u0392\u0393\7/\2"+
		"\2\u0393\u0394\5\u00a2R\2\u0394\u0395\5\u0082B\2\u0395\u03b1\3\2\2\2\u0396"+
		"\u0398\7)\2\2\u0397\u0399\5\u00aaV\2\u0398\u0397\3\2\2\2\u0398\u0399\3"+
		"\2\2\2\u0399\u039a\3\2\2\2\u039a\u03b1\7H\2\2\u039b\u039c\7\61\2\2\u039c"+
		"\u039d\5\u00aaV\2\u039d\u039e\7H\2\2\u039e\u03b1\3\2\2\2\u039f\u03a1\7"+
		"\t\2\2\u03a0\u03a2\7t\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03b1\7H\2\2\u03a4\u03a6\7\20\2\2\u03a5\u03a7\7t"+
		"\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03b1\7H\2\2\u03a9\u03b1\7H\2\2\u03aa\u03ab\5\u00aaV\2\u03ab\u03ac\7"+
		"H\2\2\u03ac\u03b1\3\2\2\2\u03ad\u03ae\7t\2\2\u03ae\u03af\7Q\2\2\u03af"+
		"\u03b1\5\u008aF\2\u03b0\u0348\3\2\2\2\u03b0\u0349\3\2\2\2\u03b0\u0351"+
		"\3\2\2\2\u03b0\u0358\3\2\2\2\u03b0\u035e\3\2\2\2\u03b0\u0362\3\2\2\2\u03b0"+
		"\u0368\3\2\2\2\u03b0\u0375\3\2\2\2\u03b0\u0381\3\2\2\2\u03b0\u0392\3\2"+
		"\2\2\u03b0\u0396\3\2\2\2\u03b0\u039b\3\2\2\2\u03b0\u039f\3\2\2\2\u03b0"+
		"\u03a4\3\2\2\2\u03b0\u03a9\3\2\2\2\u03b0\u03aa\3\2\2\2\u03b0\u03ad\3\2"+
		"\2\2\u03b1\u008b\3\2\2\2\u03b2\u03b3\7\f\2\2\u03b3\u03b7\7B\2\2\u03b4"+
		"\u03b6\5\16\b\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3"+
		"\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\5\u008eH\2\u03bb\u03bc\7t\2\2\u03bc\u03bd\7C\2\2\u03bd\u03be\5"+
		"\u0082B\2\u03be\u008d\3\2\2\2\u03bf\u03c4\5^\60\2\u03c0\u03c1\7_\2\2\u03c1"+
		"\u03c3\5^\60\2\u03c2\u03c0\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u008f\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7"+
		"\u03c8\7\30\2\2\u03c8\u03c9\5\u0082B\2\u03c9\u0091\3\2\2\2\u03ca\u03cb"+
		"\7B\2\2\u03cb\u03cd\5\u0094K\2\u03cc\u03ce\7H\2\2\u03cd\u03cc\3\2\2\2"+
		"\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7C\2\2\u03d0\u0093"+
		"\3\2\2\2\u03d1\u03d6\5\u0096L\2\u03d2\u03d3\7H\2\2\u03d3\u03d5\5\u0096"+
		"L\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u0095\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03db\5\16"+
		"\b\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0\5P"+
		")\2\u03e0\u03e1\5J&\2\u03e1\u03e2\7K\2\2\u03e2\u03e3\5\u00aaV\2\u03e3"+
		"\u0097\3\2\2\2\u03e4\u03e6\5\u009aN\2\u03e5\u03e4\3\2\2\2\u03e6\u03e7"+
		"\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03eb\5\u0084C\2\u03ea\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0099\3\2\2\2\u03ee\u03f1\7\13\2\2"+
		"\u03ef\u03f2\5\u00aaV\2\u03f0\u03f2\7t\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f0"+
		"\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f7\7Q\2\2\u03f4\u03f5\7\21\2\2\u03f5"+
		"\u03f7\7Q\2\2\u03f6\u03ee\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u009b\3\2"+
		"\2\2\u03f8\u0405\5\u00a0Q\2\u03f9\u03fb\5\u009eP\2\u03fa\u03f9\3\2\2\2"+
		"\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\7H\2\2\u03fd\u03ff"+
		"\5\u00aaV\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2"+
		"\2\u0400\u0402\7H\2\2\u0401\u0403\5\u00a4S\2\u0402\u0401\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u03f8\3\2\2\2\u0404\u03fa\3\2"+
		"\2\2\u0405\u009d\3\2\2\2\u0406\u0409\5\u0086D\2\u0407\u0409\5\u00a4S\2"+
		"\u0408\u0406\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u009f\3\2\2\2\u040a\u040c"+
		"\5\16\b\2\u040b\u040a\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2"+
		"\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411"+
		"\5\u00caf\2\u0411\u0412\5J&\2\u0412\u0413\7Q\2\2\u0413\u0414\5\u00aaV"+
		"\2\u0414\u00a1\3\2\2\2\u0415\u0416\7B\2\2\u0416\u0417\5\u00aaV\2\u0417"+
		"\u0418\7C\2\2\u0418\u00a3\3\2\2\2\u0419\u041e\5\u00aaV\2\u041a\u041b\7"+
		"I\2\2\u041b\u041d\5\u00aaV\2\u041c\u041a\3\2\2\2\u041d\u0420\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u00a5\3\2\2\2\u0420\u041e\3\2"+
		"\2\2\u0421\u0422\5\u00d6l\2\u0422\u0424\7B\2\2\u0423\u0425\5\u00a4S\2"+
		"\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427"+
		"\7C\2\2\u0427\u0435\3\2\2\2\u0428\u0429\7\60\2\2\u0429\u042b\7B\2\2\u042a"+
		"\u042c\5\u00a4S\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042d\u0435\7C\2\2\u042e\u042f\7-\2\2\u042f\u0431\7B\2\2\u0430"+
		"\u0432\5\u00a4S\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0435\7C\2\2\u0434\u0421\3\2\2\2\u0434\u0428\3\2\2\2\u0434"+
		"\u042e\3\2\2\2\u0435\u00a7\3\2\2\2\u0436\u0437\7\4\2\2\u0437\u0438\7t"+
		"\2\2\u0438\u0439\7P\2\2\u0439\u00a9\3\2\2\2\u043a\u043b\bV\1\2\u043b\u045a"+
		"\5\u00b2Z\2\u043c\u045a\5\u00a6T\2\u043d\u043e\7$\2\2\u043e\u045a\5\u00b6"+
		"\\\2\u043f\u0440\7B\2\2\u0440\u0441\5\u00caf\2\u0441\u0442\7C\2\2\u0442"+
		"\u0443\5\u00aaV\27\u0443\u045a\3\2\2\2\u0444\u0445\t\5\2\2\u0445\u045a"+
		"\5\u00aaV\25\u0446\u0447\t\6\2\2\u0447\u045a\5\u00aaV\24\u0448\u045a\5"+
		"\u00acW\2\u0449\u044a\5\u00caf\2\u044a\u0450\7n\2\2\u044b\u044d\5\u00ce"+
		"h\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u0451\7t\2\2\u044f\u0451\7$\2\2\u0450\u044c\3\2\2\2\u0450\u044f\3\2\2"+
		"\2\u0451\u045a\3\2\2\2\u0452\u0453\5\u00b4[\2\u0453\u0455\7n\2\2\u0454"+
		"\u0456\5\u00ceh\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u0458\7$\2\2\u0458\u045a\3\2\2\2\u0459\u043a\3\2\2\2\u0459"+
		"\u043c\3\2\2\2\u0459\u043d\3\2\2\2\u0459\u043f\3\2\2\2\u0459\u0444\3\2"+
		"\2\2\u0459\u0446\3\2\2\2\u0459\u0448\3\2\2\2\u0459\u0449\3\2\2\2\u0459"+
		"\u0452\3\2\2\2\u045a\u04af\3\2\2\2\u045b\u045c\f\34\2\2\u045c\u045d\5"+
		"\u00a8U\2\u045d\u045e\5\u00aaV\35\u045e\u04ae\3\2\2\2\u045f\u0460\f\23"+
		"\2\2\u0460\u0461\t\7\2\2\u0461\u04ae\5\u00aaV\24\u0462\u0463\f\22\2\2"+
		"\u0463\u0464\t\b\2\2\u0464\u04ae\5\u00aaV\23\u0465\u046d\f\21\2\2\u0466"+
		"\u0467\7M\2\2\u0467\u046e\7M\2\2\u0468\u0469\7L\2\2\u0469\u046a\7L\2\2"+
		"\u046a\u046e\7L\2\2\u046b\u046c\7L\2\2\u046c\u046e\7L\2\2\u046d\u0466"+
		"\3\2\2\2\u046d\u0468\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u04ae\5\u00aaV\22\u0470\u0471\f\20\2\2\u0471\u0472\t\t\2\2\u0472\u04ae"+
		"\5\u00aaV\21\u0473\u0474\f\16\2\2\u0474\u0475\t\n\2\2\u0475\u04ae\5\u00aa"+
		"V\17\u0476\u0477\f\r\2\2\u0477\u0478\7^\2\2\u0478\u04ae\5\u00aaV\16\u0479"+
		"\u047a\f\f\2\2\u047a\u047b\7`\2\2\u047b\u04ae\5\u00aaV\r\u047c\u047d\f"+
		"\13\2\2\u047d\u047e\7_\2\2\u047e\u04ae\5\u00aaV\f\u047f\u0480\f\n\2\2"+
		"\u0480\u0481\7V\2\2\u0481\u04ae\5\u00aaV\13\u0482\u0483\f\t\2\2\u0483"+
		"\u0484\7W\2\2\u0484\u04ae\5\u00aaV\n\u0485\u0486\f\b\2\2\u0486\u0487\7"+
		"P\2\2\u0487\u0488\5\u00aaV\2\u0488\u0489\7Q\2\2\u0489\u048a\5\u00aaV\t"+
		"\u048a\u04ae\3\2\2\2\u048b\u048c\f\7\2\2\u048c\u048d\t\13\2\2\u048d\u04ae"+
		"\5\u00aaV\7\u048e\u048f\f\33\2\2\u048f\u049b\7J\2\2\u0490\u049c\5\u00d6"+
		"l\2\u0491\u049c\5\u00a6T\2\u0492\u049c\7\60\2\2\u0493\u0495\7$\2\2\u0494"+
		"\u0496\5\u00c6d\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u049c\5\u00ba^\2\u0498\u0499\7-\2\2\u0499\u049c\5\u00d0"+
		"i\2\u049a\u049c\5\u00c0a\2\u049b\u0490\3\2\2\2\u049b\u0491\3\2\2\2\u049b"+
		"\u0492\3\2\2\2\u049b\u0493\3\2\2\2\u049b\u0498\3\2\2\2\u049b\u049a\3\2"+
		"\2\2\u049c\u04ae\3\2\2\2\u049d\u049e\f\32\2\2\u049e\u049f\7F\2\2\u049f"+
		"\u04a0\5\u00aaV\2\u04a0\u04a1\7G\2\2\u04a1\u04ae\3\2\2\2\u04a2\u04a3\f"+
		"\26\2\2\u04a3\u04ae\t\f\2\2\u04a4\u04a5\f\17\2\2\u04a5\u04a6\7\37\2\2"+
		"\u04a6\u04ae\5\u00caf\2\u04a7\u04a8\f\5\2\2\u04a8\u04aa\7n\2\2\u04a9\u04ab"+
		"\5\u00ceh\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2"+
		"\2\u04ac\u04ae\7t\2\2\u04ad\u045b\3\2\2\2\u04ad\u045f\3\2\2\2\u04ad\u0462"+
		"\3\2\2\2\u04ad\u0465\3\2\2\2\u04ad\u0470\3\2\2\2\u04ad\u0473\3\2\2\2\u04ad"+
		"\u0476\3\2\2\2\u04ad\u0479\3\2\2\2\u04ad\u047c\3\2\2\2\u04ad\u047f\3\2"+
		"\2\2\u04ad\u0482\3\2\2\2\u04ad\u0485\3\2\2\2\u04ad\u048b\3\2\2\2\u04ad"+
		"\u048e\3\2\2\2\u04ad\u049d\3\2\2\2\u04ad\u04a2\3\2\2\2\u04ad\u04a4\3\2"+
		"\2\2\u04ad\u04a7\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u00ab\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\5\u00ae"+
		"X\2\u04b3\u04b4\7m\2\2\u04b4\u04b5\5\u00b0Y\2\u04b5\u00ad\3\2\2\2\u04b6"+
		"\u04c7\7t\2\2\u04b7\u04b9\7B\2\2\u04b8\u04ba\5X-\2\u04b9\u04b8\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04c7\7C\2\2\u04bc\u04bd"+
		"\7B\2\2\u04bd\u04c2\7t\2\2\u04be\u04bf\7I\2\2\u04bf\u04c1\7t\2\2\u04c0"+
		"\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2"+
		"\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c7\7C\2\2\u04c6"+
		"\u04b6\3\2\2\2\u04c6\u04b7\3\2\2\2\u04c6\u04bc\3\2\2\2\u04c7\u00af\3\2"+
		"\2\2\u04c8\u04cb\5\u00aaV\2\u04c9\u04cb\5\u0082B\2\u04ca\u04c8\3\2\2\2"+
		"\u04ca\u04c9\3\2\2\2\u04cb\u00b1\3\2\2\2\u04cc\u04cd\7B\2\2\u04cd\u04ce"+
		"\5\u00aaV\2\u04ce\u04cf\7C\2\2\u04cf\u04df\3\2\2\2\u04d0\u04df\7\60\2"+
		"\2\u04d1\u04df\7-\2\2\u04d2\u04df\5`\61\2\u04d3\u04df\5\u00d6l\2\u04d4"+
		"\u04d5\5.\30\2\u04d5\u04d6\7J\2\2\u04d6\u04d7\7\16\2\2\u04d7\u04df\3\2"+
		"\2\2\u04d8\u04dc\5\u00c6d\2\u04d9\u04dd\5\u00d2j\2\u04da\u04db\7\60\2"+
		"\2\u04db\u04dd\5\u00d4k\2\u04dc\u04d9\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd"+
		"\u04df\3\2\2\2\u04de\u04cc\3\2\2\2\u04de\u04d0\3\2\2\2\u04de\u04d1\3\2"+
		"\2\2\u04de\u04d2\3\2\2\2\u04de\u04d3\3\2\2\2\u04de\u04d4\3\2\2\2\u04de"+
		"\u04d8\3\2\2\2\u04df\u00b3\3\2\2\2\u04e0\u04e1\5P)\2\u04e1\u04e2\7J\2"+
		"\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e8"+
		"\3\2\2\2\u04e5\u04e7\5h\65\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8"+
		"\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04eb\u04ed\7t\2\2\u04ec\u04ee\5\u00ceh\2\u04ed\u04ec\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u00b5\3\2\2\2\u04ef\u04f0\5\u00c6d\2\u04f0\u04f1"+
		"\5\u00b8]\2\u04f1\u04f2\5\u00be`\2\u04f2\u04f9\3\2\2\2\u04f3\u04f6\5\u00b8"+
		"]\2\u04f4\u04f7\5\u00bc_\2\u04f5\u04f7\5\u00be`\2\u04f6\u04f4\3\2\2\2"+
		"\u04f6\u04f5\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04ef\3\2\2\2\u04f8\u04f3"+
		"\3\2\2\2\u04f9\u00b7\3\2\2\2\u04fa\u04fc\5\u00d6l\2\u04fb\u04fd\5\u00c2"+
		"b\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0505\3\2\2\2\u04fe"+
		"\u04ff\7J\2\2\u04ff\u0501\5\u00d6l\2\u0500\u0502\5\u00c2b\2\u0501\u0500"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503\u04fe\3\2\2\2\u0504"+
		"\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u050a\3\2"+
		"\2\2\u0507\u0505\3\2\2\2\u0508\u050a\5\u00ccg\2\u0509\u04fa\3\2\2\2\u0509"+
		"\u0508\3\2\2\2\u050a\u00b9\3\2\2\2\u050b\u050d\5\u00d6l\2\u050c\u050e"+
		"\5\u00c4c\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2\2"+
		"\2\u050f\u0510\5\u00be`\2\u0510\u00bb\3\2\2\2\u0511\u052d\7F\2\2\u0512"+
		"\u0517\7G\2\2\u0513\u0514\7F\2\2\u0514\u0516\7G\2\2\u0515\u0513\3\2\2"+
		"\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a"+
		"\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u052e\5N(\2\u051b\u051c\5\u00aaV\2"+
		"\u051c\u0523\7G\2\2\u051d\u051e\7F\2\2\u051e\u051f\5\u00aaV\2\u051f\u0520"+
		"\7G\2\2\u0520\u0522\3\2\2\2\u0521\u051d\3\2\2\2\u0522\u0525\3\2\2\2\u0523"+
		"\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u052a\3\2\2\2\u0525\u0523\3\2"+
		"\2\2\u0526\u0527\7F\2\2\u0527\u0529\7G\2\2\u0528\u0526\3\2\2\2\u0529\u052c"+
		"\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052e\3\2\2\2\u052c"+
		"\u052a\3\2\2\2\u052d\u0512\3\2\2\2\u052d\u051b\3\2\2\2\u052e\u00bd\3\2"+
		"\2\2\u052f\u0531\5\u00d4k\2\u0530\u0532\5\"\22\2\u0531\u0530\3\2\2\2\u0531"+
		"\u0532\3\2\2\2\u0532\u00bf\3\2\2\2\u0533\u0534\5\u00c6d\2\u0534\u0535"+
		"\5\u00d2j\2\u0535\u00c1\3\2\2\2\u0536\u0537\7M\2\2\u0537\u053a\7L\2\2"+
		"\u0538\u053a\5\u00ceh\2\u0539\u0536\3\2\2\2\u0539\u0538\3\2\2\2\u053a"+
		"\u00c3\3\2\2\2\u053b\u053c\7M\2\2\u053c\u053f\7L\2\2\u053d\u053f\5\u00c6"+
		"d\2\u053e\u053b\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u00c5\3\2\2\2\u0540"+
		"\u0541\7M\2\2\u0541\u0542\5\u00c8e\2\u0542\u0543\7L\2\2\u0543\u00c7\3"+
		"\2\2\2\u0544\u0549\5\u00caf\2\u0545\u0546\7I\2\2\u0546\u0548\5\u00caf"+
		"\2\u0547\u0545\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a"+
		"\3\2\2\2\u054a\u00c9\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054e\5h\65\2\u054d"+
		"\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u0552\5P"+
		")\2\u0550\u0552\5\u00ccg\2\u0551\u054f\3\2\2\2\u0551\u0550\3\2\2\2\u0552"+
		"\u0557\3\2\2\2\u0553\u0554\7F\2\2\u0554\u0556\7G\2\2\u0555\u0553\3\2\2"+
		"\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u00cb"+
		"\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055b\t\r\2\2\u055b\u00cd\3\2\2\2\u055c"+
		"\u055d\7M\2\2\u055d\u0562\5R*\2\u055e\u055f\7I\2\2\u055f\u0561\5R*\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0566\7L\2\2\u0566"+
		"\u00cf\3\2\2\2\u0567\u056e\5\u00d4k\2\u0568\u0569\7J\2\2\u0569\u056b\7"+
		"t\2\2\u056a\u056c\5\u00d4k\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u056e\3\2\2\2\u056d\u0567\3\2\2\2\u056d\u0568\3\2\2\2\u056e\u00d1\3\2"+
		"\2\2\u056f\u0570\7-\2\2\u0570\u0574\5\u00d0i\2\u0571\u0572\7t\2\2\u0572"+
		"\u0574\5\u00d4k\2\u0573\u056f\3\2\2\2\u0573\u0571\3\2\2\2\u0574\u00d3"+
		"\3\2\2\2\u0575\u0577\7B\2\2\u0576\u0578\5\u00a4S\2\u0577\u0576\3\2\2\2"+
		"\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\7C\2\2\u057a\u00d5"+
		"\3\2\2\2\u057b\u057c\t\16\2\2\u057c\u00d7\3\2\2\2\u00ad\u00d9\u00de\u00e4"+
		"\u00ec\u00f5\u00fa\u0101\u0108\u010b\u0112\u011c\u0120\u0125\u0129\u012d"+
		"\u0137\u013f\u0145\u014c\u0153\u0157\u015a\u015d\u0166\u016c\u0171\u0174"+
		"\u017a\u0180\u0184\u018c\u0195\u019c\u01a2\u01a6\u01b1\u01ba\u01bf\u01c5"+
		"\u01c9\u01d5\u01e0\u01e5\u01ee\u01f6\u0200\u0209\u0211\u0216\u021e\u0223"+
		"\u022d\u0237\u023d\u0244\u0249\u0251\u0255\u0257\u025d\u0262\u0266\u026d"+
		"\u026f\u0276\u027b\u0284\u0289\u028c\u0291\u029a\u02a6\u02b0\u02bf\u02c2"+
		"\u02c9\u02d3\u02db\u02de\u02e1\u02ee\u02f6\u02fb\u0303\u0307\u030b\u030f"+
		"\u0311\u0315\u031b\u0326\u0330\u0335\u033e\u0343\u0346\u034d\u0356\u036d"+
		"\u0370\u0373\u037b\u037f\u0387\u038d\u0398\u03a1\u03a6\u03b0\u03b7\u03c4"+
		"\u03cd\u03d6\u03dc\u03e7\u03ec\u03f1\u03f6\u03fa\u03fe\u0402\u0404\u0408"+
		"\u040d\u041e\u0424\u042b\u0431\u0434\u044c\u0450\u0455\u0459\u046d\u0495"+
		"\u049b\u04aa\u04ad\u04af\u04b9\u04c2\u04c6\u04ca\u04dc\u04de\u04e3\u04e8"+
		"\u04ed\u04f6\u04f8\u04fc\u0501\u0505\u0509\u050d\u0517\u0523\u052a\u052d"+
		"\u0531\u0539\u053e\u0549\u054d\u0551\u0557\u0562\u056b\u056d\u0573\u0577";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}