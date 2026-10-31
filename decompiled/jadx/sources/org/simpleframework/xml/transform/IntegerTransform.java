package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class IntegerTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public Integer read(String str) {
        return Integer.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Integer num) {
        return num.toString();
    }
}
