package p067l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.security.MessageDigest;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۢۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC11293 extends Service {

    /* JADX INFO: renamed from: ۙ */
    public static final NotificationManager f31460 = (NotificationManager) C7050.m16223("notification");

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f31461 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public C17997 f31462;

    /* JADX INFO: renamed from: ᩹ */
    public PendingIntent f31463;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f31460.createNotificationChannel(new NotificationChannel("MT_HTTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1005, m26230());
        this.f31462 = new C17997(this);
    }

    /* JADX INFO: renamed from: ֫ */
    private Notification m26230() {
        Intent action = new Intent(this, (Class<?>) ServiceC11293.class).setAction("bin.mt.plus.NetworkStreamingService.ACTION_STOP");
        C1888 c1888 = new C1888(this, "MT_HTTP_SERVER");
        c1888.m50330();
        c1888.m50326(C7050.m16224(R.string.MT_Protector));
        c1888.m50331();
        c1888.m50322(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        if (this.f31463 != null) {
            c1888.m50325((CharSequence) getString(R.string.MT_Protector));
            c1888.m50323(this.f31463);
        }
        return c1888.m50321();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1005, m26230());
        String action = intent.getAction();
        if ("bin.mt.plus.NetworkStreamingService.ACTION_PLAY".equals(action)) {
            RunnableC22022 runnableC22022 = new RunnableC22022(0, this, intent);
            if (this.f31462.m40972()) {
                runnableC22022.run();
                return 2;
            }
            if (!this.f31462.isAlive()) {
                return 2;
            }
            C7050.m16213(runnableC22022, 100L);
            return 2;
        }
        if (!"bin.mt.plus.NetworkStreamingService.ACTION_STOP".equals(action)) {
            return 2;
        }
        stopSelf();
        return 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26231(ServiceC11293 serviceC11293, Intent intent) {
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("componentName");
            byte[] byteArrayExtra = intent.getByteArrayExtra("statelessVisitor");
            C12826.requireNonNull(byteArrayExtra);
            String stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
            C12826.requireNonNull(stringExtra);
            String stringExtra2 = intent.getStringExtra("mime");
            C12826.requireNonNull(stringExtra2);
            long longExtra = intent.getLongExtra("time", 0L);
            long longExtra2 = intent.getLongExtra(Name.LENGTH, 0L);
            AbstractC5375 abstractC5375 = (AbstractC5375) C13589.m30905(byteArrayExtra, false);
            MessageDigest messageDigestM36660 = C16111.m36660();
            messageDigestM36660.update(byteArrayExtra);
            C16111.m36662(messageDigestM36660, stringExtra);
            C16111.m36662(messageDigestM36660, stringExtra2);
            C16111.m36662(messageDigestM36660, String.valueOf(longExtra));
            C16111.m36662(messageDigestM36660, String.valueOf(longExtra2));
            Uri uriM40971 = serviceC11293.f31462.m40971(new C9142(abstractC5375, C16111.m36665(messageDigestM36660.digest()).substring(0, 16), stringExtra, stringExtra2, longExtra2));
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriM40971, stringExtra2);
            intent2.setComponent(componentName);
            intent2.addFlags(268435456);
            serviceC11293.startActivity(intent2);
            serviceC11293.f31463 = PendingIntent.getActivity(serviceC11293, 0, intent2, 201326592);
            f31460.notify(1005, serviceC11293.m26230());
        } catch (Exception e) {
            Main mainM38753 = C17127.m38753();
            if (mainM38753 != null) {
                mainM38753.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        this.f31462.m40973();
    }
}
