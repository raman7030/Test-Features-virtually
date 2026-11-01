package p067l;

import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.ܽۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18084 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53993;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53994;

    public /* synthetic */ ViewOnClickListenerC18084(int i, Object obj) {
        this.f53993 = i;
        this.f53994 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f53993;
        Object obj = this.f53994;
        switch (i) {
            case 0:
                C24790 c24790 = (C24790) obj;
                int i2 = C24790.f79226;
                if (c24790.m54463().length() <= 0) {
                    c24790.m54460();
                } else {
                    c24790.m54457((String) null);
                    c24790.m54461(true);
                }
                break;
            case 1:
                int i3 = ActivityC21269.f66906;
                ((ActivityC21269) obj).finish();
                break;
            case 2:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj;
                abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC16532.class));
                break;
            default:
                ((AbstractDialogInterfaceOnClickListenerC14580) obj).m33336((CharSequence) C18794.m42827(System.currentTimeMillis()));
                break;
        }
    }
}
