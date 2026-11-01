package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11063 extends AbstractC15669 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C5028 f30630;

    @Override // p067l.AbstractC15669, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final String mo4509(C10485 c10485, Locale locale) {
        C10485 c10486 = (C10485) c10485.m14783();
        C5028 c5028 = this.f30630;
        Iterator it = ((Map) c5028.f11529.get(EnumC17767.TYPEVAR)).keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC6462) it.next()).m14783().toString().equals(c10486.toString())) {
                i++;
            }
        }
        if (i < 1) {
            throw new AssertionError("Missing type variable in where clause: " + c10486);
        }
        if (i != 1) {
            if (((C11734) c5028.f69485).f32770.contains(EnumC22463.UNIQUE_TYPEVAR_NAMES)) {
                return mo25477(locale, "compiler.misc.type.var", c10485.toString(), Integer.valueOf(C5028.m10698(c5028, c10485, EnumC17767.TYPEVAR)));
            }
        }
        return c10485.toString();
    }

    public C11063(C5028 c5028) {
        this.f30630 = c5028;
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4510(C16637 c16637, Object obj) {
        Locale locale = (Locale) obj;
        C5028 c5028 = this.f30630;
        if (((C11734) c5028.f69485).f32770.contains(EnumC22463.WHERE_CLAUSES)) {
            return mo25477(locale, "compiler.misc.captured.type", Integer.valueOf(C5028.m10698(c5028, c16637, EnumC17767.CAPTURED)));
        }
        return super.m35599(c16637, locale);
    }

    @Override // p067l.AbstractC15669
    /* JADX INFO: renamed from: ֫ */
    public final String mo25477(Locale locale, String str, Object... objArr) {
        return this.f30630.f69486.mo38936(locale, str, objArr);
    }

    @Override // p067l.AbstractC15669
    /* JADX INFO: renamed from: ֫ */
    public final String mo25482(C16637 c16637) {
        return C5410.m11876(C5028.m10698(this.f30630, c16637, EnumC17767.CAPTURED), "", new StringBuilder());
    }

    @Override // p067l.AbstractC15669, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final String mo4507(AbstractC6462 abstractC6462, Locale locale) {
        return abstractC6462 == this.f30630.f11525.f69204 ? mo25477(locale, "compiler.misc.type.null", new Object[0]) : super.mo4507(abstractC6462, locale);
    }

    @Override // p067l.AbstractC15669, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final String mo4512(C21333 c21333, Locale locale) {
        if (c21333.mo7388()) {
            C5028 c5028 = this.f30630;
            if (((C11734) c5028.f69485).f32770.contains(EnumC22463.WHERE_CLAUSES)) {
                return mo25477(locale, "compiler.misc.intersection.type", Integer.valueOf(C5028.m10698(c5028, c21333, EnumC17767.INTERSECTION)));
            }
        }
        return super.mo4512(c21333, locale);
    }

    @Override // p067l.AbstractC15669
    /* JADX INFO: renamed from: ֫ */
    public final String mo25484(C21333 c21333, boolean z, Locale locale) {
        AbstractC21195 abstractC21195 = c21333.f16705;
        if (abstractC21195.f20408.length() != 0) {
            C5028 c5028 = this.f30630;
            C11734 c11734 = (C11734) c5028.f69485;
            if (c11734.f32770.contains(EnumC22463.SIMPLE_NAMES)) {
                if (z) {
                    return c5028.f11528.m20956(abstractC21195).toString();
                }
                return abstractC21195.f20408.toString();
            }
        }
        return super.mo25484(c21333, z, locale);
    }

    @Override // p067l.AbstractC15669, p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final String mo25476(C15828 c15828, Locale locale) {
        if (c15828.f20406.mo7388()) {
            return (String) c15828.f20406.mo5291(this, locale);
        }
        C5028 c5028 = this.f30630;
        String strM20956 = c5028.f11528.m20956(c15828);
        if (strM20956.length() != 0) {
            C11734 c11734 = (C11734) c5028.f69485;
            if (c11734.f32770.contains(EnumC22463.SIMPLE_NAMES)) {
                return strM20956;
            }
        }
        return super.mo25476(c15828, locale);
    }

    @Override // p067l.AbstractC15669, p067l.InterfaceC11807
    /* JADX INFO: renamed from: ֫ */
    public final String mo25475(C5771 c5771, Locale locale) {
        String string = (String) c5771.f20407.mo5228(this, locale);
        if (c5771.m12942()) {
            return string;
        }
        AbstractC12224 abstractC12224 = c5771.f20408;
        if (abstractC12224 != abstractC12224.f34165.f40540.f21737) {
            string = abstractC12224.toString();
        }
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
