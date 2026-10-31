package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class EnumTransform implements Transform {
    public final Class type;

    public EnumTransform(Class cls) {
        this.type = cls;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Enum read(String str) {
        return Enum.valueOf(this.type, str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Enum r1) {
        return r1.name();
    }
}
