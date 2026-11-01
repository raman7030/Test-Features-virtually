package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 140K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15669 implements InterfaceC22556, InterfaceC11807 {

    /* JADX INFO: renamed from: ᩸ */
    public C4848 f44804 = C4848.m10283();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo25477(Locale locale, String str, Object... objArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo25482(C16637 c16637);

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6261(C3088 c3088, Object obj) {
        return mo25475((C5771) c3088, (Locale) obj);
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14564(C3108 c3108, Object obj) {
        Locale locale = (Locale) obj;
        if (c3108.m5300() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m35596((AbstractC6462) c3108, false));
            return C10965.m25286(sb, (String) c3108.f16992.mo5291(this, locale), "?");
        }
        return m35596((AbstractC6462) c3108, false) + ((String) c3108.m5300().mo5291(this, locale));
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        AbstractC6462 abstractC6462 = c7251;
        while (abstractC6462.m14777(EnumC11353.ARRAY)) {
            abstractC6462 = ((C7251) abstractC6462).f18916;
        }
        sb.append((String) abstractC6462.mo5291(this, locale));
        for (AbstractC6462 abstractC6463 = c7251; abstractC6463.m14777(EnumC11353.ARRAY); abstractC6463 = ((C7251) abstractC6463).f18916) {
            sb.append(m35596(abstractC6463, true));
            sb.append("[]");
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final Object mo27056(AbstractC7783 abstractC7783, Object obj) {
        return abstractC7783.f20408.toString();
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6262(C9794 c9794, Object obj) {
        Locale locale = (Locale) obj;
        if (c9794.m22845()) {
            return mo25477(locale, "compiler.misc.unnamed.package", new Object[0]);
        }
        return c9794.f27059.toString();
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5083(C11945 c11945, Object obj) {
        Locale locale = (Locale) obj;
        return m35596((AbstractC6462) c11945, false) + "<" + m35597(c11945.f33323, locale) + ">" + ((String) c11945.f16992.mo5291(this, locale));
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        Locale locale = (Locale) obj;
        return MotionUtils.EASING_TYPE_FORMAT_START + m35597(c12497.f35030, locale) + MotionUtils.EASING_TYPE_FORMAT_END + ((String) c12497.f35031.mo5291(this, locale));
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6263(C13818 c13818, Object obj) {
        return c13818.f20408.toString();
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        return mo4507((AbstractC6462) c13956, (Locale) obj);
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo23805(C17860 c17860, Object obj) {
        return mo4507((AbstractC6462) c17860, (Locale) obj);
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo23806(C19202 c19202, Object obj) {
        return c19202.f16705.mo17995().toString();
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6264(AbstractC21195 abstractC21195, Object obj) {
        return abstractC21195.f20408.toString();
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        EnumC17268 enumC17268 = c21215.f66702;
        sb.append(enumC17268);
        if (enumC17268 != EnumC17268.UNBOUND) {
            sb.append(m35596((AbstractC6462) c21215, false));
            sb.append((String) c21215.f66703.mo5291(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m35597(C4848 c4848, Locale locale) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45777((String) ((AbstractC6462) it.next()).mo5291(this, locale));
        }
        return c20271.m45783().m10285(",");
    }

    /* JADX INFO: renamed from: ֫ */
    public String m35599(C16637 c16637, Locale locale) {
        if (this.f44804.contains(c16637)) {
            return m35596((AbstractC6462) c16637, false) + mo25477(locale, "compiler.misc.type.captureof.1", mo25482(c16637));
        }
        try {
            this.f44804 = this.f44804.m10290(c16637);
            return m35596((AbstractC6462) c16637, false) + mo25477(locale, "compiler.misc.type.captureof", mo25482(c16637), (String) c16637.f48907.mo5291(this, locale));
        } finally {
            this.f44804 = this.f44804.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35596(AbstractC6462 abstractC6462, boolean z) {
        StringBuilder sb = new StringBuilder();
        C4848 c4848M14795 = abstractC6462.m14795();
        if (!c4848M14795.isEmpty()) {
            if (z) {
                sb.append(' ');
            }
            sb.append(c4848M14795);
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo4512(C21333 c21333, Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (c21333.mo7201().m14777(EnumC11353.CLASS) && c21333.f16705.f20407.f20405 == EnumC3600.f7354) {
            sb.append((String) c21333.mo7201().mo5291(this, locale));
            sb.append('.');
            sb.append(m35596((AbstractC6462) c21333, false));
            sb.append(mo25484(c21333, false, locale));
        } else {
            sb.append(m35596((AbstractC6462) c21333, false));
            sb.append(mo25484(c21333, true, locale));
        }
        if (c21333.mo14802().m10293()) {
            sb.append('<');
            sb.append(m35597(c21333.mo14802(), locale));
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo4509(C10485 c10485, Locale locale) {
        return mo4507((AbstractC6462) c10485, locale);
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo4507(AbstractC6462 abstractC6462, Locale locale) {
        AbstractC12224 abstractC12224;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        if (abstractC21195 == null || (abstractC12224 = abstractC21195.f20408) == null) {
            return mo25477(locale, "compiler.misc.type.none", new Object[0]);
        }
        return abstractC12224.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo25484(C21333 c21333, boolean z, Locale locale) {
        AbstractC21195 abstractC21195 = c21333.f16705;
        if (abstractC21195.f20408.length() != 0 || (abstractC21195.mo18003() & 16777216) == 0) {
            if (abstractC21195.f20408.length() != 0) {
                return z ? abstractC21195.mo17995().toString() : abstractC21195.f20408.toString();
            }
            C21333 c21334 = (C21333) c21333.f16705.f20406;
            if (c21334 == null) {
                return mo25477(locale, "compiler.misc.anonymous.class", null);
            }
            C4848 c4848 = c21334.f67261;
            return (c4848 == null || !c4848.m10293()) ? mo25477(locale, "compiler.misc.anonymous.class", (String) c21334.f67259.mo5291(this, locale)) : mo25477(locale, "compiler.misc.anonymous.class", (String) ((AbstractC6462) c21334.f67261.f11034).mo5291(this, locale));
        }
        StringBuilder sb = new StringBuilder((String) c21333.f67259.mo5291(this, locale));
        for (C4848 c4849 = c21333.f67261; c4849.m10293(); c4849 = c4849.f11035) {
            sb.append('&');
            sb.append((String) ((AbstractC6462) c4849.f11034).mo5291(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m35598(C4848 c4848, boolean z, Locale locale) {
        if (!z) {
            return m35597(c4848, locale);
        }
        StringBuilder sb = new StringBuilder();
        while (c4848.f11035.m10293()) {
            sb.append((String) ((AbstractC6462) c4848.f11034).mo5291(this, locale));
            c4848 = c4848.f11035;
            sb.append(',');
        }
        if (((AbstractC6462) c4848.f11034).m14777(EnumC11353.ARRAY)) {
            sb.append((String) ((C7251) c4848.f11034).f18916.mo5291(this, locale));
            if (((AbstractC6462) c4848.f11034).m14795().m10293()) {
                sb.append(' ');
                sb.append(((AbstractC6462) c4848.f11034).m14795());
                sb.append(' ');
            }
            sb.append("...");
        } else {
            sb.append((String) ((AbstractC6462) c4848.f11034).mo5291(this, locale));
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo25476(C15828 c15828, Locale locale) {
        return c15828.f20408.isEmpty() ? mo25477(locale, "compiler.misc.anonymous.class", c15828.f45859) : c15828.f45855.toString();
    }

    @Override // p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo25475(C5771 c5771, Locale locale) {
        if (c5771.m12942()) {
            return c5771.f20407.f20408.toString();
        }
        AbstractC12224 abstractC12224 = c5771.f20408;
        String string = abstractC12224 == abstractC12224.f34165.f40540.f21737 ? c5771.f20407.f20408.toString() : abstractC12224.toString();
        AbstractC6462 abstractC6462 = c5771.f20406;
        if (abstractC6462 == null) {
            return string;
        }
        if (abstractC6462.m14777(EnumC11353.FORALL)) {
            string = "<" + m35597(c5771.f20406.mo14802(), locale) + ">" + string;
        }
        return C10965.m25286(C9179.m21133(string, MotionUtils.EASING_TYPE_FORMAT_START), m35598(c5771.f20406.mo14797(), (c5771.f20409 & 17179869184L) != 0, locale), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
