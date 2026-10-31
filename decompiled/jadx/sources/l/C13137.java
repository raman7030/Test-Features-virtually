package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.۬۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13137 implements InterfaceC10316 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f39297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f39298;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FileLock f39299;

    public C13137(InterfaceC20758 interfaceC20758, boolean z) throws IOException {
        this.f39297 = interfaceC20758.toAbsolutePath();
        FileChannel fileChannelOpen = z ? C12084.open(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.READ, EnumC3824.WRITE) : C12084.open(interfaceC20758, EnumC3824.READ, EnumC3824.WRITE);
        this.f39298 = fileChannelOpen;
        try {
            FileLock fileLockTryLock = fileChannelOpen.tryLock();
            this.f39299 = fileLockTryLock;
            if (fileLockTryLock != null) {
            } else {
                throw new IOException("Recovery file is already in use");
            }
        } catch (IOException | RuntimeException e) {
            this.f39298.close();
            throw e;
        }
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫ */
    public final void mo14384(long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f39298.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Truncated recovery file");
            }
            if (i3 == 0) {
                throw new IOException("Recovery read made no progress");
            }
            j += (long) i3;
        }
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫ */
    public final void mo14383(long j, int i, byte[] bArr) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f39298.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("Recovery write made no progress");
            }
            j += (long) iWrite;
        }
    }

    @Override // l.InterfaceC10316
    public final long length() {
        return this.f39298.size();
    }

    @Override // l.InterfaceC10316
    public final void truncate(long j) throws IOException {
        this.f39298.truncate(j);
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ܺ */
    public final void mo14386() throws IOException {
        this.f39298.force(true);
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo14385() throws Throwable {
        C6082.m16997(this.f39297.getParent());
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f39298;
        try {
            this.f39299.release();
        } finally {
            fileChannel.close();
        }
    }
}
