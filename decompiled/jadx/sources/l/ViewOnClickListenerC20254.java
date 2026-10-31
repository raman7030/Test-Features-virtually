package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩶ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20254 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65489;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65490;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65491;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65492;

    public /* synthetic */ ViewOnClickListenerC20254(Object obj, Object obj2, Object obj3, int i) {
        this.f65491 = i;
        this.f65492 = obj;
        this.f65490 = obj2;
        this.f65489 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f65491) {
            case 0:
                C7309 c7309 = (C7309) this.f65492;
                EditText editText = (EditText) this.f65490;
                EditText editText2 = (EditText) this.f65489;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
                break;
            default:
                C6058.m16902((boolean[]) this.f65492, (DialogInterfaceC0206) this.f65490, (Runnable) this.f65489);
                break;
        }
    }
}
