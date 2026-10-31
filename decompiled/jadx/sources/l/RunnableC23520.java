package l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩻ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23520 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75488;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75489;

    public /* synthetic */ RunnableC23520(int i, Object obj) {
        this.f75488 = i;
        this.f75489 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f75488;
        Object obj = this.f75489;
        switch (i) {
            case 0:
                int i2 = ServiceC19288.f60689;
                ((C14347) obj).mo13801();
                new Handler(Looper.getMainLooper()).post(new RunnableC15758(0));
                return;
            case 1:
                C5451.m15553((C5451) obj);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent.putExtra("packageName", context.getPackageName());
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (RuntimeException e) {
                    if (Build.VERSION.SDK_INT < 23) {
                        throw e;
                    }
                    C21769.m49099(context);
                    return;
                }
        }
    }
}
