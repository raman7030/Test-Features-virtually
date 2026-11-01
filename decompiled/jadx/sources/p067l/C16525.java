package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16525 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f48563;

    /* JADX INFO: renamed from: ۧ */
    public int f48564 = 0;

    public C16525(int i) {
        this.f48563 = new byte[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37500(int i) {
        byte[] bArrM19514 = C8377.m19514(this.f48564, this.f48563);
        this.f48563 = bArrM19514;
        int i2 = this.f48564;
        this.f48564 = i2 + 1;
        bArrM19514[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37501(int i, int i2, byte[] bArr) {
        byte[] bArrM19514 = C8377.m19514(this.f48564 + i2, this.f48563);
        this.f48563 = bArrM19514;
        System.arraycopy(bArr, i, bArrM19514, this.f48564, i2);
        this.f48564 += i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37503(int i) {
        byte[] bArrM19514 = C8377.m19514(this.f48564 + 1, this.f48563);
        this.f48563 = bArrM19514;
        int i2 = this.f48564;
        bArrM19514[i2] = (byte) ((i >> 8) & 255);
        bArrM19514[i2 + 1] = (byte) (i & 255);
        this.f48564 = i2 + 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m37504(int i) {
        byte[] bArrM19514 = C8377.m19514(this.f48564 + 3, this.f48563);
        this.f48563 = bArrM19514;
        int i2 = this.f48564;
        bArrM19514[i2] = (byte) ((i >> 24) & 255);
        bArrM19514[i2 + 1] = (byte) ((i >> 16) & 255);
        bArrM19514[i2 + 2] = (byte) ((i >> 8) & 255);
        bArrM19514[i2 + 3] = (byte) (i & 255);
        this.f48564 = i2 + 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37502(InputStream inputStream) {
        try {
            int i = this.f48564;
            int iAvailable = inputStream.available();
            byte[] bArrM19514 = C8377.m19514(this.f48564 + iAvailable, this.f48563);
            this.f48563 = bArrM19514;
            int i2 = inputStream.read(bArrM19514, i, iAvailable);
            while (i2 != -1) {
                i += i2;
                byte[] bArrM19515 = C8377.m19514(i, this.f48563);
                this.f48563 = bArrM19515;
                i2 = inputStream.read(bArrM19515, i, bArrM19515.length - i);
            }
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m37505(int i) {
        byte[] bArr = this.f48563;
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final char m37506(int i) {
        byte[] bArr = this.f48563;
        return (char) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }
}
