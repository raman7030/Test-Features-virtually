package p067l;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5208 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f12232;

    public /* synthetic */ AbstractC5208(int i) {
        this.f12232 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo11172(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ֫ */
    public abstract C22783 mo11174(C22783 c22783);

    public String toString() {
        switch (this.f12232) {
            case 2:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C21442 m11173(C21442 c21442) {
        int size = c21442.size();
        C21442 c21443 = new C21442(size);
        for (int i = 0; i < size; i++) {
            c21443.m43248(i, mo11174(c21442.m56524get(i)));
        }
        c21443.mo22326();
        return c21443.equals(c21442) ? c21442 : c21443;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11171(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(new Date(j));
    }
}
