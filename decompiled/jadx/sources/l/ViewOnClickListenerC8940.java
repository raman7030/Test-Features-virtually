package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۡܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8940 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27177;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27178;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27179;

    public /* synthetic */ ViewOnClickListenerC8940(Object obj, Object obj2, Object obj3, int i) {
        this.f27178 = i;
        this.f27179 = obj;
        this.f27177 = obj2;
        this.f27176 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27178) {
            case 0:
                RadioButton radioButton = (RadioButton) this.f27179;
                RadioButton radioButton2 = (RadioButton) this.f27177;
                EditText editText = (EditText) this.f27176;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                editText.setEnabled(view == radioButton2);
                break;
            default:
                C12834.m31210((C22007) this.f27179, (C12834) this.f27177, (DialogInterfaceC0206) this.f27176);
                break;
        }
    }
}
