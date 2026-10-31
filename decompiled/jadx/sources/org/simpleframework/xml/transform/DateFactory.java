package org.simpleframework.xml.transform;

import java.lang.reflect.Constructor;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DateFactory {
    public final Constructor factory;

    public DateFactory(Class cls) {
        this(cls, Long.TYPE);
    }

    public DateFactory(Class cls, Class... clsArr) {
        this.factory = cls.getDeclaredConstructor(clsArr);
    }

    public Date getInstance(Object... objArr) {
        return (Date) this.factory.newInstance(objArr);
    }
}
