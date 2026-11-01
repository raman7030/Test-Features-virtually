package p067l;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: renamed from: l.ۖ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4774 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f10825;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10826;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10827;

    public /* synthetic */ ViewOnClickListenerC4774(int i, Object obj, Object obj2) {
        this.f10826 = i;
        this.f10827 = obj;
        this.f10825 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10826) {
            case 0:
                C8126.m18830((C18107) this.f10827, (InterfaceC19370) this.f10825);
                break;
            default:
                ((Snackbar) this.f10827).lambda$setAction$0((View.OnClickListener) this.f10825, view);
                break;
        }
    }
}
