package l;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۤ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E87U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10617 extends AbstractC8333 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f31887 = new C12733();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f31888;

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c23525.m51981();
            return;
        }
        synchronized (this) {
            str = this.f31888.format((java.util.Date) date);
        }
        c23525.m51984(str);
    }

    public /* synthetic */ C10617(int i) {
        this();
    }

    public C10617() {
        this.f31888 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        Date date;
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String strM40399 = c17175.m40399();
        synchronized (this) {
            TimeZone timeZone = this.f31888.getTimeZone();
            try {
                try {
                    date = new Date(this.f31888.parse(strM40399).getTime());
                    this.f31888.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C14682("Failed parsing '" + strM40399 + "' as SQL Date; at path " + c17175.m40393(), e);
                }
            } catch (Throwable th) {
                this.f31888.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }
}
