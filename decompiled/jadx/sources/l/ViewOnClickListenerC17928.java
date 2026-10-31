package l;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17928 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54761;

    public /* synthetic */ ViewOnClickListenerC17928(int i, Object obj, Object obj2) {
        this.f54760 = i;
        this.f54761 = obj;
        this.f54759 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f54760) {
            case 0:
                C17222.m40519((C17222) this.f54761, (AbstractActivityC3346) this.f54759);
                break;
            default:
                ((C11083) this.f54761).f33276.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", ((C13698) this.f54759).f40889, null)));
                break;
        }
    }
}
