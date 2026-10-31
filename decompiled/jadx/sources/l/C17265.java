package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܿۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17265 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52919;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52920;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52921;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52922;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f52923;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52924;

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40557(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f52924 = i2;
        this.f52923 = C14442.f44265[3 - i3];
        int i7 = C14442.f44269[i5];
        this.f52922 = i7;
        if (i2 == 2) {
            this.f52922 = i7 / 2;
        } else if (i2 == 0) {
            this.f52922 = i7 / 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 != 1) {
            if (i3 == 2) {
                i6 = 1152;
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i6 = MLKEMEngine.KyberPolyBytes;
            }
        } else if (i2 == 3) {
            i6 = 1152;
        } else {
            i6 = 576;
        }
        this.f52920 = i6;
        if (i3 == 3) {
            int i9 = i2 == 3 ? C14442.f44263[i4 - 1] : C14442.f44267[i4 - 1];
            this.f52918 = i9;
            this.f52921 = (((i9 * 12) / this.f52922) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? C14442.f44264[i4 - 1] : C14442.f44266[i4 - 1];
                this.f52918 = i10;
                this.f52921 = ((i10 * 144) / this.f52922) + i8;
            } else {
                int i11 = C14442.f44268[i4 - 1];
                this.f52918 = i11;
                this.f52921 = (((i3 == 1 ? 72 : 144) * i11) / this.f52922) + i8;
            }
        }
        this.f52919 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
