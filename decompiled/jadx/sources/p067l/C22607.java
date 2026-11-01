package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22607 {

    /* JADX INFO: renamed from: ֫ */
    public final C21975 f71351;

    /* JADX INFO: renamed from: ֫ */
    public static void m50664(C21975 c21975) {
        c21975.m49509(new C16570(new C22607(c21975), C7854.m18148()));
    }

    public C22607(C21975 c21975) {
        this.f71351 = c21975;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50666(C22607 c22607, C13889 c13889) {
        C21975 c21975 = c22607.f71351;
        C5348 c5348M39656 = c13889.mo31607().m39656();
        C22783 c22783M36175 = c13889.m36175();
        if (c22783M36175 != null && !c21975.m49510(c22783M36175) && c5348M39656.m11605() != 5) {
            InterfaceC3830 interfaceC3830M50974 = c13889.m36175().m50974();
            if (interfaceC3830M50974.mo7482() && interfaceC3830M50974.mo7484() == 6) {
                C21442 c21442 = C21442.f67643;
                c22607.m50663(c13889, c21442, 5, (AbstractC15405) interfaceC3830M50974);
                if (c5348M39656.m11605() == 56) {
                    c22607.m50663((C13889) C20013.m45383(((C17950) c21975.m49517().get(c13889.m36177().m40841().nextSetBit(0))).m40832(), 1), c21442, 6, (AbstractC15405) null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m50663(C13889 c13889, C21442 c21442, int i, AbstractC15405 abstractC15405) {
        AbstractC17417 c7360;
        AbstractC17417 abstractC17417Mo31607 = c13889.mo31607();
        C5348 c5348M31914 = C14065.m31914(i, c13889.m36175(), c21442, abstractC15405);
        if (abstractC15405 == null) {
            c7360 = new C3336(c5348M31914, abstractC17417Mo31607.m39652(), c13889.m36175(), c21442);
        } else {
            c7360 = new C7360(c5348M31914, abstractC17417Mo31607.m39652(), c13889.m36175(), c21442, abstractC15405);
        }
        C13889 c138810 = new C13889(c7360, c13889.m36177());
        ArrayList arrayListM40832 = c13889.m36177().m40832();
        C21975 c21975 = this.f71351;
        c21975.m49505(c13889);
        arrayListM40832.set(arrayListM40832.lastIndexOf(c13889), c138810);
        c21975.m49504(c138810, (C21442) null);
        c21975.m49506(c138810, (C22783) null);
    }
}
