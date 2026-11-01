package p067l;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 {

    /* JADX INFO: renamed from: ܽ */
    public static int f79338;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f79339 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final C1442 f79340;

    public C2015(ServiceC6328 serviceC6328) {
        ComponentName componentName;
        if (TextUtils.isEmpty("MusicService")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = C13248.f37215;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(serviceC6328.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = serviceC6328.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            listQueryBroadcastReceivers.size();
            componentName = null;
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(serviceC6328, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f79340 = new C1967(serviceC6328);
        } else if (i2 >= 28) {
            this.f79340 = new C1127(serviceC6328);
        } else if (i2 >= 22) {
            this.f79340 = new C1337(serviceC6328);
        } else {
            this.f79340 = new C1442(serviceC6328);
        }
        m54540(new C1897(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f79340.f39157.setMediaButtonReceiver(broadcast);
        new C1582(serviceC6328, this.f79340.f39163);
        if (f79338 == 0) {
            f79338 = (int) (TypedValue.applyDimension(1, 320.0f, serviceC6328.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54540(AbstractC1057 abstractC1057, Handler handler) {
        C1442 c1442 = this.f79340;
        if (handler == null) {
            handler = new Handler();
        }
        synchronized (c1442.f39162) {
            c1442.f39156 = abstractC1057;
            c1442.f39157.setCallback(abstractC1057 == null ? null : abstractC1057.f16734, handler);
            if (abstractC1057 != null) {
                abstractC1057.m14848(c1442, handler);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54543(boolean z) {
        this.f79340.f39157.setActive(z);
        Iterator it = this.f79339.iterator();
        while (it.hasNext()) {
            ((InterfaceC1512) it.next()).m34630();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1560 m54539() {
        return this.f79340.f39163;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54542(C1805 c1805) {
        C1442 c1442 = this.f79340;
        c1442.f39159 = c1805;
        synchronized (c1442.f39162) {
            int iBeginBroadcast = c1442.f39158.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast >= 0) {
                    try {
                        ((InterfaceC1862) c1442.f39158.getBroadcastItem(iBeginBroadcast)).mo35999(c1805);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c1442.f39158.finishBroadcast();
                }
            }
        }
        c1442.f39157.setPlaybackState(c1805.m47021());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54538(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C2015.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54544() {
        C1442 c1442 = this.f79340;
        MediaSession mediaSession = c1442.f39157;
        c1442.f39158.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        c1442.f39160.m33186();
        mediaSession.release();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54541(C1372 c1372) {
        C1442 c1442 = this.f79340;
        c1442.f39161 = c1372;
        c1442.f39157.setMetadata(c1372.m28827());
    }
}
