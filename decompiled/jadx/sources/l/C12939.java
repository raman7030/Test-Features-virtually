package l;

import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* JADX INFO: renamed from: l.۬ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12939 extends AbstractC4473 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5179 f38807;

    public C12939() {
        super(new C22609());
        try {
            this.f38807 = new C8001();
        } catch (NoSuchAlgorithmException unused) {
            this.f38807 = new C19291();
        }
    }

    @Override // l.AbstractC4473
    /* JADX INFO: renamed from: ܽ */
    public final long mo9383() {
        return m13213() + this.f14236 + 12 + 12;
    }

    @Override // l.AbstractC4473
    /* JADX INFO: renamed from: ֫ */
    public final void mo9381(long j, long j2) {
        super.mo9381(j, j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC5179 abstractC5179 = this.f38807;
        abstractC5179.getClass();
        abstractC5179.mo1497(bArrArray, 0, bArrArray.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31444(InputStream inputStream) {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C15055.m35592(checkedInputStream) != this.f14240) {
            throw new C22609("XZ Block Header or the start of XZ Index is corrupt");
        }
        C12939 c12939 = new C12939();
        for (long j = 0; j < this.f14240; j++) {
            try {
                c12939.mo9381(C15055.m35592(checkedInputStream), C15055.m35592(checkedInputStream));
                if (c12939.f14236 > this.f14236 || c12939.f14239 > this.f14239 || c12939.f14237 > this.f14237) {
                    throw new C22609("XZ Index is corrupt");
                }
            } catch (C2357 unused) {
                throw new C22609("XZ Index is corrupt");
            }
        }
        if (c12939.f14236 != this.f14236 || c12939.f14239 != this.f14239 || c12939.f14237 != this.f14237 || !Arrays.equals(c12939.f38807.mo1498(), this.f38807.mo1498())) {
            throw new C22609("XZ Index is corrupt");
        }
        DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
        for (int iM13212 = m13212(); iM13212 > 0; iM13212--) {
            if (dataInputStream.readUnsignedByte() != 0) {
                throw new C22609("XZ Index is corrupt");
            }
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            if (((value >>> (i * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                throw new C22609("XZ Index is corrupt");
            }
        }
    }
}
