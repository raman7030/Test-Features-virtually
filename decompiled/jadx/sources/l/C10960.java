package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۧۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10960 implements InterfaceC11665 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WindowLayoutComponent f32994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f32995 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f32993 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f32996 = new LinkedHashMap();

    @Override // l.InterfaceC11665
    /* JADX INFO: renamed from: ֫ */
    public final void mo16844(Activity activity, ExecutorC23282 executorC23282, C11124 c11124) {
        C8058 c8058;
        LinkedHashMap linkedHashMap = this.f32993;
        ReentrantLock reentrantLock = this.f32995;
        reentrantLock.lock();
        try {
            C1787 c1787 = (C1787) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f32996;
            if (c1787 == null) {
                c8058 = null;
            } else {
                c1787.m5942(c11124);
                linkedHashMap2.put(c11124, activity);
                c8058 = C8058.f24861;
            }
            if (c8058 == null) {
                C1787 c1788 = new C1787(activity);
                linkedHashMap.put(activity, c1788);
                linkedHashMap2.put(c11124, activity);
                c1788.m5942(c11124);
                this.f32994.addWindowLayoutInfoListener(activity, c1788);
            }
            C8058 c8059 = C8058.f24861;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.InterfaceC11665
    /* JADX INFO: renamed from: ֫ */
    public final void mo16845(InterfaceC13041 interfaceC13041) {
        C11233.m27805(interfaceC13041, "callback");
        ReentrantLock reentrantLock = this.f32995;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f32996.get(interfaceC13041);
            if (activity == null) {
                return;
            }
            C1787 c1787 = (C1787) this.f32993.get(activity);
            if (c1787 == null) {
                return;
            }
            c1787.m5943(interfaceC13041);
            if (c1787.m5944()) {
                this.f32994.removeWindowLayoutInfoListener(c1787);
            }
            C8058 c8058 = C8058.f24861;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C10960(WindowLayoutComponent windowLayoutComponent) {
        this.f32994 = windowLayoutComponent;
    }
}
