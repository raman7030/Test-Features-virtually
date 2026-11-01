package p067l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۖۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4599 {

    /* JADX INFO: renamed from: ֫ */
    public final Field f10331;

    public C4599(Field field) {
        this.f10331 = field;
        field.setAccessible(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9732(AbstractC2781 abstractC2781, Serializable serializable) {
        try {
            this.f10331.set(abstractC2781, serializable);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9731(AbstractC2781 abstractC2781, int i) {
        try {
            this.f10331.set(abstractC2781, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
