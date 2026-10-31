package l;

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

/* JADX INFO: renamed from: l.᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C23645 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f76592;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f76593 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12088 f76594;

    public C23645(ServiceC4166 serviceC4166) {
        ComponentName componentName;
        if (TextUtils.isEmpty("MusicService")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = C11448.f34219;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(serviceC4166.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = serviceC4166.getPackageManager().queryBroadcastReceivers(intent, 0);
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
            broadcast = PendingIntent.getBroadcast(serviceC4166, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f76594 = new C22671(serviceC4166);
        } else if (i2 >= 28) {
            this.f76594 = new C5738(serviceC4166);
        } else if (i2 >= 22) {
            this.f76594 = new C9972(serviceC4166);
        } else {
            this.f76594 = new C12088(serviceC4166);
        }
        m52137(new C21261(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f76594.f36146.setMediaButtonReceiver(broadcast);
        new C14909(serviceC4166, this.f76594.f36152);
        if (f76592 == 0) {
            f76592 = (int) (TypedValue.applyDimension(1, 320.0f, serviceC4166.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52137(AbstractC4327 abstractC4327, Handler handler) {
        C12088 c12088 = this.f76594;
        if (handler == null) {
            handler = new Handler();
        }
        synchronized (c12088.f36151) {
            c12088.f36145 = abstractC4327;
            c12088.f36146.setCallback(abstractC4327 == null ? null : abstractC4327.f13920, handler);
            if (abstractC4327 != null) {
                abstractC4327.m12984(c12088, handler);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52140(boolean z) {
        this.f76594.f36146.setActive(z);
        Iterator it = this.f76593.iterator();
        while (it.hasNext()) {
            ((InterfaceC13498) it.next()).m32528();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14472 m52136() {
        return this.f76594.f36152;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52139(C19413 c19413) {
        C12088 c12088 = this.f76594;
        c12088.f36148 = c19413;
        synchronized (c12088.f36151) {
            int iBeginBroadcast = c12088.f36147.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast >= 0) {
                    try {
                        ((InterfaceC20555) c12088.f36147.getBroadcastItem(iBeginBroadcast)).mo33867(c19413);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c12088.f36147.finishBroadcast();
                }
            }
        }
        c12088.f36146.setPlaybackState(c19413.m44727());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52135(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C23645.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52141() {
        C12088 c12088 = this.f76594;
        MediaSession mediaSession = c12088.f36146;
        c12088.f36147.kill();
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
        c12088.f36149.m31102();
        mediaSession.release();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52138(C10677 c10677) {
        C12088 c12088 = this.f76594;
        c12088.f36150 = c10677;
        c12088.f36146.setMetadata(c10677.m26788());
    }
}
