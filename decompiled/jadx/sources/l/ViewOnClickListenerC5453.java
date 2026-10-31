package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۚܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5453 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f16971;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16972;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16973;

    public /* synthetic */ ViewOnClickListenerC5453(Object obj, KeyEvent.Callback callback, int i) {
        this.f16972 = i;
        this.f16973 = obj;
        this.f16971 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16972) {
            case 0:
                ViewOnClickListenerC21681.m48952((ViewOnClickListenerC21681) this.f16973, (View) this.f16971);
                break;
            case 1:
                C8177.m21655((AbstractActivityC3346) this.f16971, ((C8177) this.f16973).f25175);
                break;
            default:
                RadioButton radioButton = (RadioButton) this.f16973;
                RadioButton radioButton2 = (RadioButton) this.f16971;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                break;
        }
    }
}
