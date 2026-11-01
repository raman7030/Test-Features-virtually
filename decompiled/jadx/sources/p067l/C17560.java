package p067l;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17560 implements InterfaceC14288 {

    /* JADX INFO: renamed from: ֫ */
    public final Collection f52493;

    public C17560(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f52493 = collection;
    }

    @Override // p067l.InterfaceC14288
    /* JADX INFO: renamed from: ֫ */
    public final void mo4327(AbstractC20244 abstractC20244, Object obj, int i, int i2, String str, C4821 c4821) {
        Iterator it = this.f52493.iterator();
        while (it.hasNext()) {
            ((InterfaceC14288) it.next()).mo4327(abstractC20244, obj, i, i2, str, c4821);
        }
    }

    @Override // p067l.InterfaceC14288
    /* JADX INFO: renamed from: ֫ */
    public final void mo19044(AbstractC11527 abstractC11527, C7959 c7959, int i, int i2, boolean z, BitSet bitSet, C14878 c14878) {
        Iterator it = this.f52493.iterator();
        while (it.hasNext()) {
            ((InterfaceC14288) it.next()).mo19044(abstractC11527, c7959, i, i2, z, bitSet, c14878);
        }
    }

    @Override // p067l.InterfaceC14288
    /* JADX INFO: renamed from: ֫ */
    public final void mo19043(AbstractC11527 abstractC11527, C7959 c7959, int i, int i2, BitSet bitSet, C14878 c14878) {
        Iterator it = this.f52493.iterator();
        while (it.hasNext()) {
            ((InterfaceC14288) it.next()).mo19043(abstractC11527, c7959, i, i2, bitSet, c14878);
        }
    }

    @Override // p067l.InterfaceC14288
    /* JADX INFO: renamed from: ֫ */
    public final void mo19042(AbstractC11527 abstractC11527, C7959 c7959, int i, int i2, int i3, C14878 c14878) {
        Iterator it = this.f52493.iterator();
        while (it.hasNext()) {
            ((InterfaceC14288) it.next()).mo19042(abstractC11527, c7959, i, i2, i3, c14878);
        }
    }
}
