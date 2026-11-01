package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16782 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f49449;

    /* JADX INFO: renamed from: ۧ */
    public final int f49450;

    public C16782(int i, int i2) {
        this.f49449 = i;
        this.f49450 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16782)) {
            return false;
        }
        C16782 c16782 = (C16782) obj;
        return this.f49449 == c16782.f49449 && this.f49450 == c16782.f49450;
    }

    public final int hashCode() {
        return (this.f49449 * 31) + this.f49450;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f49449), Integer.valueOf(this.f49450)};
        String[] strArrSplit = "end;offset".length() == 0 ? new String[0] : "end;offset".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16782.class, sb, "[");
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
