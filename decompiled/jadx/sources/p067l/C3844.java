package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3844 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 f8251;

    /* JADX INFO: renamed from: ۧ */
    public final String f8252;

    public C3844(InterfaceC19370 interfaceC19370, String str) {
        this.f8251 = interfaceC19370;
        this.f8252 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3844)) {
            return false;
        }
        C3844 c3844 = (C3844) obj;
        return C12826.equals(this.f8251, c3844.f8251) && C12826.equals(this.f8252, c3844.f8252);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8252) + (C12826.hashCode(this.f8251) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8251, this.f8252};
        String[] strArrSplit = "fileItem;mimeType".length() == 0 ? new String[0] : "fileItem;mimeType".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3844.class, sb, "[");
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
    public final InterfaceC19370 m7540() {
        return this.f8251;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m7541() {
        return this.f8252;
    }
}
