package p067l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۙۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6577 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16986;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f16987;

    public /* synthetic */ ViewOnClickListenerC6577(int i, Object obj) {
        this.f16986 = i;
        this.f16987 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16986) {
            case 0:
                C7918.m18279((C7918) this.f16987);
                break;
            case 1:
                EditText editText = (EditText) this.f16987;
                String strM16227 = C7050.m16227();
                if (strM16227 != null) {
                    editText.setText(strM16227.trim());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                AbstractActivityC14026.m31843((AbstractActivityC14026) this.f16987);
                break;
        }
    }
}
