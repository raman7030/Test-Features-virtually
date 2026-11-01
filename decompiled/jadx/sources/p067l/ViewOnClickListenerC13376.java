package p067l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۨ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13376 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ EditText f37527;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ EditText f37528;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37529;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9315 f37530;

    public /* synthetic */ ViewOnClickListenerC13376(C9315 c9315, EditText editText, EditText editText2, int i) {
        this.f37529 = i;
        this.f37530 = c9315;
        this.f37528 = editText;
        this.f37527 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37529) {
            case 0:
                C9315 c9315 = this.f37530;
                c9315.m21562();
                C4345.m8962(c9315.f25331, c9315.f25329, this.f37528, this.f37527);
                break;
            default:
                C9315 c9316 = this.f37530;
                c9316.m21562();
                C4345.m8962(c9316.f25331, c9316.f25329, this.f37528, this.f37527);
                break;
        }
    }
}
