package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܿܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB7W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18997 {

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer f56637;

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer f56638;

    /* JADX INFO: renamed from: ܽ */
    public final int f56639;

    /* JADX INFO: renamed from: ᩳ */
    public final int f56640;

    public C18997(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.f56637 = byteBuffer;
        this.f56638 = byteBuffer2;
        this.f56639 = i;
        this.f56640 = i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m43141() {
        return this.f56639;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m43140() {
        return this.f56640;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer m43138() {
        return this.f56637.slice();
    }

    /* JADX INFO: renamed from: ܽ */
    public final ByteBuffer m43139() {
        return this.f56638.slice();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22351 m43137() {
        return new C22351(this.f56638.slice());
    }
}
