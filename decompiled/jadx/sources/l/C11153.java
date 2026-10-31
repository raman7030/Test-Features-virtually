package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۧᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11153 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f33480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Inflater f33481;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33483;

    public C11153(InterfaceC6171 interfaceC6171, Inflater inflater) {
        this.f33480 = interfaceC6171;
        this.f33481 = inflater;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        boolean z;
        if (this.f33483) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f33481;
            boolean zNeedsInput = inflater.needsInput();
            InterfaceC6171 interfaceC6171 = this.f33480;
            z = false;
            if (zNeedsInput) {
                int i = this.f33482;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f33482 -= remaining;
                    ((C4097) interfaceC6171).skip(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                C4097 c4097 = (C4097) interfaceC6171;
                if (c4097.mo12308()) {
                    z = true;
                } else {
                    C18914 c18914 = c4097.f13029.f37624;
                    int i2 = c18914.f59597;
                    int i3 = c18914.f59600;
                    int i4 = i2 - i3;
                    this.f33482 = i4;
                    inflater.setInput(c18914.f59596, i3, i4);
                }
            }
            try {
                C18914 c18914M30705 = c12521.m30705(1);
                int iInflate = inflater.inflate(c18914M30705.f59596, c18914M30705.f59597, (int) Math.min(8192L, 8192 - c18914M30705.f59597));
                if (iInflate > 0) {
                    c18914M30705.f59597 += iInflate;
                    long j2 = iInflate;
                    c12521.f37625 += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f33482;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f33482 -= remaining2;
                    ((C4097) interfaceC6171).skip(remaining2);
                }
                if (c18914M30705.f59600 != c18914M30705.f59597) {
                    return -1L;
                }
                c12521.f37624 = c18914M30705.m43656();
                C19620.m45064(c18914M30705);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f33480.mo4333();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f33483) {
            return;
        }
        this.f33481.end();
        this.f33483 = true;
        ((C4097) this.f33480).close();
    }
}
