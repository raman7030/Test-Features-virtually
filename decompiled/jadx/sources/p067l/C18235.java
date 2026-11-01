package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18235 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC8848 f54420;

    /* JADX INFO: renamed from: ۙ */
    public final Iterator f54421;

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f54422;

    /* JADX INFO: renamed from: ᩸ */
    public C23600 f54423;

    /* JADX INFO: renamed from: ᩹ */
    public C23600 f54424;

    public C18235(InterfaceC8848 interfaceC8848) {
        this.f54420 = interfaceC8848;
        Iterator itMo8422 = interfaceC8848.mo8422();
        this.f54422 = itMo8422;
        Iterator itMo8423 = interfaceC8848.mo8423();
        this.f54421 = itMo8423;
        this.f54423 = itMo8422.hasNext() ? (C23600) itMo8422.next() : null;
        this.f54424 = itMo8423.hasNext() ? (C23600) itMo8423.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.f54423 == null && this.f54424 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23600 c23600;
        C23600 c23601 = this.f54423;
        if (c23601 == null || ((c23600 = this.f54424) != null && (c23600.f75123 < c23601.f75123 || c23600.f75124 < c23601.f75124))) {
            C23600 c23602 = this.f54424;
            Iterator it = this.f54421;
            this.f54424 = it.hasNext() ? (C23600) it.next() : null;
            return new C14882(c23602, Boolean.TRUE);
        }
        Iterator it2 = this.f54422;
        this.f54423 = it2.hasNext() ? (C23600) it2.next() : null;
        return new C14882(c23601, Boolean.FALSE);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
