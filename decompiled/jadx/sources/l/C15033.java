package l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C23A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15033 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f45814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f45815;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f45816;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Field f45817;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35557(View view, KeyEvent keyEvent) {
        int i = C17648.f53953;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i2 = C18354.f57033;
        C18354 c18354 = (C18354) view.getTag(R.id.MT_Protector);
        if (c18354 == null) {
            c18354 = new C18354();
            view.setTag(R.id.MT_Protector, c18354);
        }
        return c18354.m42776(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35558(InterfaceC7979 interfaceC7979, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean zM42777;
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        boolean zM42778 = false;
        if (interfaceC7979 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return interfaceC7979.mo3966(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f45814) {
                            try {
                                f45815 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f45814 = true;
                        }
                        Method method = f45815;
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
                int i2 = C17648.f53953;
                if (Build.VERSION.SDK_INT < 28) {
                    int i3 = C18354.f57033;
                    C18354 c18354 = (C18354) decorView.getTag(R.id.MT_Protector);
                    if (c18354 == null) {
                        c18354 = new C18354();
                        decorView.setTag(R.id.MT_Protector, c18354);
                    }
                    zM42778 = c18354.m42777(decorView, keyEvent);
                }
                if (zM42778) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    int i4 = C17648.f53953;
                    if (i >= 28) {
                        zM42777 = false;
                    } else {
                        int i5 = C18354.f57033;
                        C18354 c18355 = (C18354) view.getTag(R.id.MT_Protector);
                        if (c18355 == null) {
                            c18355 = new C18354();
                            view.setTag(R.id.MT_Protector, c18355);
                        }
                        zM42777 = c18355.m42777(view, keyEvent);
                    }
                    if (!zM42777) {
                        if (interfaceC7979.mo3966(keyEvent)) {
                        }
                    }
                } else if (interfaceC7979.mo3966(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!f45816) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f45817 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f45816 = true;
            }
            Field field = f45817;
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
            int i6 = C17648.f53953;
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = C18354.f57033;
                C18354 c18356 = (C18354) decorView2.getTag(R.id.MT_Protector);
                if (c18356 == null) {
                    c18356 = new C18354();
                    decorView2.setTag(R.id.MT_Protector, c18356);
                }
                zM42778 = c18356.m42777(decorView2, keyEvent);
            }
            if (zM42778) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }
}
