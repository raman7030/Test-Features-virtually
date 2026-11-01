package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16915 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Runnable f50078;

    /* JADX INFO: renamed from: ۧ */
    public final int f50079;

    public C16915(int i, Runnable runnable) {
        this.f50079 = i;
        this.f50078 = runnable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16915)) {
            return false;
        }
        C16915 c16915 = (C16915) obj;
        return this.f50079 == c16915.f50079 && C12826.equals(this.f50078, c16915.f50078);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f50078) + (this.f50079 * 31);
    }

    public final int position() {
        return this.f50079;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f50079), this.f50078};
        String[] strArrSplit = "position;callback".length() == 0 ? new String[0] : "position;callback".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16915.class, sb, "[");
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
    public final Runnable m38486() {
        return this.f50078;
    }
}
