package p067l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۗۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnApplyWindowInsetsListenerC1001 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ֫ */
    public C1914 f12897 = null;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC1666 f12898;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ View f12899;

    public ViewOnApplyWindowInsetsListenerC1001(View view, InterfaceC1666 interfaceC1666) {
        this.f12899 = view;
        this.f12898 = interfaceC1666;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1914 c1914M51162 = C1914.m51162(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC1666 interfaceC1666 = this.f12898;
        if (i < 30) {
            C1491.m33791(windowInsets, this.f12899);
            if (c1914M51162.equals(this.f12897)) {
                return interfaceC1666.onApplyWindowInsets(view, c1914M51162).m51171();
            }
        }
        this.f12897 = c1914M51162;
        C1914 c1914OnApplyWindowInsets = interfaceC1666.onApplyWindowInsets(view, c1914M51162);
        if (i >= 30) {
            return c1914OnApplyWindowInsets.m51171();
        }
        int i2 = C1717.f57146;
        C1071.m15434(view);
        return c1914OnApplyWindowInsets.m51171();
    }
}
