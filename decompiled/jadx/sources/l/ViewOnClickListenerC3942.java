package l;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.ۘ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3942 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12562;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12563;

    public /* synthetic */ ViewOnClickListenerC3942(int i, Object obj) {
        this.f12562 = i;
        this.f12563 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12562;
        Object obj = this.f12563;
        switch (i) {
            case 0:
                C6058 c6058 = (C6058) obj;
                C6058.m16898(c6058.f18567, new RunnableC0413(0, c6058));
                break;
            case 1:
                ActivityC10717.m26893((Context) ((C16560) obj).m39056(), C23986.m52816(), false);
                break;
            case 2:
                C18995.m43831((AbstractActivityC3346) obj);
                break;
            default:
                int i2 = ActivityC9296.f28175;
                ((ActivityC9296) obj).finish();
                break;
        }
    }
}
