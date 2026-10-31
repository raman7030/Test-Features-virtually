package org.simpleframework.xml.transform;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayTransform implements Transform {
    public final Transform delegate;
    public final Class entry;
    public final StringArrayTransform split = new StringArrayTransform();

    public ArrayTransform(Transform transform, Class cls) {
        this.delegate = transform;
        this.entry = cls;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Object read(String str) {
        String[] strArr = this.split.read(str);
        return read(strArr, strArr.length);
    }

    private Object read(String[] strArr, int i) {
        Object objNewInstance = Array.newInstance((Class<?>) this.entry, i);
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.delegate.read(strArr[i2]);
            if (obj != null) {
                Array.set(objNewInstance, i2, obj);
            }
        }
        return objNewInstance;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Object obj) {
        return write(obj, Array.getLength(obj));
    }

    private String write(Object obj, int i) {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = Array.get(obj, i2);
            if (obj2 != null) {
                strArr[i2] = this.delegate.write(obj2);
            }
        }
        return this.split.write(strArr);
    }
}
