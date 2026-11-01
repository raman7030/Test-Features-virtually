package p067l;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩸ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22843 implements InterfaceC15210 {

    /* JADX INFO: renamed from: ۧ */
    public final C14125 f71931;

    /* JADX INFO: renamed from: ܽ */
    public final ReentrantLock f71932 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫ */
    public final WeakHashMap f71930 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m51047(Activity activity, C18975 c18975) {
        WeakHashMap weakHashMap = this.f71930;
        C13045.m29867(activity, "activity");
        ReentrantLock reentrantLock = this.f71932;
        reentrantLock.lock();
        try {
            if (c18975.equals((C18975) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (C12114 c12114 : this.f71931.f40116.m18771()) {
                if (C13045.m29864(c12114.m28005(), activity)) {
                    c12114.m28006(c18975);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C22843(C14125 c14125) {
        this.f71931 = c14125;
    }
}
