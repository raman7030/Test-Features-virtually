package p067l;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܽۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S2V9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18097 {

    /* JADX INFO: renamed from: ֫ */
    public ScheduledThreadPoolExecutor f54024;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6698 f54025;

    /* JADX INFO: renamed from: ܽ */
    public boolean f54026 = true;

    /* JADX INFO: renamed from: ᩳ */
    public final C24803 f54027;

    public AbstractC18097() {
        C24803 c24803 = new C24803();
        c24803.f79263 = (char) 1;
        this.f54027 = c24803;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12734 m41153(int i) {
        C24803 c24803 = this.f54027;
        if (i < 1 || i > 65535) {
            c24803.f79263 = (char) 1;
        } else {
            c24803.f79263 = (char) i;
        }
        return (C12734) this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4016 m41152() {
        AbstractC6698 abstractC6698 = this.f54025;
        if (abstractC6698 == null) {
            throw new NullPointerException("Source is not set");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f54024;
        boolean z = this.f54026;
        GifInfoHandle gifInfoHandleMo15295 = abstractC6698.mo15295();
        gifInfoHandleMo15295.m55472(false, this.f54027.f79263);
        return new C4016(gifInfoHandleMo15295, scheduledThreadPoolExecutor, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12734 m41154(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f54024 = scheduledThreadPoolExecutor;
        return (C12734) this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12734 m41157() {
        this.f54026 = false;
        return (C12734) this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41156(InputStream inputStream) {
        this.f54025 = new C23462(inputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41155(File file) {
        this.f54025 = new C22792(file);
    }
}
