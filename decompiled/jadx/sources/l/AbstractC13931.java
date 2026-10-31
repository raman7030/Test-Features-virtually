package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13931 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 f41606;

    public AbstractC13931(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f41606 = interfaceC1274;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 m33365() {
        return this.f41606;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public long mo4334(C12521 c12521, long j) {
        return this.f41606.mo4334(c12521, 8192L);
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f41606.mo4333();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41606.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + MotionUtils.EASING_TYPE_FORMAT_START + this.f41606.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
