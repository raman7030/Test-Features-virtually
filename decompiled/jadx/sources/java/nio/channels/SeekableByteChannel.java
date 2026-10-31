package java.nio.channels;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface SeekableByteChannel extends ByteChannel {
    long position();

    SeekableByteChannel position(long j);

    @Override // java.nio.channels.ReadableByteChannel
    int read(ByteBuffer byteBuffer);

    long size();

    SeekableByteChannel truncate(long j);

    @Override // java.nio.channels.WritableByteChannel
    int write(ByteBuffer byteBuffer);
}
