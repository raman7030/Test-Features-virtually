package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20379 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f62990;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f62991;

    /* JADX INFO: renamed from: ܽ */
    public final C5154 f62992;

    public C20379(C5154 c5154, byte[] bArr, byte[] bArr2) {
        this.f62992 = c5154;
        this.f62991 = bArr;
        this.f62990 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20379)) {
            return false;
        }
        C20379 c20379 = (C20379) obj;
        return C12826.equals(this.f62992, c20379.f62992) && C12826.equals(this.f62991, c20379.f62991) && C12826.equals(this.f62990, c20379.f62990);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f62990) + ((C12826.hashCode(this.f62991) + (C12826.hashCode(this.f62992) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62992, this.f62991, this.f62990};
        String[] strArrSplit = "view;search;preferences".length() == 0 ? new String[0] : "view;search;preferences".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20379.class, sb, "[");
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
    public final byte[] m46003() {
        return this.f62990;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m46004() {
        return this.f62991;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C5154 m46005() {
        return this.f62992;
    }
}
