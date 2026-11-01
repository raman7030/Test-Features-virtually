package p067l;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10146 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28092;

    public /* synthetic */ ViewOnClickListenerC10146(int i) {
        this.f28092 = i;
    }

    public /* synthetic */ ViewOnClickListenerC10146(Context context) {
        this.f28092 = 2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28092) {
            case 0:
                if (!ServiceC20700.m46783()) {
                    Application applicationM16232 = C7050.m16232();
                    C0886.m5546(applicationM16232, new Intent(applicationM16232, (Class<?>) ServiceC20700.class));
                } else {
                    Application applicationM16233 = C7050.m16232();
                    applicationM16233.stopService(new Intent(applicationM16233, (Class<?>) ServiceC20700.class));
                }
                break;
            case 1:
                int i = C24995.f79786;
                break;
            default:
                C22682.m50798(R.string.MT_Protector, 0).m50804();
                break;
        }
    }
}
