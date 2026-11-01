package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩻ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24722 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78234;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f78235;

    public /* synthetic */ RunnableC24722(int i, Object obj) {
        this.f78234 = i;
        this.f78235 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f78234;
        Object obj = this.f78235;
        switch (i) {
            case 0:
                int i2 = ServiceC20700.f63919;
                ((C16004) obj).mo15677();
                new Handler(Looper.getMainLooper()).post(new RunnableC17345(0));
                return;
            case 1:
                C7549.m17464((C7549) obj);
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
                    C23058.m51449(context);
                    return;
                }
        }
    }
}
