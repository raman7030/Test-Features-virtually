package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7931 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f24552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24553;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24554;

    public C7931(int i, int i2, int i3) {
        this.f24554 = i;
        this.f24553 = i2;
        this.f24552 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7931)) {
            return false;
        }
        C7931 c7931 = (C7931) obj;
        return this.f24554 == c7931.f24554 && this.f24553 == c7931.f24553 && this.f24552 == c7931.f24552;
    }

    public final int hashCode() {
        return (((this.f24554 * 31) + this.f24553) * 31) + this.f24552;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f24554), Integer.valueOf(this.f24553), Integer.valueOf(this.f24552)};
        String[] strArrSplit = "oldStart;oldEnd;newLength".length() == 0 ? new String[0] : "oldStart;oldEnd;newLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7931.class, sb, "[");
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
