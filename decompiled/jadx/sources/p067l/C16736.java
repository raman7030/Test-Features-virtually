package p067l;

import android.content.Context;
import com.umeng.analytics.pro.C0708d;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0W */
/* JADX INFO: loaded from: classes4.dex */
public final class C16736 implements InterfaceC22150 {
    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final Object mo37970(Context context) {
        C13045.m29867(context, C0708d.f2602R);
        C24831 c24831M54533 = C24831.m54533(context);
        C13045.m29865(c24831M54533, "getInstance(context)");
        if (!c24831M54533.m54536()) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C19420.m44190(context);
        C5338.f12563.m11553(context);
        return C5338.f12563;
    }

    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final List mo37971() {
        return C10893.f30179;
    }
}
