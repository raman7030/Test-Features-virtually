package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21473 implements InterfaceC5245 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69096 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f69095 = new byte[0];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48622() {
        return this.f69095;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m48625() {
        return this.f69096;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m48624() {
        return Arrays.copyOf(this.f69095, this.f69096);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48623() {
        Arrays.fill(this.f69095, (byte) 0);
        this.f69096 = 0;
    }

    @Override // l.InterfaceC5245
    /* JADX INFO: renamed from: ֨ */
    public final OutputStream mo3524(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C8067(this, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48619(C21473 c21473, int i) {
        if (i > c21473.f69096) {
            byte[] bArr = c21473.f69095;
            if (i > bArr.length) {
                int iMax = Math.max((i >> 2) + i, bArr.length + 262144);
                if (iMax < i) {
                    throw new IndexOutOfBoundsException();
                }
                c21473.f69095 = Arrays.copyOf(c21473.f69095, iMax);
            }
            c21473.f69096 = i;
        }
    }

    @Override // l.InterfaceC5245
    /* JADX INFO: renamed from: ۚ */
    public final InputStream mo3525(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C15121(this, i);
    }
}
