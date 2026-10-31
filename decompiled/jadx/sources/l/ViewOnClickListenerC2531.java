package l;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: renamed from: l.ۖ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2531 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8034;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8035;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8036;

    public /* synthetic */ ViewOnClickListenerC2531(int i, Object obj, Object obj2) {
        this.f8035 = i;
        this.f8036 = obj;
        this.f8034 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8035) {
            case 0:
                C6058.m16901((C16560) this.f8036, (InterfaceC17889) this.f8034);
                break;
            default:
                ((Snackbar) this.f8036).lambda$setAction$0((View.OnClickListener) this.f8034, view);
                break;
        }
    }
}
