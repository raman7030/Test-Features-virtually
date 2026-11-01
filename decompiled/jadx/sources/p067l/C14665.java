package p067l;

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
public final class C14665 extends AbstractC6619 {

    /* JADX INFO: renamed from: ܳ */
    public AbstractC7290 f41851;

    public C14665() {
        super(new C23856());
        try {
            this.f41851 = new C9972();
        } catch (NoSuchAlgorithmException unused) {
            this.f41851 = new C20702();
        }
    }

    @Override // p067l.AbstractC6619
    /* JADX INFO: renamed from: ܽ */
    public final long mo11425() {
        return m15095() + this.f17063 + 12 + 12;
    }

    @Override // p067l.AbstractC6619
    /* JADX INFO: renamed from: ֫ */
    public final void mo11423(long j, long j2) {
        super.mo11423(j, j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC7290 abstractC7290 = this.f41851;
        abstractC7290.getClass();
        abstractC7290.mo3895(bArrArray, 0, bArrArray.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33531(InputStream inputStream) {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C16676.m37750(checkedInputStream) != this.f17067) {
            throw new C23856("XZ Block Header or the start of XZ Index is corrupt");
        }
        C14665 c14665 = new C14665();
        for (long j = 0; j < this.f17067; j++) {
            try {
                c14665.mo11423(C16676.m37750(checkedInputStream), C16676.m37750(checkedInputStream));
                if (c14665.f17063 > this.f17063 || c14665.f17066 > this.f17066 || c14665.f17064 > this.f17064) {
                    throw new C23856("XZ Index is corrupt");
                }
            } catch (C4608 unused) {
                throw new C23856("XZ Index is corrupt");
            }
        }
        if (c14665.f17063 != this.f17063 || c14665.f17066 != this.f17066 || c14665.f17064 != this.f17064 || !Arrays.equals(c14665.f41851.mo3896(), this.f41851.mo3896())) {
            throw new C23856("XZ Index is corrupt");
        }
        DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
        for (int iM15094 = m15094(); iM15094 > 0; iM15094--) {
            if (dataInputStream.readUnsignedByte() != 0) {
                throw new C23856("XZ Index is corrupt");
            }
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            if (((value >>> (i * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                throw new C23856("XZ Index is corrupt");
            }
        }
    }
}
