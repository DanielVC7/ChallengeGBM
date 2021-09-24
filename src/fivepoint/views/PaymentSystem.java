package views;

import com.structurizr.Workspace;
import com.structurizr.model.Model;
import com.structurizr.model.Person;
import com.structurizr.model.SoftwareSystem;
import com.structurizr.view.SystemContextView;
import com.structurizr.view.ViewSet;

public class PaymentSystem {
	public SoftwareSystem viewPayment(Workspace workspace) {
		Model model = workspace.getModel();
		Person user = model.addPerson("Client", "Client");
		SoftwareSystem paymentMethod = model.addSoftwareSystem(
		  "Payment method: credit card", "Payment method: credit card");
		user.uses(paymentMethod, "Makes payment");
		SoftwareSystem fraudDetector = model.addSoftwareSystem(
		  "Fraud Detector", "Fraud Detector");
		paymentMethod.uses(fraudDetector, "Obtains fraud score");
		
		ViewSet viewSet = workspace.getViews();
		SystemContextView contextView = viewSet.createSystemContextView(paymentMethod, "context",
				"Payment System Diagram");
		contextView.addAllSoftwareSystems();
		contextView.addAllPeople();
		return paymentMethod;
	}
}
