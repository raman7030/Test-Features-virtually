package p067l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܰۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C15297 {

    /* JADX INFO: renamed from: ֫ */
    public final Executor f43664;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f43665;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12498 f43666;

    public C15297(C12498 c12498, C12287 c12287, Executor executor) {
        this.f43666 = c12498;
        this.f43665 = new WeakReference(c12287);
        this.f43664 = executor;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34832() {
        return this.f43665.get() == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34831() {
        this.f43664.execute(new Runnable() { // from class: l.᩺ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                C15297.m34830(this.f76261);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34830(C15297 c15297) {
        InterfaceC13287 interfaceC13287 = (InterfaceC13287) c15297.f43665.get();
        if (interfaceC13287 != null) {
            interfaceC13287.mo28309(c15297.f43666.m28792());
        }
    }
}
