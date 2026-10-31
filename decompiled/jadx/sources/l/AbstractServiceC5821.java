package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB1I */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractServiceC5821 extends Service {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractBinderC15697 f17875 = new BinderC10055(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void m16319();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f17875;
    }
}
