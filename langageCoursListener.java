// Generated from langageCours.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langageCoursParser}.
 */
public interface langageCoursListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langageCoursParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_type(langageCoursParser.Boolean_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link langageCoursParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_type(langageCoursParser.Boolean_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link langageCoursParser#integer_number}.
	 * @param ctx the parse tree
	 */
	void enterInteger_number(langageCoursParser.Integer_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link langageCoursParser#integer_number}.
	 * @param ctx the parse tree
	 */
	void exitInteger_number(langageCoursParser.Integer_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link langageCoursParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(langageCoursParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link langageCoursParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(langageCoursParser.AffectationContext ctx);
}