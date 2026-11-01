package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6920 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f18016;

    /* JADX INFO: renamed from: ۧ */
    public final String f18017;

    /* JADX INFO: renamed from: ܽ */
    public final int f18018;

    public C6920(int i, int i2, String str) {
        this.f18018 = i;
        this.f18016 = i2;
        this.f18017 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6920)) {
            return false;
        }
        C6920 c6920 = (C6920) obj;
        return this.f18018 == c6920.f18018 && this.f18016 == c6920.f18016 && C12826.equals(this.f18017, c6920.f18017);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f18017) + C6316.m14441(this.f18018, 31, this.f18016, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f18018), Integer.valueOf(this.f18016), this.f18017};
        String[] strArrSplit = "start;end;replacement".length() == 0 ? new String[0] : "start;end;replacement".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6920.class, sb, "[");
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
