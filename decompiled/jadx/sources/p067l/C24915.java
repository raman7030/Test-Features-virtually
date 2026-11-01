package p067l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.᩻۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AW3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24915 extends C3262 {

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f79576 = AtomicIntegerFieldUpdater.newUpdater(C24915.class, "_decision");
    public volatile /* synthetic */ int _decision;

    @Override // p067l.C3262, p067l.C19532
    /* JADX INFO: renamed from: ܽ */
    public final void mo5670(Object obj) {
        mo5671(obj);
    }

    @Override // p067l.C3262, p067l.C19532
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5671(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC13575 interfaceC13575M52679 = C23669.m52679((InterfaceC13575) null);
                if (obj instanceof C19948) {
                    obj = C20086.m45501(((C19948) obj).f60554);
                }
                C18014.m40992(obj, interfaceC13575M52679);
                return;
            }
        } while (!f79576.compareAndSet(this, 0, 2));
    }
}
