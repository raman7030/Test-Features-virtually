package org.simpleframework.xml.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LabelMap extends LinkedHashMap implements Iterable {
    public final Policy policy;

    public LabelMap() {
        this(null);
    }

    public LabelMap(Policy policy) {
        this.policy = policy;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }

    public Label getLabel(String str) {
        return (Label) remove(str);
    }

    public String[] getKeys() {
        HashSet hashSet = new HashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            if (label != null) {
                String path = label.getPath();
                String name = label.getName();
                hashSet.add(path);
                hashSet.add(name);
            }
        }
        return getArray(hashSet);
    }

    public String[] getPaths() {
        HashSet hashSet = new HashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            if (label != null) {
                hashSet.add(label.getPath());
            }
        }
        return getArray(hashSet);
    }

    public LabelMap getLabels() {
        LabelMap labelMap = new LabelMap(this.policy);
        Iterator it = iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            if (label != null) {
                labelMap.put(label.getPath(), label);
            }
        }
        return labelMap;
    }

    private String[] getArray(Set set) {
        return (String[]) set.toArray(new String[0]);
    }

    public boolean isStrict(Context context) {
        if (this.policy == null) {
            return context.isStrict();
        }
        return context.isStrict() && this.policy.isStrict();
    }
}
