package org.simpleframework.xml.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LabelGroup {
    public final List list;
    public final int size;

    public LabelGroup(Label label) {
        this(Arrays.asList(label));
    }

    public LabelGroup(List list) {
        this.size = list.size();
        this.list = list;
    }

    public List getList() {
        return this.list;
    }

    public Label getPrimary() {
        if (this.size > 0) {
            return (Label) this.list.get(0);
        }
        return null;
    }
}
