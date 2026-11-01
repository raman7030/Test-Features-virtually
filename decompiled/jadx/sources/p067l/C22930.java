package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71N5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22930 {

    /* JADX INFO: renamed from: ֫ */
    public final int f72163;

    /* JADX INFO: renamed from: ۧ */
    public final int f72164;

    public C22930(int i, int i2) {
        this.f72163 = i;
        this.f72164 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22930.class == obj.getClass()) {
            C22930 c22930 = (C22930) obj;
            if (this.f72163 == c22930.f72163 && this.f72164 == c22930.f72164) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f72163 * 31) + this.f72164;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f72163);
        sb.append(", ");
        return C5410.m11876(this.f72164, C0249l.f1198d, sb);
    }
}
