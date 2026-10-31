package l;

import android.content.ComponentName;
import android.content.Intent;
import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۤ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9966 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25123(C16560 c16560, InterfaceC17889 interfaceC17889) {
        if (!c16560.m39035(b.k)) {
            return false;
        }
        String strMo36971 = interfaceC17889.mo36971();
        return strMo36971.startsWith("video/") || strMo36971.startsWith("audio/");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25122(C16560 c16560, InterfaceC17889 interfaceC17889, ComponentName componentName) {
        int i = ServiceC9390.f28512;
        Main mainM39056 = c16560.m39056();
        AbstractC3163 abstractC3163 = (AbstractC3163) c16560.m39044().mo6020();
        Intent intent = new Intent(mainM39056, (Class<?>) ServiceC9390.class);
        intent.setAction("bin.mt.plus.NetworkStreamingService.ACTION_PLAY");
        intent.putExtra("componentName", componentName);
        intent.putExtra("statelessVisitor", abstractC3163.m33350());
        intent.putExtra(MotionUtils.EASING_TYPE_PATH, interfaceC17889.getPath());
        intent.putExtra("mime", interfaceC17889.mo36971());
        intent.putExtra("time", interfaceC17889.getTime());
        intent.putExtra(Name.LENGTH, interfaceC17889.getSize());
        C0881.m3232(mainM39056, intent);
    }
}
