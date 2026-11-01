package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9051 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f24557 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m20955(AbstractC7783 abstractC7783) {
        AbstractC12224 abstractC12224Mo3355 = abstractC7783.mo3355();
        HashMap map = this.f24557;
        C4848 c4848M10283 = (C4848) map.get(abstractC12224Mo3355);
        if (c4848M10283 == null) {
            c4848M10283 = C4848.m10283();
        }
        if (c4848M10283.contains(abstractC7783)) {
            return;
        }
        map.put(abstractC12224Mo3355, c4848M10283.m10286(abstractC7783));
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m20956(AbstractC7783 abstractC7783) {
        C4848 c4848;
        String string = abstractC7783.mo17995().toString();
        if (abstractC7783.f20406.mo7388() || abstractC7783.f20406.mo14805() || !((c4848 = (C4848) this.f24557.get(abstractC7783.mo3355())) == null || (c4848.m10289() == 1 && c4848.contains(abstractC7783)))) {
            return string;
        }
        C4848 c4848M10283 = C4848.m10283();
        while (true) {
            AbstractC6462 abstractC6462 = abstractC7783.f20406;
            EnumC11353 enumC11353 = EnumC11353.CLASS;
            if (!abstractC6462.m14777(enumC11353) || !abstractC7783.f20406.mo7201().m14777(enumC11353) || abstractC7783.f20407.f20405 != EnumC3600.f7354) {
                break;
            }
            AbstractC12224 abstractC12224Mo3355 = abstractC7783.mo3355();
            c4848M10283.getClass();
            C4848 c4849 = new C4848(abstractC12224Mo3355, c4848M10283);
            abstractC7783 = abstractC7783.f20407;
            c4848M10283 = c4849;
        }
        AbstractC12224 abstractC12224Mo3356 = abstractC7783.mo3355();
        c4848M10283.getClass();
        C4848<AbstractC12224> c48410 = new C4848(abstractC12224Mo3356, c4848M10283);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (AbstractC12224 abstractC12224 : c48410) {
            sb.append(str);
            sb.append((CharSequence) abstractC12224);
            str = ".";
        }
        return sb.toString();
    }
}
