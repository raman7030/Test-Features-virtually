package l;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: l.ܳ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C14849 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            c23525.m51981();
            return;
        }
        c23525.m51987();
        c23525.m51976("year");
        c23525.m51983(calendar.get(1));
        c23525.m51976("month");
        c23525.m51983(calendar.get(2));
        c23525.m51976("dayOfMonth");
        c23525.m51983(calendar.get(5));
        c23525.m51976("hourOfDay");
        c23525.m51983(calendar.get(11));
        c23525.m51976("minute");
        c23525.m51983(calendar.get(12));
        c23525.m51976("second");
        c23525.m51983(calendar.get(13));
        c23525.m51986();
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        c17175.m40402();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c17175.m40398() != EnumC14352.END_OBJECT) {
            String strM40396 = c17175.m40396();
            int iM40408 = c17175.m40408();
            strM40396.getClass();
            switch (strM40396) {
                case "dayOfMonth":
                    i3 = iM40408;
                    break;
                case "minute":
                    i5 = iM40408;
                    break;
                case "second":
                    i6 = iM40408;
                    break;
                case "year":
                    i = iM40408;
                    break;
                case "month":
                    i2 = iM40408;
                    break;
                case "hourOfDay":
                    i4 = iM40408;
                    break;
            }
        }
        c17175.m40410();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
