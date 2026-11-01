package p067l;

/* JADX INFO: renamed from: l.ۢ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11337 extends AbstractC13262 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6642 f31564;

    public C11337(C6642 c6642) {
        this.f31564 = c6642;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C21395(this.f31564);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f31564.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f31564.f17139;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f31564.clear();
    }
}
