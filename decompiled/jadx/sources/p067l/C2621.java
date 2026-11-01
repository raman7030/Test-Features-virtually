package p067l;

import com.github.luben.zstd.ZstdInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.֡۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6V5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2621 extends ZstdInputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final C5738 f4366;

    public C2621(C5738 c5738, InputStream inputStream) {
        super(inputStream);
        this.f4366 = c5738;
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C4809.m10150(e, this.f4366);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C4809.m10150(e, this.f4366);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws ZipException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C4809.m10150(e, this.f4366);
            throw null;
        }
    }
}
