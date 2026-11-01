package p067l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ܽ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18180 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54267;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f54268;

    public /* synthetic */ ViewOnClickListenerC18180(int i, Object obj) {
        this.f54267 = i;
        this.f54268 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f54267) {
            case 0:
                ActivityC12088.m27838((ActivityC12088) this.f54268);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f54268;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    radioButton.setChecked(view == radioButton);
                }
                break;
        }
    }
}
