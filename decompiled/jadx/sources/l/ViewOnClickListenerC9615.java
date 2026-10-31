package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9615 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29160;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29161;

    public /* synthetic */ ViewOnClickListenerC9615(int i, Object obj) {
        this.f29160 = i;
        this.f29161 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29160) {
            case 0:
                C4925.m14314((CharSequence) this.f29161);
                break;
            default:
                ActivityC6242.m17204((ActivityC6242) this.f29161);
                break;
        }
    }
}
