package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7161 extends AbstractC24336 {

    /* JADX INFO: renamed from: ֫֫ */
    public C2466 f18688;

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f18689;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f18690;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C21727 f18691;

    /* JADX INFO: renamed from: ۧ֫ */
    public C20573 f18692;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f18693;

    /* JADX INFO: renamed from: ܳ֫ */
    public long f18694;

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean f18695;

    /* JADX INFO: renamed from: ܿ֫ */
    public final ArrayList f18696;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final long f18697;

    /* JADX INFO: renamed from: ᩷֫ */
    public final long f18698;

    /* JADX INFO: renamed from: ᩻֫ */
    public long f18699;

    public C7161(C19902 c19902) {
        super(c19902.f60439);
        this.f18698 = c19902.f60437;
        this.f18697 = c19902.f60441;
        this.f18695 = c19902.f60442;
        this.f18693 = c19902.f60436;
        this.f18689 = c19902.f60443;
        this.f18690 = c19902.f60438;
        this.f18696 = new ArrayList();
        this.f18691 = new C21727();
    }

    @Override // p067l.AbstractC22585, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo11868() throws C2466 {
        C2466 c2466 = this.f18688;
        if (c2466 != null) {
            throw c2466;
        }
        super.mo11868();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        C5820 c5820 = new C5820(this.f77096.mo11861(c17474, interfaceC23016, j), this.f18695, this.f18699, this.f18694);
        this.f18696.add(c5820);
        return c5820;
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        ArrayList arrayList = this.f18696;
        C23877.m52960(arrayList.remove(interfaceC11441));
        this.f77096.mo11866(((C5820) interfaceC11441).f14286);
        if (!arrayList.isEmpty() || this.f18693) {
            return;
        }
        C20573 c20573 = this.f18692;
        c20573.getClass();
        m16467(c20573.f43390);
    }

    @Override // p067l.AbstractC22585, p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
        super.mo11869();
        this.f18688 = null;
        this.f18692 = null;
    }

    @Override // p067l.AbstractC24336
    /* JADX INFO: renamed from: ۧ */
    public final void mo16468(AbstractC6974 abstractC6974) {
        if (this.f18688 != null) {
            return;
        }
        m16467(abstractC6974);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m16467(AbstractC6974 abstractC6974) {
        long j;
        long j2;
        long j3;
        C21727 c21727 = this.f18691;
        abstractC6974.m15986(0, c21727);
        long j4 = c21727.f68433;
        C20573 c20573 = this.f18692;
        long j5 = this.f18697;
        ArrayList arrayList = this.f18696;
        if (c20573 == null || arrayList.isEmpty() || this.f18693) {
            boolean z = this.f18689;
            long j6 = this.f18698;
            if (z) {
                long j7 = c21727.f68425;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f18699 = j4 + j6;
            this.f18694 = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C5820 c5820 = (C5820) arrayList.get(i);
                long j8 = this.f18699;
                long j9 = this.f18694;
                c5820.f14287 = j8;
                c5820.f14289 = j9;
            }
            j2 = j;
            j3 = j6;
        } else {
            long j10 = this.f18699 - j4;
            long j11 = j5 != Long.MIN_VALUE ? this.f18694 - j4 : Long.MIN_VALUE;
            j3 = j10;
            j2 = j11;
        }
        try {
            C20573 c20574 = new C20573(abstractC6974, j3, j2, this.f18690);
            this.f18692 = c20574;
            m25803(c20574);
        } catch (C2466 e) {
            this.f18688 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C5820) arrayList.get(i2)).m13094(this.f18688);
            }
        }
    }
}
