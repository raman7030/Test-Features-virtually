package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۬۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14846 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f42328;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f42329;

    public /* synthetic */ ViewOnClickListenerC14846(int i, Object obj) {
        this.f42328 = i;
        this.f42329 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42328) {
            case 0:
                ActivityC12088.m27765((ActivityC12088) this.f42329);
                break;
            default:
                ((C6566) this.f42329).m15008("Cookie", (String) null);
                break;
        }
    }
}
