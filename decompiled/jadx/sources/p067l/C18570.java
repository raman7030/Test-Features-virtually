package p067l;

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
public final class C18570 implements InterfaceC3519 {

    /* JADX INFO: renamed from: ܳ */
    public static final int[] f55427 = {14, 13, 12, 11, 5, 2, 1};

    /* JADX INFO: renamed from: ֫ */
    public SimpleDateFormat f55428;

    /* JADX INFO: renamed from: ۧ */
    public int f55429;

    /* JADX INFO: renamed from: ܽ */
    public boolean f55430;

    /* JADX INFO: renamed from: ܿ */
    public int f55431;

    /* JADX INFO: renamed from: ᩳ */
    public SimpleDateFormat f55432;

    /* JADX INFO: renamed from: ֫ */
    public static int m42260(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return m42259(11);
                }
                if (c == 'M') {
                    return m42259(2);
                }
                if (c == 'S') {
                    return m42259(14);
                }
                if (c == 'd') {
                    return m42259(5);
                }
                if (c == 'm') {
                    return m42259(12);
                }
                if (c == 's') {
                    return m42259(13);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42259(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == f55427[i2]) {
                return i2;
            }
        }
        return 0;
    }

    public C18570() {
        m42261("MMM d yyyy", null);
        m42262("MMM d HH:mm", null);
    }

    @Override // p067l.InterfaceC3519
    /* JADX INFO: renamed from: ֫ */
    public final void mo6295(C5531 c5531) {
        c5531.getClass();
        DateFormatSymbols dateFormatSymbolsM12215 = C5531.m12215("en");
        m42262(c5531.m12218(), dateFormatSymbolsM12215);
        String strM12216 = c5531.m12216();
        if (strM12216 == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m42261(strM12216, dateFormatSymbolsM12215);
        TimeZone timeZone = TimeZone.getDefault();
        this.f55428.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.f55432;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f55430 = c5531.m12221();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX INFO: renamed from: ֫ */
    public final Calendar m42263(String str) throws ParseException {
        ParsePosition parsePosition;
        Date date;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(this.f55428.getTimeZone());
        SimpleDateFormat simpleDateFormat = this.f55432;
        int[] iArr = f55427;
        if (simpleDateFormat == null) {
            parsePosition = new ParsePosition(0);
            date = this.f55428.parse(str, parsePosition);
            if (date != null) {
            }
            StringBuilder sbM11879 = C5410.m11879("Timestamp '", str, "' could not be parsed using a server time of ");
            sbM11879.append(calendar.getTime().toString());
            throw new ParseException(sbM11879.toString(), parsePosition.getErrorIndex());
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.setTimeZone(this.f55428.getTimeZone());
        if (this.f55430) {
            calendar3.add(5, 1);
        }
        String strM53357 = C24104.m53357(str, " ", Integer.toString(calendar3.get(1)));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f55432.toPattern() + " yyyy", this.f55432.getDateFormatSymbols());
        simpleDateFormat2.setLenient(false);
        simpleDateFormat2.setTimeZone(this.f55432.getTimeZone());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date date2 = simpleDateFormat2.parse(strM53357, parsePosition2);
        if (date2 == null || parsePosition2.getIndex() != strM53357.length()) {
            parsePosition = new ParsePosition(0);
            date = this.f55428.parse(str, parsePosition);
            if (date != null || parsePosition.getIndex() != str.length()) {
                StringBuilder sbM118710 = C5410.m11879("Timestamp '", str, "' could not be parsed using a server time of ");
                sbM118710.append(calendar.getTime().toString());
                throw new ParseException(sbM118710.toString(), parsePosition.getErrorIndex());
            }
            calendar2.setTime(date);
            int i = this.f55429;
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
            int i3 = this.f55431;
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

    /* JADX INFO: renamed from: ֫ */
    private void m42261(String str, DateFormatSymbols dateFormatSymbols) {
        if (dateFormatSymbols != null) {
            this.f55428 = new SimpleDateFormat(str, dateFormatSymbols);
        } else {
            this.f55428 = new SimpleDateFormat(str);
        }
        this.f55428.setLenient(false);
        this.f55429 = m42260(this.f55428);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42262(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f55432 = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f55432 = new SimpleDateFormat(str);
            }
            this.f55432.setLenient(false);
        } else {
            this.f55432 = null;
        }
        this.f55431 = m42260(this.f55432);
    }
}
