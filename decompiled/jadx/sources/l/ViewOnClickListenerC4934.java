package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4934 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15565;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15566;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15567;

    public /* synthetic */ ViewOnClickListenerC4934(int i, Object obj, Object obj2) {
        this.f15566 = i;
        this.f15567 = obj;
        this.f15565 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15566) {
            case 0:
                C21100.m48039((DialogInterfaceC0206) this.f15567, (C8817) this.f15565);
                break;
            default:
                C3822.m11578((C3822) this.f15565, (C2312) this.f15567);
                break;
        }
    }
}
