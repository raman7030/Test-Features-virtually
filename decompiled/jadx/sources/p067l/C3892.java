package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3892 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C17302 f8434;

    /* JADX INFO: renamed from: ۧ */
    public final C11503 f8435;

    /* JADX INFO: renamed from: ܽ */
    public final long f8436;

    /* JADX INFO: renamed from: ᩳ */
    public final long f8437;

    public C3892() {
        throw null;
    }

    public C3892(C17302 c17302, C11503 c11503, long j, long j2) {
        this.f8434 = c17302;
        this.f8435 = c11503;
        this.f8436 = j;
        this.f8437 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3892)) {
            return false;
        }
        C3892 c3892 = (C3892) obj;
        return this.f8436 == c3892.f8436 && this.f8437 == c3892.f8437 && C12826.equals(this.f8434, c3892.f8434) && C12826.equals(this.f8435, c3892.f8435);
    }

    public final int hashCode() {
        long j = this.f8436;
        long j2 = this.f8437;
        return C12826.hashCode(this.f8435) + ((C12826.hashCode(this.f8434) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8434, this.f8435, Long.valueOf(this.f8436), Long.valueOf(this.f8437)};
        String[] strArrSplit = "changes;history;mark;markCount".length() == 0 ? new String[0] : "changes;history;mark;markCount".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3892.class, sb, "[");
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
