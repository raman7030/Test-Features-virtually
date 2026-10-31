package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5313 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f16565;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0373 f16566;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f16567;

    public C5313(C0373 c0373, int i, long j) {
        this.f16566 = c0373;
        this.f16565 = i;
        this.f16567 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5313)) {
            return false;
        }
        C5313 c5313 = (C5313) obj;
        return this.f16565 == c5313.f16565 && this.f16567 == c5313.f16567 && C11003.equals(this.f16566, c5313.f16566);
    }

    public final int hashCode() {
        int i = this.f16565 * 31;
        long j = this.f16567;
        return C11003.hashCode(this.f16566) + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16566, Integer.valueOf(this.f16565), Long.valueOf(this.f16567)};
        String[] strArrSplit = "ownerSetKey;occurrenceBytes;savingBytes".length() == 0 ? new String[0] : "ownerSetKey;occurrenceBytes;savingBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5313.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15228() {
        return this.f16565;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0373 m15229() {
        return this.f16566;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m15230() {
        return this.f16567;
    }
}
