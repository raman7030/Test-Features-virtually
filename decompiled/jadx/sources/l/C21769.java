package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X565 */
/* JADX INFO: loaded from: classes.dex */
public final class C21769 {
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m49101(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            C3939.m11987(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49098(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            boolean zM10402 = C3424.m10402();
            Class cls = Integer.TYPE;
            if (!zM10402) {
                if (C3424.m10400()) {
                    return m49101(context);
                }
                if (!C3424.m10398()) {
                    if (!C3424.m10396()) {
                        if (C3424.m10401()) {
                            try {
                                return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                            } catch (Exception e) {
                                C3939.m11987(e);
                                return false;
                            }
                        }
                    } else {
                        try {
                            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                        } catch (Exception e2) {
                            C3939.m11987(e2);
                        }
                    }
                } else {
                    try {
                        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                    } catch (Exception e3) {
                        C3939.m11987(e3);
                    }
                }
            } else {
                try {
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                } catch (Exception e4) {
                    C3939.m11987(e4);
                    return false;
                }
            }
        }
        if (C3424.m10400()) {
            return m49101(context);
        }
        Boolean boolValueOf = Boolean.TRUE;
        if (i >= 23) {
            boolValueOf = Boolean.valueOf(Settings.canDrawOverlays(context));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m49100(Context context, InterfaceC15417 interfaceC15417) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!C3424.m10402()) {
                if (!C3424.m10400()) {
                    if (!C3424.m10398()) {
                        if (!C3424.m10396()) {
                            if (!C3424.m10401()) {
                                if (interfaceC15417 != null) {
                                    interfaceC15417.mo5898();
                                }
                                m49102(context);
                                return;
                            }
                            m49097(context, interfaceC15417, new RunnableC20699(9, context));
                            return;
                        }
                        m49097(context, interfaceC15417, new RunnableC6438(4, context));
                        return;
                    }
                    m49097(context, interfaceC15417, new RunnableC7968(6, context));
                    return;
                }
                m49097(context, interfaceC15417, new RunnableC23520(2, context));
                return;
            }
            m49097(context, interfaceC15417, new RunnableC14532(3, context));
            return;
        }
        if (C3424.m10400()) {
            m49097(context, interfaceC15417, new RunnableC23520(2, context));
        } else if (i >= 23) {
            m49097(context, interfaceC15417, new RunnableC6772(4, context));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m49099(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49097(Context context, InterfaceC15417 interfaceC15417, Runnable runnable) {
        new C18892(context).setCancelable(true).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7845(interfaceC15417, runnable, context, 1)).setNegativeButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4022(1, interfaceC15417, context)).setOnCancelListener(new DialogInterfaceOnCancelListenerC18839(1, interfaceC15417, context)).show();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49095(Context context, InterfaceC15417 interfaceC15417, Runnable runnable) {
        if (interfaceC15417 != null) {
            try {
                interfaceC15417.mo5899();
            } catch (Throwable unused) {
                if (interfaceC15417 != null) {
                    interfaceC15417.mo5898();
                }
                new C18892(context).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC18742(context, 1)).show();
                return;
            }
        }
        runnable.run();
        m49102(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49094(Context context, InterfaceC15417 interfaceC15417) {
        if (interfaceC15417 != null) {
            interfaceC15417.mo5898();
        }
        m49102(context);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49096(Context context, InterfaceC15417 interfaceC15417) {
        if (interfaceC15417 != null) {
            interfaceC15417.mo5898();
        }
        m49102(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m49102(Context context) {
        if (context instanceof InterfaceC8363) {
            ((InterfaceC8363) context).finish();
        }
    }
}
