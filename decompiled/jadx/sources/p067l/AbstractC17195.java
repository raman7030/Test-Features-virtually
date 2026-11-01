package p067l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17195 implements InterfaceC14548 {

    /* JADX INFO: renamed from: ۧ */
    public C10491 f51187;

    /* JADX INFO: renamed from: ᩳ */
    public C16246 f51190;

    /* JADX INFO: renamed from: ܽ */
    public int f51188 = 0;

    /* JADX INFO: renamed from: ֫ */
    public C4848 f51186 = C4848.m10283();

    /* JADX INFO: renamed from: ܿ */
    public AbstractC15669 f51189 = new C21891(this);

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo16418(C18258 c18258, Locale locale);

    public AbstractC17195(C16246 c16246, C10491 c10491) {
        this.f51190 = c16246;
        this.f51187 = c10491;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m38940(C18258 c18258, Locale locale) {
        int i = C11162.f30981[c18258.m41589().ordinal()];
        if (i == 1) {
            return "";
        }
        C16246 c16246 = this.f51190;
        if (i == 2) {
            return c16246.m37005(locale, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return c16246.m37005(locale, "compiler.warn.warning", new Object[0]);
        }
        if (i != 4) {
            throw new AssertionError("Unknown diagnostic type: " + c18258.m41589());
        }
        return c16246.m37005(locale, "compiler.err.error", new Object[0]);
    }

    @Override // p067l.InterfaceC14548
    /* JADX INFO: renamed from: ܽ, reason: merged with bridge method [inline-methods] */
    public final String mo10703(C18258 c18258, Locale locale) {
        this.f51186 = C4848.m10283();
        return mo16418(c18258, locale);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38933(C18258 c18258, boolean z) {
        InterfaceC19740 interfaceC19740M41586 = c18258.m41586();
        if (interfaceC19740M41586 == null) {
            throw new IllegalArgumentException();
        }
        if (z) {
            return interfaceC19740M41586.getName();
        }
        if (interfaceC19740M41586 instanceof AbstractC14215) {
            return ((AbstractC14215) interfaceC19740M41586).mo32691();
        }
        int i = AbstractC14215.f40494;
        String schemeSpecificPart = interfaceC19740M41586.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m38942(C18258 c18258, Locale locale) {
        C20271 c20271 = new C20271();
        for (Object obj : c18258.m41590()) {
            c20271.m45777(mo38938(c18258, obj, locale));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo38938(C18258 c18258, Object obj, Locale locale) {
        if (obj instanceof C18258) {
            C18258 c18259 = (C18258) obj;
            this.f51188++;
            try {
                return mo10700(c18259, locale);
            } finally {
                this.f51188--;
            }
        }
        if (obj instanceof AbstractC14355) {
            return m38931((AbstractC14355) obj);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            if (!(obj instanceof InterfaceC22097)) {
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Object obj2 : iterable) {
                    sb.append(str);
                    sb.append(mo38938(c18258, obj2, locale));
                    str = ",";
                }
                return sb.toString();
            }
        }
        if (obj instanceof AbstractC6462) {
            AbstractC15669 abstractC15669 = this.f51189;
            abstractC15669.getClass();
            return (String) ((AbstractC6462) obj).mo5291(abstractC15669, locale);
        }
        if (obj instanceof AbstractC7783) {
            AbstractC15669 abstractC156610 = this.f51189;
            abstractC156610.getClass();
            return (String) ((AbstractC7783) obj).mo5228(abstractC156610, locale);
        }
        if (obj instanceof InterfaceC19740) {
            return ((InterfaceC19740) obj).getName();
        }
        if (obj instanceof EnumC8045) {
            return ((EnumC8045) obj).f21178;
        }
        if (obj instanceof EnumC2483) {
            return ((EnumC2483) obj).f3990;
        }
        boolean z = obj instanceof InterfaceC11867;
        C16246 c16246 = this.f51190;
        if (z) {
            return ((InterfaceC11867) obj).mo23916(locale, c16246);
        }
        if (obj instanceof EnumC12720) {
            return ((EnumC12720) obj).f35733;
        }
        if (obj instanceof EnumC17840) {
            return ((EnumC17840) obj).f53238;
        }
        if (obj instanceof EnumC19998) {
            return c16246.m37005(locale, "compiler.misc.tree.tag." + ((EnumC19998) obj).name().toLowerCase(Locale.US), new Object[0]);
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38931(AbstractC14355 abstractC14355) {
        int i = C11162.f30980[abstractC14355.mo3383().ordinal()];
        if (i == 1) {
            return m38931(((C16505) abstractC14355).f48507);
        }
        if (i != 2 && i != 3 && i != 4) {
            C1446.m31702("unexpected tree kind " + abstractC14355.mo3381());
            throw null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            new C22680(stringWriter, false).m50781(abstractC14355, 0);
            String strReplaceAll = stringWriter.toString().trim().replaceAll("\\s+", " ").replaceAll("/\\*missing\\*/", "");
            if (strReplaceAll.length() < 20) {
                return strReplaceAll;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strReplaceAll.substring(0, 10));
            sb.append("[...]");
            return C21459.m48621(strReplaceAll.length() - 5, strReplaceAll, sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C4848 m38943(C18258 c18258, Locale locale) {
        C4848 c4848M10283 = C4848.m10283();
        EnumC21255 enumC21255 = EnumC21255.DEPTH;
        C10491 c10491 = this.f51187;
        int iIntValue = ((Integer) c10491.f29047.get(enumC21255)).intValue();
        if (iIntValue != -1 && this.f51188 >= iIntValue) {
            return c4848M10283;
        }
        this.f51188++;
        try {
            int iIntValue2 = ((Integer) c10491.f29047.get(EnumC21255.LENGTH)).intValue();
            int i = 0;
            for (C18258 c18259 : c18258.mo41585()) {
                if (iIntValue2 != -1 && i >= iIntValue2) {
                    break;
                }
                c4848M10283 = c4848M10283.m10286((Object) mo10700(c18259, locale));
                i++;
            }
            this.f51188--;
            return c4848M10283;
        } catch (Throwable th) {
            this.f51188--;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38937(C18258 c18258, int i) {
        char c;
        StringBuilder sb = new StringBuilder();
        C16051 c16051M41591 = c18258.m41591();
        int iM41594 = c18258.m41594();
        if (c18258.m41594() == -1) {
            throw new AssertionError();
        }
        String str = null;
        if (c16051M41591 != null) {
            try {
                if (c16051M41591.mo36525(iM41594)) {
                    int i2 = c16051M41591.f46461;
                    while (i2 < c16051M41591.f46460 && (c = c16051M41591.f46458[i2]) != '\r' && c != '\n') {
                        i2++;
                    }
                    int i3 = c16051M41591.f46461;
                    int i4 = i2 - i3;
                    if (i4 != 0) {
                        String str2 = new String(c16051M41591.f46458, i3, i4);
                        c16051M41591.f46458 = null;
                        str = str2;
                    }
                }
                c16051M41591.f46458 = null;
            } catch (Throwable th) {
                c16051M41591.f46458 = null;
                throw th;
            }
        }
        if (str == null) {
            return "";
        }
        sb.append(m38930(i, str));
        int iM36523 = c16051M41591.m36523(iM41594, false);
        if (this.f51187.f29046) {
            sb.append("\n");
            for (int i5 = 0; i5 < iM36523 - 1; i5++) {
                sb.append(str.charAt(i5) == '\t' ? "\t" : " ");
            }
            sb.append(m38930(i, "^"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo38936(Locale locale, String str, Object... objArr) {
        return this.f51190.m37005(locale, str, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38939(C18258 c18258) {
        return (!EnumSet.copyOf(this.f51187.f29048).contains(EnumC23266.SOURCE) || c18258.m41589() == EnumC14710.FRAGMENT || c18258.m41594() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38929(int i) {
        if (i <= 24) {
            return "                        ".substring(0, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38930(int i, String str) {
        String strM38929 = m38929(i);
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        String str2 = "";
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArrSplit[i2];
            sb.append(str2);
            sb.append(strM38929 + str3);
            i2++;
            str2 = "\n";
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC14548
    public C10491 getConfiguration() {
        return this.f51187;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38932(C18258 c18258, EnumC5161 enumC5161) {
        int iM41584;
        long lineNumber;
        C1446.m31704(((long) c18258.m41594()) != -1);
        int i = C11162.f30979[enumC5161.ordinal()];
        if (i == 1) {
            iM41584 = c18258.m41584();
        } else {
            if (i != 2) {
                if (i == 3) {
                    lineNumber = c18258.getLineNumber();
                } else if (i == 4) {
                    lineNumber = c18258.getColumnNumber();
                } else if (i == 5) {
                    iM41584 = c18258.m41594();
                } else {
                    throw new AssertionError("Unknown diagnostic position: " + enumC5161);
                }
                return String.valueOf(lineNumber);
            }
            iM41584 = c18258.m41588();
        }
        lineNumber = iM41584;
        return String.valueOf(lineNumber);
    }
}
