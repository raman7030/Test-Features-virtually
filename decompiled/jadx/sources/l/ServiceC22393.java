package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩹ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC22393 extends Service {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC0520 f72548 = new BinderC21688(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Throwable f72549;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f72548;
    }
}
