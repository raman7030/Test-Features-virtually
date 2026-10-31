package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseZstdBufferDecompressingStreamNoFinalizer implements Closeable {
    public int consumed;
    public int produced;
    public ByteBuffer source;
    public long stream;
    public boolean closed = false;
    public boolean finishedFrame = false;
    public boolean streamEnd = false;

    public abstract long createDStream();

    public abstract long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public abstract long freeDStream(long j);

    public abstract long initDStream(long j);

    public abstract int read(ByteBuffer byteBuffer);

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        this.source = byteBuffer;
    }

    public boolean hasRemaining() {
        if (this.streamEnd) {
            return false;
        }
        return this.source.hasRemaining() || !this.finishedFrame;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(byte[] bArr) throws ZstdIOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
            zstdDictDecompress.releaseSharedLock();
            return this;
        } catch (Throwable th) {
            zstdDictDecompress.releaseSharedLock();
            throw th;
        }
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setLongMax(int i) throws ZstdIOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public int readInternal(ByteBuffer byteBuffer, boolean z) throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.streamEnd) {
            return 0;
        }
        long j = this.stream;
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.source;
        long jDecompressStream = decompressStream(j, byteBuffer, iPosition, iRemaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
        if (Zstd.isError(jDecompressStream)) {
            throw new ZstdIOException(jDecompressStream);
        }
        ByteBuffer byteBuffer3 = this.source;
        byteBuffer3.position(byteBuffer3.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!this.source.hasRemaining()) {
            ByteBuffer byteBufferRefill = refill(this.source);
            this.source = byteBufferRefill;
            if (!z && byteBufferRefill.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
            }
            if (z && !this.source.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z2 = jDecompressStream == 0;
        this.finishedFrame = z2;
        if (z2) {
            this.streamEnd = !this.source.hasRemaining();
        }
        return this.produced;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            freeDStream(this.stream);
        } finally {
            this.closed = true;
            this.source = null;
        }
    }
}
