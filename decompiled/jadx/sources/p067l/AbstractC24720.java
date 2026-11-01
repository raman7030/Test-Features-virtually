package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24720 extends AbstractC15449 {

    /* JADX INFO: renamed from: ۧ */
    public final C22039 f78231;

    /* JADX INFO: renamed from: ܽ */
    public C18685 f78232;

    @Override // p067l.AbstractC15449
    /* JADX INFO: renamed from: ֫ */
    public final void mo35196(Object obj, Object obj2) {
        C22039 c22039 = (C22039) obj;
        boolean z = obj2 == null;
        C22039 c220310 = this.f78231;
        C22039 c220311 = z ? c220310 : this.f78232;
        if (c220311 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C22039.f69353;
            while (!atomicReferenceFieldUpdater.compareAndSet(c22039, this, c220311)) {
                if (atomicReferenceFieldUpdater.get(c22039) != this) {
                    return;
                }
            }
            if (z) {
                C18685 c18685 = this.f78232;
                C13045.m29861(c18685);
                c220310.m49632(c18685);
            }
        }
    }

    public AbstractC24720(C22039 c22039) {
        this.f78231 = c22039;
    }
}
