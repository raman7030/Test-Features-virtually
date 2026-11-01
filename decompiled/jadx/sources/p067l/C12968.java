package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۧᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12968 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8233 f36480;

    /* JADX INFO: renamed from: ᩶ */
    public final Inflater f36481;

    /* JADX INFO: renamed from: ᩸ */
    public int f36482;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f36483;

    public C12968(InterfaceC8233 interfaceC8233, Inflater inflater) {
        this.f36480 = interfaceC8233;
        this.f36481 = inflater;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        boolean z;
        if (this.f36483) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f36481;
            boolean zNeedsInput = inflater.needsInput();
            InterfaceC8233 interfaceC8233 = this.f36480;
            z = false;
            if (zNeedsInput) {
                int i = this.f36482;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f36482 -= remaining;
                    ((C6262) interfaceC8233).skip(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                C6262 c6262 = (C6262) interfaceC8233;
                if (c6262.mo14213()) {
                    z = true;
                } else {
                    C20344 c20344 = c6262.f15843.f40648;
                    int i2 = c20344.f62828;
                    int i3 = c20344.f62831;
                    int i4 = i2 - i3;
                    this.f36482 = i4;
                    inflater.setInput(c20344.f62827, i3, i4);
                }
            }
            try {
                C20344 c20344M32779 = c14268.m32779(1);
                int iInflate = inflater.inflate(c20344M32779.f62827, c20344M32779.f62828, (int) Math.min(8192L, 8192 - c20344M32779.f62828));
                if (iInflate > 0) {
                    c20344M32779.f62828 += iInflate;
                    long j2 = iInflate;
                    c14268.f40649 += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f36482;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f36482 -= remaining2;
                    ((C6262) interfaceC8233).skip(remaining2);
                }
                if (c20344M32779.f62831 != c20344M32779.f62828) {
                    return -1L;
                }
                c14268.f40648 = c20344M32779.m45922();
                C21015.m47360(c20344M32779);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f36480.mo6579();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f36483) {
            return;
        }
        this.f36481.end();
        this.f36483 = true;
        ((C6262) this.f36480).close();
    }
}
