package l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܰۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13604 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f40586;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f40587;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10659 f40588;

    public C13604(C10659 c10659, C10436 c10436, Executor executor) {
        this.f40588 = c10659;
        this.f40587 = new WeakReference(c10436);
        this.f40586 = executor;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32720() {
        return this.f40587.get() == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32719() {
        this.f40586.execute(new Runnable() { // from class: l.᩺ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                C13604.m32718(this.f73531);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32718(C13604 c13604) {
        InterfaceC11489 interfaceC11489 = (InterfaceC11489) c13604.f40587.get();
        if (interfaceC11489 != null) {
            interfaceC11489.mo26280(c13604.f40588.m26753());
        }
    }
}
