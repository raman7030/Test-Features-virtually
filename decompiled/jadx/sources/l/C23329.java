package l;

/* JADX INFO: renamed from: l.᩺᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes2.dex */
public final class C23329 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f74984;

    public C23329(C2372 c2372) {
        this.f74984 = c2372;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C15776(this.f74984);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f74984.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f74984.f7577;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f74984.clear();
    }
}
