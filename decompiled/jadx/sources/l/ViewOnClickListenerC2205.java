package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2205 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7245;

    public /* synthetic */ ViewOnClickListenerC2205(int i, Object obj) {
        this.f7244 = i;
        this.f7245 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7244;
        Object obj = this.f7245;
        switch (i) {
            case 0:
                C22372.m50152((C22372) obj, view);
                break;
            case 1:
                ((AbstractC15252) obj).f46823.dismiss();
                break;
            default:
                int i2 = AbstractC22366.f72471;
                ((C22022) obj).m51051();
                break;
        }
    }
}
