package l;

import java.lang.ref.SoftReference;
import java.text.MessageFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: l.ܳܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O433 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14602 implements InterfaceC11406 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ResourceBundle f44689;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f44690 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f44691;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f44692;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5931 f44693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2903 f44694;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Locale f44695;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2609 f44696;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15601 f44697;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14602 m34851(C2903 c2903) {
        AbstractC15601 c5019;
        C4314 c4314 = f44690;
        C14602 c14602 = (C14602) c2903.m8838(c4314);
        if (c14602 == null) {
            c14602 = new C14602((Locale) c2903.m8837(Locale.class));
            c14602.f44694 = c2903;
            c2903.m8841(c4314, c14602);
            C11781 c11781M28823 = C11781.m28823(c2903);
            if (c11781M28823.m28831("rawDiagnostics")) {
                c5019 = new C17614(c11781M28823);
            } else {
                c5019 = new C5019(c11781M28823, c14602);
            }
            c14602.f44697 = c5019;
        }
        return c14602;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Locale m34856() {
        return this.f44695;
    }

    public C14602() {
        this(null);
    }

    public C14602(Locale locale) {
        this.f44692 = C2609.m8239();
        this.f44691 = new HashMap();
        m34858("com.sun.tools.javac.resources.compiler");
        locale = locale == null ? Locale.getDefault() : locale;
        this.f44696 = m34857(locale);
        this.f44695 = locale;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34858(final String str) {
        InterfaceC17425 interfaceC17425 = new InterfaceC17425() { // from class: l.ᩳܶ۠
            @Override // l.InterfaceC17425
            /* JADX INFO: renamed from: ֫ */
            public final ResourceBundle mo40768(Locale locale) {
                return ResourceBundle.getBundle(str, locale);
            }
        };
        C2609 c2609 = this.f44692;
        c2609.getClass();
        this.f44692 = new C2609(interfaceC17425, c2609);
        HashMap map = this.f44691;
        if (!map.isEmpty()) {
            map.clear();
        }
        this.f44696 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m34857(Locale locale) {
        C2609 c2609;
        if (locale == this.f44695 && (c2609 = this.f44696) != null) {
            return c2609;
        }
        HashMap map = this.f44691;
        SoftReference softReference = (SoftReference) map.get(locale);
        C2609 c2609M8239 = softReference == null ? null : (C2609) softReference.get();
        if (c2609M8239 == null) {
            c2609M8239 = C2609.m8239();
            Iterator it = this.f44692.iterator();
            while (it.hasNext()) {
                try {
                    ResourceBundle resourceBundleMo40768 = ((InterfaceC17425) it.next()).mo40768(locale);
                    c2609M8239.getClass();
                    c2609M8239 = new C2609(resourceBundleMo40768, c2609M8239);
                } catch (MissingResourceException e) {
                    throw new C7877("Cannot find requested resource bundle for locale " + locale, e);
                }
            }
            map.put(locale, new SoftReference(c2609M8239));
        }
        return c2609M8239;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34853(String str, Object... objArr) {
        return m34854(this.f44695, str, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34855(AbstractC4520 abstractC4520) {
        String string = null;
        for (C2609 c2609M34857 = m34857(this.f44695); c2609M34857.m8249() && string == null; c2609M34857 = c2609M34857.f8241) {
            try {
                string = ((ResourceBundle) c2609M34857.f8240).getString(abstractC4520.m13293());
            } catch (MissingResourceException unused) {
            }
        }
        if (string == null) {
            string = "compiler message file broken: key=" + abstractC4520.m13293() + " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}";
        }
        if (abstractC4520 == C6241.f19139) {
            return MessageFormat.format(string, new Object[0]);
        }
        AbstractC15601 abstractC15601 = this.f44697;
        if (this.f44693 == null) {
            this.f44693 = C5931.m16615(this.f44694);
        }
        C5931 c5931 = this.f44693;
        C14397 c14397 = C14397.f43364;
        c5931.getClass();
        C16719 c16719M16621 = c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, (InterfaceC3109) null, abstractC4520);
        abstractC15601.getClass();
        return abstractC15601.mo8643(c16719M16621, this.f44695);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34854(Locale locale, String str, Object... objArr) {
        if (locale == null) {
            locale = this.f44695;
        }
        return m34850(m34857(locale), str, objArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34852(String str, Object... objArr) {
        try {
            if (f44689 == null) {
                f44689 = ResourceBundle.getBundle("com.sun.tools.javac.resources.compiler");
            }
            return m34850(C2609.of((Object) f44689), str, objArr);
        } catch (MissingResourceException e) {
            throw new Error("Fatal: Resource for compiler is missing", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34850(C2609 c2609, String str, Object... objArr) {
        String strM14172 = null;
        while (c2609.m8249() && strM14172 == null) {
            try {
                strM14172 = ((ResourceBundle) c2609.f8240).getString(str);
            } catch (MissingResourceException unused) {
            }
            c2609 = c2609.f8241;
        }
        if (strM14172 == null) {
            strM14172 = C4860.m14172("compiler message file broken: key=", str, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}");
        }
        return MessageFormat.format(strM14172, objArr);
    }
}
