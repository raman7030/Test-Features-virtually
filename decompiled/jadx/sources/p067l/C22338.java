package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S3IR */
/* JADX INFO: loaded from: classes4.dex */
public class C22338 {

    /* JADX INFO: renamed from: ֫ */
    public ByteBuffer f70516;

    /* JADX INFO: renamed from: ۧ */
    public int f70517;

    /* JADX INFO: renamed from: ܽ */
    public int f70518;

    /* JADX INFO: renamed from: ᩳ */
    public int f70519;

    public C22338() {
        C11609.m26729();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50153(int i) {
        if (i < this.f70518) {
            return this.f70516.getShort(this.f70519 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50154(ByteBuffer byteBuffer, int i) {
        this.f70516 = byteBuffer;
        if (byteBuffer != null) {
            this.f70517 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f70519 = i2;
            this.f70518 = this.f70516.getShort(i2);
            return;
        }
        this.f70517 = 0;
        this.f70519 = 0;
        this.f70518 = 0;
    }
}
