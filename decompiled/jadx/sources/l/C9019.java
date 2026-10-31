package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9019 extends AbstractC16073 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f27379;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15859 f27380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f27381;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15859 f27382;

    public C9019(C15859 c15859, C15859 c158510, List list, List list2, InterfaceC6818 interfaceC6818, C4701 c4701) {
        super(list.size(), list2.size(), interfaceC6818, c4701);
        this.f27380 = c15859;
        this.f27382 = c158510;
        this.f27379 = list;
        this.f27381 = list2;
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23270(int i, int i2, int i3, int i4) {
        C22340 c22340M10307 = C3374.m10307(this.f27379, this.f27381, i, i3, i2, i4);
        int i5 = c22340M10307.f72397;
        int i6 = c22340M10307.f72395;
        List listSubList = this.f27379.subList(i5, i6);
        int i7 = c22340M10307.f72398;
        int i8 = c22340M10307.f72396;
        InterfaceC6818 interfaceC6818M52402 = C23751.m52402(listSubList, this.f27381.subList(i7, i8), this.f49545);
        C18107 c18107 = this.f49543;
        c18107.m40752(i, i3, i5, i7);
        for (C22340 c22340 : interfaceC6818M52402.mo6219()) {
            int i9 = c22340.f72397;
            c18107.m40750(i5 + i9, c22340.f72398 + i7, c22340.f72395 - i9);
        }
        c18107.m40752(i6, i8, i2, i4);
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21635 mo23269(int i) {
        int i2 = this.f27380.getInt(i);
        return new C21635(i2, i2 + 1);
    }

    @Override // l.AbstractC16073
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21635 mo23271(int i) {
        int i2 = this.f27382.getInt(i);
        return new C21635(i2, i2 + 1);
    }
}
