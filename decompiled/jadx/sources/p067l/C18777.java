package p067l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܿۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18777 {

    /* JADX INFO: renamed from: ֫ */
    public int f56100;

    /* JADX INFO: renamed from: ۧ */
    public int f56101;

    /* JADX INFO: renamed from: ܳ */
    public int f56102;

    /* JADX INFO: renamed from: ܽ */
    public int f56103;

    /* JADX INFO: renamed from: ܿ */
    public int f56104;

    /* JADX INFO: renamed from: ᩳ */
    public String f56105;

    /* JADX INFO: renamed from: ᩻ */
    public int f56106;

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m42806(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f56106 = i2;
        this.f56105 = C16094.f47359[3 - i3];
        int i7 = C16094.f47363[i5];
        this.f56104 = i7;
        if (i2 == 2) {
            this.f56104 = i7 / 2;
        } else if (i2 == 0) {
            this.f56104 = i7 / 4;
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
        this.f56102 = i6;
        if (i3 == 3) {
            int i9 = i2 == 3 ? C16094.f47357[i4 - 1] : C16094.f47361[i4 - 1];
            this.f56100 = i9;
            this.f56103 = (((i9 * 12) / this.f56104) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? C16094.f47358[i4 - 1] : C16094.f47360[i4 - 1];
                this.f56100 = i10;
                this.f56103 = ((i10 * 144) / this.f56104) + i8;
            } else {
                int i11 = C16094.f47362[i4 - 1];
                this.f56100 = i11;
                this.f56103 = (((i3 == 1 ? 72 : 144) * i11) / this.f56104) + i8;
            }
        }
        this.f56101 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
