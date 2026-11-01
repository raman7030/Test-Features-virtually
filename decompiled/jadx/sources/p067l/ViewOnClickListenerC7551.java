package p067l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۚܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7551 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ KeyEvent.Callback f19812;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19813;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f19814;

    public /* synthetic */ ViewOnClickListenerC7551(Object obj, KeyEvent.Callback callback, int i) {
        this.f19813 = i;
        this.f19814 = obj;
        this.f19812 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19813) {
            case 0:
                ViewOnClickListenerC22974.m51301((ViewOnClickListenerC22974) this.f19814, (View) this.f19812);
                break;
            case 1:
                C10140.m23624((AbstractActivityC5549) this.f19812, ((C10140) this.f19814).f28085);
                break;
            default:
                RadioButton radioButton = (RadioButton) this.f19814;
                RadioButton radioButton2 = (RadioButton) this.f19812;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                break;
        }
    }
}
