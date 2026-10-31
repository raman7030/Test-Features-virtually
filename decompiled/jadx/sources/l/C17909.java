package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17909 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        return c2450.m7916("local") && c16560M7919.m39035("local") && !c16560M7919.m39038() && !c2450.m7914().equals(c16560M7919.m38991());
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("local");
        c16560M7919.m38998("local");
        m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c16560M7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C16497.class);
        c0994.m3478(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", c16560M7919.m38990());
        c0994.m3474("sourcePath", c2450.m7925());
        c0994.m3474("targetPath", c16560M7919.m39020());
        c0994.m3469();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41888(AbstractC1139 abstractC1139) {
        if (abstractC1139.m3888()) {
            C0433 c0433Mo1983 = abstractC1139.mo1983();
            Iterator it = c0433Mo1983.m1988().iterator();
            while (it.hasNext()) {
                m41888((AbstractC1139) it.next());
            }
            AbstractC10503 abstractC10503Mo23558 = c0433Mo1983.m3890().mo23558();
            if (abstractC10503Mo23558.mo8669(EnumC13324.DELETE_EMPTY_DIRECTORY) == EnumC4858.UNSUPPORTED) {
                return;
            }
            try {
                abstractC10503Mo23558.mo8677();
            } catch (C22497 e) {
                if (e.m50458() != EnumC21792.DIRECTORY_NOT_EMPTY) {
                    EnumC21792 enumC21792 = EnumC21792.NOT_FOUND;
                }
            }
        }
    }
}
