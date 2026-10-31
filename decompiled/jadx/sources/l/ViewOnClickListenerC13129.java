package l;

import android.view.View;

/* JADX INFO: renamed from: l.۬۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13129 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39273;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39274;

    public /* synthetic */ ViewOnClickListenerC13129(int i, Object obj) {
        this.f39273 = i;
        this.f39274 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39273) {
            case 0:
                ActivityC10227.m25743((ActivityC10227) this.f39274);
                break;
            default:
                ((C4417) this.f39274).m13144("Cookie", (String) null);
                break;
        }
    }
}
