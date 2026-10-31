package l;

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
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.security.MessageDigest;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۢۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC9390 extends Service {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f28511 = (NotificationManager) C4925.m14326("notification");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28512 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16444 f28513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public PendingIntent f28514;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f28511.createNotificationChannel(new NotificationChannel("MT_HTTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1005, m24220());
        this.f28513 = new C16444(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Notification m24220() {
        Intent action = new Intent(this, (Class<?>) ServiceC9390.class).setAction("bin.mt.plus.NetworkStreamingService.ACTION_STOP");
        C21093 c21093 = new C21093(this, "MT_HTTP_SERVER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector));
        c21093.m48001();
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        if (this.f28514 != null) {
            c21093.m47995((CharSequence) getString(R.string.MT_Protector));
            c21093.m47993(this.f28514);
        }
        return c21093.m47991();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1005, m24220());
        String action = intent.getAction();
        if ("bin.mt.plus.NetworkStreamingService.ACTION_PLAY".equals(action)) {
            RunnableC20679 runnableC20679 = new RunnableC20679(0, this, intent);
            if (this.f28513.m38747()) {
                runnableC20679.run();
                return 2;
            }
            if (!this.f28513.isAlive()) {
                return 2;
            }
            C4925.m14316(runnableC20679, 100L);
            return 2;
        }
        if (!"bin.mt.plus.NetworkStreamingService.ACTION_STOP".equals(action)) {
            return 2;
        }
        stopSelf();
        return 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24221(ServiceC9390 serviceC9390, Intent intent) {
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("componentName");
            byte[] byteArrayExtra = intent.getByteArrayExtra("statelessVisitor");
            C11003.requireNonNull(byteArrayExtra);
            String stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
            C11003.requireNonNull(stringExtra);
            String stringExtra2 = intent.getStringExtra("mime");
            C11003.requireNonNull(stringExtra2);
            long longExtra = intent.getLongExtra("time", 0L);
            long longExtra2 = intent.getLongExtra(Name.LENGTH, 0L);
            AbstractC3163 abstractC3163 = (AbstractC3163) C11806.m28856(byteArrayExtra, false);
            MessageDigest messageDigestM34526 = C14460.m34526();
            messageDigestM34526.update(byteArrayExtra);
            C14460.m34528(messageDigestM34526, stringExtra);
            C14460.m34528(messageDigestM34526, stringExtra2);
            C14460.m34528(messageDigestM34526, String.valueOf(longExtra));
            C14460.m34528(messageDigestM34526, String.valueOf(longExtra2));
            Uri uriM38746 = serviceC9390.f28513.m38746(new C7127(abstractC3163, C14460.m34531(messageDigestM34526.digest()).substring(0, 16), stringExtra, stringExtra2, longExtra2));
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriM38746, stringExtra2);
            intent2.setComponent(componentName);
            intent2.addFlags(268435456);
            serviceC9390.startActivity(intent2);
            serviceC9390.f28514 = PendingIntent.getActivity(serviceC9390, 0, intent2, 201326592);
            f28511.notify(1005, serviceC9390.m24220());
        } catch (Exception e) {
            Main mainM36593 = C15528.m36593();
            if (mainM36593 != null) {
                mainM36593.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        this.f28513.m38748();
    }
}
