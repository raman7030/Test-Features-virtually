package p067l;

import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩹ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes.dex */
public final class C23317 {

    /* JADX INFO: renamed from: ֫ */
    public final Calendar f73372;

    /* JADX INFO: renamed from: ۧ */
    public final Locale f73373;

    /* JADX INFO: renamed from: ܽ */
    public final char f73374;

    public C23317() {
        this(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized String m51927(long j) {
        StringBuilder sb;
        this.f73372.setTimeInMillis(j);
        sb = new StringBuilder(23);
        Calendar calendar = this.f73372;
        if (calendar instanceof GregorianCalendar) {
            m51926(sb, ((GregorianCalendar) calendar).get(1), 4);
        } else {
            String displayName = calendar.getDisplayName(1, 2, this.f73373);
            if (displayName != null) {
                sb.append(displayName);
            } else {
                m51926(sb, this.f73372.get(1), 1);
            }
        }
        sb.append('-');
        m51926(sb, this.f73372.get(2) + 1, 2);
        sb.append('-');
        m51926(sb, this.f73372.get(5), 2);
        sb.append(' ');
        m51926(sb, this.f73372.get(11), 2);
        sb.append(':');
        m51926(sb, this.f73372.get(12), 2);
        sb.append(':');
        m51926(sb, this.f73372.get(13), 2);
        sb.append('.');
        m51926(sb, this.f73372.get(14), 3);
        return sb.toString();
    }

    public C23317(int i) {
        Locale locale = Locale.getDefault();
        C13045.m29865(locale, "getDefault(...)");
        TimeZone timeZone = TimeZone.getDefault();
        C13045.m29865(timeZone, "getDefault(...)");
        this.f73373 = locale;
        this.f73372 = Calendar.getInstance(timeZone, locale);
        this.f73374 = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m51926(StringBuilder sb, int i, int i2) {
        char c;
        String strValueOf = String.valueOf(i);
        int length = i2 - strValueOf.length();
        if (length < 0) {
            length = 0;
        }
        int i3 = 0;
        while (true) {
            c = this.f73374;
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
