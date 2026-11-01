package p067l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۚ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7138 extends AbstractC17195 {
    public C7138(C13565 c13565, C16246 c16246) {
        super(c16246, new C2443(c13565));
    }

    @Override // p067l.AbstractC17195
    /* JADX INFO: renamed from: ܿ */
    public final String mo16418(C18258 c18258, Locale locale) {
        boolean z;
        String strValueOf;
        C2443 c2443;
        EnumC19879 enumC19879;
        C16246 c16246 = this.f51190;
        if (locale == null) {
            locale = c16246.m37007();
        }
        C16051 c16051M41591 = c18258.m41591();
        String str = (String) ((C2443) super.getConfiguration()).f3777.get(EnumC19879.DEFAULT_NO_POS_FORMAT);
        if (c16051M41591 != null && c16051M41591 != C16051.f46457) {
            if (c18258.m41594() != -1) {
                c2443 = (C2443) super.getConfiguration();
                enumC19879 = EnumC19879.DEFAULT_POS_FORMAT;
            } else {
                InterfaceC19740 interfaceC19740 = c16051M41591.f46464;
                if (interfaceC19740 != null && interfaceC19740.mo23287() == EnumC18398.CLASS) {
                    c2443 = (C2443) super.getConfiguration();
                    enumC19879 = EnumC19879.DEFAULT_CLASS_FORMAT;
                }
            }
            str = (String) c2443.f3777.get(enumC19879);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%' || i >= str.length() - 1) {
                z = false;
            } else {
                i++;
                cCharAt = str.charAt(i);
                z = true;
            }
            if (!z) {
                strValueOf = String.valueOf(cCharAt);
            } else if (cCharAt != '%') {
                strValueOf = "";
                if (cCharAt == 'L') {
                    EnumC21706 enumC21706M41593 = c18258.m41593();
                    if (enumC21706M41593 != null) {
                        strValueOf = c16246.m37005(locale, "compiler.warn.lintOption", enumC21706M41593.f68387);
                    }
                } else if (cCharAt == '_') {
                    strValueOf = " ";
                } else if (cCharAt == 'b') {
                    strValueOf = AbstractC17195.m38933(c18258, false);
                } else if (cCharAt == 'c') {
                    strValueOf = AbstractC17195.m38932(c18258, EnumC5161.COLUMN);
                } else if (cCharAt == 'e') {
                    strValueOf = AbstractC17195.m38932(c18258, EnumC5161.END);
                } else if (cCharAt == 'f') {
                    strValueOf = AbstractC17195.m38933(c18258, true);
                } else if (cCharAt == 'l') {
                    strValueOf = AbstractC17195.m38932(c18258, EnumC5161.LINE);
                } else if (cCharAt == 'm') {
                    strValueOf = mo10700(c18258, locale);
                } else if (cCharAt == 'o') {
                    strValueOf = AbstractC17195.m38932(c18258, EnumC5161.OFFSET);
                } else if (cCharAt == 'p') {
                    strValueOf = m38940(c18258, locale);
                } else if (cCharAt == 's') {
                    strValueOf = AbstractC17195.m38932(c18258, EnumC5161.START);
                } else if (cCharAt != 't') {
                    strValueOf = String.valueOf(cCharAt);
                } else {
                    int i2 = C5797.f14240[c18258.m41589().ordinal()];
                    if (i2 != 1 && (i2 != 2 || c18258.m41594() == -1)) {
                        strValueOf = m38940(c18258, locale);
                    }
                }
            } else {
                strValueOf = "%";
            }
            sb.append(strValueOf);
            i++;
        }
        if (this.f51188 != 0) {
            return sb.toString();
        }
        String string = sb.toString();
        if (!m38939(c18258)) {
            return string;
        }
        String str2 = "\n" + m38937(c18258, ((C2443) super.getConfiguration()).m3435(EnumC23266.SOURCE));
        if (!string.contains("\n") || ((C2443) super.getConfiguration()).f3775 == EnumC20550.BOTTOM) {
            return C17588.m40053(string, str2);
        }
        return string.replaceFirst("\n", Matcher.quoteReplacement(str2) + "\n");
    }

    @Override // p067l.InterfaceC14548
    /* JADX INFO: renamed from: ۜ, reason: merged with bridge method [inline-methods] */
    public final String mo10700(C18258 c18258, Locale locale) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = this.f51190.m37005(locale, c18258.mo31353(), m38942(c18258, locale).toArray()).split("\n");
        int iM3435 = 0;
        if (strArrSplit.length == 0) {
            strArrSplit = new String[]{""};
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf(((C2443) super.getConfiguration()).f29048);
        EnumC23266 enumC23266 = EnumC23266.SUMMARY;
        if (enumSetCopyOf.contains(enumC23266)) {
            int iM3436 = ((C2443) super.getConfiguration()).m3435(enumC23266);
            sb.append(AbstractC17195.m38930(iM3436, strArrSplit[0]));
            iM3435 = iM3436;
        }
        if (strArrSplit.length > 1) {
            EnumSet enumSetCopyOf2 = EnumSet.copyOf(((C2443) super.getConfiguration()).f29048);
            EnumC23266 enumC23267 = EnumC23266.DETAILS;
            if (enumSetCopyOf2.contains(enumC23267)) {
                iM3435 += ((C2443) super.getConfiguration()).m3435(enumC23267);
                for (int i = 1; i < strArrSplit.length; i++) {
                    sb.append("\n" + AbstractC17195.m38930(iM3435, strArrSplit[i]));
                }
            }
        }
        if (c18258 instanceof C24098) {
            EnumSet enumSetCopyOf3 = EnumSet.copyOf(((C2443) super.getConfiguration()).f29048);
            EnumC23266 enumC23268 = EnumC23266.SUBDIAGNOSTICS;
            if (enumSetCopyOf3.contains(enumC23268)) {
                int iM3437 = ((C2443) super.getConfiguration()).m3435(enumC23268) + iM3435;
                Iterator it = m38943(c18258, locale).iterator();
                while (it.hasNext()) {
                    sb.append("\n" + AbstractC17195.m38930(iM3437, (String) it.next()));
                }
            }
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC17195, p067l.InterfaceC14548
    public final InterfaceC6502 getConfiguration() {
        return (C2443) super.getConfiguration();
    }

    @Override // p067l.AbstractC17195, p067l.InterfaceC14548
    public final C10491 getConfiguration() {
        return (C2443) super.getConfiguration();
    }
}
