package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ModelSection implements Section {
    public LabelMap attributes;
    public LabelMap elements;
    public Model model;
    public ModelMap models;

    public ModelSection(Model model) {
        this.model = model;
    }

    @Override // org.simpleframework.xml.core.Section
    public String getName() {
        return this.model.getName();
    }

    @Override // org.simpleframework.xml.core.Section
    public String getPrefix() {
        return this.model.getPrefix();
    }

    @Override // org.simpleframework.xml.core.Section
    public String getPath(String str) {
        Expression expression = this.model.getExpression();
        return expression == null ? str : expression.getElement(str);
    }

    @Override // org.simpleframework.xml.core.Section
    public String getAttribute(String str) {
        Expression expression = this.model.getExpression();
        return expression == null ? str : expression.getAttribute(str);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.model.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    @Override // org.simpleframework.xml.core.Section
    public boolean isSection(String str) {
        return getModels().get(str) != 0;
    }

    public ModelMap getModels() {
        if (this.models == null) {
            this.models = this.model.getModels();
        }
        return this.models;
    }

    @Override // org.simpleframework.xml.core.Section
    public Label getText() {
        return this.model.getText();
    }

    @Override // org.simpleframework.xml.core.Section
    public LabelMap getAttributes() {
        if (this.attributes == null) {
            this.attributes = this.model.getAttributes();
        }
        return this.attributes;
    }

    @Override // org.simpleframework.xml.core.Section
    public LabelMap getElements() {
        if (this.elements == null) {
            this.elements = this.model.getElements();
        }
        return this.elements;
    }

    @Override // org.simpleframework.xml.core.Section
    public Label getElement(String str) {
        return getElements().getLabel(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.core.Section
    public Section getSection(String str) {
        Model modelTake;
        ModelList modelList = (ModelList) getModels().get(str);
        if (modelList == null || (modelTake = modelList.take()) == null) {
            return null;
        }
        return new ModelSection(modelTake);
    }
}
