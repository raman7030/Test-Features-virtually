package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7058 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f18397;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f18398;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f18399;

    public /* synthetic */ ViewOnClickListenerC7058(int i, Object obj, Object obj2) {
        this.f18398 = i;
        this.f18399 = obj;
        this.f18397 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18398) {
            case 0:
                C22422.m50369((DialogInterfaceC2564) this.f18399, (C10748) this.f18397);
                break;
            default:
                C6001.m13514((C6001) this.f18397, (C4566) this.f18399);
                break;
        }
    }
}
