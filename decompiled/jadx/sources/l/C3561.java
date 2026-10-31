package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۗ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3561 extends AbstractC20495 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f11302;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f11304;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f11305 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f11303 = Class.class.getMethod("getRecordComponents", null);

    public C3561() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f11302 = cls.getMethod("getName", null);
        this.f11304 = cls.getMethod("getType", null);
    }

    @Override // l.AbstractC20495
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo10849(Class cls) {
        try {
            return ((Boolean) this.f11305.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC20495
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] mo10848(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f11303.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f11302.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC20495
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Constructor mo10846(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f11303.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f11304.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC20495
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method mo10847(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
