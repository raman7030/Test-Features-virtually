package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes.dex */
public final class C25201 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11120 f80596;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f80597;

    public C25201(C11120 c11120, Iterator it) {
        this.f80596 = c11120;
        this.f80597 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80597.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C23190.m51662(this.f80596.f30839, this.f80597.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f80597.remove();
    }
}
