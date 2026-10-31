package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12637 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38073;

    public /* synthetic */ ViewOnClickListenerC12637(int i, Object obj) {
        this.f38072 = i;
        this.f38073 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f38072;
        Object obj = this.f38073;
        switch (i) {
            case 0:
                C14298.m34104((C14298) obj);
                break;
            default:
                int i2 = ActivityC7365.f22615;
                ((ActivityC7365) obj).finish();
                break;
        }
    }
}
