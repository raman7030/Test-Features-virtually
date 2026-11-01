package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12281 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final int f34301;

    /* JADX INFO: renamed from: ۙ */
    public final int f34302;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC14962 f34303;

    /* JADX INFO: renamed from: ᩸ */
    public int f34304;

    /* JADX INFO: renamed from: ᩹ */
    public int f34305;

    public C12281(InterfaceC14962 interfaceC14962, int i, int i2) {
        this.f34304 = 0;
        this.f34305 = 0;
        this.f34303 = interfaceC14962;
        this.f34302 = i;
        this.f34301 = i2;
        if (interfaceC14962.mo10226() && interfaceC14962.mo10230() == 0 && interfaceC14962.mo10229() == 0) {
            this.f34304 = interfaceC14962.mo10228();
            this.f34305 = interfaceC14962.mo10227();
            interfaceC14962.next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (!this.f34303.mo10226() && this.f34304 == this.f34302 && this.f34305 == this.f34301) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC14962 interfaceC14962 = this.f34303;
        if (interfaceC14962.mo10226()) {
            C23600 c23600 = new C23600(this.f34304, interfaceC14962.mo10230(), this.f34305, interfaceC14962.mo10229());
            this.f34304 = interfaceC14962.mo10228();
            this.f34305 = interfaceC14962.mo10227();
            interfaceC14962.next();
            return c23600;
        }
        int i = this.f34304;
        int i2 = this.f34305;
        int i3 = this.f34302;
        int i4 = this.f34301;
        C23600 c23601 = new C23600(i, i3, i2, i4);
        this.f34304 = i3;
        this.f34305 = i4;
        return c23601;
    }
}
