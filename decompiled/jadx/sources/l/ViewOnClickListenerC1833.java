package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1833 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6279;

    public /* synthetic */ ViewOnClickListenerC1833(int i, Object obj) {
        this.f6278 = i;
        this.f6279 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6278) {
            case 0:
                ((RunnableC7497) this.f6279).run();
                break;
            case 1:
                C14507.m34635((C14507) this.f6279, view);
                break;
            case 2:
                ActivityC22006.m49520((ActivityC22006) this.f6279);
                break;
            case 3:
                C15716.m37048((C15716) this.f6279);
                break;
            default:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f6279;
                abstractActivityC3346.mo10220(abstractActivityC3346.getPackageName());
                break;
        }
    }
}
