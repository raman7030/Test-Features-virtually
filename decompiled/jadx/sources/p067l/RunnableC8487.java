package p067l;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۜ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8487 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f22790;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f22791;

    public /* synthetic */ RunnableC8487(int i, Object obj) {
        this.f22790 = i;
        this.f22791 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22790) {
            case 0:
                ((C23631) this.f22791).m52517();
                return;
            case 1:
                C18285.m41628((C18285) this.f22791);
                return;
            case 2:
                ((ServiceC5428) this.f22791).m11930();
                return;
            case 3:
                ((Button) this.f22791).setEnabled(true);
                return;
            default:
                Context context = (Context) this.f22791;
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
                intent.setFlags(268435456);
                if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                    context.startActivity(intent);
                    return;
                }
                intent.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
                if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                    throw new RuntimeException("intent is not available!");
                }
                context.startActivity(intent);
                return;
        }
    }
}
