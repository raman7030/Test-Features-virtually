package p067l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܶᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17012 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final String f50322;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f50323;

    /* JADX INFO: renamed from: ᩹ */
    public final Class f50324;

    public C17012(AbstractC6285 abstractC6285) {
        this.f50324 = abstractC6285.getClass();
        this.f50322 = abstractC6285.getClass().getName();
        this.f50323 = abstractC6285.toByteArray();
    }

    public Object readResolve() {
        String str = this.f50322;
        try {
            Field declaredField = m38617().getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            return ((InterfaceC10467) declaredField.get(null)).newBuilderForType().mergeFrom(this.f50323).buildPartial();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find proto buffer class: ".concat(str), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to call parsePartialFrom", e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException("Unable to find DEFAULT_INSTANCE in ".concat(str), e3);
        } catch (SecurityException e4) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in ".concat(str), e4);
        } catch (C4293 e5) {
            throw new RuntimeException("Unable to understand proto buffer", e5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private Class m38617() {
        Class cls = this.f50324;
        return cls != null ? cls : Class.forName(this.f50322);
    }
}
