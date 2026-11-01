package p067l;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩷ۨ */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes5.dex */
public class C1876 extends C1631 {

    /* JADX INFO: renamed from: ֫ */
    public final View f70169;

    public C1876(View view) {
        this.f70169 = view;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo24839() {
        View viewFindViewById;
        View view = this.f70169;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC21169(2, viewFindViewById));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24838() {
        View view = this.f70169;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
