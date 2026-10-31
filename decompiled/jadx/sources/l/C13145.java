package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8M6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13145 extends C21843 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f39304;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39305;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f39306;

    @Override // l.C21843, l.AbstractC4204
    /* JADX INFO: renamed from: ۧ */
    public final void mo7() {
        super.mo7();
        this.f39305 = 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m31874(int i) {
        C22632.m50631(i > 0);
        this.f39306 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m31872() {
        return this.f39304;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m31870() {
        return this.f39305;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m31873() {
        return this.f39305 > 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31871(C21843 c21843) {
        ByteBuffer byteBuffer;
        C22632.m50631(!c21843.m49227());
        C22632.m50631(!c21843.m12694());
        C22632.m50631(!c21843.m12697());
        if (m31873()) {
            if (this.f39305 >= this.f39306) {
                return false;
            }
            ByteBuffer byteBuffer2 = c21843.f69995;
            if (byteBuffer2 != null && (byteBuffer = this.f69995) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f39305;
        this.f39305 = i + 1;
        if (i == 0) {
            this.f69997 = c21843.f69997;
            if (c21843.m12690()) {
                m12693(1);
            }
        }
        ByteBuffer byteBuffer3 = c21843.f69995;
        if (byteBuffer3 != null) {
            m49228(byteBuffer3.remaining());
            this.f69995.put(byteBuffer3);
        }
        this.f39304 = c21843.f69997;
        return true;
    }

    public C13145() {
        super(2, 0);
        this.f39306 = 32;
    }
}
