package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5653 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && c2450.m7919().m39035("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("local");
        c16560M7919.m38998("zip");
        C10738 c10738 = (C10738) c16560M7919.m39044();
        if (c10738.m26939()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        if (abstractC15440M39866.mo27924()) {
            AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
            return;
        }
        String strM49978 = c10738.m26936() ? C22263.m49978(abstractC15440M39866) : null;
        new C4242(this, c2450.m7921(), strM26937, c10738.m26936(), strM49978, c2450, c10738, strM49978, abstractC15440M39866).m9489(c2450.m7918());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15942(C5653 c5653, C2450 c2450, AbstractC15440 abstractC15440, int i, int i2, boolean z, String str, C11667 c11667, boolean z2) {
        int i3 = C15104.f46193;
        C0994 c0994 = new C0994(C0713.class);
        c0994.m3474("zipPath", abstractC15440.mo23554());
        c0994.m3474("rename", str);
        c0994.m3484(c2450);
        c0994.m3478(c2450.m7909());
        c0994.m3470(i, "level");
        c0994.m3470(i2, "update");
        c0994.m3475("deleteSources", z);
        c0994.m3474("basePath", c2450.m7919().m39058().substring(1));
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z2);
        c0994.m3469();
    }
}
