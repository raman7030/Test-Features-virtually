package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܰۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15449 extends AbstractC20698 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44140 = AtomicReferenceFieldUpdater.newUpdater(AbstractC15449.class, Object.class, "_consensus");
    public volatile /* synthetic */ Object _consensus = C24167.f76645;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35196(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public abstract C16672 mo33875(Object obj);

    @Override // p067l.AbstractC20698
    /* JADX INFO: renamed from: ֫ */
    public final Object mo35195(Object obj) {
        Object obj2 = this._consensus;
        C16672 c16672 = C24167.f76645;
        if (obj2 == c16672) {
            C16672 c16672Mo33875 = mo33875(obj);
            obj2 = this._consensus;
            if (obj2 == c16672) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44140;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c16672, c16672Mo33875)) {
                    if (atomicReferenceFieldUpdater.get(this) != c16672) {
                        obj2 = this._consensus;
                    }
                }
                obj2 = c16672Mo33875;
            }
        }
        mo35196(obj, obj2);
        return obj2;
    }
}
