package l;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩶ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20119 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f65154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short f65155;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f65158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65159;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C20119(InterfaceC6171 interfaceC6171) {
        this.f65154 = interfaceC6171;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f65159;
            InterfaceC6171 interfaceC6171 = this.f65154;
            if (i3 == 0) {
                interfaceC6171.skip(this.f65155);
                this.f65155 = (short) 0;
                if ((this.f65158 & 4) == 0) {
                    i = this.f65156;
                    int iM13504 = C4596.m13504(interfaceC6171);
                    this.f65159 = iM13504;
                    this.f65157 = iM13504;
                    byte b = (byte) (interfaceC6171.readByte() & 255);
                    this.f65158 = (byte) (interfaceC6171.readByte() & 255);
                    Logger logger = C4596.f14658;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C18002.m42038(true, this.f65156, this.f65157, b, this.f65158));
                    }
                    i2 = interfaceC6171.readInt() & Integer.MAX_VALUE;
                    this.f65156 = i2;
                    if (b != 9) {
                        C18002.m42040("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jMo4334 = interfaceC6171.mo4334(c12521, Math.min(8192L, i3));
                if (jMo4334 != -1) {
                    this.f65159 = (int) (((long) this.f65159) - jMo4334);
                    return jMo4334;
                }
            }
            return -1L;
        } while (i2 == i);
        C18002.m42040("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f65154.mo4333();
    }
}
