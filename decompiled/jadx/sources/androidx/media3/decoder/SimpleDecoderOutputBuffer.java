package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p067l.AbstractC21787;
import p067l.InterfaceC23798;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends AbstractC21787 {

    /* JADX INFO: renamed from: ۗ */
    public ByteBuffer f0;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC23798 f1;

    public SimpleDecoderOutputBuffer(InterfaceC23798 interfaceC23798) {
        this.f1 = interfaceC23798;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer m6(int i, long j) {
        this.f68601 = j;
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f0.position(0);
        this.f0.limit(i);
        return this.f0;
    }

    @Override // p067l.AbstractC21787, p067l.AbstractC6364
    /* JADX INFO: renamed from: ۧ */
    public final void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // p067l.AbstractC21787
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8() {
        this.f1.mo9106(this);
    }
}
