package l;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۤܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G851 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10429 extends AbstractC8333 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f31334 = new C3373();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f31335;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12545 f31336;

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c23525.m51981();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f31335.get(0);
        synchronized (this.f31335) {
            str = dateFormat.format(date);
        }
        c23525.m51984(str);
    }

    public C10429(int i) {
        ArrayList arrayList = new ArrayList();
        this.f31335 = arrayList;
        this.f31336 = AbstractC12545.f37672;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C11861.m28970()) {
            arrayList.add(new SimpleDateFormat(C22870.m50967("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        Date dateM50596;
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String strM40399 = c17175.m40399();
        synchronized (this.f31335) {
            for (DateFormat dateFormat : this.f31335) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    dateM50596 = dateFormat.parse(strM40399);
                    dateFormat.setTimeZone(timeZone);
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                dateM50596 = C22611.m50596(strM40399, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbM9834 = C3200.m9834("Failed parsing '", strM40399, "' as Date; at path ");
                sbM9834.append(c17175.m40393());
                throw new C14682(sbM9834.toString(), e);
            }
        }
        ((C13250) this.f31336).getClass();
        return dateM50596;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f31335.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
