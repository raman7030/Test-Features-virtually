package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9148 extends AbstractC13995 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2798 f27690;

    @Override // l.AbstractC13995, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo2142(C8541 c8541, Locale locale) {
        C8541 c8542 = (C8541) c8541.m12919();
        C2798 c2798 = this.f27690;
        Iterator it = ((Map) c2798.f8735.get(EnumC16202.TYPEVAR)).keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC4308) it.next()).m12919().toString().equals(c8542.toString())) {
                i++;
            }
        }
        if (i < 1) {
            throw new AssertionError("Missing type variable in where clause: " + c8542);
        }
        if (i != 1) {
            if (((C9854) c2798.f66801).f29817.contains(EnumC21143.UNIQUE_TYPEVAR_NAMES)) {
                return mo23526(locale, "compiler.misc.type.var", c8541.toString(), Integer.valueOf(C2798.m8638(c2798, c8541, EnumC16202.TYPEVAR)));
            }
        }
        return c8541.toString();
    }

    public C9148(C2798 c2798) {
        this.f27690 = c2798;
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2143(C15014 c15014, Object obj) {
        Locale locale = (Locale) obj;
        C2798 c2798 = this.f27690;
        if (((C9854) c2798.f66801).f29817.contains(EnumC21143.WHERE_CLAUSES)) {
            return mo23526(locale, "compiler.misc.captured.type", Integer.valueOf(C2798.m8638(c2798, c15014, EnumC16202.CAPTURED)));
        }
        return super.m33479(c15014, locale);
    }

    @Override // l.AbstractC13995
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo23526(Locale locale, String str, Object... objArr) {
        return this.f27690.f66802.mo36775(locale, str, objArr);
    }

    @Override // l.AbstractC13995
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo23531(C15014 c15014) {
        return C3200.m9831(C2798.m8638(this.f27690, c15014, EnumC16202.CAPTURED), "", new StringBuilder());
    }

    @Override // l.AbstractC13995, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo2140(AbstractC4308 abstractC4308, Locale locale) {
        return abstractC4308 == this.f27690.f8731.f66522 ? mo23526(locale, "compiler.misc.type.null", new Object[0]) : super.mo2140(abstractC4308, locale);
    }

    @Override // l.AbstractC13995, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo2145(C19955 c19955, Locale locale) {
        if (c19955.mo5146()) {
            C2798 c2798 = this.f27690;
            if (((C9854) c2798.f66801).f29817.contains(EnumC21143.WHERE_CLAUSES)) {
                return mo23526(locale, "compiler.misc.intersection.type", Integer.valueOf(C2798.m8638(c2798, c19955, EnumC16202.INTERSECTION)));
            }
        }
        return super.mo2145(c19955, locale);
    }

    @Override // l.AbstractC13995
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo23533(C19955 c19955, boolean z, Locale locale) {
        AbstractC19810 abstractC19810 = c19955.f13890;
        if (abstractC19810.f17562.length() != 0) {
            C2798 c2798 = this.f27690;
            C9854 c9854 = (C9854) c2798.f66801;
            if (c9854.f29817.contains(EnumC21143.SIMPLE_NAMES)) {
                if (z) {
                    return c2798.f8734.m18999(abstractC19810).toString();
                }
                return abstractC19810.f17562.toString();
            }
        }
        return super.mo23533(c19955, z, locale);
    }

    @Override // l.AbstractC13995, l.InterfaceC9932
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo23525(C14163 c14163, Locale locale) {
        if (c14163.f17560.mo5146()) {
            return (String) c14163.f17560.mo2962(this, locale);
        }
        C2798 c2798 = this.f27690;
        String strM18999 = c2798.f8734.m18999(c14163);
        if (strM18999.length() != 0) {
            C9854 c9854 = (C9854) c2798.f66801;
            if (c9854.f29817.contains(EnumC21143.SIMPLE_NAMES)) {
                return strM18999;
            }
        }
        return super.mo23525(c14163, locale);
    }

    @Override // l.AbstractC13995, l.InterfaceC9932
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo23524(C3581 c3581, Locale locale) {
        String string = (String) c3581.f17561.mo2899(this, locale);
        if (c3581.m10966()) {
            return string;
        }
        AbstractC10370 abstractC10370 = c3581.f17562;
        if (abstractC10370 != abstractC10370.f31203.f37517.f18879) {
            string = abstractC10370.toString();
        }
        AbstractC4308 abstractC4308 = c3581.f17560;
        if (abstractC4308 == null) {
            return string;
        }
        if (abstractC4308.m12913(EnumC9454.FORALL)) {
            string = "<" + m33477(c3581.f17560.mo12938(), locale) + ">" + string;
        }
        return C9045.m23341(C7166.m19190(string, MotionUtils.EASING_TYPE_FORMAT_START), m33478(c3581.f17560.mo12933(), (c3581.f17563 & 17179869184L) != 0, locale), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
