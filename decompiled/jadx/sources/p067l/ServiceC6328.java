package p067l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC6328 extends Service {

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ int f16400 = 0;

    /* JADX INFO: renamed from: ۤ */
    public static WeakReference f16401;

    /* JADX INFO: renamed from: ۫ */
    public static final NotificationManager f16402;

    /* JADX INFO: renamed from: ۬ */
    public static final Handler f16403;

    /* JADX INFO: renamed from: ۙ */
    public long f16404;

    /* JADX INFO: renamed from: ᩶ */
    public C1468 f16405;

    /* JADX INFO: renamed from: ᩸ */
    public C2015 f16406;

    /* JADX INFO: renamed from: ᩹ */
    public BroadcastReceiver f16407;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f16401 = new WeakReference(this);
        C9010 c9010M50371 = C22422.m50371();
        if (c9010M50371 != null && c9010M50371.f24459) {
            this.f16404 = c9010M50371.f24449;
        }
        this.f16405 = C1468.m32964(this);
        C2015 c2015 = new C2015(this);
        this.f16406 = c2015;
        c2015.m54540(new C4987(this), null);
        this.f16406.m54543(true);
        if (Build.VERSION.SDK_INT >= 26) {
            f16402.createNotificationChannel(new NotificationChannel("MusicPlayerService", getString(R.string.MT_Protector), 3));
        }
        startForeground(1006, m14480());
        this.f16407 = new C17726(this);
        registerReceiver(this.f16407, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m14481() {
        WeakReference weakReference = f16401;
        ServiceC6328 serviceC6328 = weakReference == null ? null : (ServiceC6328) weakReference.get();
        if (serviceC6328 == null || !serviceC6328.m14479(C22422.m50371())) {
            return;
        }
        Handler handler = f16403;
        if (handler.hasMessages(0)) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14477(ServiceC6328 serviceC6328) {
        if (serviceC6328.m14479(C22422.m50371())) {
            serviceC6328.f16405.m32966(serviceC6328.m14480());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m14479(C9010 c9010) {
        return c9010 != null && c9010.f24459 && c9010.f24449 == this.f16404;
    }

    /* JADX INFO: renamed from: ۧ */
    private Notification m14480() {
        int i;
        String str = (String) C22422.f70730.m4060();
        String str2 = (String) C22422.f70739.m4060();
        Bitmap bitmap = (Bitmap) C22422.f70731.m4060();
        Bitmap bitmap2 = (Bitmap) C22422.f70729.m4060();
        int iIntValue = ((Integer) C22422.f70738.m4060()).intValue();
        long jIntValue = ((Integer) C22422.f70737.m4060()).intValue() * 50;
        long jIntValue2 = ((Integer) C22422.f70733.m4060()).intValue() * 50;
        boolean z = C22422.f70726.m4060() == Boolean.TRUE;
        if (iIntValue == 1) {
            i = R.drawable.MT_Protector;
        } else if (iIntValue != 2) {
            i = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
        } else {
            i = R.drawable.MT_Protector;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = null;
        }
        if (bitmap2 == null || bitmap2.isRecycled()) {
            bitmap2 = null;
        }
        C2015 c2015 = this.f16406;
        C0917 c0917 = new C0917();
        c0917.m7410("android.media.metadata.TITLE", str);
        c0917.m7410("android.media.metadata.ARTIST", str2);
        c0917.m7408(jIntValue);
        c0917.m7409("android.media.metadata.ART", bitmap);
        c0917.m7409("android.media.metadata.DISPLAY_ICON", bitmap2);
        c2015.m54541(c0917.m7407());
        C2015 c2016 = this.f16406;
        C0965 c0965 = new C0965();
        c0965.m10004(z ? 3 : 2, jIntValue2, 1.0f, SystemClock.elapsedRealtime());
        c0965.m10005();
        c2016.m54542(c0965.m10003());
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC11693.class).putExtra("fromService", true);
        C1888 c1888 = new C1888(this, "MusicPlayerService");
        c1888.m50330();
        c1888.m50326(str);
        c1888.m50325((CharSequence) str2);
        c1888.m50324(bitmap2);
        c1888.m50328(false);
        c1888.m50331();
        c1888.m50332();
        c1888.m50334();
        c1888.m50323(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c1888.m50322(i, "mode", m14475("bin.mt.media.MusicPlayerService.ACTION_MODE"));
        c1888.m50322(R.drawable.MT_Protector, "Previous", m14475("bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"));
        c1888.m50322(z ? R.drawable.MT_Protector : R.drawable.MT_Protector, z ? "Pause" : "Play", m14475("bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"));
        c1888.m50322(R.drawable.MT_Protector, "Next", m14475("bin.mt.media.MusicPlayerService.ACTION_NEXT"));
        c1888.m50322(R.drawable.MT_Protector, "Expand", m14475("bin.mt.media.MusicPlayerService.ACTION_EXIT"));
        C13918 c13918 = new C13918();
        c13918.m31636(1, 2, 3);
        c13918.m31635(this.f16406.m54539());
        c1888.m50327(c13918);
        return c1888.m50321();
    }

    /* JADX INFO: renamed from: ֫ */
    private PendingIntent m14475(String str) {
        return PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC6328.class).setAction(str).putExtra("playbackSessionId", this.f16404), 201326592);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C9010 c9010M50371 = C22422.m50371();
        String action = intent.getAction();
        long longExtra = intent.getLongExtra("playbackSessionId", 0L);
        if (action == null) {
            if (longExtra != 0 && c9010M50371 != null && c9010M50371.f24459 && c9010M50371.f24449 == longExtra) {
                this.f16404 = longExtra;
                if (m14479(C22422.m50371())) {
                    this.f16405.m32966(m14480());
                    return 2;
                }
            } else if (c9010M50371 == null || !c9010M50371.f24459) {
                stopSelf();
                return 2;
            }
        } else if (m14479(c9010M50371)) {
            if (longExtra != 0 && longExtra == this.f16404) {
                switch (action) {
                    case "bin.mt.media.MusicPlayerService.ACTION_EXIT":
                        stopSelf();
                        break;
                    case "bin.mt.media.MusicPlayerService.ACTION_MODE":
                        C19799.m45019();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_NEXT":
                        c9010M50371.m20871();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE":
                        c9010M50371.m20870();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS":
                        c9010M50371.m20869();
                        return 2;
                }
            }
        } else if (c9010M50371 == null || !c9010M50371.f24459) {
            stopSelf();
            return 2;
        }
        return 2;
    }

    static {
        Object systemService = C7050.m16232().getSystemService("notification");
        C13045.m29861(systemService);
        f16402 = (NotificationManager) systemService;
        f16403 = new HandlerC11022(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f16403.removeMessages(0);
        WeakReference weakReference = f16401;
        if (weakReference != null && weakReference.get() == this) {
            f16401 = null;
        }
        this.f16406.m54543(false);
        this.f16406.m54544();
        C23092.m51503();
        C9010 c9010M50371 = C22422.m50371();
        if (c9010M50371 != null && c9010M50371.f24449 == this.f16404) {
            c9010M50371.m20866(true);
            C22422.m50351(c9010M50371);
        }
        stopForeground(true);
        this.f16405.m32968();
        BroadcastReceiver broadcastReceiver = this.f16407;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
