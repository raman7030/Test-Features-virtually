package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۟ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9405 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f25692;

    /* JADX INFO: renamed from: ۧ */
    public final String f25693;

    /* JADX INFO: renamed from: ܽ */
    public final C10307 f25694;

    /* JADX INFO: renamed from: ܿ */
    public final int f25695;

    /* JADX INFO: renamed from: ᩳ */
    public final C24408 f25696;

    public C9405(C24408 c24408, int i, C10307 c10307, String str, String str2) {
        this.f25696 = c24408;
        this.f25695 = i;
        this.f25694 = c10307;
        this.f25693 = str;
        this.f25692 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9405)) {
            return false;
        }
        C9405 c9405 = (C9405) obj;
        return this.f25695 == c9405.f25695 && C12826.equals(this.f25696, c9405.f25696) && C12826.equals(this.f25694, c9405.f25694) && C12826.equals(this.f25693, c9405.f25693) && C12826.equals(this.f25692, c9405.f25692);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f25692) + C21720.m49003((C12826.hashCode(this.f25694) + ((C12826.hashCode(this.f25696) + (this.f25695 * 31)) * 31)) * 31, 31, this.f25693);
    }

    public final String toString() {
        Object[] objArr = {this.f25696, Integer.valueOf(this.f25695), this.f25694, this.f25693, this.f25692};
        String[] strArrSplit = "group;trackIndex;format;displayName;compactName".length() == 0 ? new String[0] : "group;trackIndex;format;displayName;compactName".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9405.class, sb, "[");
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
    public final String m21897() {
        return this.f25692;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C24408 m21898() {
        return this.f25696;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m21899() {
        return this.f25693;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10307 m21900() {
        return this.f25694;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m21901() {
        return this.f25695;
    }
}
