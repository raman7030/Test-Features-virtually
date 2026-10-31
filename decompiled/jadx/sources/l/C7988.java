package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7988 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f24666;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24668;

    public C7988(int i, int i2, boolean z) {
        this.f24668 = i;
        this.f24667 = i2;
        this.f24666 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7988)) {
            return false;
        }
        C7988 c7988 = (C7988) obj;
        return this.f24666 == c7988.f24666 && this.f24668 == c7988.f24668 && this.f24667 == c7988.f24667;
    }

    public final int hashCode() {
        return ((((this.f24666 ? 1231 : 1237) * 31) + this.f24668) * 31) + this.f24667;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f24668), Integer.valueOf(this.f24667), Boolean.valueOf(this.f24666)};
        String[] strArrSplit = "start;end;complete".length() == 0 ? new String[0] : "start;end;complete".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7988.class, sb, "[");
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
}
