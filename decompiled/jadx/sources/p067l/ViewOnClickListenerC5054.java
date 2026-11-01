package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5054 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f11838;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f11839;

    public /* synthetic */ ViewOnClickListenerC5054(int i, Object obj) {
        this.f11838 = i;
        this.f11839 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11838) {
            case 0:
                ((ActivityC22429) this.f11839).m50398();
                break;
            case 1:
                C4073.m8171((C4073) this.f11839);
                break;
            default:
                ActivityC12088.m27730((ActivityC12088) this.f11839, view);
                break;
        }
    }
}
