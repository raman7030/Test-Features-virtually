package p067l;

import android.content.ComponentName;
import android.content.Intent;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۤ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11840 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27140(C18107 c18107, InterfaceC19370 interfaceC19370) {
        if (!c18107.m41261(C0168b.f616k)) {
            return false;
        }
        String strMo39137 = interfaceC19370.mo39137();
        return strMo39137.startsWith("video/") || strMo39137.startsWith("audio/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27139(C18107 c18107, InterfaceC19370 interfaceC19370, ComponentName componentName) {
        int i = ServiceC11293.f31461;
        Main mainM41282 = c18107.m41282();
        AbstractC5375 abstractC5375 = (AbstractC5375) c18107.m41270().mo8217();
        Intent intent = new Intent(mainM41282, (Class<?>) ServiceC11293.class);
        intent.setAction("bin.mt.plus.NetworkStreamingService.ACTION_PLAY");
        intent.putExtra("componentName", componentName);
        intent.putExtra("statelessVisitor", abstractC5375.m35469());
        intent.putExtra(MotionUtils.EASING_TYPE_PATH, interfaceC19370.getPath());
        intent.putExtra("mime", interfaceC19370.mo39137());
        intent.putExtra("time", interfaceC19370.getTime());
        intent.putExtra(Name.LENGTH, interfaceC19370.getSize());
        C0886.m5546(mainM41282, intent);
    }
}
