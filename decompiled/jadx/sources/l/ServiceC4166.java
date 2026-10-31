package l;

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
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC4166 extends Service {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13587 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static WeakReference f13588;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f13589;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Handler f13590;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f13591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12625 f13592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23645 f13593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f13594;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f13588 = new WeakReference(this);
        C6988 c6988M48041 = C21100.m48041();
        if (c6988M48041 != null && c6988M48041.f21579) {
            this.f13591 = c6988M48041.f21569;
        }
        this.f13592 = C12625.m30887(this);
        C23645 c23645 = new C23645(this);
        this.f13593 = c23645;
        c23645.m52137(new C2755(this), null);
        this.f13593.m52140(true);
        if (Build.VERSION.SDK_INT >= 26) {
            f13589.createNotificationChannel(new NotificationChannel("MusicPlayerService", getString(R.string.MT_Protector), 3));
        }
        startForeground(1006, m12606());
        this.f13594 = new C16159(this);
        registerReceiver(this.f13594, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m12607() {
        WeakReference weakReference = f13588;
        ServiceC4166 serviceC4166 = weakReference == null ? null : (ServiceC4166) weakReference.get();
        if (serviceC4166 == null || !serviceC4166.m12605(C21100.m48041())) {
            return;
        }
        Handler handler = f13590;
        if (handler.hasMessages(0)) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12603(ServiceC4166 serviceC4166) {
        if (serviceC4166.m12605(C21100.m48041())) {
            serviceC4166.f13592.m30889(serviceC4166.m12606());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m12605(C6988 c6988) {
        return c6988 != null && c6988.f21579 && c6988.f21569 == this.f13591;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Notification m12606() {
        int i;
        String str = (String) C21100.f68048.m1662();
        String str2 = (String) C21100.f68057.m1662();
        Bitmap bitmap = (Bitmap) C21100.f68049.m1662();
        Bitmap bitmap2 = (Bitmap) C21100.f68047.m1662();
        int iIntValue = ((Integer) C21100.f68056.m1662()).intValue();
        long jIntValue = ((Integer) C21100.f68055.m1662()).intValue() * 50;
        long jIntValue2 = ((Integer) C21100.f68051.m1662()).intValue() * 50;
        boolean z = C21100.f68044.m1662() == Boolean.TRUE;
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
        C23645 c23645 = this.f13593;
        C1504 c1504 = new C1504();
        c1504.m5184("android.media.metadata.TITLE", str);
        c1504.m5184("android.media.metadata.ARTIST", str2);
        c1504.m5182(jIntValue);
        c1504.m5183("android.media.metadata.ART", bitmap);
        c1504.m5183("android.media.metadata.DISPLAY_ICON", bitmap2);
        c23645.m52138(c1504.m5181());
        C23645 c23646 = this.f13593;
        C2479 c2479 = new C2479();
        c2479.m7956(z ? 3 : 2, jIntValue2, 1.0f, SystemClock.elapsedRealtime());
        c2479.m7957();
        c23646.m52139(c2479.m7955());
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC9811.class).putExtra("fromService", true);
        C21093 c21093 = new C21093(this, "MusicPlayerService");
        c21093.m48000();
        c21093.m47996(str);
        c21093.m47995((CharSequence) str2);
        c21093.m47994(bitmap2);
        c21093.m47998(false);
        c21093.m48001();
        c21093.m48002();
        c21093.m48004();
        c21093.m47993(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c21093.m47992(i, "mode", m12601("bin.mt.media.MusicPlayerService.ACTION_MODE"));
        c21093.m47992(R.drawable.MT_Protector, "Previous", m12601("bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"));
        c21093.m47992(z ? R.drawable.MT_Protector : R.drawable.MT_Protector, z ? "Pause" : "Play", m12601("bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"));
        c21093.m47992(R.drawable.MT_Protector, "Next", m12601("bin.mt.media.MusicPlayerService.ACTION_NEXT"));
        c21093.m47992(R.drawable.MT_Protector, "Expand", m12601("bin.mt.media.MusicPlayerService.ACTION_EXIT"));
        C12153 c12153 = new C12153();
        c12153.m29571(1, 2, 3);
        c12153.m29570(this.f13593.m52136());
        c21093.m47997(c12153);
        return c21093.m47991();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PendingIntent m12601(String str) {
        return PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC4166.class).setAction(str).putExtra("playbackSessionId", this.f13591), 201326592);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C6988 c6988M48041 = C21100.m48041();
        String action = intent.getAction();
        long longExtra = intent.getLongExtra("playbackSessionId", 0L);
        if (action == null) {
            if (longExtra != 0 && c6988M48041 != null && c6988M48041.f21579 && c6988M48041.f21569 == longExtra) {
                this.f13591 = longExtra;
                if (m12605(C21100.m48041())) {
                    this.f13592.m30889(m12606());
                    return 2;
                }
            } else if (c6988M48041 == null || !c6988M48041.f21579) {
                stopSelf();
                return 2;
            }
        } else if (m12605(c6988M48041)) {
            if (longExtra != 0 && longExtra == this.f13591) {
                switch (action) {
                    case "bin.mt.media.MusicPlayerService.ACTION_EXIT":
                        stopSelf();
                        break;
                    case "bin.mt.media.MusicPlayerService.ACTION_MODE":
                        C18340.m42757();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_NEXT":
                        c6988M48041.m18917();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE":
                        c6988M48041.m18916();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS":
                        c6988M48041.m18915();
                        return 2;
                }
            }
        } else if (c6988M48041 == null || !c6988M48041.f21579) {
            stopSelf();
            return 2;
        }
        return 2;
    }

    static {
        Object systemService = C4925.m14335().getSystemService("notification");
        C11233.m27799(systemService);
        f13589 = (NotificationManager) systemService;
        f13590 = new HandlerC9105(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f13590.removeMessages(0);
        WeakReference weakReference = f13588;
        if (weakReference != null && weakReference.get() == this) {
            f13588 = null;
        }
        this.f13593.m52140(false);
        this.f13593.m52141();
        C21805.m49152();
        C6988 c6988M48041 = C21100.m48041();
        if (c6988M48041 != null && c6988M48041.f21569 == this.f13591) {
            c6988M48041.m18912(true);
            C21100.m48021(c6988M48041);
        }
        stopForeground(true);
        this.f13592.m30891();
        BroadcastReceiver broadcastReceiver = this.f13594;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
