package p067l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p050t0.C0215b;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJ2 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC10885 extends Service {

    /* JADX INFO: renamed from: ۫ */
    public static final NotificationManager f30152;

    /* JADX INFO: renamed from: ᩸ */
    public long f30157;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f30158;

    /* JADX INFO: renamed from: ۬ */
    public final C8034 f30155 = new C8034();

    /* JADX INFO: renamed from: ۙ */
    public final RunnableC9941 f30154 = new RunnableC9941(4, this);

    /* JADX INFO: renamed from: ۗ */
    public int f30153 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f30156 = -1;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f30152.createNotificationChannels(Arrays.asList(new NotificationChannel("MTaskService", "Task Running Notification", 3), new NotificationChannel("MTaskService3", "Task Error Notification", 4)));
        }
        C16723.m37950();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m25076() {
        int size = this.f30155.size();
        int i = this.f30153;
        if (size == i) {
            m25073();
            return;
        }
        this.f30156 = size;
        if (i == -1) {
            m25075();
            return;
        }
        if (this.f30158) {
            return;
        }
        long jElapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f30157);
        if (jElapsedRealtime <= 0) {
            m25075();
        } else {
            this.f30158 = true;
            C7050.m16213(this.f30154, jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m25075() {
        this.f30158 = false;
        int i = this.f30156;
        this.f30156 = -1;
        if (i <= 0 || i == this.f30153) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ActivityC11556.class), 67108864);
        C1888 c1888 = new C1888(this, "MTaskService");
        c1888.m50330();
        c1888.m50326(getString(R.string.MT_Protector));
        c1888.m50325((CharSequence) getResources().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        c1888.m50323(activity);
        c1888.m50331();
        c1888.m50328(false);
        c1888.m50332();
        Notification notificationM50321 = c1888.m50321();
        if (this.f30153 == -1) {
            startForeground(C0215b.f1000c, notificationM50321);
        } else {
            f30152.notify(C0215b.f1000c, notificationM50321);
        }
        this.f30153 = i;
        this.f30157 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25073() {
        this.f30156 = -1;
        if (this.f30158) {
            C7050.m16221().removeCallbacks(this.f30154);
            this.f30158 = false;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f30155.add(i2);
        m25076();
        try {
            AbstractC5996 abstractC5996 = (AbstractC5996) ((Class) intent.getSerializableExtra("TaskClass")).newInstance();
            abstractC5996.mo13455(intent);
            int i3 = C16723.f49313;
            C4081.f8987.submit(new RunnableC10019(this, abstractC5996, i2));
            return 2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25077(int i) {
        C8034 c8034 = this.f30155;
        c8034.remove(i);
        if (c8034.isEmpty()) {
            m25073();
            stopSelf();
        } else {
            m25076();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m25073();
        super.onDestroy();
        stopForeground(true);
    }

    static {
        Object systemService = C7050.m16232().getSystemService("notification");
        C13045.m29861(systemService);
        f30152 = (NotificationManager) systemService;
    }
}
