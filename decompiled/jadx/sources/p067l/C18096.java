package p067l;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.ܽۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C8EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18096 extends AbstractC4015 {

    /* JADX INFO: renamed from: ۙ */
    public final SeekableByteChannel f54023;

    public C18096(long j, long j2, C24618 c24618) {
        super(j, j2);
        this.f54023 = c24618;
    }

    @Override // p067l.AbstractC4015
    /* JADX INFO: renamed from: ֫ */
    public final int mo7993(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f54023) {
            this.f54023.position(j);
            i = this.f54023.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
