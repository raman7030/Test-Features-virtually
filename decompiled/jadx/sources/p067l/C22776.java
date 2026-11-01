package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes5.dex */
public final class C22776 implements InterfaceC7353 {

    /* JADX INFO: renamed from: ᩹ */
    public int f71794 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f71793 = new byte[0];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m50959() {
        return this.f71793;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50962() {
        return this.f71794;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m50961() {
        return Arrays.copyOf(this.f71793, this.f71794);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m50960() {
        Arrays.fill(this.f71793, (byte) 0);
        this.f71794 = 0;
    }

    @Override // p067l.InterfaceC7353
    /* JADX INFO: renamed from: ֨ */
    public final OutputStream mo5811(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C10035(this, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50956(C22776 c22776, int i) {
        if (i > c22776.f71794) {
            byte[] bArr = c22776.f71793;
            if (i > bArr.length) {
                int iMax = Math.max((i >> 2) + i, bArr.length + 262144);
                if (iMax < i) {
                    throw new IndexOutOfBoundsException();
                }
                c22776.f71793 = Arrays.copyOf(c22776.f71793, iMax);
            }
            c22776.f71794 = i;
        }
    }

    @Override // p067l.InterfaceC7353
    /* JADX INFO: renamed from: ۚ */
    public final InputStream mo5812(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C16739(this, i);
    }
}
