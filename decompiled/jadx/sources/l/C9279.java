package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۢ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9279 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28113 = ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20568[] f28114 = new C20568[16384];

    public C9279() {
        m23805(0, 4, 1185263, "$ref");
        m23805(0, 5, 62680954, "@type");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m23806(char[] cArr, int i, int i2) {
        int i3 = this.f28113 & i2;
        C20568[] c20568Arr = this.f28114;
        C20568 c20568 = c20568Arr[i3];
        if (c20568 != null) {
            char[] cArr2 = c20568.f66247;
            if (i2 == c20568.f66248 && i == cArr2.length) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (cArr[i4] == cArr2[i4]) {
                    }
                }
                return c20568.f66249;
            }
            return new String(cArr, 0, i);
        }
        String strIntern = new String(cArr, 0, i).intern();
        c20568Arr[i3] = new C20568(strIntern, i2);
        return strIntern;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m23805(int i, int i2, int i3, String str) {
        int i4 = this.f28113 & i3;
        C20568[] c20568Arr = this.f28114;
        C20568 c20568 = c20568Arr[i4];
        if (c20568 != null) {
            String str2 = c20568.f66249;
            if (i3 == c20568.f66248 && i2 == c20568.f66247.length && str.regionMatches(i, str2, 0, i2)) {
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
        c20568Arr[i4] = new C20568(strIntern, i3);
        return strIntern;
    }
}
