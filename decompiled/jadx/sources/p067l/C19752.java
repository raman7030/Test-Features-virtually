package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19752 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f60082;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f60083;

    /* JADX INFO: renamed from: ܽ */
    public final String f60084;

    /* JADX INFO: renamed from: ᩳ */
    public final String f60085;

    public C19752(String str, String str2, boolean z, boolean z2) {
        this.f60085 = str;
        this.f60084 = str2;
        this.f60082 = z;
        this.f60083 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19752)) {
            return false;
        }
        C19752 c19752 = (C19752) obj;
        return this.f60082 == c19752.f60082 && this.f60083 == c19752.f60083 && C12826.equals(this.f60085, c19752.f60085) && C12826.equals(this.f60084, c19752.f60084);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f60084) + C21720.m49003((((this.f60082 ? 1231 : 1237) * 31) + (this.f60083 ? 1231 : 1237)) * 31, 31, this.f60085);
    }

    public final String toString() {
        Object[] objArr = {this.f60085, this.f60084, Boolean.valueOf(this.f60082), Boolean.valueOf(this.f60083)};
        String[] strArrSplit = "oldName;newName;isDirectory;needMark".length() == 0 ? new String[0] : "oldName;newName;isDirectory;needMark".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19752.class, sb, "[");
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
    public final String m44886() {
        if (!this.f60083) {
            return null;
        }
        String str = this.f60084;
        if (C12826.equals(C11419.m26416(str), C11419.m26416(this.f60085))) {
            return C11419.m26414(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44887(C5738 c5738) {
        String name = c5738.getName();
        boolean z = this.f60082;
        String str = this.f60084;
        String str2 = this.f60085;
        if (!z) {
            if (!name.equals(str2)) {
                return false;
            }
            c5738.m12769(str);
            return true;
        }
        if (name.length() <= str2.length() || !name.startsWith(str2) || name.charAt(str2.length()) != '/') {
            return false;
        }
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(name.substring(str2.length()));
        c5738.m12769(sbM17248.toString());
        return true;
    }
}
