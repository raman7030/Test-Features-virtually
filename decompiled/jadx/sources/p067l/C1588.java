package p067l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import bin.p000mt.plus.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶۛ */
/* JADX INFO: compiled from: C23A */
/* JADX INFO: loaded from: classes4.dex */
public final class C1588 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f48930;

    /* JADX INFO: renamed from: ۧ */
    public static Method f48931;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f48932;

    /* JADX INFO: renamed from: ᩳ */
    public static Field f48933;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37714(View view, KeyEvent keyEvent) {
        int i = C1717.f57146;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i2 = C1752.f60253;
        C1752 c1752 = (C1752) view.getTag(R.id.MT_Protector);
        if (c1752 == null) {
            c1752 = new C1752();
            view.setTag(R.id.MT_Protector, c1752);
        }
        return c1752.m45048(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m37715(InterfaceC1238 interfaceC1238, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean zM45049;
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        boolean zM450410 = false;
        if (interfaceC1238 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return interfaceC1238.mo6208(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f48930) {
                            try {
                                f48931 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f48930 = true;
                        }
                        Method method = f48931;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                zBooleanValue = objInvoke == null ? false : ((Boolean) objInvoke).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                int i2 = C1717.f57146;
                if (Build.VERSION.SDK_INT < 28) {
                    int i3 = C1752.f60253;
                    C1752 c1752 = (C1752) decorView.getTag(R.id.MT_Protector);
                    if (c1752 == null) {
                        c1752 = new C1752();
                        decorView.setTag(R.id.MT_Protector, c1752);
                    }
                    zM450410 = c1752.m45049(decorView, keyEvent);
                }
                if (zM450410) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    int i4 = C1717.f57146;
                    if (i >= 28) {
                        zM45049 = false;
                    } else {
                        int i5 = C1752.f60253;
                        C1752 c1753 = (C1752) view.getTag(R.id.MT_Protector);
                        if (c1753 == null) {
                            c1753 = new C1752();
                            view.setTag(R.id.MT_Protector, c1753);
                        }
                        zM45049 = c1753.m45049(view, keyEvent);
                    }
                    if (!zM45049) {
                        if (interfaceC1238.mo6208(keyEvent)) {
                        }
                    }
                } else if (interfaceC1238.mo6208(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!f48932) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f48933 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f48932 = true;
            }
            Field field = f48933;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            int i6 = C1717.f57146;
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = C1752.f60253;
                C1752 c1754 = (C1752) decorView2.getTag(R.id.MT_Protector);
                if (c1754 == null) {
                    c1754 = new C1752();
                    decorView2.setTag(R.id.MT_Protector, c1754);
                }
                zM450410 = c1754.m45049(decorView2, keyEvent);
            }
            if (zM450410) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }
}
