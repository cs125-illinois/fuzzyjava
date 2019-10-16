// Generated from /Users/arjunvnair/IdeaProjects/fuzzyjava/src/main/antlr/edu/illinois/cs/cs125/fuzzyjava/antlr/fuzzyjava/FuzzyJavaParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuzzyJavaParser}.
 */
public interface FuzzyJavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(FuzzyJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(FuzzyJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(FuzzyJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(FuzzyJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(FuzzyJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(FuzzyJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(FuzzyJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(FuzzyJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(FuzzyJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(FuzzyJavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(FuzzyJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(FuzzyJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(FuzzyJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(FuzzyJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(FuzzyJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(FuzzyJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(FuzzyJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(FuzzyJavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(FuzzyJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(FuzzyJavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(FuzzyJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(FuzzyJavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(FuzzyJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(FuzzyJavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(FuzzyJavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(FuzzyJavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(FuzzyJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(FuzzyJavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(FuzzyJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(FuzzyJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(FuzzyJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(FuzzyJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(FuzzyJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(FuzzyJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(FuzzyJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(FuzzyJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(FuzzyJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(FuzzyJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(FuzzyJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(FuzzyJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(FuzzyJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(FuzzyJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(FuzzyJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(FuzzyJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(FuzzyJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(FuzzyJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(FuzzyJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(FuzzyJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(FuzzyJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(FuzzyJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(FuzzyJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(FuzzyJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(FuzzyJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(FuzzyJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(FuzzyJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(FuzzyJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(FuzzyJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(FuzzyJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(FuzzyJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(FuzzyJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(FuzzyJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(FuzzyJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(FuzzyJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(FuzzyJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(FuzzyJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(FuzzyJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(FuzzyJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(FuzzyJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(FuzzyJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(FuzzyJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(FuzzyJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(FuzzyJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(FuzzyJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(FuzzyJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(FuzzyJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(FuzzyJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(FuzzyJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(FuzzyJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(FuzzyJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(FuzzyJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(FuzzyJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(FuzzyJavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(FuzzyJavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(FuzzyJavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(FuzzyJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(FuzzyJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(FuzzyJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(FuzzyJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FuzzyJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FuzzyJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(FuzzyJavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(FuzzyJavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FuzzyJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FuzzyJavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FuzzyJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FuzzyJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(FuzzyJavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(FuzzyJavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(FuzzyJavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(FuzzyJavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#fuzzyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFuzzyLiteral(FuzzyJavaParser.FuzzyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#fuzzyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFuzzyLiteral(FuzzyJavaParser.FuzzyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(FuzzyJavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(FuzzyJavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(FuzzyJavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(FuzzyJavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(FuzzyJavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(FuzzyJavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(FuzzyJavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(FuzzyJavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(FuzzyJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(FuzzyJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(FuzzyJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(FuzzyJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(FuzzyJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(FuzzyJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(FuzzyJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(FuzzyJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(FuzzyJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(FuzzyJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(FuzzyJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(FuzzyJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(FuzzyJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(FuzzyJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(FuzzyJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(FuzzyJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(FuzzyJavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(FuzzyJavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FuzzyJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FuzzyJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(FuzzyJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(FuzzyJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(FuzzyJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(FuzzyJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(FuzzyJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(FuzzyJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FuzzyJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FuzzyJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(FuzzyJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(FuzzyJavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(FuzzyJavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(FuzzyJavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(FuzzyJavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(FuzzyJavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(FuzzyJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(FuzzyJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(FuzzyJavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(FuzzyJavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(FuzzyJavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(FuzzyJavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(FuzzyJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(FuzzyJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(FuzzyJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(FuzzyJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(FuzzyJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(FuzzyJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(FuzzyJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(FuzzyJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(FuzzyJavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(FuzzyJavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(FuzzyJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(FuzzyJavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FuzzyJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FuzzyJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(FuzzyJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(FuzzyJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#fuzzyComparison}.
	 * @param ctx the parse tree
	 */
	void enterFuzzyComparison(FuzzyJavaParser.FuzzyComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#fuzzyComparison}.
	 * @param ctx the parse tree
	 */
	void exitFuzzyComparison(FuzzyJavaParser.FuzzyComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FuzzyJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FuzzyJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(FuzzyJavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(FuzzyJavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(FuzzyJavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(FuzzyJavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(FuzzyJavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(FuzzyJavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FuzzyJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FuzzyJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(FuzzyJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(FuzzyJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(FuzzyJavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(FuzzyJavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(FuzzyJavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(FuzzyJavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(FuzzyJavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(FuzzyJavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(FuzzyJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(FuzzyJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(FuzzyJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(FuzzyJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(FuzzyJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(FuzzyJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(FuzzyJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(FuzzyJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(FuzzyJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(FuzzyJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(FuzzyJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(FuzzyJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FuzzyJavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FuzzyJavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(FuzzyJavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(FuzzyJavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(FuzzyJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(FuzzyJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(FuzzyJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(FuzzyJavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(FuzzyJavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(FuzzyJavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(FuzzyJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(FuzzyJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FuzzyJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FuzzyJavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FuzzyJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FuzzyJavaParser.IdentifierContext ctx);
}