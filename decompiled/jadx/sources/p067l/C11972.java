package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C11972 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f33386;

    public C11972(int i) {
        this.f33386 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11972) && this.f33386 == ((C11972) obj).f33386;
    }

    public final int hashCode() {
        return this.f33386;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f33386)};
        String[] strArrSplit = "extra".length() == 0 ? new String[0] : "extra".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11972.class, sb, "[");
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
