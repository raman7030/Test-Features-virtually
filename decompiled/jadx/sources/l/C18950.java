package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18950 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f59760;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f59761;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2931 f59762;

    public C18950(C2931 c2931, byte[] bArr, byte[] bArr2) {
        this.f59762 = c2931;
        this.f59761 = bArr;
        this.f59760 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18950)) {
            return false;
        }
        C18950 c18950 = (C18950) obj;
        return C11003.equals(this.f59762, c18950.f59762) && C11003.equals(this.f59761, c18950.f59761) && C11003.equals(this.f59760, c18950.f59760);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f59760) + ((C11003.hashCode(this.f59761) + (C11003.hashCode(this.f59762) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59762, this.f59761, this.f59760};
        String[] strArrSplit = "view;search;preferences".length() == 0 ? new String[0] : "view;search;preferences".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18950.class, sb, "[");
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
    public final byte[] m43736() {
        return this.f59760;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m43737() {
        return this.f59761;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2931 m43738() {
        return this.f59762;
    }
}
