/*
 * generated by Xtext 2.32.0
 */
package geodes.sms.relis.serializer;

import Relis.Comparative;
import Relis.Descriptive;
import Relis.Evolution;
import Relis.RelisPackage;
import Relis.RelisRoot;
import Relis.Variable;
import com.google.inject.Inject;
import geodes.sms.relis.services.RelisTextualGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class RelisTextualSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RelisTextualGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RelisPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RelisPackage.COMPARATIVE:
				sequence_Comparative(context, (Comparative) semanticObject); 
				return; 
			case RelisPackage.DESCRIPTIVE:
				sequence_Descriptive(context, (Descriptive) semanticObject); 
				return; 
			case RelisPackage.EVOLUTION:
				sequence_Evolution(context, (Evolution) semanticObject); 
				return; 
			case RelisPackage.RELIS_ROOT:
				sequence_RelisRoot(context, (RelisRoot) semanticObject); 
				return; 
			case RelisPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statistic returns Comparative
	 *     Comparative returns Comparative
	 *
	 * Constraint:
	 *     (name=EString type=Type?)
	 * </pre>
	 */
	protected void sequence_Comparative(ISerializationContext context, Comparative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statistic returns Descriptive
	 *     Descriptive returns Descriptive
	 *
	 * Constraint:
	 *     (name=EString type=Type?)
	 * </pre>
	 */
	protected void sequence_Descriptive(ISerializationContext context, Descriptive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statistic returns Evolution
	 *     Evolution returns Evolution
	 *
	 * Constraint:
	 *     (name=EString type=Type?)
	 * </pre>
	 */
	protected void sequence_Evolution(ISerializationContext context, Evolution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RelisRoot returns RelisRoot
	 *
	 * Constraint:
	 *     (name=EString (variable+=Variable variable+=Variable*)?)
	 * </pre>
	 */
	protected void sequence_RelisRoot(ISerializationContext context, RelisRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=EString (statistic+=Statistic statistic+=Statistic*)?)
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
