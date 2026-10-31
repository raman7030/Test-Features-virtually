package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.ܶ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15225 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46729;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46730;

    public /* synthetic */ ViewOnClickListenerC15225(int i, Object obj) {
        this.f46729 = i;
        this.f46730 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f46729;
        Object obj = this.f46730;
        switch (i) {
            case 0:
                ActivityC10227.m25728((ActivityC10227) obj);
                break;
            case 1:
                ActivityC7365 activityC7365 = (ActivityC7365) obj;
                int i2 = ActivityC7365.f22615;
                try {
                    activityC7365.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C23986.m52828())));
                } catch (Throwable th) {
                    activityC7365.m10223(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                C4439.m13188((C4439) obj);
                break;
        }
    }
}
