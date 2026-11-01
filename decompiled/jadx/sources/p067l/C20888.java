package p067l;

/* JADX INFO: renamed from: l.᩵۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20888 extends AbstractC23966 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final transient AbstractC2781 f65599;

    public C20888(AbstractC2781 abstractC2781) {
        this.f65599 = abstractC2781;
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f65599.mo4365(obj);
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        AbstractC2781 abstractC2781 = this.f65599;
        abstractC2781.getClass();
        return new C4794(abstractC2781);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        AbstractC21520 it = this.f65599.f4695.values().iterator();
        while (it.hasNext()) {
            i = ((AbstractC23966) it.next()).mo26245(i, objArr);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f65599.f4694;
    }

    @Override // p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
