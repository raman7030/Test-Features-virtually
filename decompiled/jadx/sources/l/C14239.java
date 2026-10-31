package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14239 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42912;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f42913;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14239)) {
            return false;
        }
        C14239 c14239 = (C14239) obj;
        return this.f42913 == c14239.f42913 && this.f42912 == c14239.f42912;
    }

    public final int hashCode() {
        return (this.f42913 * 31) + this.f42912;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f42913), Integer.valueOf(this.f42912)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14239.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33887() {
        return this.f42912;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33888() {
        return this.f42913;
    }

    public C14239(int i, int i2) {
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid syntax difference range");
        }
        this.f42913 = i;
        this.f42912 = i2;
    }
}
