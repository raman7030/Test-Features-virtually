package l;

import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩹ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes.dex */
public final class C22042 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Calendar f70655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Locale f70656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char f70657;

    public C22042() {
        this(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m49591(long j) {
        StringBuilder sb;
        this.f70655.setTimeInMillis(j);
        sb = new StringBuilder(23);
        Calendar calendar = this.f70655;
        if (calendar instanceof GregorianCalendar) {
            m49590(sb, ((GregorianCalendar) calendar).get(1), 4);
        } else {
            String displayName = calendar.getDisplayName(1, 2, this.f70656);
            if (displayName != null) {
                sb.append(displayName);
            } else {
                m49590(sb, this.f70655.get(1), 1);
            }
        }
        sb.append('-');
        m49590(sb, this.f70655.get(2) + 1, 2);
        sb.append('-');
        m49590(sb, this.f70655.get(5), 2);
        sb.append(' ');
        m49590(sb, this.f70655.get(11), 2);
        sb.append(':');
        m49590(sb, this.f70655.get(12), 2);
        sb.append(':');
        m49590(sb, this.f70655.get(13), 2);
        sb.append('.');
        m49590(sb, this.f70655.get(14), 3);
        return sb.toString();
    }

    public C22042(int i) {
        Locale locale = Locale.getDefault();
        C11233.m27803(locale, "getDefault(...)");
        TimeZone timeZone = TimeZone.getDefault();
        C11233.m27803(timeZone, "getDefault(...)");
        this.f70656 = locale;
        this.f70655 = Calendar.getInstance(timeZone, locale);
        this.f70657 = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m49590(StringBuilder sb, int i, int i2) {
        char c;
        String strValueOf = String.valueOf(i);
        int length = i2 - strValueOf.length();
        if (length < 0) {
            length = 0;
        }
        int i3 = 0;
        while (true) {
            c = this.f70657;
            if (i3 >= length) {
                break;
            }
            sb.append(c);
            i3++;
        }
        int length2 = strValueOf.length();
        for (int i4 = 0; i4 < length2; i4++) {
            sb.append((char) ((strValueOf.charAt(i4) - '0') + c));
        }
    }
}
