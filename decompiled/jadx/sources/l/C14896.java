package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14896 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f45448;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45449 = 0;

    public C14896(int i) {
        this.f45448 = new byte[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35348(int i) {
        byte[] bArrM17574 = C6322.m17574(this.f45449, this.f45448);
        this.f45448 = bArrM17574;
        int i2 = this.f45449;
        this.f45449 = i2 + 1;
        bArrM17574[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35349(int i, int i2, byte[] bArr) {
        byte[] bArrM17574 = C6322.m17574(this.f45449 + i2, this.f45448);
        this.f45448 = bArrM17574;
        System.arraycopy(bArr, i, bArrM17574, this.f45449, i2);
        this.f45449 += i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35351(int i) {
        byte[] bArrM17574 = C6322.m17574(this.f45449 + 1, this.f45448);
        this.f45448 = bArrM17574;
        int i2 = this.f45449;
        bArrM17574[i2] = (byte) ((i >> 8) & 255);
        bArrM17574[i2 + 1] = (byte) (i & 255);
        this.f45449 = i2 + 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35352(int i) {
        byte[] bArrM17574 = C6322.m17574(this.f45449 + 3, this.f45448);
        this.f45448 = bArrM17574;
        int i2 = this.f45449;
        bArrM17574[i2] = (byte) ((i >> 24) & 255);
        bArrM17574[i2 + 1] = (byte) ((i >> 16) & 255);
        bArrM17574[i2 + 2] = (byte) ((i >> 8) & 255);
        bArrM17574[i2 + 3] = (byte) (i & 255);
        this.f45449 = i2 + 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35350(InputStream inputStream) {
        try {
            int i = this.f45449;
            int iAvailable = inputStream.available();
            byte[] bArrM17574 = C6322.m17574(this.f45449 + iAvailable, this.f45448);
            this.f45448 = bArrM17574;
            int i2 = inputStream.read(bArrM17574, i, iAvailable);
            while (i2 != -1) {
                i += i2;
                byte[] bArrM17575 = C6322.m17574(i, this.f45448);
                this.f45448 = bArrM17575;
                i2 = inputStream.read(bArrM17575, i, bArrM17575.length - i);
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35353(int i) {
        byte[] bArr = this.f45448;
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char m35354(int i) {
        byte[] bArr = this.f45448;
        return (char) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }
}
