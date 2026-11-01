package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7418 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f19402;

    /* JADX INFO: renamed from: ۧ */
    public final C2723 f19403;

    /* JADX INFO: renamed from: ܽ */
    public final long f19404;

    public C7418(C2723 c2723, int i, long j) {
        this.f19403 = c2723;
        this.f19402 = i;
        this.f19404 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7418)) {
            return false;
        }
        C7418 c7418 = (C7418) obj;
        return this.f19402 == c7418.f19402 && this.f19404 == c7418.f19404 && C12826.equals(this.f19403, c7418.f19403);
    }

    public final int hashCode() {
        int i = this.f19402 * 31;
        long j = this.f19404;
        return C12826.hashCode(this.f19403) + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19403, Integer.valueOf(this.f19402), Long.valueOf(this.f19404)};
        String[] strArrSplit = "ownerSetKey;occurrenceBytes;savingBytes".length() == 0 ? new String[0] : "ownerSetKey;occurrenceBytes;savingBytes".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7418.class, sb, "[");
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
    public final int m17134() {
        return this.f19402;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2723 m17135() {
        return this.f19403;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m17136() {
        return this.f19404;
    }
}
