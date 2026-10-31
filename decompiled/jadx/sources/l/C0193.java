package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0193 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f1429;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5133 f1430;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0193(C5133 c5133) {
        this.f1430 = c5133;
        this.f1429 = c5133.f16072.iterator();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1430.f16073.invoke(this.f1429.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1429.hasNext();
    }
}
