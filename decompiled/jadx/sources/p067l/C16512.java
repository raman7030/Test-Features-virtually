package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16512 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f48537;

    /* JADX INFO: renamed from: ۧ */
    public final int f48538;

    /* JADX INFO: renamed from: ܽ */
    public final int f48539;

    public C16512(int i, int i2, boolean z) {
        this.f48539 = i;
        this.f48538 = i2;
        this.f48537 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16512)) {
            return false;
        }
        C16512 c16512 = (C16512) obj;
        return this.f48537 == c16512.f48537 && this.f48539 == c16512.f48539 && this.f48538 == c16512.f48538;
    }

    public final int hashCode() {
        return ((((this.f48537 ? 1231 : 1237) * 31) + this.f48539) * 31) + this.f48538;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f48539), Integer.valueOf(this.f48538), Boolean.valueOf(this.f48537)};
        String[] strArrSplit = "total;failed;canceled".length() == 0 ? new String[0] : "total;failed;canceled".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16512.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37468() {
        return this.f48537;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m37469() {
        return this.f48538;
    }
}
