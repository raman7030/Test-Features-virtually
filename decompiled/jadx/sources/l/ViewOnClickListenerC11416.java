package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۨۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11416 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34120;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34121;

    public /* synthetic */ ViewOnClickListenerC11416(int i, Object obj) {
        this.f34120 = i;
        this.f34121 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f34120;
        Object obj = this.f34121;
        switch (i) {
            case 0:
                C9340.m24043((C9340) obj);
                break;
            case 1:
                ViewOnClickListenerC19987.m46083((ViewOnClickListenerC19987) obj);
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
                int i3 = ActivityC15196.f46412;
                ((ActivityC15196) obj).finish();
                break;
            default:
                ViewOnClickListenerC19121.m44128((ViewOnClickListenerC19121) obj);
                break;
        }
    }
}
