package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֫۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4111 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9057;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f9058;

    public /* synthetic */ ViewOnClickListenerC4111(int i, Object obj) {
        this.f9057 = i;
        this.f9058 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9057) {
            case 0:
                ((RunnableC9494) this.f9058).run();
                break;
            case 1:
                C16156.m36776((C16156) this.f9058, view);
                break;
            case 2:
                ActivityC23283.m51855((ActivityC23283) this.f9058);
                break;
            case 3:
                C17305.m39217((C17305) this.f9058);
                break;
            default:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f9058;
                abstractActivityC5549.mo12256(abstractActivityC5549.getPackageName());
                break;
        }
    }
}
