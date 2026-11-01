package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15608 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3579 f44687;

    public AbstractC15608(InterfaceC3579 interfaceC3579) {
        if (interfaceC3579 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f44687 = interfaceC3579;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3579 m35484() {
        return this.f44687;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public long mo6580(C14268 c14268, long j) {
        return this.f44687.mo6580(c14268, 8192L);
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f44687.mo6579();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44687.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f44687.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
