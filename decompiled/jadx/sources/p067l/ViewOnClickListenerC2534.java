package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֡ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2534 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4170;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f4171;

    public /* synthetic */ ViewOnClickListenerC2534(int i, Object obj) {
        this.f4170 = i;
        this.f4171 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4170;
        Object obj = this.f4171;
        switch (i) {
            case 0:
                int i2 = ActivityC21312.f67165;
                ((ActivityC21312) obj).finish();
                break;
            default:
                ((C6435) obj).m14725(view);
                break;
        }
    }
}
