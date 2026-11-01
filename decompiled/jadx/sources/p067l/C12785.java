package p067l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۧۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12785 implements InterfaceC13455 {

    /* JADX INFO: renamed from: ۧ */
    public final WindowLayoutComponent f35986;

    /* JADX INFO: renamed from: ܽ */
    public final ReentrantLock f35987 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f35985 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final LinkedHashMap f35988 = new LinkedHashMap();

    @Override // p067l.InterfaceC13455
    /* JADX INFO: renamed from: ֫ */
    public final void mo18772(Activity activity, ExecutorC24496 executorC24496, C12941 c12941) {
        C10027 c10027;
        LinkedHashMap linkedHashMap = this.f35985;
        ReentrantLock reentrantLock = this.f35987;
        reentrantLock.lock();
        try {
            C4067 c4067 = (C4067) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f35988;
            if (c4067 == null) {
                c10027 = null;
            } else {
                c4067.m8137(c12941);
                linkedHashMap2.put(c12941, activity);
                c10027 = C10027.f27775;
            }
            if (c10027 == null) {
                C4067 c4068 = new C4067(activity);
                linkedHashMap.put(activity, c4068);
                linkedHashMap2.put(c12941, activity);
                c4068.m8137(c12941);
                this.f35986.addWindowLayoutInfoListener(activity, c4068);
            }
            C10027 c10028 = C10027.f27775;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p067l.InterfaceC13455
    /* JADX INFO: renamed from: ֫ */
    public final void mo18773(InterfaceC1489 interfaceC1489) {
        C13045.m29867(interfaceC1489, "callback");
        ReentrantLock reentrantLock = this.f35987;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f35988.get(interfaceC1489);
            if (activity == null) {
                return;
            }
            C4067 c4067 = (C4067) this.f35985.get(activity);
            if (c4067 == null) {
                return;
            }
            c4067.m8138(interfaceC1489);
            if (c4067.m8139()) {
                this.f35986.removeWindowLayoutInfoListener(c4067);
            }
            C10027 c10027 = C10027.f27775;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C12785(WindowLayoutComponent windowLayoutComponent) {
        this.f35986 = windowLayoutComponent;
    }
}
