package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۗۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5382 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C10307 f12779;

    /* JADX INFO: renamed from: ۧ */
    public final C24408 f12780;

    /* JADX INFO: renamed from: ܽ */
    public final int f12781;

    /* JADX INFO: renamed from: ᩳ */
    public final int f12782;

    public C5382(C24408 c24408, int i, C10307 c10307, int i2) {
        this.f12780 = c24408;
        this.f12782 = i;
        this.f12779 = c10307;
        this.f12781 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5382)) {
            return false;
        }
        C5382 c5382 = (C5382) obj;
        return this.f12782 == c5382.f12782 && this.f12781 == c5382.f12781 && C12826.equals(this.f12780, c5382.f12780) && C12826.equals(this.f12779, c5382.f12779);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f12779) + ((C12826.hashCode(this.f12780) + C6316.m14441(this.f12782, 31, this.f12781, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f12780, Integer.valueOf(this.f12782), this.f12779, Integer.valueOf(this.f12781)};
        String[] strArrSplit = "group;trackIndex;format;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;format;logicalIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C5382.class, sb, "[");
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
    public final C10307 m11766() {
        return this.f12779;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m11767() {
        return this.f12782;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24408 m11768() {
        return this.f12780;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m11769() {
        return this.f12781;
    }
}
