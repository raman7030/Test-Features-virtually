package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۡۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X1KJ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC8770 extends Service implements InterfaceC23586 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19559 f26719 = new C19559(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C11233.m27805(intent, "intent");
        this.f26719.m44977();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.f26719.m44978();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f26719.m44979();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f26719.m44980();
        super.onDestroy();
    }

    @Override // l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        return this.f26719.m44976();
    }
}
