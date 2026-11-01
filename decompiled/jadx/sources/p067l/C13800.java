package p067l;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۨ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V898 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13800 extends AbstractC10288 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC16992 f38992 = new C8435();

    /* JADX INFO: renamed from: ֫ */
    public final SimpleDateFormat f38993;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c24726.m54383();
            return;
        }
        synchronized (this) {
            str = this.f38993.format((Date) time);
        }
        c24726.m54386(str);
    }

    public /* synthetic */ C13800(int i) {
        this();
    }

    public C13800() {
        this.f38993 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        Time time;
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        synchronized (this) {
            TimeZone timeZone = this.f38993.getTimeZone();
            try {
                try {
                    time = new Time(this.f38993.parse(strM42644).getTime());
                    this.f38993.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C16322("Failed parsing '" + strM42644 + "' as SQL Time; at path " + c18691.m42638(), e);
                }
            } catch (Throwable th) {
                this.f38993.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }
}
