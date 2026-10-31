package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64E4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23104 implements InterfaceC5508 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 f74338;

    public AbstractC23104(InterfaceC5508 interfaceC5508) {
        if (interfaceC5508 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f74338 = interfaceC5508;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public void mo8911(C12521 c12521, long j) {
        this.f74338.mo8911(c12521, j);
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public void flush() {
        this.f74338.flush();
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f74338.mo8912();
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f74338.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f74338.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
