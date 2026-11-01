package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9960 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f27579;

    /* JADX INFO: renamed from: ۧ */
    public final int f27580;

    /* JADX INFO: renamed from: ܽ */
    public final int f27581;

    public C9960(int i, int i2, boolean z) {
        this.f27581 = i;
        this.f27580 = i2;
        this.f27579 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9960)) {
            return false;
        }
        C9960 c9960 = (C9960) obj;
        return this.f27579 == c9960.f27579 && this.f27581 == c9960.f27581 && this.f27580 == c9960.f27580;
    }

    public final int hashCode() {
        return ((((this.f27579 ? 1231 : 1237) * 31) + this.f27581) * 31) + this.f27580;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27581), Integer.valueOf(this.f27580), Boolean.valueOf(this.f27579)};
        String[] strArrSplit = "start;end;complete".length() == 0 ? new String[0] : "start;end;complete".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9960.class, sb, "[");
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
