package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩷ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 498X */
/* JADX INFO: loaded from: classes.dex */
public final class C21962 implements InterfaceC8550 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f69015;

    /* JADX INFO: renamed from: ۧ */
    public int f69016 = 0;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC8550 f69017 = m49487();

    static {
        ApplicationC14266.m56479(148);
    }

    /* JADX INFO: renamed from: ֫ */
    public static native InterfaceC4527 m49486(byte[] bArr);

    /* JADX INFO: renamed from: ᩳ */
    private native InterfaceC8550 m49487();

    public C21962(byte[] bArr) {
        this.f69015 = bArr;
    }

    @Override // p067l.InterfaceC8550
    public final int read() {
        while (true) {
            InterfaceC8550 interfaceC8550 = this.f69017;
            if (interfaceC8550 == null) {
                return -1;
            }
            int i = interfaceC8550.read();
            if (i != -1) {
                return i;
            }
            this.f69017 = m49487();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m49488() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) (i & 255);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49489() {
        return (m49488() & 255) | ((m49488() & 255) << 8) | ((m49488() & 255) << 16) | ((m49488() & 255) << 24);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m49490() {
        return ((m49488() & 255) << 24) | ((m49488() & 255) << 16) | ((m49488() & 255) << 8) | (m49488() & 255);
    }
}
