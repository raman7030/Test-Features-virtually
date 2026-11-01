package p067l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۛۙ */
/* JADX INFO: compiled from: MB1I */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractServiceC1131 extends Service {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractBinderC1621 f20727 = new BinderC1341(this);

    /* JADX INFO: renamed from: ֫ */
    public abstract void m18244();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f20727;
    }
}
