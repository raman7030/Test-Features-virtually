package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩵֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes4.dex */
public class C19138 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4488 f60321 = new C4488();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18432 m44188(int i) {
        C18432 c18432;
        C4488 c4488 = f60321;
        synchronized (c4488) {
            Object c18433 = c4488.get(i);
            if (c18433 == null && !c4488.mo2422(i)) {
                c18433 = new C18432(i);
                c4488.mo2318(i, c18433);
            }
            c18432 = (C18432) c18433;
        }
        return c18432;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44189(int i, int i2, String str) {
        C18432 c18432;
        C4488 c4488 = f60321;
        synchronized (c4488) {
            c18432 = (C18432) c4488.get(i);
        }
        if (c18432 != null) {
            C18432.m42904(c18432, i2, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra2 == -1) {
            System.out.println("Requesting user confirmation for installation");
            m44189(intExtra, 1, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            int i = ActivityC3615.f11457;
            Intent intent3 = new Intent(context, (Class<?>) ActivityC3615.class);
            intent3.putExtra("confirmationIntent", intent2);
            intent3.putExtra("sessionID", intExtra);
            intent3.addFlags(268435456);
            context.startActivity(intent3);
            return;
        }
        if (intExtra2 == 0) {
            System.out.println("Installation succeed");
            m44189(intExtra, 0, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
        } else if (intExtra2 == 3) {
            System.out.println("Installation canceled");
            m44189(intExtra, 2, null);
        } else {
            System.out.println("Installation failed");
            m44189(intExtra, 3, intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE"));
        }
    }
}
