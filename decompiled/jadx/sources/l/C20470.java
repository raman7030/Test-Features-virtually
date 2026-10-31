package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20470 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        if (!c2450.m7916("zip") || !c16560M7919.m39035("zip")) {
            return false;
        }
        C10738 c10738 = (C10738) c2450.m7922();
        C10738 c10739 = (C10738) c16560M7919.m39044();
        if (c10738.m26937().equals(c10739.m26937())) {
            return !c10738.m39741().equals(c10739.m39741());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("zip");
        c16560M7919.m38998("zip");
        C10738 c10738 = (C10738) c16560M7919.m39044();
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        if (c10738.m26939()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
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
        new C8475(this, c2450.m7921(), strM26937, c10738.m26936(), strM49978, c10738, c2450, strM49978).m9494();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46863(C20470 c20470, C2450 c2450, int i, C11667 c11667, boolean z) {
        C16560 c16560M7919 = c2450.m7919();
        C10738 c10738 = (C10738) c2450.m7922();
        C10738 c10739 = (C10738) c16560M7919.m39044();
        List listM7909 = c2450.m7909();
        int i2 = C15104.f46193;
        C0994 c0994 = new C0994(C22586.class);
        c0994.m3474("srcZipPath", c10738.m26937());
        c0994.m3474("tarZipPath", c10739.m26937());
        c0994.m3474("targetPath", c10739.m39741().substring(1));
        c0994.m3470(i, "update");
        c0994.m3483(listM7909);
        c0994.m3484(c2450);
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
