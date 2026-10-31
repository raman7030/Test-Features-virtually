package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ܽ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16637 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51087;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51088;

    public /* synthetic */ ViewOnClickListenerC16637(int i, Object obj) {
        this.f51087 = i;
        this.f51088 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f51087) {
            case 0:
                ActivityC10227.m25816((ActivityC10227) this.f51088);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f51088;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    radioButton.setChecked(view == radioButton);
                }
                break;
        }
    }
}
