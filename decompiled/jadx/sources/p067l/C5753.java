package p067l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۗ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5753 extends AbstractC21847 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f14108;

    /* JADX INFO: renamed from: ܽ */
    public final Method f14110;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f14111 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: ۧ */
    public final Method f14109 = Class.class.getMethod("getRecordComponents", null);

    public C5753() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f14108 = cls.getMethod("getName", null);
        this.f14110 = cls.getMethod("getType", null);
    }

    @Override // p067l.AbstractC21847
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12829(Class cls) {
        try {
            return ((Boolean) this.f14111.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p067l.AbstractC21847
    /* JADX INFO: renamed from: ۧ */
    public final String[] mo12828(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14109.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f14108.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p067l.AbstractC21847
    /* JADX INFO: renamed from: ֫ */
    public final Constructor mo12826(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14109.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f14110.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p067l.AbstractC21847
    /* JADX INFO: renamed from: ֫ */
    public final Method mo12827(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
