package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes2.dex */
public final class C3923 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C10307 f8506;

    /* JADX INFO: renamed from: ۧ */
    public final C24408 f8507;

    /* JADX INFO: renamed from: ܽ */
    public final int f8508;

    /* JADX INFO: renamed from: ᩳ */
    public final int f8509;

    public C3923(C24408 c24408, int i, C10307 c10307, int i2) {
        this.f8507 = c24408;
        this.f8509 = i;
        this.f8506 = c10307;
        this.f8508 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3923)) {
            return false;
        }
        C3923 c3923 = (C3923) obj;
        return this.f8509 == c3923.f8509 && this.f8508 == c3923.f8508 && C12826.equals(this.f8507, c3923.f8507) && C12826.equals(this.f8506, c3923.f8506);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8506) + ((C12826.hashCode(this.f8507) + C6316.m14441(this.f8509, 31, this.f8508, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8507, Integer.valueOf(this.f8509), this.f8506, Integer.valueOf(this.f8508)};
        String[] strArrSplit = "group;trackIndex;format;sourceOrder".length() == 0 ? new String[0] : "group;trackIndex;format;sourceOrder".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3923.class, sb, "[");
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
    public final C10307 m7742() {
        return this.f8506;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m7743() {
        return this.f8509;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24408 m7744() {
        return this.f8507;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m7745() {
        return this.f8508;
    }
}
