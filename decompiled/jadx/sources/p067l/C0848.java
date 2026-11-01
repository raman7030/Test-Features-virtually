package p067l;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۖ */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0848 extends C1303 implements InterfaceC0953 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static Method f3876;

    /* JADX INFO: renamed from: ֡֫ */
    public InterfaceC0953 f3877;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3876 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p067l.C1303
    /* JADX INFO: renamed from: ֫ */
    public final C1462 mo3513(Context context, boolean z) {
        C1793 c1793 = new C1793(context, z);
        c1793.m46540(this);
        return c1793;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m3517() {
        if (Build.VERSION.SDK_INT >= 23) {
            C1023.m13105(this.f31105, null);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m3518() {
        if (Build.VERSION.SDK_INT >= 23) {
            C1023.m13106(this.f31105, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3514(InterfaceC0953 interfaceC0953) {
        this.f3877 = interfaceC0953;
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m3512() {
        int i = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.f31105;
        if (i <= 28) {
            Method method = f3876;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.FALSE);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        C1758.m45215(popupWindow, false);
    }

    @Override // p067l.InterfaceC0953
    /* JADX INFO: renamed from: ֫ */
    public final void mo3516(C0994 c0994, C1134 c1134) {
        InterfaceC0953 interfaceC0953 = this.f3877;
        if (interfaceC0953 != null) {
            interfaceC0953.mo3516(c0994, c1134);
        }
    }

    @Override // p067l.InterfaceC0953
    /* JADX INFO: renamed from: ֫ */
    public final void mo3515(C0994 c0994, MenuItem menuItem) {
        InterfaceC0953 interfaceC0953 = this.f3877;
        if (interfaceC0953 != null) {
            interfaceC0953.mo3515(c0994, menuItem);
        }
    }
}
