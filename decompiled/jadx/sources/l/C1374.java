package l;

/* JADX INFO: renamed from: l.֨᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C1374 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7724 f5012;

    public C1374(C7724 c7724) {
        this.f5012 = c7724;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C14073(this.f5012);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5012.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5012.f23903;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5012.clear();
    }
}
