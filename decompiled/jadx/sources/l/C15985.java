package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15985 implements InterfaceC12542 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection f49330;

    public C15985(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f49330 = collection;
    }

    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫ */
    public final void mo1935(AbstractC18809 abstractC18809, Object obj, int i, int i2, String str, C2581 c2581) {
        Iterator it = this.f49330.iterator();
        while (it.hasNext()) {
            ((InterfaceC12542) it.next()).mo1935(abstractC18809, obj, i, i2, str, c2581);
        }
    }

    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫ */
    public final void mo17112(AbstractC9637 abstractC9637, C5883 c5883, int i, int i2, boolean z, BitSet bitSet, C13163 c13163) {
        Iterator it = this.f49330.iterator();
        while (it.hasNext()) {
            ((InterfaceC12542) it.next()).mo17112(abstractC9637, c5883, i, i2, z, bitSet, c13163);
        }
    }

    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫ */
    public final void mo17111(AbstractC9637 abstractC9637, C5883 c5883, int i, int i2, BitSet bitSet, C13163 c13163) {
        Iterator it = this.f49330.iterator();
        while (it.hasNext()) {
            ((InterfaceC12542) it.next()).mo17111(abstractC9637, c5883, i, i2, bitSet, c13163);
        }
    }

    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫ */
    public final void mo17110(AbstractC9637 abstractC9637, C5883 c5883, int i, int i2, int i3, C13163 c13163) {
        Iterator it = this.f49330.iterator();
        while (it.hasNext()) {
            ((InterfaceC12542) it.next()).mo17110(abstractC9637, c5883, i, i2, i3, c13163);
        }
    }
}
