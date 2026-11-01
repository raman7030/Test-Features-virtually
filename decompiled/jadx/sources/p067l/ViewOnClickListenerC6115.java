package p067l;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.ۘ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6115 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15370;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15371;

    public /* synthetic */ ViewOnClickListenerC6115(int i, Object obj) {
        this.f15370 = i;
        this.f15371 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15370;
        Object obj = this.f15371;
        switch (i) {
            case 0:
                C8126 c8126 = (C8126) obj;
                C8126.m18827(c8126.f21423, new RunnableC2761(0, c8126));
                break;
            case 1:
                ActivityC12554.m28933((Context) ((C18107) obj).m41282(), C25165.m55222(), false);
                break;
            case 2:
                C20422.m46099((AbstractActivityC5549) obj);
                break;
            default:
                int i2 = ActivityC11203.f31124;
                ((ActivityC11203) obj).finish();
                break;
        }
    }
}
