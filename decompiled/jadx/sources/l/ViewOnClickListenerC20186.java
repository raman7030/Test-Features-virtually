package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩶۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20186 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65341;

    public /* synthetic */ ViewOnClickListenerC20186(int i, Object obj) {
        this.f65340 = i;
        this.f65341 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f65340) {
            case 0:
                ActivityC10227.m25783((ActivityC10227) this.f65341);
                break;
            default:
                C4417.m13139((C4417) this.f65341);
                break;
        }
    }
}
