package l;

/* JADX INFO: renamed from: l.ۢ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9437 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4497 f28617;

    public C9437(C4497 c4497) {
        this.f28617 = c4497;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C20020(this.f28617);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28617.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f28617.f14312;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f28617.clear();
    }
}
