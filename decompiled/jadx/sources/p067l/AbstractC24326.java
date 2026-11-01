package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64E4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24326 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC7603 f77083;

    public AbstractC24326(InterfaceC7603 interfaceC7603) {
        if (interfaceC7603 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f77083 = interfaceC7603;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public void mo10979(C14268 c14268, long j) {
        this.f77083.mo10979(c14268, j);
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public void flush() {
        this.f77083.flush();
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f77083.mo10980();
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f77083.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f77083.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
