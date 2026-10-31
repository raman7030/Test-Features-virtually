package l;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܽۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S2V9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16550 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f50846;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4556 f50847;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50848 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23606 f50849;

    public AbstractC16550() {
        C23606 c23606 = new C23606();
        c23606.f76519 = (char) 1;
        this.f50849 = c23606;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10907 m38927(int i) {
        C23606 c23606 = this.f50849;
        if (i < 1 || i > 65535) {
            c23606.f76519 = (char) 1;
        } else {
            c23606.f76519 = (char) i;
        }
        return (C10907) this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1734 m38926() {
        AbstractC4556 abstractC4556 = this.f50847;
        if (abstractC4556 == null) {
            throw new NullPointerException("Source is not set");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f50846;
        boolean z = this.f50848;
        GifInfoHandle gifInfoHandleMo13407 = abstractC4556.mo13407();
        gifInfoHandleMo13407.m52908(false, this.f50849.f76519);
        return new C1734(gifInfoHandleMo13407, scheduledThreadPoolExecutor, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10907 m38928(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f50846 = scheduledThreadPoolExecutor;
        return (C10907) this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10907 m38931() {
        this.f50848 = false;
        return (C10907) this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38930(InputStream inputStream) {
        this.f50847 = new C22195(inputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38929(File file) {
        this.f50847 = new C21490(file);
    }
}
