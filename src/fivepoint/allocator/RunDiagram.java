package allocator;

import java.util.List;

import com.structurizr.Workspace;
import com.structurizr.api.StructurizrClientException;
import com.structurizr.model.Container;
import com.structurizr.model.SoftwareSystem;

import views.PaymentSystem;
import views.PaymentMethodCard;
import views.ComponentJVM1;

public class RunDiagram {

	public static void main(String[] args) throws StructurizrClientException {
		RunDiagram diagram = new RunDiagram();
		diagram.construcDiagram();
	}

	public void construcDiagram() throws StructurizrClientException {
		Workspace workspace = new Workspace("Payment system", "Payment system");
		PaymentSystem viewPaymentMethod = new PaymentSystem();
		PaymentMethodCard methodCard = new PaymentMethodCard();
		ComponentJVM1 jmv1 = new ComponentJVM1();
		SoftwareSystem paymentMethod = viewPaymentMethod.viewPayment(workspace);
		List<Object[]> containers = methodCard.methodCard(paymentMethod, workspace);
		Container jvm1 = (Container) containers.get(0)[1];
		jmv1.componentJVM1(jvm1, workspace);
	}
}
