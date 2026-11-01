package p067l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩷ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC21957 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f69009;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f69010;

    public /* synthetic */ ViewOnFocusChangeListenerC21957(int i, Object obj) {
        this.f69009 = i;
        this.f69010 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f69009) {
            case 0:
                InputMethodManager inputMethodManager = (InputMethodManager) this.f69010;
                if (z) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                break;
            default:
                C7269.m16641((EditText) this.f69010, z);
                break;
        }
    }
}
