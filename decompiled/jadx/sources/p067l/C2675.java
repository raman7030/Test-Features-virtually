package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C2675 {

    /* JADX INFO: renamed from: ֫ */
    public final int f4481;

    /* JADX INFO: renamed from: ۧ */
    public final Method f4482;

    public C2675(Method method, int i) {
        this.f4481 = i;
        this.f4482 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2675)) {
            return false;
        }
        C2675 c2675 = (C2675) obj;
        return this.f4481 == c2675.f4481 && this.f4482.getName().equals(c2675.f4482.getName());
    }

    public final int hashCode() {
        return this.f4482.getName().hashCode() + (this.f4481 * 31);
    }
}
