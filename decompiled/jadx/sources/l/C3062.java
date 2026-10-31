package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: renamed from: l.ۗۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3062 extends AbstractC4473 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9612;

    public C3062() {
        super(new C2357("XZ Stream or its Index has grown too big"));
        this.f9612 = new ArrayList();
    }

    @Override // l.AbstractC4473
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9381(long j, long j2) throws C2357 {
        super.mo9381(j, j2);
        this.f9612.add(new C12234(j, j2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9382(OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, crc32);
        checkedOutputStream.write(0);
        C21407.m48505(checkedOutputStream, this.f14240);
        for (C12234 c12234 : this.f9612) {
            C21407.m48505(checkedOutputStream, c12234.f36482);
            C21407.m48505(checkedOutputStream, c12234.f36481);
        }
        for (int iM13212 = m13212(); iM13212 > 0; iM13212--) {
            checkedOutputStream.write(0);
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    @Override // l.AbstractC4473
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo9383() {
        return m13213() + this.f14236 + 12 + 12;
    }
}
