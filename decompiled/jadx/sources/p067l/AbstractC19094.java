package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BAS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19094 extends AbstractC7971 {
    /* JADX INFO: renamed from: ۢ */
    public abstract void mo3906();

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15108() {
        Collection collectionMo8960 = mo8960();
        int size = collectionMo8960.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC4619) collectionMo8960.iterator().next()).mo5704() * size;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ܳ */
    public final void mo15107() {
        C3948 c3948M18447 = m18447();
        mo3906();
        Iterator it = mo8960().iterator();
        while (it.hasNext()) {
            ((AbstractC4619) it.next()).mo5192(c3948M18447);
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ۧ */
    public final void mo15106(C19705 c19705) {
        C3948 c3948M18447 = m18447();
        int iM18442 = m18442();
        Iterator it = mo8960().iterator();
        while (it.hasNext()) {
            ((AbstractC4619) it.next()).mo5703(c3948M18447, c19705);
            c19705.m44759(iM18442);
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ֫ */
    public final int mo15101(AbstractC4619 abstractC4619) {
        AbstractC17358 abstractC17358 = (AbstractC17358) abstractC4619;
        return m18443(abstractC17358.mo5704() * abstractC17358.m39358());
    }
}
