package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11507 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32108;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32109;

    public /* synthetic */ ViewOnClickListenerC11507(int i, Object obj) {
        this.f32108 = i;
        this.f32109 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32108) {
            case 0:
                C7050.m16211((CharSequence) this.f32109);
                break;
            default:
                ActivityC8301.m19142((ActivityC8301) this.f32109);
                break;
        }
    }
}
