package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13915 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f39265;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f39266;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39267;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39268;

    public /* synthetic */ ViewOnClickListenerC13915(Object obj, Object obj2, Object obj3, int i) {
        this.f39267 = i;
        this.f39268 = obj;
        this.f39266 = obj2;
        this.f39265 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39267) {
            case 0:
                C12848.m29430((C12848) this.f39268, (C22198) this.f39266, (DialogInterfaceC2564) this.f39265);
                break;
            default:
                C15116.m34532((C15116) this.f39268, (AbstractActivityC5549) this.f39266, (C13776) this.f39265);
                break;
        }
    }
}
