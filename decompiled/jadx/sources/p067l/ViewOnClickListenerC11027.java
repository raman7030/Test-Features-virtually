package p067l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۡ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11027 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f30540;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30541;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30542;

    public /* synthetic */ ViewOnClickListenerC11027(int i, Object obj, Object obj2) {
        this.f30541 = i;
        this.f30542 = obj;
        this.f30540 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30541) {
            case 0:
                C15957.m36227((C15957) this.f30542, (DialogInterfaceC2564) this.f30540);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f30542;
                int[] iArr = (int[]) this.f30540;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    if (radioButton == view) {
                        radioButton.setChecked(true);
                        iArr[0] = i;
                    } else {
                        radioButton.setChecked(false);
                    }
                }
                break;
        }
    }
}
