package l;

import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܺ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16247 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        if (!c16560M7919.m39038() && c2450.m7916("local") && c16560M7919.m39035("local")) {
            return !c2450.m7914().equals(c16560M7919.m38991()) || c2450.m7918() == 1;
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("local");
        c16560M7919.m38998("local");
        if (!c2450.m7923() && c2450.m7914().equals(c16560M7919.m38991())) {
            c2450.m7907("local");
            final InterfaceC17889 interfaceC17889M7913 = c2450.m7913();
            C19777.m45461(c2450.m7917(), interfaceC17889M7913, c2450.m7926(), new InterfaceC19071() { // from class: l.ۖ᩺ܳ
                @Override // l.InterfaceC19071
                /* JADX INFO: renamed from: ֫ */
                public final void mo2836(String str) {
                    int i = C15104.f46193;
                    C0994 c0994 = new C0994(C9193.class);
                    InterfaceC17889 interfaceC17889 = interfaceC17889M7913;
                    c0994.m3483(Collections.singletonList(interfaceC17889));
                    C2450 c2451 = c2450;
                    c0994.m3484(c2451);
                    c0994.m3474("ARG_MSG_FROM", interfaceC17889.getName());
                    if (interfaceC17889.isDirectory()) {
                        c0994.m3474("ARG_MSG_TO", str);
                    }
                    c0994.m3474("targetPath", c2451.m7926());
                    c0994.m3474("replacedName", str);
                    c0994.m3469();
                }
            });
            return;
        }
        m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c16560M7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C9193.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", c16560M7919.m38990());
        c0994.m3474("targetPath", c16560M7919.m39058());
        c0994.m3469();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38212(String... strArr) {
        for (String str : strArr) {
            if (C19739.m45449(str) != null) {
                return true;
            }
        }
        return false;
    }
}
