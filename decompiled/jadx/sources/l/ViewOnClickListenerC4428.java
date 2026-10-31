package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۙۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4428 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14161;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14162;

    public /* synthetic */ ViewOnClickListenerC4428(int i, Object obj) {
        this.f14161 = i;
        this.f14162 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14161) {
            case 0:
                C5839.m16354((C5839) this.f14162);
                break;
            case 1:
                EditText editText = (EditText) this.f14162;
                String strM14330 = C4925.m14330();
                if (strM14330 != null) {
                    editText.setText(strM14330.trim());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                AbstractActivityC12266.m29781((AbstractActivityC12266) this.f14162);
                break;
        }
    }
}
