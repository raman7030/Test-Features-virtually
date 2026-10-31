package l;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64LS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17048 implements InterfaceC1211 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f52245 = {14, 13, 12, 11, 5, 2, 1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f52246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52247;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52248;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52249;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f52250;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40015(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return m40014(11);
                }
                if (c == 'M') {
                    return m40014(2);
                }
                if (c == 'S') {
                    return m40014(14);
                }
                if (c == 'd') {
                    return m40014(5);
                }
                if (c == 'm') {
                    return m40014(12);
                }
                if (c == 's') {
                    return m40014(13);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40014(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == f52245[i2]) {
                return i2;
            }
        }
        return 0;
    }

    public C17048() {
        m40016("MMM d yyyy", null);
        m40017("MMM d HH:mm", null);
    }

    @Override // l.InterfaceC1211
    /* JADX INFO: renamed from: ֫ */
    public final void mo4051(C3328 c3328) {
        c3328.getClass();
        DateFormatSymbols dateFormatSymbolsM10179 = C3328.m10179("en");
        m40017(c3328.m10182(), dateFormatSymbolsM10179);
        String strM10180 = c3328.m10180();
        if (strM10180 == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m40016(strM10180, dateFormatSymbolsM10179);
        TimeZone timeZone = TimeZone.getDefault();
        this.f52246.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.f52250;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f52248 = c3328.m10185();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Calendar m40018(String str) throws ParseException {
        ParsePosition parsePosition;
        Date date;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(this.f52246.getTimeZone());
        SimpleDateFormat simpleDateFormat = this.f52250;
        int[] iArr = f52245;
        if (simpleDateFormat == null) {
            parsePosition = new ParsePosition(0);
            date = this.f52246.parse(str, parsePosition);
            if (date != null) {
            }
            StringBuilder sbM9834 = C3200.m9834("Timestamp '", str, "' could not be parsed using a server time of ");
            sbM9834.append(calendar.getTime().toString());
            throw new ParseException(sbM9834.toString(), parsePosition.getErrorIndex());
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.setTimeZone(this.f52246.getTimeZone());
        if (this.f52248) {
            calendar3.add(5, 1);
        }
        String strM50967 = C22870.m50967(str, " ", Integer.toString(calendar3.get(1)));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f52250.toPattern() + " yyyy", this.f52250.getDateFormatSymbols());
        simpleDateFormat2.setLenient(false);
        simpleDateFormat2.setTimeZone(this.f52250.getTimeZone());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date date2 = simpleDateFormat2.parse(strM50967, parsePosition2);
        if (date2 == null || parsePosition2.getIndex() != strM50967.length()) {
            parsePosition = new ParsePosition(0);
            date = this.f52246.parse(str, parsePosition);
            if (date != null || parsePosition.getIndex() != str.length()) {
                StringBuilder sbM9835 = C3200.m9834("Timestamp '", str, "' could not be parsed using a server time of ");
                sbM9835.append(calendar.getTime().toString());
                throw new ParseException(sbM9835.toString(), parsePosition.getErrorIndex());
            }
            calendar2.setTime(date);
            int i = this.f52247;
            if (i > 0) {
                int i2 = iArr[i - 1];
                if (calendar2.get(i2) == 0) {
                    calendar2.clear(i2);
                    return calendar2;
                }
            }
        } else {
            calendar2.setTime(date2);
            if (calendar2.after(calendar3)) {
                calendar2.add(1, -1);
            }
            int i3 = this.f52249;
            if (i3 > 0) {
                int i4 = iArr[i3 - 1];
                if (calendar2.get(i4) == 0) {
                    calendar2.clear(i4);
                    return calendar2;
                }
            }
        }
        return calendar2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40016(String str, DateFormatSymbols dateFormatSymbols) {
        if (dateFormatSymbols != null) {
            this.f52246 = new SimpleDateFormat(str, dateFormatSymbols);
        } else {
            this.f52246 = new SimpleDateFormat(str);
        }
        this.f52246.setLenient(false);
        this.f52247 = m40015(this.f52246);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40017(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f52250 = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f52250 = new SimpleDateFormat(str);
            }
            this.f52250.setLenient(false);
        } else {
            this.f52250 = null;
        }
        this.f52249 = m40015(this.f52250);
    }
}
