package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10213 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f28309;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f28310;

    /* JADX INFO: renamed from: ܽ */
    public final String f28311;

    public C10213(String str, boolean z, boolean z2) {
        this.f28311 = str;
        this.f28309 = z;
        this.f28310 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10213)) {
            return false;
        }
        C10213 c10213 = (C10213) obj;
        return this.f28309 == c10213.f28309 && this.f28310 == c10213.f28310 && C12826.equals(this.f28311, c10213.f28311);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f28311) + ((((this.f28309 ? 1231 : 1237) * 31) + (this.f28310 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28311, Boolean.valueOf(this.f28309), Boolean.valueOf(this.f28310)};
        String[] strArrSplit = "name;defaultChecked;mainApkCandidate".length() == 0 ? new String[0] : "name;defaultChecked;mainApkCandidate".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10213.class, sb, "[");
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
    public final boolean m23808() {
        return this.f28309;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m23809() {
        return this.f28310;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m23810() {
        return this.f28311;
    }
}
