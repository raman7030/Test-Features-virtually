package p067l;

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
public class C22426 implements InterfaceC22150 {
    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final Object mo37970(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            final Context applicationContext = context.getApplicationContext();
            C16389.m37205(new Runnable(this) { // from class: l.ᩳ᩶ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler;
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = C25107.m55096(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new RunnableC2761(1, applicationContext), new Random().nextInt(Math.max(1000, 1)) + OpenAuthTask.Duplex);
                }
            });
            return new C9014();
        }
        return new C9014();
    }

    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final List mo37971() {
        return Collections.EMPTY_LIST;
    }
}
