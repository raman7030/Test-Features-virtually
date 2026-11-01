package p067l;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.alipay.sdk.p010m.p037n.C0172c;

/* JADX INFO: renamed from: l.᩷֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21914 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8502();

    /* JADX INFO: renamed from: ᩸ */
    public final int f68923;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C21914(int i) {
        this.f68923 = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX INFO: renamed from: ֫ */
    public final int m49452(JobServiceC24595 jobServiceC24595) {
        int i;
        boolean zIsDeviceIdleMode;
        Intent intentRegisterReceiver;
        int intExtra;
        int i2 = this.f68923;
        if ((i2 & 1) != 0) {
            Object systemService = jobServiceC24595.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i = i2 & 3;
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    i = i2 & 3;
                }
                if ((i2 & 2) == 0 || !connectivityManager.isActiveNetworkMetered()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        } else {
            i = 0;
        }
        if ((i2 & 8) != 0 && ((intentRegisterReceiver = jobServiceC24595.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra(C0172c.f705a, -1)) != 2 && intExtra != 5))) {
            i |= 8;
        }
        if ((i2 & 4) != 0) {
            Object systemService2 = jobServiceC24595.getSystemService("power");
            systemService2.getClass();
            PowerManager powerManager = (PowerManager) systemService2;
            if (Build.VERSION.SDK_INT >= 23) {
                zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            } else {
                zIsDeviceIdleMode = !powerManager.isInteractive();
            }
            if (!zIsDeviceIdleMode) {
                i |= 4;
            }
        }
        if ((i2 & 16) != 0) {
            return !(jobServiceC24595.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i | 16 : i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21914.class == obj.getClass()) {
            if (this.f68923 == ((C21914) obj).f68923) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68923;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68923);
    }
}
