package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public class C19015 extends AbstractC13660 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f59913 = C11321.m27962(C19015.class.getName());

    @Override // l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo2716(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8617(C8806 c8806, HashSet hashSet) {
    }

    @Override // l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo32824(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo8618(C8806 c8806) {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19015 m43857(String str, EnumC11628 enumC11628, EnumC5983 enumC5983, boolean z) {
        switch (C23953.f77669[enumC11628.ordinal()]) {
            case 1:
                return new C21132(str, enumC11628, enumC5983, z);
            case 2:
                return new C9843(str, enumC11628, enumC5983, z);
            case 3:
                return new C9843(str, enumC11628, enumC5983, z);
            case 4:
                return new C7020(str, enumC11628, enumC5983, z);
            case 5:
                return new C9137(str, enumC11628, enumC5983, z);
            case 6:
                return new C16191(str, enumC11628, enumC5983, z);
            case 7:
                return new C2787(str, enumC11628, enumC5983, z);
            case 8:
                return new C4198(str, enumC11628, enumC5983, z);
            default:
                return new C19015(str, enumC11628, enumC5983, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43858(C8806 c8806, HashSet hashSet, C20095 c20095) {
        if (c20095 == null || !c20095.m46332()) {
            return;
        }
        if (m32828().equalsIgnoreCase(c20095.mo25450()) || m32828().equalsIgnoreCase(c20095.mo25446()) || m32828().equalsIgnoreCase(c20095.m46334())) {
            C7725 c7725M22739 = c8806.m22739();
            EnumC5983 enumC5983M32830 = m32830();
            int i = C13038.f39042;
            hashSet.addAll(c7725M22739.m20682(enumC5983M32830, true, i));
            hashSet.addAll(c20095.m46322(m32830(), i, c8806.m22739()));
        }
        f59913.mo7092("{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}", c8806.getName(), m32828(), c20095, hashSet);
    }
}
