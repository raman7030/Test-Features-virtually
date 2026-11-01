package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4464 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10029;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10030;

    public /* synthetic */ ViewOnClickListenerC4464(int i, Object obj) {
        this.f10029 = i;
        this.f10030 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10029;
        Object obj = this.f10030;
        switch (i) {
            case 0:
                C23631.m52492((C23631) obj, view);
                break;
            case 1:
                ((AbstractC16864) obj).f49947.dismiss();
                break;
            default:
                int i2 = AbstractC23625.f75197;
                ((C23298) obj).m53442();
                break;
        }
    }
}
