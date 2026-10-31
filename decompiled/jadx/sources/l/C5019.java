package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۚ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5019 extends AbstractC15601 {
    public C5019(C11781 c11781, C14602 c14602) {
        super(c14602, new C0079(c11781));
    }

    @Override // l.AbstractC15601
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo14514(C16719 c16719, Locale locale) {
        boolean z;
        String strValueOf;
        C0079 c0079;
        EnumC18425 enumC18425;
        C14602 c14602 = this.f48058;
        if (locale == null) {
            locale = c14602.m34856();
        }
        C14397 c14397M39355 = c16719.m39355();
        String str = (String) ((C0079) super.getConfiguration()).f1003.get(EnumC18425.DEFAULT_NO_POS_FORMAT);
        if (c14397M39355 != null && c14397M39355 != C14397.f43364) {
            if (c16719.m39358() != -1) {
                c0079 = (C0079) super.getConfiguration();
                enumC18425 = EnumC18425.DEFAULT_POS_FORMAT;
            } else {
                InterfaceC18278 interfaceC18278 = c14397M39355.f43371;
                if (interfaceC18278 != null && interfaceC18278.mo21321() == EnumC16866.CLASS) {
                    c0079 = (C0079) super.getConfiguration();
                    enumC18425 = EnumC18425.DEFAULT_CLASS_FORMAT;
                }
            }
            str = (String) c0079.f1003.get(enumC18425);
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
                    EnumC20347 enumC20347M39357 = c16719.m39357();
                    if (enumC20347M39357 != null) {
                        strValueOf = c14602.m34854(locale, "compiler.warn.lintOption", enumC20347M39357.f65711);
                    }
                } else if (cCharAt == '_') {
                    strValueOf = " ";
                } else if (cCharAt == 'b') {
                    strValueOf = AbstractC15601.m36772(c16719, false);
                } else if (cCharAt == 'c') {
                    strValueOf = AbstractC15601.m36771(c16719, EnumC2939.COLUMN);
                } else if (cCharAt == 'e') {
                    strValueOf = AbstractC15601.m36771(c16719, EnumC2939.END);
                } else if (cCharAt == 'f') {
                    strValueOf = AbstractC15601.m36772(c16719, true);
                } else if (cCharAt == 'l') {
                    strValueOf = AbstractC15601.m36771(c16719, EnumC2939.LINE);
                } else if (cCharAt == 'm') {
                    strValueOf = mo8640(c16719, locale);
                } else if (cCharAt == 'o') {
                    strValueOf = AbstractC15601.m36771(c16719, EnumC2939.OFFSET);
                } else if (cCharAt == 'p') {
                    strValueOf = m36779(c16719, locale);
                } else if (cCharAt == 's') {
                    strValueOf = AbstractC15601.m36771(c16719, EnumC2939.START);
                } else if (cCharAt != 't') {
                    strValueOf = String.valueOf(cCharAt);
                } else {
                    int i2 = C3608.f11436[c16719.m39353().ordinal()];
                    if (i2 != 1 && (i2 != 2 || c16719.m39358() == -1)) {
                        strValueOf = m36779(c16719, locale);
                    }
                }
            } else {
                strValueOf = "%";
            }
            sb.append(strValueOf);
            i++;
        }
        if (this.f48056 != 0) {
            return sb.toString();
        }
        String string = sb.toString();
        if (!m36778(c16719)) {
            return string;
        }
        String str2 = "\n" + m36776(c16719, ((C0079) super.getConfiguration()).m1039(EnumC21989.SOURCE));
        if (!string.contains("\n") || ((C0079) super.getConfiguration()).f1001 == EnumC19131.BOTTOM) {
            return C16014.m37867(string, str2);
        }
        return string.replaceFirst("\n", Matcher.quoteReplacement(str2) + "\n");
    }

    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo8640(C16719 c16719, Locale locale) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = this.f48058.m34854(locale, c16719.mo29298(), m36781(c16719, locale).toArray()).split("\n");
        int iM1039 = 0;
        if (strArrSplit.length == 0) {
            strArrSplit = new String[]{""};
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
        EnumC21989 enumC21989 = EnumC21989.SUMMARY;
        if (enumSetCopyOf.contains(enumC21989)) {
            int iM10310 = ((C0079) super.getConfiguration()).m1039(enumC21989);
            sb.append(AbstractC15601.m36769(iM10310, strArrSplit[0]));
            iM1039 = iM10310;
        }
        if (strArrSplit.length > 1) {
            EnumSet enumSetCopyOf2 = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
            EnumC21989 enumC219810 = EnumC21989.DETAILS;
            if (enumSetCopyOf2.contains(enumC219810)) {
                iM1039 += ((C0079) super.getConfiguration()).m1039(enumC219810);
                for (int i = 1; i < strArrSplit.length; i++) {
                    sb.append("\n" + AbstractC15601.m36769(iM1039, strArrSplit[i]));
                }
            }
        }
        if (c16719 instanceof C22864) {
            EnumSet enumSetCopyOf3 = EnumSet.copyOf(((C0079) super.getConfiguration()).f26133);
            EnumC21989 enumC219811 = EnumC21989.SUBDIAGNOSTICS;
            if (enumSetCopyOf3.contains(enumC219811)) {
                int iM10311 = ((C0079) super.getConfiguration()).m1039(enumC219811) + iM1039;
                Iterator it = m36782(c16719, locale).iterator();
                while (it.hasNext()) {
                    sb.append("\n" + AbstractC15601.m36769(iM10311, (String) it.next()));
                }
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC15601, l.InterfaceC12816
    public final InterfaceC4350 getConfiguration() {
        return (C0079) super.getConfiguration();
    }

    @Override // l.AbstractC15601, l.InterfaceC12816
    public final C8547 getConfiguration() {
        return (C0079) super.getConfiguration();
    }
}
