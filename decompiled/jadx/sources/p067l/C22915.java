package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C22915 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f72104;

    /* JADX INFO: renamed from: ۧ */
    public final int f72105;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f72106;

    /* JADX INFO: renamed from: ܿ */
    public final int f72107;

    /* JADX INFO: renamed from: ᩳ */
    public final int f72108;

    public C22915(int i, int i2, int i3, boolean z, boolean z2) {
        this.f72108 = i;
        this.f72105 = i2;
        this.f72107 = i3;
        this.f72104 = z;
        this.f72106 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22915)) {
            return false;
        }
        C22915 c22915 = (C22915) obj;
        return this.f72104 == c22915.f72104 && this.f72106 == c22915.f72106 && this.f72108 == c22915.f72108 && this.f72105 == c22915.f72105 && this.f72107 == c22915.f72107;
    }

    public final int hashCode() {
        return ((((((((this.f72104 ? 1231 : 1237) * 31) + (this.f72106 ? 1231 : 1237)) * 31) + this.f72108) * 31) + this.f72105) * 31) + this.f72107;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f72108), Integer.valueOf(this.f72105), Integer.valueOf(this.f72107), Boolean.valueOf(this.f72104), Boolean.valueOf(this.f72106)};
        String[] strArrSplit = "start;end;type;breakBefore;protectedText".length() == 0 ? new String[0] : "start;end;type;breakBefore;protectedText".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22915.class, sb, "[");
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
