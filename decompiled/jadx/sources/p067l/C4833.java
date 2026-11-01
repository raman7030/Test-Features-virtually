package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes2.dex */
public class C4833 implements InterfaceC10713 {

    /* JADX INFO: renamed from: ֫ */
    public C18088 f10994;

    /* JADX INFO: renamed from: ۧ */
    public C16981 f10995;

    /* JADX INFO: renamed from: ܽ */
    public final C16231 f10996;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C6174 f10997;

    public C4833(C6174 c6174, C16231 c16231) {
        this.f10997 = c6174;
        this.f10996 = c16231;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10257(C18088 c18088, C16981 c16981) {
        this.f10994 = c18088;
        this.f10995 = c16981;
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public void mo10251(C3336 c3336) {
        AbstractC6924 c20256;
        C5348 c5348M39656 = c3336.m39656();
        if (c5348M39656.m11605() == 54 || c5348M39656.m11605() == 56) {
            return;
        }
        C12054 c12054M39652 = c3336.m39652();
        C14970 c14970M26598 = C11539.m26598(c3336);
        int iM11601 = c5348M39656.m11601();
        if (iM11601 == 1 || iM11601 == 2) {
            c20256 = new C20256(c14970M26598, c12054M39652, C6174.m13979(c3336));
        } else {
            if (iM11601 == 3) {
                return;
            }
            if (iM11601 != 4) {
                if (iM11601 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c20256 = new C20256(c14970M26598, c12054M39652, C6174.m13979(c3336));
            } else {
                c20256 = new C7515(c14970M26598, c12054M39652, C6174.m13979(c3336), this.f10997.f15514.m47347(this.f10994.m41137().get(1)));
            }
        }
        m10253(c20256);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public void mo10254(C7360 c7360) {
        C12054 c12054M39652 = c7360.m39652();
        C14970 c14970M26598 = C11539.m26598(c7360);
        C5348 c5348M39656 = c7360.m39656();
        int iM11605 = c5348M39656.m11605();
        if (c5348M39656.m11601() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM11605 == 3) {
            C6174 c6174 = this.f10997;
            if (c6174.f15522) {
                return;
            }
            C22783 c22783M39655 = c7360.m39655();
            m10253(new C20256(c14970M26598, c12054M39652, C21442.m48566(c22783M39655, C22783.m50968((c6174.f15515 - c6174.f15517) + ((C4873) c7360.m36587()).mo4598(), c22783M39655.getType()))));
            return;
        }
        m10253(new C23018(c14970M26598, c12054M39652, C6174.m13979(c7360), c7360.m36587()));
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public void mo10255(C8030 c8030) {
        C12054 c12054M39652 = c8030.m39652();
        C22388 c22388M18608 = c8030.m18608();
        C22388 c22388M41137 = this.f10994.m41137();
        int size = c22388M18608.size();
        int size2 = c22388M41137.size();
        int iM41139 = this.f10994.m41139();
        if (size != size2 - 1 || iM41139 != c22388M41137.get(size)) {
            throw new RuntimeException("shouldn't happen");
        }
        C16981[] c16981Arr = new C16981[size];
        for (int i = 0; i < size; i++) {
            c16981Arr[i] = this.f10997.f15514.m47347(c22388M41137.get(i));
        }
        C16981 c16981 = new C16981(c12054M39652, false);
        C16981 c16982 = new C16981(this.f10995.m15863(), true);
        C2820 c2820 = new C2820(c12054M39652, c16982, c22388M18608, c16981Arr);
        AbstractC6924 c7515 = new C7515(c2820.m4464() ? C14300.f40855 : C14300.f40742, c12054M39652, C6174.m13979(c8030), c16981);
        m10253(c16982);
        m10253(c7515);
        m10260(new C18914(c12054M39652));
        m10260(c16981);
        m10260(c2820);
    }

    /* JADX INFO: renamed from: ֫ */
    private C22783 m10250() {
        int iM41139 = this.f10994.m41139();
        if (iM41139 < 0) {
            return null;
        }
        AbstractC17417 abstractC17417M56521get = this.f10997.f15518.m33676().m42784(iM41139).m41142().m56521get(0);
        if (abstractC17417M56521get.m39656().m11605() != 56) {
            return null;
        }
        return abstractC17417M56521get.m39655();
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10252(C6019 c6019) {
        C12054 c12054M39652 = c6019.m39652();
        C14970 c14970M26598 = C11539.m26598(c6019);
        C5348 c5348M39656 = c6019.m39656();
        if (c5348M39656.m11601() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c5348M39656.m11601());
        }
        if (!c5348M39656.m11606()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m10253(this.f10995);
        m10253(new C19585(c14970M26598, c12054M39652, c6019.m39651(), new AbstractC15405[]{c6019.m13528(), c6019.m13527()}));
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public void mo10256(C13395 c13395) {
        AbstractC6924 c23018;
        AbstractC6924 abstractC6924M36987;
        int iM34270;
        C12054 c12054M39652 = c13395.m39652();
        C14970 c14970M26598 = C11539.m26598(c13395);
        C5348 c5348M39656 = c13395.m39656();
        AbstractC15405 abstractC15405M36587 = c13395.m36587();
        if (c5348M39656.m11601() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c5348M39656.m11601());
        }
        m10253(this.f10995);
        if (c5348M39656.m11606()) {
            m10253(new C23018(c14970M26598, c12054M39652, c13395.m39651(), abstractC15405M36587));
            return;
        }
        C22783 c22783M10250 = m10250();
        C21442 c21442M13983 = C6174.m13983(c13395, c22783M10250);
        if ((c14970M26598.m34272() || c5348M39656.m11605() == 43) != (c22783M10250 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c13395);
        }
        if (c5348M39656.m11605() == 41 && c14970M26598.m34270() != 35) {
            c23018 = new C20256(c14970M26598, c12054M39652, c21442M13983);
        } else {
            c23018 = new C23018(c14970M26598, c12054M39652, c21442M13983, abstractC15405M36587);
        }
        C16231 c16231 = this.f10996;
        int iM36991 = c16231.m36991() - 1;
        while (true) {
            if (iM36991 < 0) {
                abstractC6924M36987 = null;
                break;
            }
            abstractC6924M36987 = c16231.m36987(iM36991);
            if (abstractC6924M36987.m15874().m34270() != -1) {
                break;
            } else {
                iM36991--;
            }
        }
        if (c14970M26598.m34270() == 32 && abstractC6924M36987 != null && (((iM34270 = abstractC6924M36987.m15874().m34270()) == 7 || iM34270 == 8 || iM34270 == 9) && c23018.m15873().size() > 0 && abstractC6924M36987.m15873().size() > 1 && c23018.m15873().m56524get(0).m50989() == abstractC6924M36987.m15873().m56524get(1).m50989())) {
            m10253(new C20256(C14300.f40751, c12054M39652, C21442.f67643));
        }
        m10253(c23018);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public void mo10259(C24123 c24123) {
        C12054 c12054M39652 = c24123.m39652();
        C14970 c14970M26598 = C11539.m26598(c24123);
        if (c24123.m39656().m11601() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C22783 c22783M10250 = m10250();
        if (c14970M26598.m34272() != (c22783M10250 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c24123);
        }
        m10253(this.f10995);
        m10253(new C20256(c14970M26598, c12054M39652, C6174.m13983(c24123, c22783M10250)));
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10258(C22113 c22113) {
        C12054 c12054M39652 = c22113.m39652();
        AbstractC15405 abstractC15405M49802 = c22113.m49802();
        ArrayList arrayListM49803 = c22113.m49803();
        if (c22113.m39656().m11601() == 1) {
            C16981 c16981 = new C16981(c12054M39652, false);
            AbstractC6924 c20336 = new C20336(c12054M39652, this.f10995, arrayListM49803, abstractC15405M49802);
            AbstractC6924 c7515 = new C7515(C14300.f40823, c12054M39652, C6174.m13979(c22113), c16981);
            m10253(this.f10995);
            m10253(c7515);
            m10260(new C18914(c12054M39652));
            m10260(c16981);
            m10260(c20336);
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10253(AbstractC6924 abstractC6924) {
        this.f10996.m36989(abstractC6924);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10260(AbstractC6924 abstractC6924) {
        this.f10996.m36992(abstractC6924);
    }
}
