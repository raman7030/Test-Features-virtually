package l;

import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.᩸᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28PU */
/* JADX INFO: loaded from: classes.dex */
public class C21843 extends AbstractC4204 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8353 f69994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f69995;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f69996;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f69997;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f69998;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f69999;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5615 f70000 = new C5615();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f70001;

    public C21843(int i, int i2) {
        this.f70001 = i;
        this.f69999 = i2;
    }

    static {
        C16840.m39615("media3.decoder");
    }

    @EnsuresNonNull({e.m})
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49228(int i) {
        int i2 = i + this.f69999;
        ByteBuffer byteBuffer = this.f69995;
        if (byteBuffer == null) {
            this.f69995 = m49226(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f69995 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM49226 = m49226(i3);
        byteBufferM49226.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM49226.put(byteBuffer);
        }
        this.f69995 = byteBufferM49226;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m49227() {
        return m12695(1073741824);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49229() {
        ByteBuffer byteBuffer = this.f69995;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f69998;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // l.AbstractC4204
    /* JADX INFO: renamed from: ۧ */
    public void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f69995;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f69998;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f69996 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private ByteBuffer m49226(int i) {
        int i2 = this.f70001;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f69995;
        throw new C15491(C19373.m44634("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", MotionUtils.EASING_TYPE_FORMAT_END, i));
    }
}
