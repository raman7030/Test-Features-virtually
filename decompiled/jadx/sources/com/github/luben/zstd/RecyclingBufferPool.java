package com.github.luben.zstd;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import p067l.C20780;

/* JADX INFO: loaded from: classes.dex */
public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    public static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    public final ConcurrentLinkedQueue pool = new ConcurrentLinkedQueue();

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        ByteBuffer byteBuffer;
        int i2 = buffSize;
        if (i > i2) {
            throw new RuntimeException(C20780.m46928("Unsupported buffer size: ", i, ". Supported buffer sizes: ", " or smaller.", i2));
        }
        do {
            SoftReference softReference = (SoftReference) this.pool.poll();
            if (softReference == null) {
                return ByteBuffer.allocate(buffSize);
            }
            byteBuffer = (ByteBuffer) softReference.get();
        } while (byteBuffer == null);
        return byteBuffer;
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference(byteBuffer));
        }
    }
}
