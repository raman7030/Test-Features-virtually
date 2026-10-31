package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6421 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable f19863;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f19864;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC15592 f19865;

    public C6421(EnumC15592 enumC15592, Throwable th, boolean z) {
        this.f19865 = enumC15592;
        this.f19863 = th;
        this.f19864 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6421)) {
            return false;
        }
        C6421 c6421 = (C6421) obj;
        return this.f19864 == c6421.f19864 && C11003.equals(this.f19865, c6421.f19865) && C11003.equals(this.f19863, c6421.f19863);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f19863) + ((C11003.hashCode(this.f19865) + ((this.f19864 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19865, this.f19863, Boolean.valueOf(this.f19864)};
        String[] strArrSplit = "state;error;signingDisabledCandidate".length() == 0 ? new String[0] : "state;error;signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6421.class, sb, "[");
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
    public final Throwable m17749() {
        return this.f19863;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17750() {
        return this.f19864;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC15592 m17751() {
        return this.f19865;
    }
}
