package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13891 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f39223;

    /* JADX INFO: renamed from: ۧ */
    public final int f39224;

    /* JADX INFO: renamed from: ܽ */
    public final C23120 f39225;

    public C13891(int i, int i2, C23120 c23120) {
        this.f39224 = i;
        this.f39223 = i2;
        this.f39225 = c23120;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13891)) {
            return false;
        }
        C13891 c13891 = (C13891) obj;
        return this.f39224 == c13891.f39224 && this.f39223 == c13891.f39223 && C12826.equals(this.f39225, c13891.f39225);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f39225) + C6316.m14441(this.f39224, 31, this.f39223, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f39224), Integer.valueOf(this.f39223), this.f39225};
        String[] strArrSplit = "start;end;style".length() == 0 ? new String[0] : "start;end;style".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C13891.class, sb, "[");
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
