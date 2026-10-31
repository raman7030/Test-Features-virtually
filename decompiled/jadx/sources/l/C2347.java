package l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۖۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2347 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Field f7540;

    public C2347(Field field) {
        this.f7540 = field;
        field.setAccessible(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7661(AbstractC0434 abstractC0434, Serializable serializable) {
        try {
            this.f7540.set(abstractC0434, serializable);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7660(AbstractC0434 abstractC0434, int i) {
        try {
            this.f7540.set(abstractC0434, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
