package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99H */
/* JADX INFO: loaded from: classes3.dex */
public final class C5124 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC16412 f16044;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f16045;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f16046;

    public C5124(String str, AbstractC16412 abstractC16412, boolean z) {
        this.f16046 = str;
        this.f16044 = abstractC16412;
        this.f16045 = z;
    }

    public final String toString() {
        Object[] objArr = {this.f16046, this.f16044, Boolean.valueOf(this.f16045)};
        String[] strArrSplit = "name;descriptor;isMethod".length() == 0 ? new String[0] : "name;descriptor;isMethod".split(l.b);
        StringBuilder sb = new StringBuilder("NameDescriptorKey[");
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
    public final boolean m14673() {
        return this.f16045;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m14674() {
        return this.f16046;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5124.class != obj.getClass()) {
            return false;
        }
        C5124 c5124 = (C5124) obj;
        if (this.f16045 == c5124.f16045 && this.f16046.equals(c5124.f16046)) {
            return this.f16044.equals(c5124.f16044);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16044.hashCode() + (this.f16046.hashCode() * 31)) * 31) + (this.f16045 ? 1 : 0);
    }
}
