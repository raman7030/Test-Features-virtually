package p067l;

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
public final class C16246 implements InterfaceC13208 {

    /* JADX INFO: renamed from: ۜ */
    public static ResourceBundle f47796;

    /* JADX INFO: renamed from: ᩷ */
    public static final C6468 f47797 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f47798;

    /* JADX INFO: renamed from: ۧ */
    public C4848 f47799;

    /* JADX INFO: renamed from: ܳ */
    public C8005 f47800;

    /* JADX INFO: renamed from: ܽ */
    public C5127 f47801;

    /* JADX INFO: renamed from: ܿ */
    public Locale f47802;

    /* JADX INFO: renamed from: ᩳ */
    public C4848 f47803;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17195 f47804;

    /* JADX INFO: renamed from: ֫ */
    public static C16246 m37002(C5127 c5127) {
        AbstractC17195 c7138;
        C6468 c6468 = f47797;
        C16246 c16246 = (C16246) c5127.m10905(c6468);
        if (c16246 == null) {
            c16246 = new C16246((Locale) c5127.m10904(Locale.class));
            c16246.f47801 = c5127;
            c5127.m10908(c6468, c16246);
            C13565 c13565M30871 = C13565.m30871(c5127);
            if (c13565M30871.m30879("rawDiagnostics")) {
                c7138 = new C19109(c13565M30871);
            } else {
                c7138 = new C7138(c13565M30871, c16246);
            }
            c16246.f47804 = c7138;
        }
        return c16246;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Locale m37007() {
        return this.f47802;
    }

    public C16246() {
        this(null);
    }

    public C16246(Locale locale) {
        this.f47799 = C4848.m10283();
        this.f47798 = new HashMap();
        m37009("com.sun.tools.javac.resources.compiler");
        locale = locale == null ? Locale.getDefault() : locale;
        this.f47803 = m37008(locale);
        this.f47802 = locale;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37009(final String str) {
        InterfaceC18929 interfaceC18929 = new InterfaceC18929() { // from class: l.ᩳܶ۠
            @Override // p067l.InterfaceC18929
            /* JADX INFO: renamed from: ֫ */
            public final ResourceBundle mo43025(Locale locale) {
                return ResourceBundle.getBundle(str, locale);
            }
        };
        C4848 c4848 = this.f47799;
        c4848.getClass();
        this.f47799 = new C4848(interfaceC18929, c4848);
        HashMap map = this.f47798;
        if (!map.isEmpty()) {
            map.clear();
        }
        this.f47803 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m37008(Locale locale) {
        C4848 c4848;
        if (locale == this.f47802 && (c4848 = this.f47803) != null) {
            return c4848;
        }
        HashMap map = this.f47798;
        SoftReference softReference = (SoftReference) map.get(locale);
        C4848 c4848M10283 = softReference == null ? null : (C4848) softReference.get();
        if (c4848M10283 == null) {
            c4848M10283 = C4848.m10283();
            Iterator it = this.f47799.iterator();
            while (it.hasNext()) {
                try {
                    ResourceBundle resourceBundleMo43025 = ((InterfaceC18929) it.next()).mo43025(locale);
                    c4848M10283.getClass();
                    c4848M10283 = new C4848(resourceBundleMo43025, c4848M10283);
                } catch (MissingResourceException e) {
                    throw new C9854("Cannot find requested resource bundle for locale " + locale, e);
                }
            }
            map.put(locale, new SoftReference(c4848M10283));
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m37004(String str, Object... objArr) {
        return m37005(this.f47802, str, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m37006(AbstractC6664 abstractC6664) {
        String string = null;
        for (C4848 c4848M37008 = m37008(this.f47802); c4848M37008.m10293() && string == null; c4848M37008 = c4848M37008.f11035) {
            try {
                string = ((ResourceBundle) c4848M37008.f11034).getString(abstractC6664.m15176());
            } catch (MissingResourceException unused) {
            }
        }
        if (string == null) {
            string = "compiler message file broken: key=" + abstractC6664.m15176() + " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}";
        }
        if (abstractC6664 == C8300.f22004) {
            return MessageFormat.format(string, new Object[0]);
        }
        AbstractC17195 abstractC17195 = this.f47804;
        if (this.f47800 == null) {
            this.f47800 = C8005.m18541(this.f47801);
        }
        C8005 c8005 = this.f47800;
        C16051 c16051 = C16051.f46457;
        c8005.getClass();
        C18258 c18258M18547 = c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, (InterfaceC5323) null, abstractC6664);
        abstractC17195.getClass();
        return abstractC17195.mo10703(c18258M18547, this.f47802);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m37005(Locale locale, String str, Object... objArr) {
        if (locale == null) {
            locale = this.f47802;
        }
        return m37001(m37008(locale), str, objArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37003(String str, Object... objArr) {
        try {
            if (f47796 == null) {
                f47796 = ResourceBundle.getBundle("com.sun.tools.javac.resources.compiler");
            }
            return m37001(C4848.m10276of((Object) f47796), str, objArr);
        } catch (MissingResourceException e) {
            throw new Error("Fatal: Resource for compiler is missing", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37001(C4848 c4848, String str, Object... objArr) {
        String strM16053 = null;
        while (c4848.m10293() && strM16053 == null) {
            try {
                strM16053 = ((ResourceBundle) c4848.f11034).getString(str);
            } catch (MissingResourceException unused) {
            }
            c4848 = c4848.f11035;
        }
        if (strM16053 == null) {
            strM16053 = C6988.m16053("compiler message file broken: key=", str, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}");
        }
        return MessageFormat.format(strM16053, objArr);
    }
}
