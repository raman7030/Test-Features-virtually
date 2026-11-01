package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.᩸᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28PU */
/* JADX INFO: loaded from: classes.dex */
public class C23128 extends AbstractC6364 {

    /* JADX INFO: renamed from: ۗ */
    public C10307 f72703;

    /* JADX INFO: renamed from: ۙ */
    public ByteBuffer f72704;

    /* JADX INFO: renamed from: ۛ */
    public boolean f72705;

    /* JADX INFO: renamed from: ۤ */
    public long f72706;

    /* JADX INFO: renamed from: ۫ */
    public ByteBuffer f72707;

    /* JADX INFO: renamed from: ۬ */
    public final int f72708;

    /* JADX INFO: renamed from: ᩶ */
    public final C7705 f72709 = new C7705();

    /* JADX INFO: renamed from: ᩹ */
    public final int f72710;

    public C23128(int i, int i2) {
        this.f72710 = i;
        this.f72708 = i2;
    }

    static {
        C18373.m41851("media3.decoder");
    }

    @EnsuresNonNull({AbstractC0213e.f989m})
    /* JADX INFO: renamed from: ܳ */
    public final void m51579(int i) {
        int i2 = i + this.f72708;
        ByteBuffer byteBuffer = this.f72704;
        if (byteBuffer == null) {
            this.f72704 = m51577(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f72704 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM51577 = m51577(i3);
        byteBufferM51577.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM51577.put(byteBuffer);
        }
        this.f72704 = byteBufferM51577;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m51578() {
        return m14571(1073741824);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m51580() {
        ByteBuffer byteBuffer = this.f72704;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f72707;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // p067l.AbstractC6364
    /* JADX INFO: renamed from: ۧ */
    public void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f72704;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f72707;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f72705 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    private ByteBuffer m51577(int i) {
        int i2 = this.f72710;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f72704;
        throw new C17091(C20780.m46928("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", MotionUtils.EASING_TYPE_FORMAT_END, i));
    }
}
