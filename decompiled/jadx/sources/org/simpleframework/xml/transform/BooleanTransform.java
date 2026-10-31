package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public Boolean read(String str) {
        return Boolean.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Boolean bool) {
        return bool.toString();
    }
}
