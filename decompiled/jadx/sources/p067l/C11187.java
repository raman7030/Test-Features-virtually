package p067l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۢ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11187 {

    /* JADX INFO: renamed from: ֫ */
    public final int f31061 = ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;

    /* JADX INFO: renamed from: ۧ */
    public final C21916[] f31062 = new C21916[16384];

    public C11187() {
        m25814(0, 4, 1185263, "$ref");
        m25814(0, 5, 62680954, "@type");
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m25815(char[] cArr, int i, int i2) {
        int i3 = this.f31061 & i2;
        C21916[] c21916Arr = this.f31062;
        C21916 c21916 = c21916Arr[i3];
        if (c21916 != null) {
            char[] cArr2 = c21916.f68928;
            if (i2 == c21916.f68929 && i == cArr2.length) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (cArr[i4] == cArr2[i4]) {
                    }
                }
                return c21916.f68930;
            }
            return new String(cArr, 0, i);
        }
        String strIntern = new String(cArr, 0, i).intern();
        c21916Arr[i3] = new C21916(strIntern, i2);
        return strIntern;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m25814(int i, int i2, int i3, String str) {
        int i4 = this.f31061 & i3;
        C21916[] c21916Arr = this.f31062;
        C21916 c21916 = c21916Arr[i4];
        if (c21916 != null) {
            String str2 = c21916.f68930;
            if (i3 == c21916.f68929 && i2 == c21916.f68928.length && str.regionMatches(i, str2, 0, i2)) {
                return str2;
            }
            char[] cArr = new char[i2];
            str.getChars(i, i2 + i, cArr, 0);
            return new String(cArr);
        }
        if (i2 != str.length()) {
            char[] cArr2 = new char[i2];
            str.getChars(i, i2 + i, cArr2, 0);
            str = new String(cArr2);
        }
        String strIntern = str.intern();
        c21916Arr[i4] = new C21916(strIntern, i3);
        return strIntern;
    }
}
