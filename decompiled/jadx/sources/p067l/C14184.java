package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۫۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14184 implements InterfaceC12173 {

    /* JADX INFO: renamed from: ᩸ */
    public final FileChannel f40443;

    public C14184(InterfaceC22097 interfaceC22097) {
        this.f40443 = C13853.open(interfaceC22097, EnumC6003.READ);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16281(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f40443.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery validation file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery validation read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // p067l.InterfaceC12173
    public final long length() {
        return this.f40443.size();
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16280(long j, int i, byte[] bArr) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // p067l.InterfaceC12173
    public final void truncate(long j) throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ܺ */
    public final void mo16283() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo16282() throws IOException {
        throw new IOException("Recovery validation file is read-only");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f40443.close();
    }
}
