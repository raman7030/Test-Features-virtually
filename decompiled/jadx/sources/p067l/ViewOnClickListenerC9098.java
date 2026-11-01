package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۜ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9098 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractActivityC5549 f24656;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24657;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24658;

    public /* synthetic */ ViewOnClickListenerC9098(int i, AbstractActivityC5549 abstractActivityC5549, Object obj) {
        this.f24657 = i;
        this.f24658 = obj;
        this.f24656 = abstractActivityC5549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24657) {
            case 0:
                C17143.m38814((C17143) this.f24658, this.f24656, view);
                break;
            default:
                C10140.m23631((C10140) this.f24658, this.f24656);
                break;
        }
    }
}
