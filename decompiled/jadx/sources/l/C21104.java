package l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: l.᩷᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79M1 */
/* JADX INFO: loaded from: classes5.dex */
public class C21104 implements InterfaceC20814 {
    @Override // l.InterfaceC20814
    /* JADX INFO: renamed from: ֫ */
    public final Object mo35812(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            final Context applicationContext = context.getApplicationContext();
            C14752.m35058(new Runnable(this) { // from class: l.ᩳ᩶ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler;
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = C23925.m52690(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new RunnableC0413(1, applicationContext), new Random().nextInt(Math.max(1000, 1)) + OpenAuthTask.Duplex);
                }
            });
            return new C6992();
        }
        return new C6992();
    }

    @Override // l.InterfaceC20814
    /* JADX INFO: renamed from: ֫ */
    public final List mo35813() {
        return Collections.EMPTY_LIST;
    }
}
