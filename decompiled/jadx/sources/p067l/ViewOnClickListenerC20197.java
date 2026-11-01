package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩴ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20197 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62488;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f62489;

    public /* synthetic */ ViewOnClickListenerC20197(int i, Object obj) {
        this.f62488 = i;
        this.f62489 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f62488;
        Object obj = this.f62489;
        switch (i) {
            case 0:
                C8126.m18842((C8126) obj);
                break;
            case 1:
                C7050.m16211((CharSequence) obj);
                break;
            case 2:
                ActivityC10778.m24827((ActivityC10778) obj);
                break;
            default:
                int i2 = ActivityC22720.f71666;
                ((ActivityC22720) obj).finish();
                break;
        }
    }
}
