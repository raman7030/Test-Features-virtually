package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4507 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f14337;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14338;

    public C4507(int i, int i2) {
        this.f14338 = i;
        this.f14337 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4507)) {
            return false;
        }
        C4507 c4507 = (C4507) obj;
        return this.f14338 == c4507.f14338 && this.f14337 == c4507.f14337;
    }

    public final int hashCode() {
        return (this.f14338 * 31) + this.f14337;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f14338), Integer.valueOf(this.f14337)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4507.class, sb, "[");
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
    public final int m13253() {
        return this.f14337;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m13254() {
        return this.f14338;
    }
}
