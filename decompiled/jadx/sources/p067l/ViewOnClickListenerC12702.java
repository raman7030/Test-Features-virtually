package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12702 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35640;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f35641;

    public /* synthetic */ ViewOnClickListenerC12702(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f35640 = i;
        this.f35641 = abstractActivityC5549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35640) {
            case 0:
                new ViewOnClickListenerC2424(this.f35641);
                break;
            default:
                ActivityC4030.m8061((ActivityC4030) this.f35641);
                break;
        }
    }
}
