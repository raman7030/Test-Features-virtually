package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8M6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14861 extends C23128 {

    /* JADX INFO: renamed from: ۨ */
    public long f42359;

    /* JADX INFO: renamed from: ܰ */
    public int f42360;

    /* JADX INFO: renamed from: ᩺ */
    public int f42361;

    @Override // p067l.C23128, p067l.AbstractC6364
    /* JADX INFO: renamed from: ۧ */
    public final void mo7() {
        super.mo7();
        this.f42360 = 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m33967(int i) {
        C23877.m52957(i > 0);
        this.f42361 = i;
    }

    /* JADX INFO: renamed from: ۚ */
    public final long m33965() {
        return this.f42359;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m33963() {
        return this.f42360;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m33966() {
        return this.f42360 > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33964(C23128 c23128) {
        ByteBuffer byteBuffer;
        C23877.m52957(!c23128.m51578());
        C23877.m52957(!c23128.m14570());
        C23877.m52957(!c23128.m14573());
        if (m33966()) {
            if (this.f42360 >= this.f42361) {
                return false;
            }
            ByteBuffer byteBuffer2 = c23128.f72704;
            if (byteBuffer2 != null && (byteBuffer = this.f72704) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f42360;
        this.f42360 = i + 1;
        if (i == 0) {
            this.f72706 = c23128.f72706;
            if (c23128.m14566()) {
                m14569(1);
            }
        }
        ByteBuffer byteBuffer3 = c23128.f72704;
        if (byteBuffer3 != null) {
            m51579(byteBuffer3.remaining());
            this.f72704.put(byteBuffer3);
        }
        this.f42359 = c23128.f72706;
        return true;
    }

    public C14861() {
        super(2, 0);
        this.f42361 = 32;
    }
}
