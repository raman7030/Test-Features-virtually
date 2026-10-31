package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۡ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9110 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27603;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27604;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27605;

    public /* synthetic */ ViewOnClickListenerC9110(int i, Object obj, Object obj2) {
        this.f27604 = i;
        this.f27605 = obj;
        this.f27603 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27604) {
            case 0:
                C14298.m34094((C14298) this.f27605, (DialogInterfaceC0206) this.f27603);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f27605;
                int[] iArr = (int[]) this.f27603;
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
