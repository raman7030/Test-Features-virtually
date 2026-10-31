package l;

import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.ܽۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16536 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50815;

    public /* synthetic */ ViewOnClickListenerC16536(int i, Object obj) {
        this.f50814 = i;
        this.f50815 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50814;
        Object obj = this.f50815;
        switch (i) {
            case 0:
                C23592 c23592 = (C23592) obj;
                int i2 = C23592.f76481;
                if (c23592.m52060().length() <= 0) {
                    c23592.m52057();
                } else {
                    c23592.m52054((String) null);
                    c23592.m52058(true);
                }
                break;
            case 1:
                int i3 = ActivityC19887.f64270;
                ((ActivityC19887) obj).finish();
                break;
            case 2:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj;
                abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC14903.class));
                break;
            default:
                ((AbstractDialogInterfaceOnClickListenerC12849) obj).m31250((CharSequence) C17283.m40576(System.currentTimeMillis()));
                break;
        }
    }
}
