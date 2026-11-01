package p067l;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1O7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6822 extends AbstractC18046 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f17705 = new ArrayList(3);

    /* JADX INFO: renamed from: ֫ */
    public final void m15616(AbstractC18046 abstractC18046) {
        this.f17705.add(abstractC18046);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15617(AbstractC18046 abstractC18046) {
        this.f17705.remove(abstractC18046);
    }

    @Override // p067l.AbstractC18046
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.f17705.iterator();
            while (it.hasNext()) {
                ((AbstractC18046) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // p067l.AbstractC18046
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f17705.iterator();
            while (it.hasNext()) {
                ((AbstractC18046) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // p067l.AbstractC18046
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f17705.iterator();
            while (it.hasNext()) {
                ((AbstractC18046) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
