package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C3645 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C4847 f7658;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f7659;

    /* JADX INFO: renamed from: ܽ */
    public final int f7660;

    /* JADX INFO: renamed from: ᩳ */
    public final long f7661;

    public C3645(C4847 c4847, boolean z, int i, long j) {
        this.f7658 = c4847;
        this.f7659 = z;
        this.f7660 = i;
        this.f7661 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3645)) {
            return false;
        }
        C3645 c3645 = (C3645) obj;
        return this.f7659 == c3645.f7659 && this.f7660 == c3645.f7660 && this.f7661 == c3645.f7661 && C12826.equals(this.f7658, c3645.f7658);
    }

    public final int hashCode() {
        int iM14441 = C6316.m14441(this.f7659 ? 1231 : 1237, 31, this.f7660, 31);
        long j = this.f7661;
        return C12826.hashCode(this.f7658) + ((iM14441 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7658, Boolean.valueOf(this.f7659), Integer.valueOf(this.f7660), Long.valueOf(this.f7661)};
        String[] strArrSplit = "arguments;historyChanged;pausedPosition;sourceGeneration".length() == 0 ? new String[0] : "arguments;historyChanged;pausedPosition;sourceGeneration".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3645.class, sb, "[");
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
    public final C4847 m6920() {
        return this.f7658;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m6921() {
        return this.f7661;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m6922() {
        return this.f7659;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m6923() {
        return this.f7660;
    }
}
