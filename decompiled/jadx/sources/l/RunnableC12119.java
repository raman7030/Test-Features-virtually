package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMR */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12119 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f36200;

    public RunnableC12119(C19922 c19922, String str) {
        super(c19922);
        this.f36200 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM48358 = AbstractRunnableC21333.m48358(this.f36200);
        int iIndexOf = strM48358.indexOf(32);
        C19922 c19922 = this.f68752;
        if (iIndexOf == -1) {
            c19922.m45860("500 wrong number of parameters\r\n");
            return;
        }
        String strSubstring = strM48358.substring(0, iIndexOf);
        String strSubstring2 = strM48358.substring(iIndexOf + 1);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss", locale);
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss", locale);
            simpleDateFormat2.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
            Date date = simpleDateFormat2.parse(strSubstring);
            AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strSubstring2);
            if (m48366(abstractC15440M48364)) {
                c19922.m45860("550 Invalid name or chroot violation\r\n");
                return;
            }
            if (!abstractC15440M48364.mo23120()) {
                c19922.m45860("550 file does not exist on server\r\n");
                return;
            }
            if (!abstractC15440M48364.mo18537(date.getTime())) {
                c19922.m45860("500 unable to modify last modification time\r\n");
                return;
            }
            c19922.m45860("213 " + simpleDateFormat.format(new Date(abstractC15440M48364.mo23117())) + "; " + abstractC15440M48364.mo23554() + "\r\n");
        } catch (ParseException unused) {
            c19922.m45860("501 unable to parse parameter time-val\r\n");
        }
    }
}
