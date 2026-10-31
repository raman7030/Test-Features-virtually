package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18864 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f59476;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59477;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59478 = 0;

    public C18864() {
        byte[] bArr = new byte[65536];
        this.f59476 = bArr;
        this.f59477 = bArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43573() {
        return this.f59476;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43574() {
        return this.f59478;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m43576() {
        return this.f59477 == this.f59478;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43575(InputStream inputStream) throws IOException {
        this.f59478 = 0;
        byte[] bArr = this.f59476;
        int i = this.f59477;
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        this.f59478 = i2;
        return i2 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43572(InputStream inputStream) throws IOException {
        int i = this.f59477;
        if (i >= 524288) {
            return false;
        }
        int i2 = i * 2;
        byte[] bArr = this.f59476;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, this.f59478);
            this.f59476 = bArr2;
        }
        this.f59477 = i2;
        byte[] bArr3 = this.f59476;
        int i3 = this.f59478;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr3, i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        this.f59478 = i3;
        return true;
    }
}
