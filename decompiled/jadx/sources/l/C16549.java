package l;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.ܽۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C8EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C16549 extends AbstractC1733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f50845;

    public C16549(long j, long j2, C23411 c23411) {
        super(j, j2);
        this.f50845 = c23411;
    }

    @Override // l.AbstractC1733
    /* JADX INFO: renamed from: ֫ */
    public final int mo5783(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f50845) {
            this.f50845.position(j);
            i = this.f50845.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
