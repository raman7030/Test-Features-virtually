package p067l;

/* JADX INFO: renamed from: l.ܳۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15997 extends AbstractC8146 {

    /* JADX INFO: renamed from: ۗ */
    public final transient AbstractC11500 f46333;

    /* JADX INFO: renamed from: ۙ */
    public final transient AbstractC16192 f46334;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C15997(AbstractC11500 abstractC11500, AbstractC16192 abstractC16192) {
        this.f46333 = abstractC11500;
        this.f46334 = abstractC16192;
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return this.f46334.listIterator(0);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        return this.f46334.mo26245(i, objArr);
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo18927() {
        return this.f46334;
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f46333.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46333.size();
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
