package p067l;

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
public final class C17875 extends FileChannel implements SeekableByteChannel {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f53421e = 0;

    /* JADX INFO: renamed from: a */
    public final FileChannel f53422a;

    /* JADX INFO: renamed from: b */
    public final boolean f53423b;

    /* JADX INFO: renamed from: c */
    public final boolean f53424c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22097 f53425d;

    public C17875(FileChannel fileChannel, boolean z, boolean z2, InterfaceC22097 interfaceC22097) {
        this.f53422a = fileChannel;
        this.f53423b = z;
        this.f53424c = z2;
        this.f53425d = z ? interfaceC22097 : null;
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f53422a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f53422a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f53424c) {
            FileChannel fileChannel = this.f53422a;
            return fileChannel.write(byteBuffer, fileChannel.size());
        }
        return this.f53422a.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f53422a.write(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long position() {
        return this.f53422a.position();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel position(long j) throws IOException {
        FileChannel fileChannelPosition = this.f53422a.position(j);
        if (fileChannelPosition instanceof C17875) {
            return (C17875) fileChannelPosition;
        }
        return new C17875(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long size() {
        return this.f53422a.size();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel truncate(long j) throws IOException {
        FileChannel fileChannelTruncate = this.f53422a.truncate(j);
        if (fileChannelTruncate instanceof C17875) {
            return (C17875) fileChannelTruncate;
        }
        return new C17875(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws IOException {
        this.f53422a.force(z);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.f53422a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.f53422a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        return this.f53422a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        return this.f53422a.write(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        return this.f53422a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockLock = this.f53422a.lock(j, j2, z);
        if (fileLockLock == null) {
            return null;
        }
        return new C19217(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockTryLock = this.f53422a.tryLock(j, j2, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new C19217(fileLockTryLock, this);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        this.f53422a.close();
        if (this.f53423b) {
            this.f53425d.toFile().delete();
        }
    }
}
