package p067l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۡܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10865 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f30111;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f30112;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30113;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30114;

    public /* synthetic */ ViewOnClickListenerC10865(Object obj, Object obj2, Object obj3, int i) {
        this.f30113 = i;
        this.f30114 = obj;
        this.f30112 = obj2;
        this.f30111 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30113) {
            case 0:
                RadioButton radioButton = (RadioButton) this.f30114;
                RadioButton radioButton2 = (RadioButton) this.f30112;
                EditText editText = (EditText) this.f30111;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                editText.setEnabled(view == radioButton2);
                break;
            default:
                C14566.m33296((C23284) this.f30114, (C14566) this.f30112, (DialogInterfaceC2564) this.f30111);
                break;
        }
    }
}
