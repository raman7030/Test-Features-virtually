package l;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: renamed from: l.۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7518 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7518 f23134;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f23135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LocationManager f23136;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13867 f23137 = new C13867();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7518 m20159(Context context) {
        if (f23134 == null) {
            Context applicationContext = context.getApplicationContext();
            f23134 = new C7518(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f23134;
    }

    public C7518(Context context, LocationManager locationManager) {
        this.f23135 = context;
        this.f23136 = locationManager;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20160() {
        Location lastKnownLocation;
        long j;
        C13867 c13867 = this.f23137;
        if (c13867.f41347 > System.currentTimeMillis()) {
            return c13867.f41346;
        }
        Context context = this.f23135;
        int iM29635 = C12171.m29635(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationManager locationManager = this.f23136;
        Location lastKnownLocation2 = null;
        if (iM29635 == 0) {
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
        if (C12171.m29635(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
        C23040 c23040M51208 = C23040.m51208();
        c23040M51208.m51209(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
        c23040M51208.m51209(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
        boolean z = c23040M51208.f74145 == 1;
        long j2 = c23040M51208.f74146;
        long j3 = c23040M51208.f74147;
        c23040M51208.m51209(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
        long j4 = c23040M51208.f74146;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        c13867.f41346 = z;
        c13867.f41347 = j;
        return z;
    }
}
