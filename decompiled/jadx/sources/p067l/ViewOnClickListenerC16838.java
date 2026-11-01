package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.ܶ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16838 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f49853;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f49854;

    public /* synthetic */ ViewOnClickListenerC16838(int i, Object obj) {
        this.f49853 = i;
        this.f49854 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49853;
        Object obj = this.f49854;
        switch (i) {
            case 0:
                ActivityC12088.m27750((ActivityC12088) obj);
                break;
            case 1:
                ActivityC9368 activityC9368 = (ActivityC9368) obj;
                int i2 = ActivityC9368.f25528;
                try {
                    activityC9368.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C25165.m55234())));
                } catch (Throwable th) {
                    activityC9368.m12259(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                C6587.m15069((C6587) obj);
                break;
        }
    }
}
