package p067l;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.۠ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9866 extends Closeable, SeekableByteChannel {
    int available();

    void flush();

    long getFilePointer();

    String getName();

    boolean isClosed();

    long length();

    int read();

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    int read(ByteBuffer byteBuffer);

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    void seek(long j);

    int skipBytes(int i);

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۛۧ */
    int mo23137();

    /* JADX INFO: renamed from: ۜ֫ */
    InterfaceC4502 mo23138();

    /* JADX INFO: renamed from: ۡ */
    C24618 mo23139();

    /* JADX INFO: renamed from: ۧ */
    int mo23140(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۧ */
    C24618 mo23141(long j, long j2);
}
