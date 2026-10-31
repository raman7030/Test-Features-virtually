package l;

/* JADX INFO: renamed from: l.ۙ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C4902 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11958 f15480;

    public C4902(C11958 c11958) {
        this.f15480 = c11958;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C6313(this.f15480);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15480.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f15480.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f15480.clear();
    }
}
