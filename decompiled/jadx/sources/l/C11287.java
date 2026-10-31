package l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11287 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f33812 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27898() {
        f33812 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27899(final Main main, final InterfaceC2114 interfaceC2114) {
        if (C0881.m3229(main, UMUtils.SD_PERMISSION) == 0) {
            interfaceC2114.onSuccess();
            if (f33812) {
                return;
            }
            main.findViewById(R.id.MT_Protector).setVisibility(8);
            return;
        }
        if (C15871.m37616()) {
            interfaceC2114.mo3493();
            return;
        }
        final String[] strArr = {UMUtils.SD_PERMISSION};
        View viewFindViewById = main.findViewById(R.id.MT_Protector);
        final int i = 0;
        if (f33812) {
            f33812 = false;
            C19039.m43890(main, strArr, 23678);
            viewFindViewById.setVisibility(0);
            return;
        }
        if (C19039.m43891((Activity) main, UMUtils.SD_PERMISSION)) {
            viewFindViewById.setVisibility(8);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩺᩸ۡ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (i) {
                        case 0:
                            Main main2 = (Main) main;
                            String[] strArr2 = (String[]) strArr;
                            InterfaceC2114 interfaceC2115 = (InterfaceC2114) interfaceC2114;
                            if (i2 != -1) {
                                interfaceC2115.mo3493();
                            } else {
                                C19039.m43890(main2, strArr2, 23678);
                            }
                            break;
                        default:
                            C19568.m45004((C16560) main, (ArrayList) strArr, (InterfaceC17889) interfaceC2114, dialogInterface, i2);
                            break;
                    }
                }
            };
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(main);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44428(false);
            c19258.m44442(R.string.MT_Protector, onClickListener);
            c19258.m44434(R.string.MT_Protector, onClickListener);
            c19258.m44438();
            return;
        }
        viewFindViewById.setVisibility(8);
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19259 = new C19258(main);
        c19259.m44433(R.string.MT_Protector);
        c19259.m44416(R.string.MT_Protector);
        c19259.m44442(R.string.MT_Protector, null);
        c19259.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14086(i, main, interfaceC2114));
        c19259.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19259.m44438();
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩸ۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Main main2 = main;
                if (C0881.m3229(main2, UMUtils.SD_PERMISSION) == 0) {
                    dialogInterfaceC0206M44438.dismiss();
                    interfaceC2114.onSuccess();
                } else {
                    main2.mo10220(main2.getPackageName());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27900(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27901(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
