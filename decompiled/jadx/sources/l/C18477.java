package l;

/* JADX INFO: renamed from: l.ᩴۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18477 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5154 f57277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f57278;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f57280;

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int i3 = i + 1;
        this.f57280 = bArr[i] == 0;
        this.f57278 = bArr[i3] & 255;
        int iM5121 = C1480.m5121(i + 2, bArr);
        this.f57279 = C1480.m5123(i + 4, bArr);
        this.f57277 = new C5154(bArr, i + 8);
        return iM5121;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f57280 ? "Allow " : "Deny  ");
        String strM14712 = this.f57277.m14712();
        stringBuffer.append(strM14712);
        int length = 25 - strM14712.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(" 0x");
        stringBuffer.append(C12085.m29467(this.f57279, 8));
        stringBuffer.append(' ');
        stringBuffer.append((this.f57278 & 16) != 0 ? "Inherited " : "Direct    ");
        int i2 = this.f57278 & 11;
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
