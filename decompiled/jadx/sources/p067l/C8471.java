package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۜ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8471 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Throwable f22735;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f22736;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC17187 f22737;

    public C8471(EnumC17187 enumC17187, Throwable th, boolean z) {
        this.f22737 = enumC17187;
        this.f22735 = th;
        this.f22736 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8471)) {
            return false;
        }
        C8471 c8471 = (C8471) obj;
        return this.f22736 == c8471.f22736 && C12826.equals(this.f22737, c8471.f22737) && C12826.equals(this.f22735, c8471.f22735);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f22735) + ((C12826.hashCode(this.f22737) + ((this.f22736 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22737, this.f22735, Boolean.valueOf(this.f22736)};
        String[] strArrSplit = "state;error;signingDisabledCandidate".length() == 0 ? new String[0] : "state;error;signingDisabledCandidate".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8471.class, sb, "[");
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
    public final Throwable m19696() {
        return this.f22735;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m19697() {
        return this.f22736;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC17187 m19698() {
        return this.f22737;
    }
}
