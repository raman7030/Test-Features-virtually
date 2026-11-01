package p067l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩹ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC23651 extends Service {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractBinderC2863 f75274 = new BinderC22981(this);

    /* JADX INFO: renamed from: ᩹ */
    public Throwable f75275;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f75274;
    }
}
