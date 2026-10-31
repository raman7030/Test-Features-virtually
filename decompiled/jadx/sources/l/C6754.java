package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6754 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20866 f20964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15925 f20965;

    public C6754(AbstractC20866 abstractC20866, C15925 c15925) {
        this.f20964 = abstractC20866;
        this.f20965 = c15925;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC18043 abstractC18043 = (AbstractC18043) obj;
        boolean zM42098 = abstractC18043.m42098();
        AbstractC20866 abstractC20866 = this.f20964;
        if (!zM42098) {
            abstractC18043.f56236 = this.f20965;
            AbstractC20866.m47681(abstractC20866, abstractC18043);
            return true;
        }
        throw new IllegalArgumentException(abstractC20866.mo24457());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C23687(AbstractC20866.m47680(this.f20964).iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC20866.m47680(this.f20964).size();
    }
}
