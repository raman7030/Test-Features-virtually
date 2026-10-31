package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.stream.NamespaceMap;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes2.dex */
public class NamespaceDecorator implements Decorator {
    public Namespace primary;
    public List scope = new ArrayList();

    public void set(Namespace namespace) {
        if (namespace != null) {
            add(namespace);
        }
        this.primary = namespace;
    }

    public void add(Namespace namespace) {
        this.scope.add(namespace);
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(OutputNode outputNode) {
        decorate(outputNode, null);
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(OutputNode outputNode, Decorator decorator) {
        if (decorator != null) {
            decorator.decorate(outputNode);
        }
        scope(outputNode);
        namespace(outputNode);
    }

    private void scope(OutputNode outputNode) {
        NamespaceMap namespaces = outputNode.getNamespaces();
        for (Namespace namespace : this.scope) {
            namespaces.setReference(namespace.reference(), namespace.prefix());
        }
    }

    private void namespace(OutputNode outputNode) {
        Namespace namespace = this.primary;
        if (namespace != null) {
            outputNode.setReference(namespace.reference());
        }
    }
}
