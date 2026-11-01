package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: renamed from: l.ۗۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5278 extends AbstractC6619 {

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f12415;

    public C5278() {
        super(new C4608("XZ Stream or its Index has grown too big"));
        this.f12415 = new ArrayList();
    }

    @Override // p067l.AbstractC6619
    /* JADX INFO: renamed from: ֫ */
    public final void mo11423(long j, long j2) throws C4608 {
        super.mo11423(j, j2);
        this.f12415.add(new C13995(j, j2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11424(OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, crc32);
        checkedOutputStream.write(0);
        C22713.m50841(checkedOutputStream, this.f17067);
        for (C13995 c13995 : this.f12415) {
            C22713.m50841(checkedOutputStream, c13995.f39499);
            C22713.m50841(checkedOutputStream, c13995.f39498);
        }
        for (int iM15094 = m15094(); iM15094 > 0; iM15094--) {
            checkedOutputStream.write(0);
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    @Override // p067l.AbstractC6619
    /* JADX INFO: renamed from: ܽ */
    public final long mo11425() {
        return m15095() + this.f17063 + 12 + 12;
    }
}
