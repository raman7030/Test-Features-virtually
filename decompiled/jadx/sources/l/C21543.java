package l;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩸ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21543 implements InterfaceC13512 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12370 f69231;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f69232 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f69230 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48702(Activity activity, C17473 c17473) {
        WeakHashMap weakHashMap = this.f69230;
        C11233.m27805(activity, "activity");
        ReentrantLock reentrantLock = this.f69232;
        reentrantLock.lock();
        try {
            if (c17473.equals((C17473) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (C10254 c10254 : this.f69231.f37100.m16843()) {
                if (C11233.m27802(c10254.m25983(), activity)) {
                    c10254.m25984(c17473);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C21543(C12370 c12370) {
        this.f69231 = c12370;
    }
}
