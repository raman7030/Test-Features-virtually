package p067l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۡۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X1KJ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC10703 extends Service implements InterfaceC24784 {

    /* JADX INFO: renamed from: ᩸ */
    public final C20957 f29645 = new C20957(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C13045.m29867(intent, "intent");
        this.f29645.m47272();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.f29645.m47273();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f29645.m47274();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f29645.m47275();
        super.onDestroy();
    }

    @Override // p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        return this.f29645.m47271();
    }
}
