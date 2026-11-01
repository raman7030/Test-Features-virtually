package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16804 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f49529;

    /* JADX INFO: renamed from: ۧ */
    public final int f49530;

    public C16804(int i, int i2) {
        this.f49529 = i;
        this.f49530 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16804)) {
            return false;
        }
        C16804 c16804 = (C16804) obj;
        return this.f49529 == c16804.f49529 && this.f49530 == c16804.f49530;
    }

    public final int hashCode() {
        return (this.f49529 * 31) + this.f49530;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f49529), Integer.valueOf(this.f49530)};
        String[] strArrSplit = "blockCount;lastLength".length() == 0 ? new String[0] : "blockCount;lastLength".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16804.class, sb, "[");
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
