package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܽ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16296 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1023 f50123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50124;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f50125;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50126;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f50127;

    public C16296(InterfaceC1023 interfaceC1023) {
        this.f50123 = interfaceC1023;
    }

    public C16296(InterfaceC1023 interfaceC1023, String str, int i, String str2) {
        this.f50123 = interfaceC1023;
        this.f50125 = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f50124 = i;
        if (str2 == null || str2.length() <= 0) {
            interfaceC1023.getClass();
            str2 = null;
        }
        this.f50127 = str2;
        this.f50126 = 0;
    }

    public C16296(InterfaceC1023 interfaceC1023, C16296 c16296) {
        this.f50123 = interfaceC1023;
        this.f50125 = c16296.f50125;
        this.f50124 = c16296.f50124;
        this.f50127 = c16296.f50127;
        this.f50126 = c16296.f50126;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38332() {
        return "0.0.0.0".equals(this.f50125) && this.f50124 == 0 && this.f50127 == null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38333(int i, byte[] bArr) {
        int length;
        bArr[i] = UTF8.S_CS3;
        String str = this.f50125;
        InterfaceC1023 interfaceC1023 = this.f50123;
        byte[] bArrM25128 = C9969.m25128(str, interfaceC1023);
        int i2 = 0;
        while (i2 < bArrM25128.length) {
            int i3 = i2 * 2;
            bArr[i3 + 1 + i] = (byte) (((bArrM25128[i2] & 240) >> 4) + 65);
            bArr[i3 + 2 + i] = (byte) ((15 & bArrM25128[i2]) + 65);
            i2++;
        }
        while (i2 < 15) {
            int i4 = i2 * 2;
            bArr[i4 + 1 + i] = 67;
            bArr[i4 + 2 + i] = 65;
            i2++;
        }
        int i5 = this.f50124;
        bArr[i + 31] = (byte) (((i5 & 240) >> 4) + 65);
        bArr[i + 32] = (byte) ((i5 & 15) + 65);
        int i6 = i + 33;
        String str2 = this.f50127;
        if (str2 == null) {
            bArr[i6] = 0;
            length = 1;
        } else {
            int i7 = i + 34;
            bArr[i6] = 46;
            System.arraycopy(C9969.m25128(str2, interfaceC1023), 0, bArr, i7, this.f50127.length());
            int length2 = this.f50127.length() + i7;
            bArr[length2] = 0;
            int i8 = length2 - 1;
            int length3 = i8 - this.f50127.length();
            int i9 = 0;
            while (true) {
                if (bArr[i8] == 46) {
                    bArr[i8] = (byte) i9;
                    i9 = 0;
                } else {
                    i9++;
                }
                int i10 = i8 - 1;
                if (i8 <= length3) {
                    break;
                }
                i8 = i10;
            }
            length = this.f50127.length() + 2;
        }
        return length + 33;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38331(int i, byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[33];
        int i3 = 15;
        for (int i4 = 0; i4 < 15; i4++) {
            int i5 = i4 * 2;
            byte b = (byte) (((bArr[(i5 + 1) + i] & 255) - 65) << 4);
            bArr2[i4] = b;
            byte b2 = (byte) (((byte) (((bArr[(i5 + 2) + i] & 255) - 65) & 15)) | b);
            bArr2[i4] = b2;
            if (b2 != 32) {
                i3 = i4 + 1;
            }
        }
        InterfaceC1023 interfaceC1023 = this.f50123;
        this.f50125 = C9969.m25126(bArr2, 0, i3, interfaceC1023);
        int i6 = ((bArr[i + 31] & 255) - 65) << 4;
        this.f50124 = i6;
        this.f50124 = i6 | (15 & ((bArr[i + 32] & 255) - 65));
        int i7 = i + 33;
        int i8 = i + 34;
        int i9 = bArr[i7] & 255;
        if (i9 == 0) {
            this.f50127 = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(C9969.m25126(bArr, i8, i9, interfaceC1023));
            while (true) {
                int i10 = i8 + i9;
                i9 = i10 + 1;
                i8 = bArr[i10] & 255;
                if (i8 == 0) {
                    break;
                }
                stringBuffer.append('.');
                stringBuffer.append(C9969.m25126(bArr, i9, i8, interfaceC1023));
            }
            this.f50127 = stringBuffer.toString();
            i2 = i9 - i7;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = (this.f50126 * 65599) + (this.f50124 * 65599) + this.f50125.hashCode();
        String str = this.f50127;
        return (str == null || str.length() == 0) ? iHashCode : this.f50127.hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16296)) {
            return false;
        }
        C16296 c16296 = (C16296) obj;
        if (this.f50127 == null && c16296.f50127 == null) {
            return this.f50125.equals(c16296.f50125) && this.f50124 == c16296.f50124;
        }
        return this.f50125.equals(c16296.f50125) && this.f50124 == c16296.f50124 && this.f50127.equals(c16296.f50127);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f50125;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str);
        stringBuffer.append("<");
        stringBuffer.append(C12085.m29467(this.f50124, 2));
        stringBuffer.append(">");
        if (this.f50127 != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.f50127);
        }
        return stringBuffer.toString();
    }
}
