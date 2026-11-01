package p067l;

import android.os.IBinder;

/* JADX INFO: renamed from: l.ۘۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5871 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f14436;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f14437;

    public RunnableC5871(C2517 c2517, C3188 c3188) {
        this.f14436 = c2517;
        this.f14437 = c3188;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f14437.f6126.getBinder();
        C11868 c11868 = (C11868) this.f14436.f4113.f48755.remove(binder);
        if (c11868 != null) {
            binder.unlinkToDeath(c11868, 0);
        }
    }
}
