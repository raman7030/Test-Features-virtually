package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    public static final int dstSize;
    public final BufferPool bufferPool;
    public boolean closeFrameOnFlush;
    public final byte[] dst;
    public final ByteBuffer dstByteBuffer;
    public long dstPos;
    public boolean frameClosed;
    public boolean frameStarted;
    public boolean isClosed;
    public long srcPos;
    public final long stream;

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    public static native int freeCStream(long j);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j);

    public synchronized void closeWithoutClosingParentStream() {
        close(false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        int iFlushStream;
        int iEndStream;
        if (this.isClosed) {
            throw new IOException("StreamClosed");
        }
        if (!this.frameClosed) {
            if (this.closeFrameOnFlush) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j = iEndStream;
                    if (Zstd.isError(j)) {
                        throw new ZstdIOException(j);
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (iEndStream > 0);
                this.frameClosed = true;
            } else {
                do {
                    iFlushStream = flushStream(this.stream, this.dst, dstSize);
                    long j2 = iFlushStream;
                    if (Zstd.isError(j2)) {
                        throw new ZstdIOException(j2);
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (iFlushStream > 0);
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChainLog(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionChainLog = Zstd.setCompressionChainLog(this.stream, i);
        if (Zstd.isError(compressionChainLog)) {
            throw new ZstdIOException(compressionChainLog);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionChecksums = Zstd.setCompressionChecksums(this.stream, z);
        if (Zstd.isError(compressionChecksums)) {
            throw new ZstdIOException(compressionChecksums);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.closeFrameOnFlush = z;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setHashLog(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionHashLog = Zstd.setCompressionHashLog(this.stream, i);
        if (Zstd.isError(compressionHashLog)) {
            throw new ZstdIOException(compressionHashLog);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setJobSize(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionJobSize = Zstd.setCompressionJobSize(this.stream, i);
        if (Zstd.isError(compressionJobSize)) {
            throw new ZstdIOException(compressionJobSize);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionLevel = Zstd.setCompressionLevel(this.stream, i);
        if (Zstd.isError(compressionLevel)) {
            throw new ZstdIOException(compressionLevel);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionLong = Zstd.setCompressionLong(this.stream, i);
        if (Zstd.isError(compressionLong)) {
            throw new ZstdIOException(compressionLong);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setMinMatch(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionMinMatch = Zstd.setCompressionMinMatch(this.stream, i);
        if (Zstd.isError(compressionMinMatch)) {
            throw new ZstdIOException(compressionMinMatch);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setOverlapLog(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.stream, i);
        if (Zstd.isError(compressionOverlapLog)) {
            throw new ZstdIOException(compressionOverlapLog);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setSearchLog(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionSearchLog = Zstd.setCompressionSearchLog(this.stream, i);
        if (Zstd.isError(compressionSearchLog)) {
            throw new ZstdIOException(compressionSearchLog);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setStrategy(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionStrategy = Zstd.setCompressionStrategy(this.stream, i);
        if (Zstd.isError(compressionStrategy)) {
            throw new ZstdIOException(compressionStrategy);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setTargetLength(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionTargetLength = Zstd.setCompressionTargetLength(this.stream, i);
        if (Zstd.isError(compressionTargetLength)) {
            throw new ZstdIOException(compressionTargetLength);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWindowLog(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionWindowLog = Zstd.setCompressionWindowLog(this.stream, i);
        if (Zstd.isError(compressionWindowLog)) {
            throw new ZstdIOException(compressionWindowLog);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long compressionWorkers = Zstd.setCompressionWorkers(this.stream, i);
        if (Zstd.isError(compressionWorkers)) {
            throw new ZstdIOException(compressionWorkers);
        }
        return this;
    }

    static {
        Native.load();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i) {
        this(outputStream, NoPool.INSTANCE);
        Zstd.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) {
        this(outputStream, NoPool.INSTANCE);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool, int i) {
        this(outputStream, bufferPool);
        Zstd.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool) throws ZstdIOException {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.isClosed = false;
        this.closeFrameOnFlush = false;
        this.frameClosed = true;
        this.frameStarted = false;
        this.stream = createCStream();
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, dstSize);
        this.dstByteBuffer = arrayBackedBuffer;
        this.dst = arrayBackedBuffer.array();
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long jLoadDictCompress = Zstd.loadDictCompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictCompress)) {
            throw new ZstdIOException(jLoadDictCompress);
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        long jLoadFastDictCompress = Zstd.loadFastDictCompress(this.stream, zstdDictCompress);
        if (Zstd.isError(jLoadFastDictCompress)) {
            throw new ZstdIOException(jLoadFastDictCompress);
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (this.frameClosed) {
                long jResetCStream = resetCStream(this.stream);
                if (Zstd.isError(jResetCStream)) {
                    throw new ZstdIOException(jResetCStream);
                }
                this.frameClosed = false;
                this.frameStarted = true;
            }
            int i3 = i2 + i;
            this.srcPos = i;
            while (this.srcPos < i3) {
                long jCompressStream = compressStream(this.stream, this.dst, dstSize, bArr, i3);
                if (Zstd.isError(jCompressStream)) {
                    throw new ZstdIOException(jCompressStream);
                }
                long j = this.dstPos;
                if (j > 0) {
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) j);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        close(true);
    }

    private void close(boolean z) {
        int iEndStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameStarted) {
                long jResetCStream = resetCStream(this.stream);
                if (Zstd.isError(jResetCStream)) {
                    throw new ZstdIOException(jResetCStream);
                }
                this.frameClosed = false;
            }
            if (!this.frameClosed) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j = iEndStream;
                    if (Zstd.isError(j)) {
                        throw new ZstdIOException(j);
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (iEndStream > 0);
            }
            if (z) {
                ((FilterOutputStream) this).out.close();
            }
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
        } catch (Throwable th) {
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
            throw th;
        }
    }
}
