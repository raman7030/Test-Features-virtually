package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class ByteTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public Byte read(String str) {
        return Byte.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Byte b) {
        return b.toString();
    }
}
