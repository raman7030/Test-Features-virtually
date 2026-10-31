package l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܶᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15408 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f47192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f47193;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Class f47194;

    public C15408(AbstractC4121 abstractC4121) {
        this.f47194 = abstractC4121.getClass();
        this.f47192 = abstractC4121.getClass().getName();
        this.f47193 = abstractC4121.toByteArray();
    }

    public Object readResolve() {
        String str = this.f47192;
        try {
            Field declaredField = m36459().getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            return ((InterfaceC8522) declaredField.get(null)).newBuilderForType().mergeFrom(this.f47193).buildPartial();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find proto buffer class: ".concat(str), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to call parsePartialFrom", e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException("Unable to find DEFAULT_INSTANCE in ".concat(str), e3);
        } catch (SecurityException e4) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in ".concat(str), e4);
        } catch (C2025 e5) {
            throw new RuntimeException("Unable to understand proto buffer", e5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Class m36459() {
        Class cls = this.f47194;
        return cls != null ? cls : Class.forName(this.f47192);
    }
}
