package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16695 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6818 f51235;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f51236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f51237;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22340 f51238;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22340 f51239;

    public C16695(InterfaceC6818 interfaceC6818) {
        this.f51235 = interfaceC6818;
        Iterator itMo6220 = interfaceC6818.mo6220();
        this.f51237 = itMo6220;
        Iterator itMo6221 = interfaceC6818.mo6221();
        this.f51236 = itMo6221;
        this.f51238 = itMo6220.hasNext() ? (C22340) itMo6220.next() : null;
        this.f51239 = itMo6221.hasNext() ? (C22340) itMo6221.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.f51238 == null && this.f51239 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22340 c22340;
        C22340 c22341 = this.f51238;
        if (c22341 == null || ((c22340 = this.f51239) != null && (c22340.f72397 < c22341.f72397 || c22340.f72398 < c22341.f72398))) {
            C22340 c22342 = this.f51239;
            Iterator it = this.f51236;
            this.f51239 = it.hasNext() ? (C22340) it.next() : null;
            return new C13167(c22342, Boolean.TRUE);
        }
        Iterator it2 = this.f51237;
        this.f51238 = it2.hasNext() ? (C22340) it2.next() : null;
        return new C13167(c22341, Boolean.FALSE);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
