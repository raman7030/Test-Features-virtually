package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23518 extends AbstractC13763 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20697 f75485;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17168 f75486;

    @Override // l.AbstractC13763
    /* JADX INFO: renamed from: ֫ */
    public final void mo33081(Object obj, Object obj2) {
        C20697 c20697 = (C20697) obj;
        boolean z = obj2 == null;
        C20697 c20698 = this.f75485;
        C20697 c20699 = z ? c20698 : this.f75486;
        if (c20699 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C20697.f66672;
            while (!atomicReferenceFieldUpdater.compareAndSet(c20697, this, c20699)) {
                if (atomicReferenceFieldUpdater.get(c20697) != this) {
                    return;
                }
            }
            if (z) {
                C17168 c17168 = this.f75486;
                C11233.m27799(c17168);
                c20698.m47305(c17168);
            }
        }
    }

    public AbstractC23518(C20697 c20697) {
        this.f75485 = c20697;
    }
}
