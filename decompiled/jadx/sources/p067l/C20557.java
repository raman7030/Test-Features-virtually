package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩵֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes4.dex */
public class C20557 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public static final C6634 f63553 = new C6634();

    /* JADX INFO: renamed from: ֫ */
    public static C19886 m46482(int i) {
        C19886 c19886;
        C6634 c6634 = f63553;
        synchronized (c6634) {
            Object c19887 = c6634.get(i);
            if (c19887 == null && !c6634.mo4793(i)) {
                c19887 = new C19886(i);
                c6634.mo4686(i, c19887);
            }
            c19886 = (C19886) c19887;
        }
        return c19886;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46483(int i, int i2, String str) {
        C19886 c19886;
        C6634 c6634 = f63553;
        synchronized (c6634) {
            c19886 = (C19886) c6634.get(i);
        }
        if (c19886 != null) {
            C19886.m45177(c19886, i2, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra2 == -1) {
            System.out.println("Requesting user confirmation for installation");
            m46483(intExtra, 1, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            int i = ActivityC5804.f14261;
            Intent intent3 = new Intent(context, (Class<?>) ActivityC5804.class);
            intent3.putExtra("confirmationIntent", intent2);
            intent3.putExtra("sessionID", intExtra);
            intent3.addFlags(268435456);
            context.startActivity(intent3);
            return;
        }
        if (intExtra2 == 0) {
            System.out.println("Installation succeed");
            m46483(intExtra, 0, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
        } else if (intExtra2 == 3) {
            System.out.println("Installation canceled");
            m46483(intExtra, 2, null);
        } else {
            System.out.println("Installation failed");
            m46483(intExtra, 3, intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE"));
        }
    }
}
