package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C7250 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC2555 f18914;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC2555 f18915;

    public C7250(AbstractC2555 abstractC2555, AbstractC2555 abstractC2556) {
        this.f18915 = abstractC2555;
        this.f18914 = abstractC2556;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3226(this.f18915, this.f18914);
    }
}
