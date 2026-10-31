package l;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1O7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4686 extends AbstractC16496 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f14876 = new ArrayList(3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13741(AbstractC16496 abstractC16496) {
        this.f14876.add(abstractC16496);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13742(AbstractC16496 abstractC16496) {
        this.f14876.remove(abstractC16496);
    }

    @Override // l.AbstractC16496
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.f14876.iterator();
            while (it.hasNext()) {
                ((AbstractC16496) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC16496
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f14876.iterator();
            while (it.hasNext()) {
                ((AbstractC16496) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // l.AbstractC16496
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f14876.iterator();
            while (it.hasNext()) {
                ((AbstractC16496) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
