package p067l;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: renamed from: l.۟ܳ */
/* JADX INFO: compiled from: G5FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1215 {

    /* JADX INFO: renamed from: ᩳ */
    public static C1215 f26047;

    /* JADX INFO: renamed from: ֫ */
    public final Context f26048;

    /* JADX INFO: renamed from: ۧ */
    public final LocationManager f26049;

    /* JADX INFO: renamed from: ܽ */
    public final C1530 f26050 = new C1530();

    /* JADX INFO: renamed from: ֫ */
    public static C1215 m22135(Context context) {
        if (f26047 == null) {
            Context applicationContext = context.getApplicationContext();
            f26047 = new C1215(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f26047;
    }

    public C1215(Context context, LocationManager locationManager) {
        this.f26048 = context;
        this.f26049 = locationManager;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m22136() {
        Location lastKnownLocation;
        long j;
        C1530 c1530 = this.f26050;
        if (c1530.f44428 > System.currentTimeMillis()) {
            return c1530.f44427;
        }
        Context context = this.f26048;
        int iM31697 = C1446.m31697(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationManager locationManager = this.f26049;
        Location lastKnownLocation2 = null;
        if (iM31697 == 0) {
            try {
                if (locationManager.isProviderEnabled("network")) {
                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                } else {
                    lastKnownLocation = null;
                }
            } catch (Exception unused) {
            }
        } else {
            lastKnownLocation = null;
        }
        if (C1446.m31697(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                }
            } catch (Exception unused2) {
            }
        }
        if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
            lastKnownLocation = lastKnownLocation2;
        }
        if (lastKnownLocation == null) {
            int i = Calendar.getInstance().get(11);
            return i < 6 || i >= 22;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1985 c1985M53601 = C1985.m53601();
        c1985M53601.m53602(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
        c1985M53601.m53602(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
        boolean z = c1985M53601.f76887 == 1;
        long j2 = c1985M53601.f76888;
        long j3 = c1985M53601.f76889;
        c1985M53601.m53602(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
        long j4 = c1985M53601.f76888;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        c1530.f44427 = z;
        c1530.f44428 = j;
        return z;
    }
}
