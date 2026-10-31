package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.᩻۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AW3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23723 extends C0940 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f76825 = AtomicIntegerFieldUpdater.newUpdater(C23723.class, "_decision");
    public volatile /* synthetic */ int _decision;

    @Override // l.C0940, l.C18059
    /* JADX INFO: renamed from: ܽ */
    public final void mo3351(Object obj) {
        mo3352(obj);
    }

    @Override // l.C0940, l.C18059
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3352(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC11791 interfaceC11791M50339 = C22412.m50339((InterfaceC11791) null);
                if (obj instanceof C18497) {
                    obj = C18642.m43235(((C18497) obj).f57332);
                }
                C16462.m38766(obj, interfaceC11791M50339);
                return;
            }
        } while (!f76825.compareAndSet(this, 0, 2));
    }
}
