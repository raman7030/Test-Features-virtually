package l;

/* JADX INFO: renamed from: l.ᩳۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17894 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9428 f54635;

    public C17894(C9428 c9428) {
        this.f54635 = c9428;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C20717(this.f54635);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f54635.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f54635.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f54635.clear();
    }
}
