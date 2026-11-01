package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۧۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12562 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 f35286;

    /* JADX INFO: renamed from: ۧ */
    public final String f35287;

    /* JADX INFO: renamed from: ܽ */
    public final int f35288;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f35289;

    public C12562(InterfaceC19370 interfaceC19370, String str, boolean z, int i) {
        this.f35286 = interfaceC19370;
        this.f35287 = str;
        this.f35289 = z;
        this.f35288 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12562)) {
            return false;
        }
        C12562 c12562 = (C12562) obj;
        return this.f35289 == c12562.f35289 && this.f35288 == c12562.f35288 && C12826.equals(this.f35286, c12562.f35286) && C12826.equals(this.f35287, c12562.f35287);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f35287) + ((C12826.hashCode(this.f35286) + C6316.m14441(this.f35289 ? 1231 : 1237, 31, this.f35288, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f35286, this.f35287, Boolean.valueOf(this.f35289), Integer.valueOf(this.f35288)};
        String[] strArrSplit = "fileItem;mimeType;sameBaseName;priority".length() == 0 ? new String[0] : "fileItem;mimeType;sameBaseName;priority".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C12562.class, sb, "[");
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
    public final InterfaceC19370 m28951() {
        return this.f35286;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m28952() {
        return this.f35289;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m28953() {
        return this.f35287;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28954() {
        return this.f35288;
    }
}
