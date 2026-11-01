package p067l;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩶ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21489 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC8233 f67793;

    /* JADX INFO: renamed from: ۙ */
    public short f67794;

    /* JADX INFO: renamed from: ۬ */
    public int f67795;

    /* JADX INFO: renamed from: ᩶ */
    public int f67796;

    /* JADX INFO: renamed from: ᩸ */
    public byte f67797;

    /* JADX INFO: renamed from: ᩹ */
    public int f67798;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C21489(InterfaceC8233 interfaceC8233) {
        this.f67793 = interfaceC8233;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f67798;
            InterfaceC8233 interfaceC8233 = this.f67793;
            if (i3 == 0) {
                interfaceC8233.skip(this.f67794);
                this.f67794 = (short) 0;
                if ((this.f67797 & 4) == 0) {
                    i = this.f67795;
                    int iM15393 = C6736.m15393(interfaceC8233);
                    this.f67798 = iM15393;
                    this.f67796 = iM15393;
                    byte b = (byte) (interfaceC8233.readByte() & 255);
                    this.f67797 = (byte) (interfaceC8233.readByte() & 255);
                    Logger logger = C6736.f17486;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C19477.m44288(true, this.f67795, this.f67796, b, this.f67797));
                    }
                    i2 = interfaceC8233.readInt() & Integer.MAX_VALUE;
                    this.f67795 = i2;
                    if (b != 9) {
                        C19477.m44290("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jMo6580 = interfaceC8233.mo6580(c14268, Math.min(8192L, i3));
                if (jMo6580 != -1) {
                    this.f67798 = (int) (((long) this.f67798) - jMo6580);
                    return jMo6580;
                }
            }
            return -1L;
        } while (i2 == i);
        C19477.m44290("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f67793.mo6579();
    }
}
