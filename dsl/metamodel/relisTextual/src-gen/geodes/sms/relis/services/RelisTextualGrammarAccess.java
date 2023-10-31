/*
 * generated by Xtext 2.32.0
 */
package geodes.sms.relis.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RelisTextualGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RelisRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.RelisRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRelisRootAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRelisClassificationStatisticKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cVariableAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cVariableVariableParserRuleCall_4_0_0 = (RuleCall)cVariableAssignment_4_0.eContents().get(0);
		private final Assignment cVariableAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cVariableVariableParserRuleCall_4_1_0 = (RuleCall)cVariableAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RelisRoot returns RelisRoot:
		//    {RelisRoot}
		//    'RelisClassificationStatistic'
		//    name=EString
		//    '{'
		//        (variable+=Variable ( variable+=Variable)* )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{RelisRoot}
		//'RelisClassificationStatistic'
		//name=EString
		//'{'
		//    (variable+=Variable ( variable+=Variable)* )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{RelisRoot}
		public Action getRelisRootAction_0() { return cRelisRootAction_0; }
		
		//'RelisClassificationStatistic'
		public Keyword getRelisClassificationStatisticKeyword_1() { return cRelisClassificationStatisticKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//(variable+=Variable ( variable+=Variable)* )?
		public Group getGroup_4() { return cGroup_4; }
		
		//variable+=Variable
		public Assignment getVariableAssignment_4_0() { return cVariableAssignment_4_0; }
		
		//Variable
		public RuleCall getVariableVariableParserRuleCall_4_0_0() { return cVariableVariableParserRuleCall_4_0_0; }
		
		//( variable+=Variable)*
		public Assignment getVariableAssignment_4_1() { return cVariableAssignment_4_1; }
		
		//Variable
		public RuleCall getVariableVariableParserRuleCall_4_1_0() { return cVariableVariableParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StatisticElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Statistic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDescriptiveParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComparativeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEvolutionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Statistic returns Statistic:
		//    Descriptive | Comparative | Evolution;
		@Override public ParserRule getRule() { return rule; }
		
		//Descriptive | Comparative | Evolution
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Descriptive
		public RuleCall getDescriptiveParserRuleCall_0() { return cDescriptiveParserRuleCall_0; }
		
		//Comparative
		public RuleCall getComparativeParserRuleCall_1() { return cComparativeParserRuleCall_1; }
		
		//Evolution
		public RuleCall getEvolutionParserRuleCall_2() { return cEvolutionParserRuleCall_2; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVariableKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cStatisticAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cStatisticStatisticParserRuleCall_5_0_0 = (RuleCall)cStatisticAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cStatisticAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cStatisticStatisticParserRuleCall_5_1_1_0 = (RuleCall)cStatisticAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Variable returns Variable:
		//    {Variable}
		//    'Variable'
		//    name=EString
		//    type=Type
		//    '{'
		//         (statistic+=Statistic ( ";" statistic+=Statistic)*)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Variable}
		//'Variable'
		//name=EString
		//type=Type
		//'{'
		//     (statistic+=Statistic ( ";" statistic+=Statistic)*)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }
		
		//'Variable'
		public Keyword getVariableKeyword_1() { return cVariableKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//Type
		public RuleCall getTypeTypeEnumRuleCall_3_0() { return cTypeTypeEnumRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//(statistic+=Statistic ( ";" statistic+=Statistic)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//statistic+=Statistic
		public Assignment getStatisticAssignment_5_0() { return cStatisticAssignment_5_0; }
		
		//Statistic
		public RuleCall getStatisticStatisticParserRuleCall_5_0_0() { return cStatisticStatisticParserRuleCall_5_0_0; }
		
		//( ";" statistic+=Statistic)*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//";"
		public Keyword getSemicolonKeyword_5_1_0() { return cSemicolonKeyword_5_1_0; }
		
		//statistic+=Statistic
		public Assignment getStatisticAssignment_5_1_1() { return cStatisticAssignment_5_1_1; }
		
		//Statistic
		public RuleCall getStatisticStatisticParserRuleCall_5_1_1_0() { return cStatisticStatisticParserRuleCall_5_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class DescriptiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Descriptive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDescriptiveAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDescriptiveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cStatsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cStatsDescStatsEnumRuleCall_3_0_0 = (RuleCall)cStatsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cStatsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cStatsDescStatsEnumRuleCall_3_1_1_0 = (RuleCall)cStatsAssignment_3_1_1.eContents().get(0);
		
		//Descriptive returns Descriptive:
		//    {Descriptive}
		//    'Descriptive' ':' (stats+=DescStats ( "," stats+=DescStats)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Descriptive}
		//'Descriptive' ':' (stats+=DescStats ( "," stats+=DescStats)*)?
		public Group getGroup() { return cGroup; }
		
		//{Descriptive}
		public Action getDescriptiveAction_0() { return cDescriptiveAction_0; }
		
		//'Descriptive'
		public Keyword getDescriptiveKeyword_1() { return cDescriptiveKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(stats+=DescStats ( "," stats+=DescStats)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//stats+=DescStats
		public Assignment getStatsAssignment_3_0() { return cStatsAssignment_3_0; }
		
		//DescStats
		public RuleCall getStatsDescStatsEnumRuleCall_3_0_0() { return cStatsDescStatsEnumRuleCall_3_0_0; }
		
		//( "," stats+=DescStats)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//stats+=DescStats
		public Assignment getStatsAssignment_3_1_1() { return cStatsAssignment_3_1_1; }
		
		//DescStats
		public RuleCall getStatsDescStatsEnumRuleCall_3_1_1_0() { return cStatsDescStatsEnumRuleCall_3_1_1_0; }
	}
	public class ComparativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Comparative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComparativeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComparativeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cStatsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cStatsCompStatsEnumRuleCall_3_0_0 = (RuleCall)cStatsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cStatsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cStatsCompStatsEnumRuleCall_3_1_1_0 = (RuleCall)cStatsAssignment_3_1_1.eContents().get(0);
		
		//Comparative returns Comparative:
		//    {Comparative}
		//    'Comparative' ':' (stats+=CompStats ( "," stats+=CompStats)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Comparative}
		//'Comparative' ':' (stats+=CompStats ( "," stats+=CompStats)*)?
		public Group getGroup() { return cGroup; }
		
		//{Comparative}
		public Action getComparativeAction_0() { return cComparativeAction_0; }
		
		//'Comparative'
		public Keyword getComparativeKeyword_1() { return cComparativeKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(stats+=CompStats ( "," stats+=CompStats)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//stats+=CompStats
		public Assignment getStatsAssignment_3_0() { return cStatsAssignment_3_0; }
		
		//CompStats
		public RuleCall getStatsCompStatsEnumRuleCall_3_0_0() { return cStatsCompStatsEnumRuleCall_3_0_0; }
		
		//( "," stats+=CompStats)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//stats+=CompStats
		public Assignment getStatsAssignment_3_1_1() { return cStatsAssignment_3_1_1; }
		
		//CompStats
		public RuleCall getStatsCompStatsEnumRuleCall_3_1_1_0() { return cStatsCompStatsEnumRuleCall_3_1_1_0; }
	}
	public class EvolutionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Evolution");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEvolutionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEvolutionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cStatsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cStatsEvoStatsEnumRuleCall_3_0_0 = (RuleCall)cStatsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cStatsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cStatsEvoStatsEnumRuleCall_3_1_1_0 = (RuleCall)cStatsAssignment_3_1_1.eContents().get(0);
		
		//Evolution returns Evolution:
		//    {Evolution}
		//    'Evolution' ':' (stats+=EvoStats ( "," stats+=EvoStats)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Evolution}
		//'Evolution' ':' (stats+=EvoStats ( "," stats+=EvoStats)*)?
		public Group getGroup() { return cGroup; }
		
		//{Evolution}
		public Action getEvolutionAction_0() { return cEvolutionAction_0; }
		
		//'Evolution'
		public Keyword getEvolutionKeyword_1() { return cEvolutionKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(stats+=EvoStats ( "," stats+=EvoStats)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//stats+=EvoStats
		public Assignment getStatsAssignment_3_0() { return cStatsAssignment_3_0; }
		
		//EvoStats
		public RuleCall getStatsEvoStatsEnumRuleCall_3_0_0() { return cStatsEvoStatsEnumRuleCall_3_0_0; }
		
		//( "," stats+=EvoStats)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//stats+=EvoStats
		public Assignment getStatsAssignment_3_1_1() { return cStatsAssignment_3_1_1; }
		
		//EvoStats
		public RuleCall getStatsEvoStatsEnumRuleCall_3_1_1_0() { return cStatsEvoStatsEnumRuleCall_3_1_1_0; }
	}
	
	public class TypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cContinuousEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cContinuousContinuousKeyword_0_0 = (Keyword)cContinuousEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNominalEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNominalNominalKeyword_1_0 = (Keyword)cNominalEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cComparativeEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cComparativeComparativeKeyword_2_0 = (Keyword)cComparativeEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Type returns Type:
		//                Continuous = 'Continuous' | Nominal = 'Nominal' | Comparative = 'Comparative';
		public EnumRule getRule() { return rule; }
		
		//Continuous = 'Continuous' | Nominal = 'Nominal' | Comparative = 'Comparative'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Continuous = 'Continuous'
		public EnumLiteralDeclaration getContinuousEnumLiteralDeclaration_0() { return cContinuousEnumLiteralDeclaration_0; }
		
		//'Continuous'
		public Keyword getContinuousContinuousKeyword_0_0() { return cContinuousContinuousKeyword_0_0; }
		
		//Nominal = 'Nominal'
		public EnumLiteralDeclaration getNominalEnumLiteralDeclaration_1() { return cNominalEnumLiteralDeclaration_1; }
		
		//'Nominal'
		public Keyword getNominalNominalKeyword_1_0() { return cNominalNominalKeyword_1_0; }
		
		//Comparative = 'Comparative'
		public EnumLiteralDeclaration getComparativeEnumLiteralDeclaration_2() { return cComparativeEnumLiteralDeclaration_2; }
		
		//'Comparative'
		public Keyword getComparativeComparativeKeyword_2_0() { return cComparativeComparativeKeyword_2_0; }
	}
	public class DescStatsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.DescStats");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFrequency_tablesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFrequency_tablesFrequency_tablesKeyword_0_0 = (Keyword)cFrequency_tablesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBar_plotsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBar_plotsBar_plotsKeyword_1_0 = (Keyword)cBar_plotsEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStatisticsEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStatisticsStatisticsKeyword_2_0 = (Keyword)cStatisticsEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBox_plotsEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBox_plotsBox_plotsKeyword_3_0 = (Keyword)cBox_plotsEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cViolin_plotsEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cViolin_plotsViolin_plotsKeyword_4_0 = (Keyword)cViolin_plotsEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum DescStats returns DescStats:
		//                Frequency_tables = 'Frequency_tables' | Bar_plots = 'Bar_plots' | Statistics = 'Statistics' | Box_plots = 'Box_plots' | Violin_plots = 'Violin_plots';
		public EnumRule getRule() { return rule; }
		
		//Frequency_tables = 'Frequency_tables' | Bar_plots = 'Bar_plots' | Statistics = 'Statistics' | Box_plots = 'Box_plots' | Violin_plots = 'Violin_plots'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Frequency_tables = 'Frequency_tables'
		public EnumLiteralDeclaration getFrequency_tablesEnumLiteralDeclaration_0() { return cFrequency_tablesEnumLiteralDeclaration_0; }
		
		//'Frequency_tables'
		public Keyword getFrequency_tablesFrequency_tablesKeyword_0_0() { return cFrequency_tablesFrequency_tablesKeyword_0_0; }
		
		//Bar_plots = 'Bar_plots'
		public EnumLiteralDeclaration getBar_plotsEnumLiteralDeclaration_1() { return cBar_plotsEnumLiteralDeclaration_1; }
		
		//'Bar_plots'
		public Keyword getBar_plotsBar_plotsKeyword_1_0() { return cBar_plotsBar_plotsKeyword_1_0; }
		
		//Statistics = 'Statistics'
		public EnumLiteralDeclaration getStatisticsEnumLiteralDeclaration_2() { return cStatisticsEnumLiteralDeclaration_2; }
		
		//'Statistics'
		public Keyword getStatisticsStatisticsKeyword_2_0() { return cStatisticsStatisticsKeyword_2_0; }
		
		//Box_plots = 'Box_plots'
		public EnumLiteralDeclaration getBox_plotsEnumLiteralDeclaration_3() { return cBox_plotsEnumLiteralDeclaration_3; }
		
		//'Box_plots'
		public Keyword getBox_plotsBox_plotsKeyword_3_0() { return cBox_plotsBox_plotsKeyword_3_0; }
		
		//Violin_plots = 'Violin_plots'
		public EnumLiteralDeclaration getViolin_plotsEnumLiteralDeclaration_4() { return cViolin_plotsEnumLiteralDeclaration_4; }
		
		//'Violin_plots'
		public Keyword getViolin_plotsViolin_plotsKeyword_4_0() { return cViolin_plotsViolin_plotsKeyword_4_0; }
	}
	public class CompStatsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.CompStats");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFrequency_tablesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFrequency_tablesFrequency_tablesKeyword_0_0 = (Keyword)cFrequency_tablesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cStacked_bar_plotsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cStacked_bar_plotsStacked_bar_plotsKeyword_1_0 = (Keyword)cStacked_bar_plotsEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGrouped_bar_plotsEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGrouped_bar_plotsGrouped_bar_plotsKeyword_2_0 = (Keyword)cGrouped_bar_plotsEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBubble_chartsEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBubble_chartsBubble_chartsKeyword_3_0 = (Keyword)cBubble_chartsEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cFisher_exact_testEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cFisher_exact_testFisher_exact_testKeyword_4_0 = (Keyword)cFisher_exact_testEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cShapiro_Wilk_correlation_testEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cShapiro_Wilk_correlation_testShapiro_Wilk_correlation_testKeyword_5_0 = (Keyword)cShapiro_Wilk_correlation_testEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cPearson_correlation_testEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cPearson_correlation_testPearson_correlation_testKeyword_6_0 = (Keyword)cPearson_correlation_testEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cSpearman_correlation_testEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cSpearman_correlation_testSpearman_correlation_testKeyword_7_0 = (Keyword)cSpearman_correlation_testEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum CompStats returns CompStats:
		//                Frequency_tables = 'Frequency_tables' | Stacked_bar_plots = 'Stacked_bar_plots' | Grouped_bar_plots = 'Grouped_bar_plots' | Bubble_charts = 'Bubble_charts' | Fisher_exact_test = 'Fisher_exact_test' | Shapiro_Wilk_correlation_test = 'Shapiro_Wilk_correlation_test' | Pearson_correlation_test = 'Pearson_correlation_test' | Spearman_correlation_test = 'Spearman_correlation_test';
		public EnumRule getRule() { return rule; }
		
		//Frequency_tables = 'Frequency_tables' | Stacked_bar_plots = 'Stacked_bar_plots' | Grouped_bar_plots = 'Grouped_bar_plots' | Bubble_charts = 'Bubble_charts' | Fisher_exact_test = 'Fisher_exact_test' | Shapiro_Wilk_correlation_test = 'Shapiro_Wilk_correlation_test' | Pearson_correlation_test = 'Pearson_correlation_test' | Spearman_correlation_test = 'Spearman_correlation_test'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Frequency_tables = 'Frequency_tables'
		public EnumLiteralDeclaration getFrequency_tablesEnumLiteralDeclaration_0() { return cFrequency_tablesEnumLiteralDeclaration_0; }
		
		//'Frequency_tables'
		public Keyword getFrequency_tablesFrequency_tablesKeyword_0_0() { return cFrequency_tablesFrequency_tablesKeyword_0_0; }
		
		//Stacked_bar_plots = 'Stacked_bar_plots'
		public EnumLiteralDeclaration getStacked_bar_plotsEnumLiteralDeclaration_1() { return cStacked_bar_plotsEnumLiteralDeclaration_1; }
		
		//'Stacked_bar_plots'
		public Keyword getStacked_bar_plotsStacked_bar_plotsKeyword_1_0() { return cStacked_bar_plotsStacked_bar_plotsKeyword_1_0; }
		
		//Grouped_bar_plots = 'Grouped_bar_plots'
		public EnumLiteralDeclaration getGrouped_bar_plotsEnumLiteralDeclaration_2() { return cGrouped_bar_plotsEnumLiteralDeclaration_2; }
		
		//'Grouped_bar_plots'
		public Keyword getGrouped_bar_plotsGrouped_bar_plotsKeyword_2_0() { return cGrouped_bar_plotsGrouped_bar_plotsKeyword_2_0; }
		
		//Bubble_charts = 'Bubble_charts'
		public EnumLiteralDeclaration getBubble_chartsEnumLiteralDeclaration_3() { return cBubble_chartsEnumLiteralDeclaration_3; }
		
		//'Bubble_charts'
		public Keyword getBubble_chartsBubble_chartsKeyword_3_0() { return cBubble_chartsBubble_chartsKeyword_3_0; }
		
		//Fisher_exact_test = 'Fisher_exact_test'
		public EnumLiteralDeclaration getFisher_exact_testEnumLiteralDeclaration_4() { return cFisher_exact_testEnumLiteralDeclaration_4; }
		
		//'Fisher_exact_test'
		public Keyword getFisher_exact_testFisher_exact_testKeyword_4_0() { return cFisher_exact_testFisher_exact_testKeyword_4_0; }
		
		//Shapiro_Wilk_correlation_test = 'Shapiro_Wilk_correlation_test'
		public EnumLiteralDeclaration getShapiro_Wilk_correlation_testEnumLiteralDeclaration_5() { return cShapiro_Wilk_correlation_testEnumLiteralDeclaration_5; }
		
		//'Shapiro_Wilk_correlation_test'
		public Keyword getShapiro_Wilk_correlation_testShapiro_Wilk_correlation_testKeyword_5_0() { return cShapiro_Wilk_correlation_testShapiro_Wilk_correlation_testKeyword_5_0; }
		
		//Pearson_correlation_test = 'Pearson_correlation_test'
		public EnumLiteralDeclaration getPearson_correlation_testEnumLiteralDeclaration_6() { return cPearson_correlation_testEnumLiteralDeclaration_6; }
		
		//'Pearson_correlation_test'
		public Keyword getPearson_correlation_testPearson_correlation_testKeyword_6_0() { return cPearson_correlation_testPearson_correlation_testKeyword_6_0; }
		
		//Spearman_correlation_test = 'Spearman_correlation_test'
		public EnumLiteralDeclaration getSpearman_correlation_testEnumLiteralDeclaration_7() { return cSpearman_correlation_testEnumLiteralDeclaration_7; }
		
		//'Spearman_correlation_test'
		public Keyword getSpearman_correlation_testSpearman_correlation_testKeyword_7_0() { return cSpearman_correlation_testSpearman_correlation_testKeyword_7_0; }
	}
	public class EvoStatsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "geodes.sms.relis.RelisTextual.EvoStats");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFrequency_tablesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFrequency_tablesFrequency_tablesKeyword_0_0 = (Keyword)cFrequency_tablesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEvolution_plotsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEvolution_plotsEvolution_plotsKeyword_1_0 = (Keyword)cEvolution_plotsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum EvoStats returns EvoStats:
		//                Frequency_tables = 'Frequency_tables' | Evolution_plots = 'Evolution_plots';
		public EnumRule getRule() { return rule; }
		
		//Frequency_tables = 'Frequency_tables' | Evolution_plots = 'Evolution_plots'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Frequency_tables = 'Frequency_tables'
		public EnumLiteralDeclaration getFrequency_tablesEnumLiteralDeclaration_0() { return cFrequency_tablesEnumLiteralDeclaration_0; }
		
		//'Frequency_tables'
		public Keyword getFrequency_tablesFrequency_tablesKeyword_0_0() { return cFrequency_tablesFrequency_tablesKeyword_0_0; }
		
		//Evolution_plots = 'Evolution_plots'
		public EnumLiteralDeclaration getEvolution_plotsEnumLiteralDeclaration_1() { return cEvolution_plotsEnumLiteralDeclaration_1; }
		
		//'Evolution_plots'
		public Keyword getEvolution_plotsEvolution_plotsKeyword_1_0() { return cEvolution_plotsEvolution_plotsKeyword_1_0; }
	}
	
	private final RelisRootElements pRelisRoot;
	private final StatisticElements pStatistic;
	private final VariableElements pVariable;
	private final EStringElements pEString;
	private final TypeElements eType;
	private final DescriptiveElements pDescriptive;
	private final ComparativeElements pComparative;
	private final EvolutionElements pEvolution;
	private final DescStatsElements eDescStats;
	private final CompStatsElements eCompStats;
	private final EvoStatsElements eEvoStats;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RelisTextualGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRelisRoot = new RelisRootElements();
		this.pStatistic = new StatisticElements();
		this.pVariable = new VariableElements();
		this.pEString = new EStringElements();
		this.eType = new TypeElements();
		this.pDescriptive = new DescriptiveElements();
		this.pComparative = new ComparativeElements();
		this.pEvolution = new EvolutionElements();
		this.eDescStats = new DescStatsElements();
		this.eCompStats = new CompStatsElements();
		this.eEvoStats = new EvoStatsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("geodes.sms.relis.RelisTextual".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RelisRoot returns RelisRoot:
	//    {RelisRoot}
	//    'RelisClassificationStatistic'
	//    name=EString
	//    '{'
	//        (variable+=Variable ( variable+=Variable)* )?
	//    '}';
	public RelisRootElements getRelisRootAccess() {
		return pRelisRoot;
	}
	
	public ParserRule getRelisRootRule() {
		return getRelisRootAccess().getRule();
	}
	
	//Statistic returns Statistic:
	//    Descriptive | Comparative | Evolution;
	public StatisticElements getStatisticAccess() {
		return pStatistic;
	}
	
	public ParserRule getStatisticRule() {
		return getStatisticAccess().getRule();
	}
	
	//Variable returns Variable:
	//    {Variable}
	//    'Variable'
	//    name=EString
	//    type=Type
	//    '{'
	//         (statistic+=Statistic ( ";" statistic+=Statistic)*)?
	//    '}';
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//enum Type returns Type:
	//                Continuous = 'Continuous' | Nominal = 'Nominal' | Comparative = 'Comparative';
	public TypeElements getTypeAccess() {
		return eType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Descriptive returns Descriptive:
	//    {Descriptive}
	//    'Descriptive' ':' (stats+=DescStats ( "," stats+=DescStats)*)?;
	public DescriptiveElements getDescriptiveAccess() {
		return pDescriptive;
	}
	
	public ParserRule getDescriptiveRule() {
		return getDescriptiveAccess().getRule();
	}
	
	//Comparative returns Comparative:
	//    {Comparative}
	//    'Comparative' ':' (stats+=CompStats ( "," stats+=CompStats)*)?;
	public ComparativeElements getComparativeAccess() {
		return pComparative;
	}
	
	public ParserRule getComparativeRule() {
		return getComparativeAccess().getRule();
	}
	
	//Evolution returns Evolution:
	//    {Evolution}
	//    'Evolution' ':' (stats+=EvoStats ( "," stats+=EvoStats)*)?;
	public EvolutionElements getEvolutionAccess() {
		return pEvolution;
	}
	
	public ParserRule getEvolutionRule() {
		return getEvolutionAccess().getRule();
	}
	
	//enum DescStats returns DescStats:
	//                Frequency_tables = 'Frequency_tables' | Bar_plots = 'Bar_plots' | Statistics = 'Statistics' | Box_plots = 'Box_plots' | Violin_plots = 'Violin_plots';
	public DescStatsElements getDescStatsAccess() {
		return eDescStats;
	}
	
	public EnumRule getDescStatsRule() {
		return getDescStatsAccess().getRule();
	}
	
	//enum CompStats returns CompStats:
	//                Frequency_tables = 'Frequency_tables' | Stacked_bar_plots = 'Stacked_bar_plots' | Grouped_bar_plots = 'Grouped_bar_plots' | Bubble_charts = 'Bubble_charts' | Fisher_exact_test = 'Fisher_exact_test' | Shapiro_Wilk_correlation_test = 'Shapiro_Wilk_correlation_test' | Pearson_correlation_test = 'Pearson_correlation_test' | Spearman_correlation_test = 'Spearman_correlation_test';
	public CompStatsElements getCompStatsAccess() {
		return eCompStats;
	}
	
	public EnumRule getCompStatsRule() {
		return getCompStatsAccess().getRule();
	}
	
	//enum EvoStats returns EvoStats:
	//                Frequency_tables = 'Frequency_tables' | Evolution_plots = 'Evolution_plots';
	public EvoStatsElements getEvoStatsAccess() {
		return eEvoStats;
	}
	
	public EnumRule getEvoStatsRule() {
		return getEvoStatsAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}