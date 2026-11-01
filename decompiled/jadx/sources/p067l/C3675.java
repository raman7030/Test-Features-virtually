package p067l;

/* JADX INFO: renamed from: l.֨᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C3675 extends AbstractC13262 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9710 f7784;

    public C3675(C9710 c9710) {
        this.f7784 = c9710;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C15744(this.f7784);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7784.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7784.f26816;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7784.clear();
    }
}
