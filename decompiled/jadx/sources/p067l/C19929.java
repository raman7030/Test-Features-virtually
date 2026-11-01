package p067l;

/* JADX INFO: renamed from: l.ᩴۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19929 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ */
    public C7267 f60497;

    /* JADX INFO: renamed from: ᩶ */
    public int f60498;

    /* JADX INFO: renamed from: ᩸ */
    public int f60499;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f60500;

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        int i3 = i + 1;
        this.f60500 = bArr[i] == 0;
        this.f60498 = bArr[i3] & 255;
        int iM7363 = C3775.m7363(i + 2, bArr);
        this.f60499 = C3775.m7365(i + 4, bArr);
        this.f60497 = new C7267(bArr, i + 8);
        return iM7363;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f60500 ? "Allow " : "Deny  ");
        String strM16620 = this.f60497.m16620();
        stringBuffer.append(strM16620);
        int length = 25 - strM16620.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(" 0x");
        stringBuffer.append(C13854.m31529(this.f60499, 8));
        stringBuffer.append(' ');
        stringBuffer.append((this.f60498 & 16) != 0 ? "Inherited " : "Direct    ");
        int i2 = this.f60498 & 11;
        if (i2 == 0) {
            str = "This folder only";
        } else if (i2 == 1) {
            str = "This folder and files";
        } else if (i2 == 2) {
            str = "This folder and subfolders";
        } else if (i2 != 3) {
            switch (i2) {
                case 9:
                    str = "Files only";
                    break;
                case 10:
                    str = "Subfolders only";
                    break;
                case 11:
                    str = "Subfolders and files only";
                    break;
                default:
                    str = "Invalid";
                    break;
            }
        } else {
            str = "This folder, subfolders and files";
        }
        stringBuffer.append(str);
        int length2 = 34 - str.length();
        for (int i3 = 0; i3 < length2; i3++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }
}
