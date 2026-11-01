package p067l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X565 */
/* JADX INFO: loaded from: classes.dex */
public final class C23058 {
    /* JADX INFO: renamed from: ܿ */
    public static boolean m51451(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            C6112.m13907(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m51448(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            boolean zM12441 = C5623.m12441();
            Class cls = Integer.TYPE;
            if (!zM12441) {
                if (C5623.m12439()) {
                    return m51451(context);
                }
                if (!C5623.m12437()) {
                    if (!C5623.m12435()) {
                        if (C5623.m12440()) {
                            try {
                                return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                            } catch (Exception e) {
                                C6112.m13907(e);
                                return false;
                            }
                        }
                    } else {
                        try {
                            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                        } catch (Exception e2) {
                            C6112.m13907(e2);
                        }
                    }
                } else {
                    try {
                        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                    } catch (Exception e3) {
                        C6112.m13907(e3);
                    }
                }
            } else {
                try {
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                } catch (Exception e4) {
                    C6112.m13907(e4);
                    return false;
                }
            }
        }
        if (C5623.m12439()) {
            return m51451(context);
        }
        Boolean boolValueOf = Boolean.TRUE;
        if (i >= 23) {
            boolValueOf = Boolean.valueOf(Settings.canDrawOverlays(context));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m51450(Context context, InterfaceC17021 interfaceC17021) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!C5623.m12441()) {
                if (!C5623.m12439()) {
                    if (!C5623.m12437()) {
                        if (!C5623.m12435()) {
                            if (!C5623.m12440()) {
                                if (interfaceC17021 != null) {
                                    interfaceC17021.mo8109();
                                }
                                m51452(context);
                                return;
                            }
                            m51447(context, interfaceC17021, new RunnableC22041(9, context));
                            return;
                        }
                        m51447(context, interfaceC17021, new RunnableC8487(4, context));
                        return;
                    }
                    m51447(context, interfaceC17021, new RunnableC9941(6, context));
                    return;
                }
                m51447(context, interfaceC17021, new RunnableC24722(2, context));
                return;
            }
            m51447(context, interfaceC17021, new RunnableC16180(3, context));
            return;
        }
        if (C5623.m12439()) {
            m51447(context, interfaceC17021, new RunnableC24722(2, context));
        } else if (i >= 23) {
            m51447(context, interfaceC17021, new RunnableC8805(4, context));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m51449(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m51447(Context context, InterfaceC17021 interfaceC17021, Runnable runnable) {
        new C1779(context).setCancelable(true).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9824(interfaceC17021, runnable, context, 1)).setNegativeButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6191(1, interfaceC17021, context)).setOnCancelListener(new DialogInterfaceOnCancelListenerC20273(1, interfaceC17021, context)).show();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51445(Context context, InterfaceC17021 interfaceC17021, Runnable runnable) {
        if (interfaceC17021 != null) {
            try {
                interfaceC17021.mo8110();
            } catch (Throwable unused) {
                if (interfaceC17021 != null) {
                    interfaceC17021.mo8109();
                }
                new C1779(context).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC20181(context, 1)).show();
                return;
            }
        }
        runnable.run();
        m51452(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51444(Context context, InterfaceC17021 interfaceC17021) {
        if (interfaceC17021 != null) {
            interfaceC17021.mo8109();
        }
        m51452(context);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m51446(Context context, InterfaceC17021 interfaceC17021) {
        if (interfaceC17021 != null) {
            interfaceC17021.mo8109();
        }
        m51452(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ */
    public static void m51452(Context context) {
        if (context instanceof InterfaceC10317) {
            ((InterfaceC10317) context).finish();
        }
    }
}
