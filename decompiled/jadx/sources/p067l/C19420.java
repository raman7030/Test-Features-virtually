package p067l;

import android.app.Application;
import android.content.Context;
import com.umeng.analytics.pro.C0708d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H1JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19420 {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicBoolean f59130 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֫ */
    public static final void m44190(Context context) {
        C13045.m29867(context, C0708d.f2602R);
        if (f59130.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C13045.m29862((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C18078());
    }
}
