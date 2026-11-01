package p067l;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۤ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E87U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12459 extends AbstractC10288 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC16992 f34859 = new C14470();

    /* JADX INFO: renamed from: ֫ */
    public final SimpleDateFormat f34860;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c24726.m54383();
            return;
        }
        synchronized (this) {
            str = this.f34860.format((java.util.Date) date);
        }
        c24726.m54386(str);
    }

    public /* synthetic */ C12459(int i) {
        this();
    }

    public C12459() {
        this.f34860 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        Date date;
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        synchronized (this) {
            TimeZone timeZone = this.f34860.getTimeZone();
            try {
                try {
                    date = new Date(this.f34860.parse(strM42644).getTime());
                    this.f34860.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C16322("Failed parsing '" + strM42644 + "' as SQL Date; at path " + c18691.m42638(), e);
                }
            } catch (Throwable th) {
                this.f34860.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }
}
