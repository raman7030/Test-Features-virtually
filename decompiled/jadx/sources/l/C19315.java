package l;

/* JADX INFO: renamed from: l.᩵۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19315 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21431 f60732;

    public C19315(C21431 c21431) {
        this.f60732 = c21431;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C15079(this.f60732);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f60732.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f60732.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f60732.clear();
    }
}
