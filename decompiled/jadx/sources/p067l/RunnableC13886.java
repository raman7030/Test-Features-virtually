package p067l;

import com.google.android.material.datepicker.UtcDates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AMR */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13886 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f39212;

    public RunnableC13886(C21302 c21302, String str) {
        super(c21302);
        this.f39212 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM50693 = AbstractRunnableC22643.m50693(this.f39212);
        int iIndexOf = strM50693.indexOf(32);
        C21302 c21302 = this.f71446;
        if (iIndexOf == -1) {
            c21302.m48173("500 wrong number of parameters\r\n");
            return;
        }
        String strSubstring = strM50693.substring(0, iIndexOf);
        String strSubstring2 = strM50693.substring(iIndexOf + 1);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss", locale);
        simpleDateFormat.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss", locale);
            simpleDateFormat2.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
            Date date = simpleDateFormat2.parse(strSubstring);
            AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strSubstring2);
            if (m50701(abstractC17043M50699)) {
                c21302.m48173("550 Invalid name or chroot violation\r\n");
                return;
            }
            if (!abstractC17043M50699.mo25094()) {
                c21302.m48173("550 file does not exist on server\r\n");
                return;
            }
            if (!abstractC17043M50699.mo20486(date.getTime())) {
                c21302.m48173("500 unable to modify last modification time\r\n");
                return;
            }
            c21302.m48173("213 " + simpleDateFormat.format(new Date(abstractC17043M50699.mo25091())) + "; " + abstractC17043M50699.mo25505() + "\r\n");
        } catch (ParseException unused) {
            c21302.m48173("501 unable to parse parameter time-val\r\n");
        }
    }
}
