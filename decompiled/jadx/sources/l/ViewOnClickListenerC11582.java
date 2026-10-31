package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۨ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11582 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f34528;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f34529;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34530;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7309 f34531;

    public /* synthetic */ ViewOnClickListenerC11582(C7309 c7309, EditText editText, EditText editText2, int i) {
        this.f34530 = i;
        this.f34531 = c7309;
        this.f34529 = editText;
        this.f34528 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34530) {
            case 0:
                C7309 c7309 = this.f34531;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, this.f34529, this.f34528);
                break;
            default:
                C7309 c73010 = this.f34531;
                c73010.m19594();
                C2079.m6836(c73010.f22440, c73010.f22438, this.f34529, this.f34528);
                break;
        }
    }
}
