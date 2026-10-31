package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12546 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13251 f37673;

    public C12546(InterfaceC13251 interfaceC13251) {
        this.f37673 = interfaceC13251;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37673.mo8187();
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC13251 interfaceC13251 = this.f37673;
        C22340 c22340 = new C22340(interfaceC13251.mo8191(), interfaceC13251.mo8189(), interfaceC13251.mo8190(), interfaceC13251.mo8188());
        interfaceC13251.next();
        return c22340;
    }
}
