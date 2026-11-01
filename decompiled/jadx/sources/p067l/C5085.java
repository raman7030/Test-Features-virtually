package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5085 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6426 f11917;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f11918;

    public C5085(C6426 c6426, Iterator it) {
        this.f11917 = c6426;
        this.f11918 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11918.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C23190.m51662(this.f11917.f16630, this.f11918.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11918.remove();
    }
}
