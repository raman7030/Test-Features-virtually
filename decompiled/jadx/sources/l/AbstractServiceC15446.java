package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ܶ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: H5YD */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC15446 extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
