package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C18172 extends AbstractC21044 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f56476;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f56477;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f56478;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56479;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f56480;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f56481;

    public C18172() {
        throw null;
    }

    public C18172(InterfaceC7099 interfaceC7099, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList) {
        super(interfaceC7099, i);
        this.f56481 = interfaceC7099.mo2348(i);
        this.f56476 = z;
        this.f56480 = z2;
        this.f56478 = z3;
        this.f56477 = z4;
        this.f67902 = i2;
        this.f56479 = arrayList;
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue() {
        return (InterfaceC1454) this.f56479.get(0);
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue(int i) {
        return (InterfaceC1454) this.f56479.get(i);
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo29409() {
        return this.f56479.size();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo29406() {
        String str = this.f56481;
        return str == null ? "" : str;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo29412() {
        return this.f56476;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo29405() {
        return this.f56480;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo29411() {
        return this.f56478;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo29408() {
        return this.f56477;
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final Iterable values() {
        return this.f56479;
    }
}
