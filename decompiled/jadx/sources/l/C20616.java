package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩷ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 498X */
/* JADX INFO: loaded from: classes.dex */
public final class C20616 implements InterfaceC6504 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f66333;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66334 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC6504 f66335 = m47160();

    static {
        ApplicationC12518.m30701(148);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native InterfaceC2271 m47159(byte[] bArr);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private native InterfaceC6504 m47160();

    public C20616(byte[] bArr) {
        this.f66333 = bArr;
    }

    @Override // l.InterfaceC6504
    public final int read() {
        while (true) {
            InterfaceC6504 interfaceC6504 = this.f66335;
            if (interfaceC6504 == null) {
                return -1;
            }
            int i = interfaceC6504.read();
            if (i != -1) {
                return i;
            }
            this.f66335 = m47160();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m47161() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) (i & 255);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47162() {
        return (m47161() & 255) | ((m47161() & 255) << 8) | ((m47161() & 255) << 16) | ((m47161() & 255) << 24);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47163() {
        return ((m47161() & 255) << 24) | ((m47161() & 255) << 16) | ((m47161() & 255) << 8) | (m47161() & 255);
    }
}
