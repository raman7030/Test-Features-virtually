package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19639 extends AbstractC22369 {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f59690;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f59691;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f59692;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f59693;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f59694;

    /* JADX INFO: renamed from: ۬ */
    public final String f59695;

    public C19639() {
        throw null;
    }

    public C19639(InterfaceC9116 interfaceC9116, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList) {
        super(interfaceC9116, i);
        this.f59695 = interfaceC9116.mo4719(i);
        this.f59690 = z;
        this.f59694 = z2;
        this.f59692 = z3;
        this.f59691 = z4;
        this.f70587 = i2;
        this.f59693 = arrayList;
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue() {
        return (InterfaceC3751) this.f59693.get(0);
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue(int i) {
        return (InterfaceC3751) this.f59693.get(i);
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo31471() {
        return this.f59693.size();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo31468() {
        String str = this.f59695;
        return str == null ? "" : str;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo31474() {
        return this.f59690;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo31467() {
        return this.f59694;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo31473() {
        return this.f59692;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo31470() {
        return this.f59691;
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    public final Iterable values() {
        return this.f59693;
    }
}
