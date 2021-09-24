package views;

import com.structurizr.Workspace;
import com.structurizr.model.Component;
import com.structurizr.model.Container;
import com.structurizr.view.ComponentView;

public class ComponentJVM1 {
	public void componentJVM1(Container jvm1, Workspace workspace) {
		Component jaxrs = jvm1.addComponent("jaxrs-jersey", "restful webservice implementation", "rest");
		Component gemfire = jvm1.addComponent("gemfire", "Clustered Cache Gemfire", "cache");
		Component hibernate = jvm1.addComponent("hibernate", "Data Access Layer", "jpa");
		jaxrs.uses(gemfire, "");
		gemfire.uses(hibernate, "");
		ComponentView componentView = workspace.getViews().createComponentView(jvm1, "JVM Components", "JVM Components");
		componentView.addAllComponents();
	}
}
