package p067l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SX */
/* JADX INFO: loaded from: classes.dex */
public final class C24053 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f76398;

    /* JADX INFO: renamed from: ۧ */
    public final int f76400;

    /* JADX INFO: renamed from: ۜ */
    public int f76399 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public int f76405 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f76402 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f76404 = 0;

    /* JADX INFO: renamed from: ܳ */
    public int f76401 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f76403 = 0;

    public C24053(int i, C6422 c6422) {
        this.f76400 = i;
        byte[] bArrMo7199 = c6422.mo7199(i);
        this.f76398 = bArrMo7199;
        bArrMo7199[i - 1] = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53311(C6422 c6422) {
        c6422.mo7197(this.f76398);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m53315() {
        this.f76399 = 0;
        this.f76405 = 0;
        this.f76402 = 0;
        this.f76404 = 0;
        this.f76398[this.f76400 - 1] = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53312(int i) {
        int i2 = this.f76405;
        int i3 = this.f76400;
        if (i3 - i2 <= i) {
            this.f76404 = i3;
        } else {
            this.f76404 = i2 + i;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53314() {
        return this.f76405 < this.f76404;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53313() {
        return this.f76401 > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53305() {
        return this.f76405;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53306(int i) {
        int i2 = this.f76405;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f76400;
        }
        return this.f76398[i3] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53308(byte b) {
        int i = this.f76405;
        int i2 = i + 1;
        this.f76405 = i2;
        this.f76398[i] = b;
        if (this.f76402 < i2) {
            this.f76402 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53309(int i, int i2) throws C23856 {
        int i3;
        if (i < 0 || i >= this.f76402) {
            throw new C23856();
        }
        int iMin = Math.min(this.f76404 - this.f76405, i2);
        this.f76401 = i2 - iMin;
        this.f76403 = i;
        int i4 = (this.f76405 - i) - 1;
        byte[] bArr = this.f76398;
        if (i4 < 0) {
            int i5 = this.f76400;
            int i6 = i4 + i5;
            int iMin2 = Math.min(i5 - i6, iMin);
            System.arraycopy(bArr, i6, bArr, this.f76405, iMin2);
            this.f76405 += iMin2;
            iMin -= iMin2;
            if (iMin == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int iMin3 = Math.min(iMin, this.f76405 - i4);
            System.arraycopy(bArr, i4, bArr, this.f76405, iMin3);
            i3 = this.f76405 + iMin3;
            this.f76405 = i3;
            iMin -= iMin3;
        } while (iMin > 0);
        if (this.f76402 < i3) {
            this.f76402 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m53316() throws C23856 {
        int i = this.f76401;
        if (i > 0) {
            m53309(this.f76403, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53310(int i, DataInputStream dataInputStream) throws IOException {
        int iMin = Math.min(this.f76400 - this.f76405, i);
        dataInputStream.readFully(this.f76398, this.f76405, iMin);
        int i2 = this.f76405 + iMin;
        this.f76405 = i2;
        if (this.f76402 < i2) {
            this.f76402 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53307(int i, byte[] bArr) {
        int i2 = this.f76405;
        int i3 = this.f76399;
        int i4 = i2 - i3;
        if (i2 == this.f76400) {
            this.f76405 = 0;
        }
        System.arraycopy(this.f76398, i3, bArr, i, i4);
        this.f76399 = this.f76405;
        return i4;
    }
}
