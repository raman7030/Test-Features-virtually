package p067l;

/* JADX INFO: renamed from: l.᩺᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes2.dex */
public final class C24541 extends AbstractC13262 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4623 f77731;

    public C24541(C4623 c4623) {
        this.f77731 = c4623;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C17362(this.f77731);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f77731.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f77731.f10368;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f77731.clear();
    }
}
