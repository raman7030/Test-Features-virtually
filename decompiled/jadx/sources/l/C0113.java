package l;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes3.dex */
public final class C0113 extends C9287 implements InterfaceC2231 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static Method f1100;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2231 f1101;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1100 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // l.C9287
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12499 mo1112(Context context, boolean z) {
        C19165 c19165 = new C19165(context, z);
        c19165.m44245(this);
        return c19165;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m1116() {
        if (Build.VERSION.SDK_INT >= 23) {
            C3642.m11129(this.f28156, null);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m1117() {
        if (Build.VERSION.SDK_INT >= 23) {
            C3642.m11130(this.f28156, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1113(InterfaceC2231 interfaceC2231) {
        this.f1101 = interfaceC2231;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m1111() {
        int i = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.f28156;
        if (i <= 28) {
            Method method = f1100;
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
        C18459.m42939(popupWindow, false);
    }

    @Override // l.InterfaceC2231
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1115(C3060 c3060, C5882 c5882) {
        InterfaceC2231 interfaceC2231 = this.f1101;
        if (interfaceC2231 != null) {
            interfaceC2231.mo1115(c3060, c5882);
        }
    }

    @Override // l.InterfaceC2231
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1114(C3060 c3060, MenuItem menuItem) {
        InterfaceC2231 interfaceC2231 = this.f1101;
        if (interfaceC2231 != null) {
            interfaceC2231.mo1114(c3060, menuItem);
        }
    }
}
