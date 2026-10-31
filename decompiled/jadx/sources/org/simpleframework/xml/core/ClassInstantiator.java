package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ClassInstantiator implements Instantiator {
    public final List creators;
    public final Detail detail;
    public final Creator primary;
    public final ParameterMap registry;

    public ClassInstantiator(List list, Creator creator, ParameterMap parameterMap, Detail detail) {
        this.creators = list;
        this.registry = parameterMap;
        this.primary = creator;
        this.detail = detail;
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public boolean isDefault() {
        return this.creators.size() <= 1 && this.primary != null;
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public Object getInstance() {
        return this.primary.getInstance();
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public Object getInstance(Criteria criteria) throws PersistenceException {
        Creator creator = getCreator(criteria);
        if (creator == null) {
            throw new PersistenceException("Constructor not matched for %s", this.detail);
        }
        return creator.getInstance(criteria);
    }

    private Creator getCreator(Criteria criteria) {
        Creator creator = this.primary;
        double d = 0.0d;
        for (Creator creator2 : this.creators) {
            double score = creator2.getScore(criteria);
            if (score > d) {
                creator = creator2;
                d = score;
            }
        }
        return creator;
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public Parameter getParameter(String str) {
        return (Parameter) this.registry.get(str);
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public List getParameters() {
        return this.registry.getAll();
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public List getCreators() {
        return new ArrayList(this.creators);
    }

    public String toString() {
        return String.format("creator for %s", this.detail);
    }
}
