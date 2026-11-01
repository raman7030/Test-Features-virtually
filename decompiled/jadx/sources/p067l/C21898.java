package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩷֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21898 {

    /* JADX INFO: renamed from: ֫ */
    public static final C7350 f68876;

    /* JADX INFO: renamed from: ۧ */
    public static final C7350 f68877;

    /* JADX INFO: renamed from: ܽ */
    public static final AtomicInteger f68878;

    /* JADX INFO: renamed from: ܿ */
    public static final C17873 f68879;

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f68880 = new Object();

    static {
        C7350 c7350 = new C7350();
        f68877 = c7350;
        f68876 = c7350;
        f68878 = new AtomicInteger(21321);
        f68879 = new C17873();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49404(final AbstractActivityC5549 abstractActivityC5549, final AbstractC17043 abstractC17043, List list) {
        if (list != null) {
            new C12510(abstractActivityC5549, abstractC17043, true, null, list, ApplicationC21448.f67649.getString("ais", "")).m28816(EnumC7934.SHIZUKU);
            return;
        }
        if (!C12799.m29347()) {
            C7050.m16212(new RunnableC20876(3, abstractActivityC5549, abstractC17043));
            return;
        }
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                final ArrayList arrayListM38496 = C16917.m38496(c19561);
                c19561.close();
                CharSequence[] charSequenceArr = new CharSequence[arrayListM38496.size()];
                final boolean[] zArr = new boolean[arrayListM38496.size()];
                for (int i = 0; i < arrayListM38496.size(); i++) {
                    C10213 c10213 = (C10213) arrayListM38496.get(i);
                    charSequenceArr[i] = c10213.m23810();
                    zArr[i] = c10213.m23808();
                }
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46725(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩺֡ܿ
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                        C10213 c10214 = (C10213) arrayListM38496.get(i2);
                        boolean[] zArr2 = zArr;
                        if (!z && c10214.m23809()) {
                            zArr2[i2] = true;
                            C0974 c0974M47330 = ((DialogInterfaceC1814) dialogInterface).m47330();
                            if (c0974M47330 != null) {
                                c0974M47330.post(new RunnableC3911(i2, 0, c0974M47330));
                                return;
                            }
                            return;
                        }
                        zArr2[i2] = z;
                    }
                });
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC2564M18268.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܰ֡ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayListM38490 = C16917.m38490(arrayListM38496, zArr);
                        if (arrayListM38490.isEmpty()) {
                            C22682.m50793(R.string.MT_Protector);
                            return;
                        }
                        dialogInterfaceC2564M18268.dismiss();
                        new C12510(abstractActivityC5549, abstractC17043, true, null, arrayListM38490, ApplicationC21448.f67649.getString("ais", "")).m28816(EnumC7934.SHIZUKU);
                    }
                });
                dialogInterfaceC2564M18268.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.۟֡ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = 0;
                        while (true) {
                            boolean[] zArr2 = zArr;
                            if (i2 >= zArr2.length) {
                                return;
                            }
                            boolean z = ((C10213) arrayListM38496.get(i2)).m23809() || !zArr2[i2];
                            zArr2[i2] = z;
                            dialogInterfaceC2564M18268.m3856().setItemChecked(i2, z);
                            i2++;
                        }
                    }
                });
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49403(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, String str) {
        new C12510(abstractActivityC5549, abstractC17043, false, str, null, ApplicationC21448.f67649.getString("ais", "")).m28816(EnumC7934.SHIZUKU);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49405(AbstractC17043 abstractC17043, List list) {
        C19561 c19561 = new C19561(abstractC17043);
        try {
            new C24027().m53210(c19561, list);
            c19561.close();
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m49409() {
        return C11164.m25781() && ApplicationC21448.f67650.getBoolean("apk_installation_root", true);
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m49407() {
        return Build.VERSION.SDK_INT >= 23 && ApplicationC21448.f67650.getBoolean("apk_installation_shizuku", true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m49410() {
        f68879.getClass();
        if (C24433.m53918()) {
            return 0;
        }
        try {
            return C24433.m53913() == 0 ? 2 : 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m49411() {
        return f68878.getAndIncrement();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49402(AbstractActivityC5549 abstractActivityC5549, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            EnumC15415 enumC15415Mo21805 = abstractActivityC5549.getLifecycle().mo21805();
            if (enumC15415Mo21805 != EnumC15415.DESTROYED) {
                Intent launchIntentForPackage = C7050.m16217().getLaunchIntentForPackage(str2);
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(str);
                if (launchIntentForPackage != null) {
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19334(0, abstractActivityC5549, launchIntentForPackage));
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                } else {
                    c20671BuildDialog.m46736(R.string.MT_Protector, null);
                }
                c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC23213(1, abstractActivityC5549, str2));
            }
            if (enumC15415Mo21805 != EnumC15415.RESUMED) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49401(String str) throws C2450 {
        if (str.contains("Success") || str.contains("Completed with warning(s)")) {
            return;
        }
        if (str.contains("INSTALL_FAILED_VERSION_DOWNGRADE")) {
            C2450 c2450 = new C2450(R.string.MT_Protector, str);
            c2450.m3445();
            throw c2450;
        }
        if (str.contains("INSTALL_FAILED_UPDATE_INCOMPATIBLE")) {
            throw new C2450(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_OLDER_SDK")) {
            throw new C2450(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_USER_RESTRICTED")) {
            throw new CancellationException();
        }
        C2450 c2451 = new C2450(R.string.MT_Protector, str);
        c2451.m3444();
        throw c2451;
    }
}
