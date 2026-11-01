package p067l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۨۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13218 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37116;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37117;

    public /* synthetic */ ViewOnClickListenerC13218(int i, Object obj) {
        this.f37116 = i;
        this.f37117 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f37116;
        Object obj = this.f37117;
        switch (i) {
            case 0:
                C11245.m26052((C11245) obj);
                break;
            case 1:
                ViewOnClickListenerC21364.m48397((ViewOnClickListenerC21364) obj);
                break;
            case 2:
                RadioButton[] radioButtonArr = (RadioButton[]) obj;
                int length = radioButtonArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr[i2];
                    radioButton.setChecked(radioButton == view);
                }
                break;
            case 3:
                int i3 = ActivityC16811.f49537;
                ((ActivityC16811) obj).finish();
                break;
            default:
                ViewOnClickListenerC20541.m46422((ViewOnClickListenerC20541) obj);
                break;
        }
    }
}
