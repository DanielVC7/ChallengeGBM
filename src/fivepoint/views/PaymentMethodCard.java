package views;

import java.util.ArrayList;
import java.util.List;

import com.structurizr.Workspace;
import com.structurizr.model.Container;
import com.structurizr.model.SoftwareSystem;
import com.structurizr.view.ContainerView;

public class PaymentMethodCard {
	public List<Object[]> methodCard(SoftwareSystem paymentMethod, Workspace workspace) {
		List<Object[]> containers = new ArrayList<>();
		Container f5 = paymentMethod.addContainer("Payment Load Balancer", "Payment Load Balancer", "F5");
		Container jvm1 = paymentMethod.addContainer("JVM-1", "JVM-1", "Java Virtual Machine");
		Container jvm2 = paymentMethod.addContainer("JVM-2", "JVM-2", "Java Virtual Machine");
		Container jvm3 = paymentMethod.addContainer("JVM-3", "JVM-3", "Java Virtual Machine");
		Container oracle = paymentMethod.addContainer("oracleDB", "Oracle Database", "RDBMS");
		f5.uses(jvm1, "route");
		f5.uses(jvm2, "route");
		f5.uses(jvm3, "route");
		jvm1.uses(oracle, "storage");
		jvm2.uses(oracle, "storage");
		jvm3.uses(oracle, "storage");
		ContainerView view = workspace.getViews().createContainerView(paymentMethod, "F5", "Container View");
		view.addAllContainers();
		containers.add(new Object[] { f5, jvm1, jvm2, jvm3, oracle });
		return containers;
	}
}
