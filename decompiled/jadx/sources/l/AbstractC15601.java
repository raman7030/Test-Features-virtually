package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15601 implements InterfaceC12816 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8547 f48055;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14602 f48058;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48056 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f48054 = C2609.m8239();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC13995 f48057 = new C20542(this);

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo14514(C16719 c16719, Locale locale);

    public AbstractC15601(C14602 c14602, C8547 c8547) {
        this.f48058 = c14602;
        this.f48055 = c8547;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m36779(C16719 c16719, Locale locale) {
        int i = C9253.f28035[c16719.m39353().ordinal()];
        if (i == 1) {
            return "";
        }
        C14602 c14602 = this.f48058;
        if (i == 2) {
            return c14602.m34854(locale, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return c14602.m34854(locale, "compiler.warn.warning", new Object[0]);
        }
        if (i != 4) {
            throw new AssertionError("Unknown diagnostic type: " + c16719.m39353());
        }
        return c14602.m34854(locale, "compiler.err.error", new Object[0]);
    }

    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo8643(C16719 c16719, Locale locale) {
        this.f48054 = C2609.m8239();
        return mo14514(c16719, locale);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36772(C16719 c16719, boolean z) {
        InterfaceC18278 interfaceC18278M39350 = c16719.m39350();
        if (interfaceC18278M39350 == null) {
            throw new IllegalArgumentException();
        }
        if (z) {
            return interfaceC18278M39350.getName();
        }
        if (interfaceC18278M39350 instanceof AbstractC12465) {
            return ((AbstractC12465) interfaceC18278M39350).mo30626();
        }
        int i = AbstractC12465.f37474;
        String schemeSpecificPart = interfaceC18278M39350.toUri().getSchemeSpecificPart();
        return schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m36781(C16719 c16719, Locale locale) {
        C18837 c18837 = new C18837();
        for (Object obj : c16719.m39354()) {
            c18837.m43511(mo36777(c16719, obj, locale));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo36777(C16719 c16719, Object obj, Locale locale) {
        if (obj instanceof C16719) {
            C16719 c167110 = (C16719) obj;
            this.f48056++;
            try {
                return mo8640(c167110, locale);
            } finally {
                this.f48056--;
            }
        }
        if (obj instanceof AbstractC12612) {
            return m36770((AbstractC12612) obj);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            if (!(obj instanceof InterfaceC20758)) {
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Object obj2 : iterable) {
                    sb.append(str);
                    sb.append(mo36777(c16719, obj2, locale));
                    str = ",";
                }
                return sb.toString();
            }
        }
        if (obj instanceof AbstractC4308) {
            AbstractC13995 abstractC13995 = this.f48057;
            abstractC13995.getClass();
            return (String) ((AbstractC4308) obj).mo2962(abstractC13995, locale);
        }
        if (obj instanceof AbstractC5698) {
            AbstractC13995 abstractC13996 = this.f48057;
            abstractC13996.getClass();
            return (String) ((AbstractC5698) obj).mo2899(abstractC13996, locale);
        }
        if (obj instanceof InterfaceC18278) {
            return ((InterfaceC18278) obj).getName();
        }
        if (obj instanceof EnumC5973) {
            return ((EnumC5973) obj).f18325;
        }
        if (obj instanceof EnumC0121) {
            return ((EnumC0121) obj).f1214;
        }
        boolean z = obj instanceof InterfaceC9995;
        C14602 c14602 = this.f48058;
        if (z) {
            return ((InterfaceC9995) obj).mo21946(locale, c14602);
        }
        if (obj instanceof EnumC10892) {
            return ((EnumC10892) obj).f32755;
        }
        if (obj instanceof EnumC16280) {
            return ((EnumC16280) obj).f50071;
        }
        if (obj instanceof EnumC18550) {
            return c14602.m34854(locale, "compiler.misc.tree.tag." + ((EnumC18550) obj).name().toLowerCase(Locale.US), new Object[0]);
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36770(AbstractC12612 abstractC12612) {
        int i = C9253.f28034[abstractC12612.mo989().ordinal()];
        if (i == 1) {
            return m36770(((C14875) abstractC12612).f45392);
        }
        if (i != 2 && i != 3 && i != 4) {
            C12171.m29640("unexpected tree kind " + abstractC12612.mo987());
            throw null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            new C21372(stringWriter, false).m48445(abstractC12612, 0);
            String strReplaceAll = stringWriter.toString().trim().replaceAll("\\s+", " ").replaceAll("/\\*missing\\*/", "");
            if (strReplaceAll.length() < 20) {
                return strReplaceAll;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strReplaceAll.substring(0, 10));
            sb.append("[...]");
            return C20087.m46305(strReplaceAll.length() - 5, strReplaceAll, sb);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2609 m36782(C16719 c16719, Locale locale) {
        C2609 c2609M8239 = C2609.m8239();
        EnumC19873 enumC19873 = EnumC19873.DEPTH;
        C8547 c8547 = this.f48055;
        int iIntValue = ((Integer) c8547.f26132.get(enumC19873)).intValue();
        if (iIntValue != -1 && this.f48056 >= iIntValue) {
            return c2609M8239;
        }
        this.f48056++;
        try {
            int iIntValue2 = ((Integer) c8547.f26132.get(EnumC19873.LENGTH)).intValue();
            int i = 0;
            for (C16719 c167110 : c16719.mo39349()) {
                if (iIntValue2 != -1 && i >= iIntValue2) {
                    break;
                }
                c2609M8239 = c2609M8239.m8242((Object) mo8640(c167110, locale));
                i++;
            }
            this.f48056--;
            return c2609M8239;
        } catch (Throwable th) {
            this.f48056--;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36776(C16719 c16719, int i) {
        char c;
        StringBuilder sb = new StringBuilder();
        C14397 c14397M39355 = c16719.m39355();
        int iM39358 = c16719.m39358();
        if (c16719.m39358() == -1) {
            throw new AssertionError();
        }
        String str = null;
        if (c14397M39355 != null) {
            try {
                if (c14397M39355.mo34391(iM39358)) {
                    int i2 = c14397M39355.f43368;
                    while (i2 < c14397M39355.f43367 && (c = c14397M39355.f43365[i2]) != '\r' && c != '\n') {
                        i2++;
                    }
                    int i3 = c14397M39355.f43368;
                    int i4 = i2 - i3;
                    if (i4 != 0) {
                        String str2 = new String(c14397M39355.f43365, i3, i4);
                        c14397M39355.f43365 = null;
                        str = str2;
                    }
                }
                c14397M39355.f43365 = null;
            } catch (Throwable th) {
                c14397M39355.f43365 = null;
                throw th;
            }
        }
        if (str == null) {
            return "";
        }
        sb.append(m36769(i, str));
        int iM34389 = c14397M39355.m34389(iM39358, false);
        if (this.f48055.f26131) {
            sb.append("\n");
            for (int i5 = 0; i5 < iM34389 - 1; i5++) {
                sb.append(str.charAt(i5) == '\t' ? "\t" : " ");
            }
            sb.append(m36769(i, "^"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo36775(Locale locale, String str, Object... objArr) {
        return this.f48058.m34854(locale, str, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36778(C16719 c16719) {
        return (!EnumSet.copyOf(this.f48055.f26133).contains(EnumC21989.SOURCE) || c16719.m39353() == EnumC12986.FRAGMENT || c16719.m39358() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36768(int i) {
        if (i <= 24) {
            return "                        ".substring(0, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36769(int i, String str) {
        String strM36768 = m36768(i);
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        String str2 = "";
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArrSplit[i2];
            sb.append(str2);
            sb.append(strM36768 + str3);
            i2++;
            str2 = "\n";
        }
        return sb.toString();
    }

    @Override // l.InterfaceC12816
    public C8547 getConfiguration() {
        return this.f48055;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36771(C16719 c16719, EnumC2939 enumC2939) {
        int iM39348;
        long lineNumber;
        C12171.m29642(((long) c16719.m39358()) != -1);
        int i = C9253.f28033[enumC2939.ordinal()];
        if (i == 1) {
            iM39348 = c16719.m39348();
        } else {
            if (i != 2) {
                if (i == 3) {
                    lineNumber = c16719.getLineNumber();
                } else if (i == 4) {
                    lineNumber = c16719.getColumnNumber();
                } else if (i == 5) {
                    iM39348 = c16719.m39358();
                } else {
                    throw new AssertionError("Unknown diagnostic position: " + enumC2939);
                }
                return String.valueOf(lineNumber);
            }
            iM39348 = c16719.m39352();
        }
        lineNumber = iM39348;
        return String.valueOf(lineNumber);
    }
}
