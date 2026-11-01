package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3134 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23663 f5713;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC21195 f5715;

    /* JADX INFO: renamed from: ᩶ */
    public C4848 f5714 = C4848.m10283();

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC21195 f5716 = null;

    public C3134(C23663 c23663, AbstractC6462 abstractC6462) {
        this.f5713 = c23663;
        this.f5715 = m5354(abstractC6462);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC21195 abstractC21195 = this.f5715;
        C23663 c23663 = this.f5713;
        if (abstractC21195 == c23663.f75331.f69157) {
            this.f5715 = m5354(c23663.f75323.m19502(this.f5716.f20406));
        }
        return this.f5715 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC21195 abstractC21195 = this.f5715;
        this.f5716 = abstractC21195;
        AbstractC21195 abstractC21196 = this.f5713.f75331.f69157;
        this.f5715 = abstractC21196;
        C1446.m31704((abstractC21195 == null && abstractC21195 == abstractC21196) ? false : true);
        return this.f5716;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21195 m5354(AbstractC6462 abstractC6462) {
        if (!abstractC6462.m14777(EnumC11353.CLASS) && !abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            return null;
        }
        AbstractC6462 abstractC6462M19466 = this.f5713.f75323.m19466(abstractC6462, false);
        if (this.f5714.contains(abstractC6462M19466.f16705)) {
            return null;
        }
        this.f5714 = this.f5714.m10290(abstractC6462M19466.f16705);
        return abstractC6462M19466.f16705;
    }
}
