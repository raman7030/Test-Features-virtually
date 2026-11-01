package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: l.۫ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1439 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f39043 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final C1789 f39044;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C1439(Context context, ComponentName componentName, C0949 c0949) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f39044 = new C1089(context, componentName, c0949);
        } else if (i >= 23) {
            this.f39044 = new C0844(context, componentName, c0949);
        } else {
            this.f39044 = new C1789(context, componentName, c0949);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31477() {
        this.f39044.f63396.connect();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1560 m31479() {
        return this.f39044.m46315();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31478() {
        Messenger messenger;
        C1789 c1789 = this.f39044;
        C1929 c1929 = c1789.f63403;
        if (c1929 != null && (messenger = c1789.f63398) != null) {
            try {
                c1929.m51683(messenger);
            } catch (RemoteException unused) {
            }
        }
        c1789.f63396.disconnect();
    }
}
