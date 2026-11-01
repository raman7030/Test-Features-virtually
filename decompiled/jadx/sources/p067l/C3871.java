package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3871 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f8378;

    /* JADX INFO: renamed from: ۧ */
    public final int f8379;

    /* JADX INFO: renamed from: ܽ */
    public final C17952 f8380;

    public C3871(C17952 c17952, int i, int i2) {
        this.f8380 = c17952;
        this.f8379 = i;
        this.f8378 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3871)) {
            return false;
        }
        C3871 c3871 = (C3871) obj;
        return this.f8379 == c3871.f8379 && this.f8378 == c3871.f8378 && C12826.equals(this.f8380, c3871.f8380);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8380) + C6316.m14441(this.f8379, 31, this.f8378, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8380, Integer.valueOf(this.f8379), Integer.valueOf(this.f8378)};
        String[] strArrSplit = "restarts;oldStart;oldEnd".length() == 0 ? new String[0] : "restarts;oldStart;oldEnd".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3871.class, sb, "[");
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
    public final int m7630() {
        return this.f8378;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m7631() {
        return this.f8379;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17952 m7632() {
        return this.f8380;
    }
}
