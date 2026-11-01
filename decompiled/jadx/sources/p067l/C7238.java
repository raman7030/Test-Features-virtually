package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7238 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17966 f18878;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f18879;

    /* JADX INFO: renamed from: ܽ */
    public final String f18880;

    public C7238(String str, AbstractC17966 abstractC17966, boolean z) {
        this.f18880 = str;
        this.f18878 = abstractC17966;
        this.f18879 = z;
    }

    public final String toString() {
        Object[] objArr = {this.f18880, this.f18878, Boolean.valueOf(this.f18879)};
        String[] strArrSplit = "name;descriptor;isMethod".length() == 0 ? new String[0] : "name;descriptor;isMethod".split(C0249l.f1196b);
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16581() {
        return this.f18879;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m16582() {
        return this.f18880;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7238.class != obj.getClass()) {
            return false;
        }
        C7238 c7238 = (C7238) obj;
        if (this.f18879 == c7238.f18879 && this.f18880.equals(c7238.f18880)) {
            return this.f18878.equals(c7238.f18878);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18878.hashCode() + (this.f18880.hashCode() * 31)) * 31) + (this.f18879 ? 1 : 0);
    }
}
