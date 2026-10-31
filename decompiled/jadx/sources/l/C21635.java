package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71N5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21635 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69460;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69461;

    public C21635(int i, int i2) {
        this.f69460 = i;
        this.f69461 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21635.class == obj.getClass()) {
            C21635 c21635 = (C21635) obj;
            if (this.f69460 == c21635.f69460 && this.f69461 == c21635.f69461) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69460 * 31) + this.f69461;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f69460);
        sb.append(", ");
        return C3200.m9831(this.f69461, l.d, sb);
    }
}
