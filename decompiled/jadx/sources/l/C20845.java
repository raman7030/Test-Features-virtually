package l;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes5.dex */
public class C20845 extends C15904 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f67487;

    public C20845(View view) {
        this.f67487 = view;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo22868() {
        View viewFindViewById;
        View view = this.f67487;
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
        viewFindViewById.post(new RunnableC19781(2, viewFindViewById));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22867() {
        View view = this.f67487;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
