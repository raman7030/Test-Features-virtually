package p067l;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19407 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f57956;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57957;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57958;

    public /* synthetic */ ViewOnClickListenerC19407(int i, Object obj, Object obj2) {
        this.f57957 = i;
        this.f57958 = obj;
        this.f57956 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f57957) {
            case 0:
                C18736.m42766((C18736) this.f57958, (AbstractActivityC5549) this.f57956);
                break;
            default:
                ((C12902) this.f57958).f36277.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", ((C15387) this.f57956).f43970, null)));
                break;
        }
    }
}
