package p067l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes3.dex */
public class C13248 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f37215 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            C12826.toString(intent);
            return;
        }
        ComponentName componentNameM30299 = m30299(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM30299 != null) {
            intent.setComponent(componentNameM30299);
            try {
                C0886.m5546(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !C11907.m27226(e)) {
                    throw e;
                }
                C11907.m27225(e).getMessage();
                return;
            }
        }
        ComponentName componentNameM302910 = m30299(context, "android.media.browse.MediaBrowserService");
        if (componentNameM302910 != null) {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C7883 c7883 = new C7883(applicationContext, intent, pendingResultGoAsync);
            C1439 c1439 = new C1439(applicationContext, componentNameM302910, c7883);
            c7883.m18205(c1439);
            c1439.m31477();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ComponentName m30299(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbM11879 = C5410.m11879("Expected 1 service that handles ", str, ", found ");
        sbM11879.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbM11879.toString());
    }
}
