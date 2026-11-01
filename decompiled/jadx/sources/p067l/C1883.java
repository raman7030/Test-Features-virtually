package p067l;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩷ܽ */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883 {

    /* JADX INFO: renamed from: ܽ */
    public static C1323 f70466;

    /* JADX INFO: renamed from: ۧ */
    public static final int f70465 = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: ֫ */
    public static final int f70464 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: ֫ */
    public static final void m50126(AbstractActivityC5549 abstractActivityC5549) {
        C1533 c1533 = C1533.f44686;
        C0940 c0940 = new C0940(0, 0, c1533);
        C0940 c0941 = new C0940(f70465, f70464, c1533);
        View decorView = abstractActivityC5549.getWindow().getDecorView();
        C13045.m29865(decorView, "window.decorView");
        InterfaceC17797 interfaceC17797M8635 = c0940.m8635();
        Resources resources = decorView.getResources();
        C13045.m29865(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) interfaceC17797M8635.invoke(resources)).booleanValue();
        InterfaceC17797 interfaceC17797M8636 = c0941.m8635();
        Resources resources2 = decorView.getResources();
        C13045.m29865(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) interfaceC17797M8636.invoke(resources2)).booleanValue();
        C1323 c1323 = f70466;
        InterfaceC1043 c1288 = c1323;
        if (c1323 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                c1288 = new C0973();
            } else if (i >= 26) {
                c1288 = new C1638();
            } else if (i < 23) {
                C1323 c1324 = new C1323();
                f70466 = c1324;
                c1288 = c1324;
            } else {
                c1288 = new C1288();
            }
        }
        Window window = abstractActivityC5549.getWindow();
        C13045.m29865(window, "window");
        c1288.mo10360(c0940, c0941, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
