package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.۬۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14854 implements InterfaceC12173 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC22097 f42352;

    /* JADX INFO: renamed from: ᩸ */
    public final FileChannel f42353;

    /* JADX INFO: renamed from: ᩹ */
    public final FileLock f42354;

    public C14854(InterfaceC22097 interfaceC22097, boolean z) throws IOException {
        this.f42352 = interfaceC22097.toAbsolutePath();
        FileChannel fileChannelOpen = z ? C13853.open(interfaceC22097, EnumC6003.CREATE_NEW, EnumC6003.READ, EnumC6003.WRITE) : C13853.open(interfaceC22097, EnumC6003.READ, EnumC6003.WRITE);
        this.f42353 = fileChannelOpen;
        try {
            FileLock fileLockTryLock = fileChannelOpen.tryLock();
            this.f42354 = fileLockTryLock;
            if (fileLockTryLock != null) {
            } else {
                throw new IOException("Recovery file is already in use");
            }
        } catch (IOException | RuntimeException e) {
            this.f42353.close();
            throw e;
        }
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16281(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f42353.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16280(long j, int i, byte[] bArr) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f42353.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("Recovery write made no progress");
            }
            j += (long) iWrite;
        }
    }

    @Override // p067l.InterfaceC12173
    public final long length() {
        return this.f42353.size();
    }

    @Override // p067l.InterfaceC12173
    public final void truncate(long j) throws IOException {
        this.f42353.truncate(j);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ܺ */
    public final void mo16283() throws IOException {
        this.f42353.force(true);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo16282() throws Throwable {
        C8149.m18928(this.f42352.getParent());
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f42353;
        try {
            this.f42354.release();
        } finally {
            fileChannel.close();
        }
    }
}
