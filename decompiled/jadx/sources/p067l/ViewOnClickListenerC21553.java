package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩶۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21553 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67988;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f67989;

    public /* synthetic */ ViewOnClickListenerC21553(int i, Object obj) {
        this.f67988 = i;
        this.f67989 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f67988) {
            case 0:
                ActivityC12088.m27805((ActivityC12088) this.f67989);
                break;
            default:
                C6566.m15003((C6566) this.f67989);
                break;
        }
    }
}
