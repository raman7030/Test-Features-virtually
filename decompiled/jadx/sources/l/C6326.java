package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6326 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f19614;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17597() {
        return Build.VERSION.SDK_INT == 37 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17598(Context context, boolean z) {
        if ((z || !f19614) && m17597()) {
            try {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK");
                if (iCheckSelfPermission != -1) {
                    String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_LOCAL_NETWORK");
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    int iCheckOpNoThrow = (strPermissionToOp == null || appOpsManager == null) ? 3 : appOpsManager.checkOpNoThrow(strPermissionToOp, Process.myUid(), context.getPackageName());
                    if (iCheckOpNoThrow != 1 && iCheckOpNoThrow != 2) {
                        if (iCheckSelfPermission == 0 && iCheckOpNoThrow == 0) {
                            f19614 = true;
                            return false;
                        }
                    }
                }
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        if ((r0[0] & org.bouncycastle.util.encoders.UTF8.S_ERR) != 252) goto L73;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m17600(AbstractActivityC3346 abstractActivityC3346, AbstractC3577 abstractC3577) {
        String strM9677;
        if (!f19614 && m17597()) {
            if (abstractC3577 instanceof C1936) {
                strM9677 = ((C1936) abstractC3577).f6478;
            } else if (abstractC3577 instanceof C6875) {
                strM9677 = ((C6875) abstractC3577).f21246;
            } else if (abstractC3577 instanceof C23354) {
                strM9677 = ((C23354) abstractC3577).f75031;
            } else if (abstractC3577 instanceof C14719) {
                C14719 c14719 = (C14719) abstractC3577;
                try {
                    strM9677 = c14719.f44954 == -1 ? c14719.f44950 : c14719.m35018().f7409;
                } catch (IOException | IllegalArgumentException unused) {
                }
            } else if (abstractC3577 instanceof C2292) {
                strM9677 = ((C2292) abstractC3577).f7409;
            } else if (abstractC3577 instanceof C5156) {
                strM9677 = AbstractC3163.m9679(((C5156) abstractC3577).f16123);
            } else if (abstractC3577 instanceof C12834) {
                strM9677 = AbstractC3163.m9677(((C12834) abstractC3577).f38544);
            }
            if (strM9677 != null) {
                String lowerCase = strM9677.trim().toLowerCase(Locale.ROOT);
                if (lowerCase.endsWith(".")) {
                    lowerCase = C15472.m36561(1, 0, lowerCase);
                }
                if (!lowerCase.endsWith(".local") || lowerCase.length() <= 6 || lowerCase.indexOf(47) >= 0 || lowerCase.indexOf(58) >= 0 || lowerCase.indexOf(32) >= 0) {
                    if (lowerCase.startsWith("[") && lowerCase.endsWith("]")) {
                        lowerCase = C15472.m36561(1, 1, lowerCase);
                    }
                    int iIndexOf = lowerCase.indexOf(37);
                    if (iIndexOf >= 0 && lowerCase.indexOf(58) >= 0) {
                        lowerCase = lowerCase.substring(0, iIndexOf);
                    }
                    InetAddress inetAddressM50577 = C22599.m50577(lowerCase);
                    if (!inetAddressM50577.isLoopbackAddress() && !inetAddressM50577.isAnyLocalAddress()) {
                        byte[] address = inetAddressM50577.getAddress();
                        if (!inetAddressM50577.isSiteLocalAddress()) {
                            if (!inetAddressM50577.isLinkLocalAddress()) {
                                if (address.length == 16) {
                                }
                            }
                        }
                    }
                }
                return m17599(abstractActivityC3346);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17599(AbstractActivityC3346 abstractActivityC3346) {
        if (!m17598((Context) abstractActivityC3346, false)) {
            return true;
        }
        m17601(abstractActivityC3346);
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m17602(AbstractActivityC3346 abstractActivityC3346) {
        if (f19614 || !m17597() || C12865.m31302() == null || !m17598((Context) abstractActivityC3346, false)) {
            return;
        }
        m17601(abstractActivityC3346);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۬᩸ۡ, l.ܳۡ֫] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RunnableC10560 m17596(View view, final AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        final C3504 c3504 = new C3504(new boolean[]{false}, view, abstractActivityC3346);
        view.setOnClickListener(new ViewOnClickListenerC1833(4, abstractActivityC3346));
        final ?? r4 = new InterfaceC17236() { // from class: l.۬᩸ۡ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                if (enumC22901 == EnumC22901.ON_RESUME) {
                    c3504.n(Boolean.TRUE);
                }
            }
        };
        abstractActivityC3346.getLifecycle().mo19833(r4);
        if (!abstractActivityC3346.getLifecycle().mo19832().m33028(EnumC13728.RESUMED)) {
            c3504.n(Boolean.TRUE);
        }
        dialogInterfaceC0206.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.۫᩸ۡ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                if (enumC22901 == EnumC22901.ON_DESTROY) {
                    abstractActivityC3346.getLifecycle().mo19834(r4);
                }
            }
        });
        return new RunnableC10560(0, c3504);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17601(AbstractActivityC3346 abstractActivityC3346) {
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10944(3, abstractActivityC3346));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
