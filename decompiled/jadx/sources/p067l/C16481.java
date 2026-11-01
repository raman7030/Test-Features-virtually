package p067l;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.ܳ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C16481 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            c24726.m54383();
            return;
        }
        c24726.m54389();
        c24726.m54378("year");
        c24726.m54385(calendar.get(1));
        c24726.m54378("month");
        c24726.m54385(calendar.get(2));
        c24726.m54378("dayOfMonth");
        c24726.m54385(calendar.get(5));
        c24726.m54378("hourOfDay");
        c24726.m54385(calendar.get(11));
        c24726.m54378("minute");
        c24726.m54385(calendar.get(12));
        c24726.m54378("second");
        c24726.m54385(calendar.get(13));
        c24726.m54388();
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        c18691.m42647();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c18691.m42643() != EnumC16008.END_OBJECT) {
            String strM42641 = c18691.m42641();
            int iM42653 = c18691.m42653();
            strM42641.getClass();
            switch (strM42641) {
                case "dayOfMonth":
                    i3 = iM42653;
                    break;
                case "minute":
                    i5 = iM42653;
                    break;
                case "second":
                    i6 = iM42653;
                    break;
                case "year":
                    i = iM42653;
                    break;
                case "month":
                    i2 = iM42653;
                    break;
                case "hourOfDay":
                    i4 = iM42653;
                    break;
            }
        }
        c18691.m42655();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
