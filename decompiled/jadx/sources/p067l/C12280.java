package p067l;

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
public final class C12280 extends AbstractC10288 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC16992 f34298 = new C5574();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f34299;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14291 f34300;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c24726.m54383();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f34299.get(0);
        synchronized (this.f34299) {
            str = dateFormat.format(date);
        }
        c24726.m54386(str);
    }

    public C12280(int i) {
        ArrayList arrayList = new ArrayList();
        this.f34299 = arrayList;
        this.f34300 = AbstractC14291.f40698;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C13641.m31021()) {
            arrayList.add(new SimpleDateFormat(C24104.m53357("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        Date dateM52938;
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        synchronized (this.f34299) {
            for (DateFormat dateFormat : this.f34299) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    dateM52938 = dateFormat.parse(strM42644);
                    dateFormat.setTimeZone(timeZone);
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                dateM52938 = C23858.m52938(strM42644, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbM11879 = C5410.m11879("Failed parsing '", strM42644, "' as Date; at path ");
                sbM11879.append(c18691.m42638());
                throw new C16322(sbM11879.toString(), e);
            }
        }
        ((C14961) this.f34300).getClass();
        return dateM52938;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f34299.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
