package p067l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܽ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17856 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3341 f53290;

    /* JADX INFO: renamed from: ۧ */
    public int f53291;

    /* JADX INFO: renamed from: ܽ */
    public String f53292;

    /* JADX INFO: renamed from: ܿ */
    public int f53293;

    /* JADX INFO: renamed from: ᩳ */
    public String f53294;

    public C17856(InterfaceC3341 interfaceC3341) {
        this.f53290 = interfaceC3341;
    }

    public C17856(InterfaceC3341 interfaceC3341, String str, int i, String str2) {
        this.f53290 = interfaceC3341;
        this.f53292 = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f53291 = i;
        if (str2 == null || str2.length() <= 0) {
            interfaceC3341.getClass();
            str2 = null;
        }
        this.f53294 = str2;
        this.f53293 = 0;
    }

    public C17856(InterfaceC3341 interfaceC3341, C17856 c17856) {
        this.f53290 = interfaceC3341;
        this.f53292 = c17856.f53292;
        this.f53291 = c17856.f53291;
        this.f53294 = c17856.f53294;
        this.f53293 = c17856.f53293;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40547() {
        return "0.0.0.0".equals(this.f53292) && this.f53291 == 0 && this.f53294 == null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40548(int i, byte[] bArr) {
        int length;
        bArr[i] = UTF8.S_CS3;
        String str = this.f53292;
        InterfaceC3341 interfaceC3341 = this.f53290;
        byte[] bArrM27145 = C11843.m27145(str, interfaceC3341);
        int i2 = 0;
        while (i2 < bArrM27145.length) {
            int i3 = i2 * 2;
            bArr[i3 + 1 + i] = (byte) (((bArrM27145[i2] & 240) >> 4) + 65);
            bArr[i3 + 2 + i] = (byte) ((15 & bArrM27145[i2]) + 65);
            i2++;
        }
        while (i2 < 15) {
            int i4 = i2 * 2;
            bArr[i4 + 1 + i] = 67;
            bArr[i4 + 2 + i] = 65;
            i2++;
        }
        int i5 = this.f53291;
        bArr[i + 31] = (byte) (((i5 & 240) >> 4) + 65);
        bArr[i + 32] = (byte) ((i5 & 15) + 65);
        int i6 = i + 33;
        String str2 = this.f53294;
        if (str2 == null) {
            bArr[i6] = 0;
            length = 1;
        } else {
            int i7 = i + 34;
            bArr[i6] = 46;
            System.arraycopy(C11843.m27145(str2, interfaceC3341), 0, bArr, i7, this.f53294.length());
            int length2 = this.f53294.length() + i7;
            bArr[length2] = 0;
            int i8 = length2 - 1;
            int length3 = i8 - this.f53294.length();
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
            length = this.f53294.length() + 2;
        }
        return length + 33;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40546(int i, byte[] bArr) {
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
        InterfaceC3341 interfaceC3341 = this.f53290;
        this.f53292 = C11843.m27143(bArr2, 0, i3, interfaceC3341);
        int i6 = ((bArr[i + 31] & 255) - 65) << 4;
        this.f53291 = i6;
        this.f53291 = i6 | (15 & ((bArr[i + 32] & 255) - 65));
        int i7 = i + 33;
        int i8 = i + 34;
        int i9 = bArr[i7] & 255;
        if (i9 == 0) {
            this.f53294 = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(C11843.m27143(bArr, i8, i9, interfaceC3341));
            while (true) {
                int i10 = i8 + i9;
                i9 = i10 + 1;
                i8 = bArr[i10] & 255;
                if (i8 == 0) {
                    break;
                }
                stringBuffer.append('.');
                stringBuffer.append(C11843.m27143(bArr, i9, i8, interfaceC3341));
            }
            this.f53294 = stringBuffer.toString();
            i2 = i9 - i7;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = (this.f53293 * 65599) + (this.f53291 * 65599) + this.f53292.hashCode();
        String str = this.f53294;
        return (str == null || str.length() == 0) ? iHashCode : this.f53294.hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17856)) {
            return false;
        }
        C17856 c17856 = (C17856) obj;
        if (this.f53294 == null && c17856.f53294 == null) {
            return this.f53292.equals(c17856.f53292) && this.f53291 == c17856.f53291;
        }
        return this.f53292.equals(c17856.f53292) && this.f53291 == c17856.f53291 && this.f53294.equals(c17856.f53294);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f53292;
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
        stringBuffer.append(C13854.m31529(this.f53291, 2));
        stringBuffer.append(">");
        if (this.f53294 != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.f53294);
        }
        return stringBuffer.toString();
    }
}
