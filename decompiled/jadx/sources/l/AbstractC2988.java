package l;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2988 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9433;

    public /* synthetic */ AbstractC2988(int i) {
        this.f9433 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo9121(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C21480 mo9123(C21480 c21480);

    public String toString() {
        switch (this.f9433) {
            case 2:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20069 m9122(C20069 c20069) {
        int size = c20069.size();
        C20069 c200610 = new C20069(size);
        for (int i = 0; i < size; i++) {
            c200610.m40988(i, mo9123(c20069.m41004get(i)));
        }
        c200610.mo20349();
        return c200610.equals(c20069) ? c20069 : c200610;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9120(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(new Date(j));
    }
}
