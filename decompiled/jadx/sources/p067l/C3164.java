package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.֨ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3164 implements InterfaceC15983, InterfaceC10047 {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f5790;

    /* JADX INFO: renamed from: ۗ */
    public int f5791;

    /* JADX INFO: renamed from: ۙ */
    public long f5792;

    /* JADX INFO: renamed from: ۛ */
    public String f5793;

    /* JADX INFO: renamed from: ۟ */
    public String f5794;

    /* JADX INFO: renamed from: ۤ */
    public int f5795;

    /* JADX INFO: renamed from: ۨ */
    public long f5796;

    /* JADX INFO: renamed from: ۫ */
    public int f5797;

    /* JADX INFO: renamed from: ۬ */
    public long f5798;

    /* JADX INFO: renamed from: ܰ */
    public int f5799;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3341 f5800;

    /* JADX INFO: renamed from: ᩸ */
    public long f5801;

    /* JADX INFO: renamed from: ᩹ */
    public long f5802;

    /* JADX INFO: renamed from: ᩺ */
    public long f5803;

    @Override // p067l.InterfaceC15983
    public final int getType() {
        return 1;
    }

    public C3164(InterfaceC3341 interfaceC3341, boolean z) {
        this.f5800 = interfaceC3341;
        this.f5790 = z;
    }

    @Override // p067l.InterfaceC15983
    public final String getName() {
        return this.f5793;
    }

    @Override // p067l.InterfaceC15983
    /* JADX INFO: renamed from: ܽ */
    public final int mo5427() {
        return this.f5795;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m5428() {
        return this.f5793;
    }

    @Override // p067l.InterfaceC15983
    public final int getAttributes() {
        return this.f5797;
    }

    @Override // p067l.InterfaceC15983
    /* JADX INFO: renamed from: ۚ */
    public final long mo5425() {
        return this.f5803;
    }

    @Override // p067l.InterfaceC15983
    public final long length() {
        return this.f5798;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m5426() {
        return this.f5799;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        String strM27143;
        this.f5799 = C3775.m7365(i, bArr);
        this.f5795 = C3775.m7365(i + 4, bArr);
        this.f5792 = C3775.m7369(i + 8, bArr);
        this.f5796 = C3775.m7369(i + 16, bArr);
        this.f5803 = C3775.m7369(i + 24, bArr);
        this.f5802 = C3775.m7369(i + 32, bArr);
        this.f5798 = C3775.m7367(i + 40, bArr);
        this.f5801 = C3775.m7367(i + 48, bArr);
        this.f5797 = C3775.m7365(i + 56, bArr);
        int iM7365 = C3775.m7365(i + 60, bArr);
        this.f5791 = C3775.m7365(i + 64, bArr);
        this.f5794 = C11843.m27148(i + 70, bArr[i + 68] & 255, bArr);
        int i3 = i + 94;
        if (this.f5790) {
            if (iM7365 > 0) {
                int i4 = i3 + iM7365;
                if (bArr[i4 - 1] == 0 && bArr[i4 - 2] == 0) {
                    iM7365 -= 2;
                }
            }
            strM27143 = C11843.m27148(i3, iM7365, bArr);
        } else {
            if (iM7365 > 0 && bArr[(i3 + iM7365) - 1] == 0) {
                iM7365--;
            }
            strM27143 = C11843.m27143(bArr, i3, iM7365, this.f5800);
        }
        this.f5793 = strM27143;
        return i - (i3 + iM7365);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
        sb.append(this.f5799);
        sb.append(",fileIndex=");
        sb.append(this.f5795);
        sb.append(",creationTime=");
        sb.append(new Date(this.f5792));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f5796));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f5803));
        sb.append(",changeTime=");
        sb.append(new Date(this.f5802));
        sb.append(",endOfFile=");
        sb.append(this.f5798);
        sb.append(",allocationSize=");
        sb.append(this.f5801);
        sb.append(",extFileAttributes=");
        sb.append(this.f5797);
        sb.append(",eaSize=");
        sb.append(this.f5791);
        sb.append(",shortName=");
        sb.append(this.f5794);
        sb.append(",filename=");
        return new String(C10965.m25286(sb, this.f5793, "]"));
    }
}
