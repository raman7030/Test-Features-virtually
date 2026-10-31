package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public Double read(String str) {
        return Double.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Double d) {
        return d.toString();
    }
}
