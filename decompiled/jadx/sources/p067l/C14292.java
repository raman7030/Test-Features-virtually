package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14292 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC14962 f40699;

    public C14292(InterfaceC14962 interfaceC14962) {
        this.f40699 = interfaceC14962;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40699.mo10226();
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC14962 interfaceC14962 = this.f40699;
        C23600 c23600 = new C23600(interfaceC14962.mo10230(), interfaceC14962.mo10228(), interfaceC14962.mo10229(), interfaceC14962.mo10227());
        interfaceC14962.next();
        return c23600;
    }
}
