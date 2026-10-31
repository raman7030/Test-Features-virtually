package l;

import java.util.Date;

/* JADX INFO: renamed from: l.֨ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0837 implements InterfaceC14325, InterfaceC8079 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f3016;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f3017;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f3018;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f3019;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f3020;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f3021;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f3022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f3023;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f3024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 f3026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f3027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f3028;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f3029;

    @Override // l.InterfaceC14325
    public final int getType() {
        return 1;
    }

    public C0837(InterfaceC1023 interfaceC1023, boolean z) {
        this.f3026 = interfaceC1023;
        this.f3016 = z;
    }

    @Override // l.InterfaceC14325
    public final String getName() {
        return this.f3019;
    }

    @Override // l.InterfaceC14325
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo3113() {
        return this.f3021;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m3114() {
        return this.f3019;
    }

    @Override // l.InterfaceC14325
    public final int getAttributes() {
        return this.f3023;
    }

    @Override // l.InterfaceC14325
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long mo3111() {
        return this.f3029;
    }

    @Override // l.InterfaceC14325
    public final long length() {
        return this.f3024;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m3112() {
        return this.f3025;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        String strM25126;
        this.f3025 = C1480.m5123(i, bArr);
        this.f3021 = C1480.m5123(i + 4, bArr);
        this.f3018 = C1480.m5127(i + 8, bArr);
        this.f3022 = C1480.m5127(i + 16, bArr);
        this.f3029 = C1480.m5127(i + 24, bArr);
        this.f3028 = C1480.m5127(i + 32, bArr);
        this.f3024 = C1480.m5125(i + 40, bArr);
        this.f3027 = C1480.m5125(i + 48, bArr);
        this.f3023 = C1480.m5123(i + 56, bArr);
        int iM5123 = C1480.m5123(i + 60, bArr);
        this.f3017 = C1480.m5123(i + 64, bArr);
        this.f3020 = C9969.m25131(i + 70, bArr[i + 68] & 255, bArr);
        int i3 = i + 94;
        if (this.f3016) {
            if (iM5123 > 0) {
                int i4 = i3 + iM5123;
                if (bArr[i4 - 1] == 0 && bArr[i4 - 2] == 0) {
                    iM5123 -= 2;
                }
            }
            strM25126 = C9969.m25131(i3, iM5123, bArr);
        } else {
            if (iM5123 > 0 && bArr[(i3 + iM5123) - 1] == 0) {
                iM5123--;
            }
            strM25126 = C9969.m25126(bArr, i3, iM5123, this.f3026);
        }
        this.f3019 = strM25126;
        return i - (i3 + iM5123);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
        sb.append(this.f3025);
        sb.append(",fileIndex=");
        sb.append(this.f3021);
        sb.append(",creationTime=");
        sb.append(new Date(this.f3018));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f3022));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f3029));
        sb.append(",changeTime=");
        sb.append(new Date(this.f3028));
        sb.append(",endOfFile=");
        sb.append(this.f3024);
        sb.append(",allocationSize=");
        sb.append(this.f3027);
        sb.append(",extFileAttributes=");
        sb.append(this.f3023);
        sb.append(",eaSize=");
        sb.append(this.f3017);
        sb.append(",shortName=");
        sb.append(this.f3020);
        sb.append(",filename=");
        return new String(C9045.m23341(sb, this.f3019, "]"));
    }
}
