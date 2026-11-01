package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes.dex */
public final class C23550 implements InterfaceC8069 {

    /* JADX INFO: renamed from: ᩶ */
    public Object f74995;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f74996;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f74997;

    public C23550(Iterator it) {
        it.getClass();
        this.f74997 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74996 || this.f74997.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f74996) {
            return this.f74997.next();
        }
        Object obj = this.f74995;
        this.f74996 = false;
        this.f74995 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6194.m14035("Can't remove after you've peeked at next", !this.f74996);
        this.f74997.remove();
    }

    @Override // p067l.InterfaceC8069
    public final Object peek() {
        if (!this.f74996) {
            this.f74995 = this.f74997.next();
            this.f74996 = true;
        }
        return this.f74995;
    }
}
