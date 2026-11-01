package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13096 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f36811 = true;

    /* JADX INFO: renamed from: ֫ */
    public static void m29959() {
        f36811 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29960(final Main main, final InterfaceC4378 interfaceC4378) {
        if (C0886.m5543(main, UMUtils.SD_PERMISSION) == 0) {
            interfaceC4378.onSuccess();
            if (f36811) {
                return;
            }
            main.findViewById(R.id.MT_Protector).setVisibility(8);
            return;
        }
        if (C17452.m39788()) {
            interfaceC4378.mo5796();
            return;
        }
        final String[] strArr = {UMUtils.SD_PERMISSION};
        View viewFindViewById = main.findViewById(R.id.MT_Protector);
        final int i = 0;
        if (f36811) {
            f36811 = false;
            C1786.m46159(main, strArr, 23678);
            viewFindViewById.setVisibility(0);
            return;
        }
        if (C1786.m46160((Activity) main, UMUtils.SD_PERMISSION)) {
            viewFindViewById.setVisibility(8);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩺᩸ۡ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (i) {
                        case 0:
                            Main main2 = (Main) main;
                            String[] strArr2 = (String[]) strArr;
                            InterfaceC4378 interfaceC4379 = (InterfaceC4378) interfaceC4378;
                            if (i2 != -1) {
                                interfaceC4379.mo5796();
                            } else {
                                C1786.m46159(main2, strArr2, 23678);
                            }
                            break;
                        default:
                            C20966.m47299((C18107) main, (ArrayList) strArr, (InterfaceC19370) interfaceC4378, dialogInterface, i2);
                            break;
                    }
                }
            };
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(main);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46722(false);
            c20671.m46736(R.string.MT_Protector, onClickListener);
            c20671.m46728(R.string.MT_Protector, onClickListener);
            c20671.m46732();
            return;
        }
        viewFindViewById.setVisibility(8);
        int i3 = DialogInterfaceC2564.f4230;
        C20671 c20672 = new C20671(main);
        c20672.m46727(R.string.MT_Protector);
        c20672.m46710(R.string.MT_Protector);
        c20672.m46736(R.string.MT_Protector, null);
        c20672.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15756(i, main, interfaceC4378));
        c20672.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20672.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩸ۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Main main2 = main;
                if (C0886.m5543(main2, UMUtils.SD_PERMISSION) == 0) {
                    dialogInterfaceC2564M46732.dismiss();
                    interfaceC4378.onSuccess();
                } else {
                    main2.mo12256(main2.getPackageName());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29961(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29962(Context context) {
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
