package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f1705;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f1706;

    public C0323(Method method, int i) {
        this.f1705 = i;
        this.f1706 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0323)) {
            return false;
        }
        C0323 c0323 = (C0323) obj;
        return this.f1705 == c0323.f1705 && this.f1706.getName().equals(c0323.f1706.getName());
    }

    public final int hashCode() {
        return this.f1706.getName().hashCode() + (this.f1705 * 31);
    }
}
