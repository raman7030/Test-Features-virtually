package p067l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.۟۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9487 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4104 f25989;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C9487(C4104 c4104) {
        this.f25989 = c4104;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19527 c19527 = this.f25989.f9039;
        return new AbstractMap.SimpleImmutableEntry(c19527.f59466.f31490.get(i), c19527.f59465.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25989.f9039.size();
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
