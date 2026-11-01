package p067l;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.۬ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14930 extends AbstractC8225 {

    /* JADX INFO: renamed from: ᩸ */
    public final C13000 f42631;

    /* JADX INFO: renamed from: ᩹ */
    public final String f42632;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "utf8";
    }

    static {
        new C14930("");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34148(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + C16351.m37152(i) + " at offset " + C16351.m37155(i2));
    }

    public C14930(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f42632 = str.intern();
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f42631 = new C13000(bArr2);
    }

    public C14930(C13000 c13000) {
        char c;
        this.f42631 = c13000;
        int iM29810 = c13000.m29810();
        char[] cArr = new char[iM29810];
        int i = 0;
        int i2 = 0;
        while (iM29810 > 0) {
            int iM29817 = c13000.m29817(i2);
            switch (iM29817 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    iM29810--;
                    if (iM29817 == 0) {
                        m34148(iM29817, i2);
                        throw null;
                    }
                    c = (char) iM29817;
                    i2++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m34148(iM29817, i2);
                    throw null;
                case 12:
                case 13:
                    iM29810 -= 2;
                    if (iM29810 < 0) {
                        m34148(iM29817, i2);
                        throw null;
                    }
                    int i3 = i2 + 1;
                    int iM29818 = c13000.m29817(i3);
                    if ((iM29818 & 192) != 128) {
                        m34148(iM29818, i3);
                        throw null;
                    }
                    int i4 = ((iM29817 & 31) << 6) | (iM29818 & 63);
                    if (i4 != 0 && i4 < 128) {
                        m34148(iM29818, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                    break;
                case 14:
                    iM29810 -= 3;
                    if (iM29810 < 0) {
                        m34148(iM29817, i2);
                        throw null;
                    }
                    int i5 = i2 + 1;
                    int iM29819 = c13000.m29817(i5);
                    int i6 = iM29819 & 192;
                    if (i6 != 128) {
                        m34148(iM29819, i5);
                        throw null;
                    }
                    int i7 = i2 + 2;
                    int iM298110 = c13000.m29817(i7);
                    if (i6 != 128) {
                        m34148(iM298110, i7);
                        throw null;
                    }
                    int i8 = ((iM29817 & 15) << 12) | ((iM29819 & 63) << 6) | (iM298110 & 63);
                    if (i8 < 2048) {
                        m34148(iM298110, i7);
                        throw null;
                    }
                    c = (char) i8;
                    i2 += 3;
                    break;
                    break;
            }
            cArr[i] = c;
            i++;
        }
        this.f42632 = new String(cArr, 0, i).intern();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14930)) {
            return false;
        }
        return this.f42632.equals(((C14930) obj).f42632);
    }

    public final int hashCode() {
        return this.f42632.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        return this.f42632.compareTo(((C14930) abstractC15405).f42632);
    }

    public final String toString() {
        return "string{\"" + mo4819() + "\"}";
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        String str = this.f42632;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else {
                char cCharAt2 = i < length + (-1) ? str.charAt(i + 1) : (char) 0;
                boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((cCharAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m34150() {
        return "\"" + mo4819() + '\"';
    }

    public final String getString() {
        return this.f42632;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C13000 m34151() {
        return this.f42631;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m34149() {
        return this.f42631.m29810();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m34152() {
        return this.f42632.length();
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26319;
    }
}
