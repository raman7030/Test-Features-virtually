package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10430 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f31337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f31338;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13251 f31339;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31341;

    public C10430(InterfaceC13251 interfaceC13251, int i, int i2) {
        this.f31340 = 0;
        this.f31341 = 0;
        this.f31339 = interfaceC13251;
        this.f31338 = i;
        this.f31337 = i2;
        if (interfaceC13251.mo8187() && interfaceC13251.mo8191() == 0 && interfaceC13251.mo8190() == 0) {
            this.f31340 = interfaceC13251.mo8189();
            this.f31341 = interfaceC13251.mo8188();
            interfaceC13251.next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (!this.f31339.mo8187() && this.f31340 == this.f31338 && this.f31341 == this.f31337) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC13251 interfaceC13251 = this.f31339;
        if (interfaceC13251.mo8187()) {
            C22340 c22340 = new C22340(this.f31340, interfaceC13251.mo8191(), this.f31341, interfaceC13251.mo8190());
            this.f31340 = interfaceC13251.mo8189();
            this.f31341 = interfaceC13251.mo8188();
            interfaceC13251.next();
            return c22340;
        }
        int i = this.f31340;
        int i2 = this.f31341;
        int i3 = this.f31338;
        int i4 = this.f31337;
        C22340 c22341 = new C22340(i, i3, i2, i4);
        this.f31340 = i3;
        this.f31341 = i4;
        return c22341;
    }
}
