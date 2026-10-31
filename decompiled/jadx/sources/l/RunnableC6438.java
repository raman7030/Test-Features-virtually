package l;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۜ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6438 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19918;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19919;

    public /* synthetic */ RunnableC6438(int i, Object obj) {
        this.f19918 = i;
        this.f19919 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19918) {
            case 0:
                ((C22372) this.f19919).m50177();
                return;
            case 1:
                C16747.m39392((C16747) this.f19919);
                return;
            case 2:
                ((ServiceC3219) this.f19919).m9883();
                return;
            case 3:
                ((Button) this.f19919).setEnabled(true);
                return;
            default:
                Context context = (Context) this.f19919;
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
