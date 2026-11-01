package p067l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8381 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f22485;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19537() {
        return Build.VERSION.SDK_INT == 37 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19538(Context context, boolean z) {
        if ((z || !f22485) && m19537()) {
            try {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK");
                if (iCheckSelfPermission != -1) {
                    String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_LOCAL_NETWORK");
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    int iCheckOpNoThrow = (strPermissionToOp == null || appOpsManager == null) ? 3 : appOpsManager.checkOpNoThrow(strPermissionToOp, Process.myUid(), context.getPackageName());
                    if (iCheckOpNoThrow != 1 && iCheckOpNoThrow != 2) {
                        if (iCheckSelfPermission == 0 && iCheckOpNoThrow == 0) {
                            f22485 = true;
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m19540(AbstractActivityC5549 abstractActivityC5549, AbstractC5769 abstractC5769) {
        String strM11721;
        if (!f22485 && m19537()) {
            if (abstractC5769 instanceof C4209) {
                strM11721 = ((C4209) abstractC5769).f9258;
            } else if (abstractC5769 instanceof C8903) {
                strM11721 = ((C8903) abstractC5769).f24123;
            } else if (abstractC5769 instanceof C24564) {
                strM11721 = ((C24564) abstractC5769).f77777;
            } else if (abstractC5769 instanceof C16358) {
                C16358 c16358 = (C16358) abstractC5769;
                try {
                    strM11721 = c16358.f48067 == -1 ? c16358.f48063 : c16358.m37165().f10195;
                } catch (IOException | IllegalArgumentException unused) {
                }
            } else if (abstractC5769 instanceof C4547) {
                strM11721 = ((C4547) abstractC5769).f10195;
            } else if (abstractC5769 instanceof C7269) {
                strM11721 = AbstractC5375.m11723(((C7269) abstractC5769).f18962);
            } else if (abstractC5769 instanceof C14566) {
                strM11721 = AbstractC5375.m11721(((C14566) abstractC5769).f41586);
            }
            if (strM11721 != null) {
                String lowerCase = strM11721.trim().toLowerCase(Locale.ROOT);
                if (lowerCase.endsWith(".")) {
                    lowerCase = C17073.m38720(1, 0, lowerCase);
                }
                if (!lowerCase.endsWith(".local") || lowerCase.length() <= 6 || lowerCase.indexOf(47) >= 0 || lowerCase.indexOf(58) >= 0 || lowerCase.indexOf(32) >= 0) {
                    if (lowerCase.startsWith("[") && lowerCase.endsWith("]")) {
                        lowerCase = C17073.m38720(1, 1, lowerCase);
                    }
                    int iIndexOf = lowerCase.indexOf(37);
                    if (iIndexOf >= 0 && lowerCase.indexOf(58) >= 0) {
                        lowerCase = lowerCase.substring(0, iIndexOf);
                    }
                    InetAddress inetAddressM52919 = C23847.m52919(lowerCase);
                    if (!inetAddressM52919.isLoopbackAddress() && !inetAddressM52919.isAnyLocalAddress()) {
                        byte[] address = inetAddressM52919.getAddress();
                        if (!inetAddressM52919.isSiteLocalAddress()) {
                            if (!inetAddressM52919.isLinkLocalAddress()) {
                                if (address.length == 16) {
                                }
                            }
                        }
                    }
                }
                return m19539(abstractActivityC5549);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19539(AbstractActivityC5549 abstractActivityC5549) {
        if (!m19538((Context) abstractActivityC5549, false)) {
            return true;
        }
        m19541(abstractActivityC5549);
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m19542(AbstractActivityC5549 abstractActivityC5549) {
        if (f22485 || !m19537() || C14595.m33388() == null || !m19538((Context) abstractActivityC5549, false)) {
            return;
        }
        m19541(abstractActivityC5549);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۬᩸ۡ, l.ܳۡ֫] */
    /* JADX INFO: renamed from: ֫ */
    public static RunnableC12405 m19536(View view, final AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        final C5699 c5699 = new C5699(new boolean[]{false}, view, abstractActivityC5549);
        view.setOnClickListener(new ViewOnClickListenerC4111(4, abstractActivityC5549));
        final ?? r4 = new InterfaceC18749() { // from class: l.۬᩸ۡ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                if (enumC24133 == EnumC24133.ON_RESUME) {
                    c5699.m45213n(Boolean.TRUE);
                }
            }
        };
        abstractActivityC5549.getLifecycle().mo21806(r4);
        if (!abstractActivityC5549.getLifecycle().mo21805().m35142(EnumC15415.RESUMED)) {
            c5699.m45213n(Boolean.TRUE);
        }
        dialogInterfaceC2564.getLifecycle().mo21806(new InterfaceC18749() { // from class: l.۫᩸ۡ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                if (enumC24133 == EnumC24133.ON_DESTROY) {
                    abstractActivityC5549.getLifecycle().mo21807(r4);
                }
            }
        });
        return new RunnableC12405(0, c5699);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19541(AbstractActivityC5549 abstractActivityC5549) {
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12770(3, abstractActivityC5549));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
