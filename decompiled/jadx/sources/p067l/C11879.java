package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: l.ۤۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAQD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11879 extends C13890 {

    /* JADX INFO: renamed from: ۫ */
    public static final byte[] f33097 = {C0684bo.f2505j, -117, 8, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۬ */
    public CRC32 f33098;

    public C11879(OutputStream outputStream) throws IOException {
        super(outputStream, new Deflater(1, true));
        CRC32 crc32 = new CRC32();
        this.f33098 = crc32;
        this.f39219 = true;
        ((FilterOutputStream) this).out.write(f33097);
        crc32.reset();
    }

    @Override // p067l.C13890, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        this.f33098.update(bArr, i, i2);
    }

    @Override // p067l.C13890
    public final void finish() throws IOException {
        Deflater deflater = this.f39220;
        if (deflater.finished()) {
            return;
        }
        deflater.finish();
        while (true) {
            boolean zFinished = deflater.finished();
            CRC32 crc32 = this.f33098;
            if (zFinished) {
                int value = (int) crc32.getValue();
                int i = value >> 16;
                int totalIn = deflater.getTotalIn();
                int i2 = totalIn >> 16;
                ((FilterOutputStream) this).out.write(new byte[]{(byte) (value & 255), (byte) (((value & 65535) >> 8) & 255), (byte) (i & 255), (byte) (((i & 65535) >> 8) & 255), (byte) (totalIn & 255), (byte) (((totalIn & 65535) >> 8) & 255), (byte) (i2 & 255), (byte) (((65535 & i2) >> 8) & 255)});
                return;
            }
            byte[] bArr = this.f39221;
            int iDeflate = deflater.deflate(bArr, 0, bArr.length);
            if (deflater.finished()) {
                byte[] bArr2 = this.f39221;
                if (iDeflate <= bArr2.length - 8) {
                    int value2 = (int) crc32.getValue();
                    bArr2[iDeflate] = (byte) (value2 & 255);
                    bArr2[iDeflate + 1] = (byte) (((value2 & 65535) >> 8) & 255);
                    int i3 = value2 >> 16;
                    bArr2[iDeflate + 2] = (byte) (i3 & 255);
                    bArr2[iDeflate + 3] = (byte) (((i3 & 65535) >> 8) & 255);
                    int totalIn2 = deflater.getTotalIn();
                    bArr2[iDeflate + 4] = (byte) (totalIn2 & 255);
                    bArr2[iDeflate + 5] = (byte) (((totalIn2 & 65535) >> 8) & 255);
                    int i4 = totalIn2 >> 16;
                    bArr2[iDeflate + 6] = (byte) (i4 & 255);
                    bArr2[iDeflate + 7] = (byte) (((65535 & i4) >> 8) & 255);
                    ((FilterOutputStream) this).out.write(this.f39221, 0, iDeflate + 8);
                    return;
                }
            }
            if (iDeflate > 0) {
                ((FilterOutputStream) this).out.write(this.f39221, 0, iDeflate);
            }
        }
    }
}
