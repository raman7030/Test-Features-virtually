package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: l.ܽ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16316 extends FileChannel implements SeekableByteChannel {
    public static final /* synthetic */ int e = 0;
    public final FileChannel a;
    public final boolean b;
    public final boolean c;
    public final InterfaceC20758 d;

    public C16316(FileChannel fileChannel, boolean z, boolean z2, InterfaceC20758 interfaceC20758) {
        this.a = fileChannel;
        this.b = z;
        this.c = z2;
        this.d = z ? interfaceC20758 : null;
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            FileChannel fileChannel = this.a;
            return fileChannel.write(byteBuffer, fileChannel.size());
        }
        return this.a.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.write(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long position() {
        return this.a.position();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel position(long j) throws IOException {
        FileChannel fileChannelPosition = this.a.position(j);
        if (fileChannelPosition instanceof C16316) {
            return (C16316) fileChannelPosition;
        }
        return new C16316(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel truncate(long j) throws IOException {
        FileChannel fileChannelTruncate = this.a.truncate(j);
        if (fileChannelTruncate instanceof C16316) {
            return (C16316) fileChannelTruncate;
        }
        return new C16316(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws IOException {
        this.a.force(z);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        return this.a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockLock = this.a.lock(j, j2, z);
        if (fileLockLock == null) {
            return null;
        }
        return new C17728(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockTryLock = this.a.tryLock(j, j2, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new C17728(fileLockTryLock, this);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        this.a.close();
        if (this.b) {
            this.d.toFile().delete();
        }
    }
}
