package l;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14657 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9720 f44791;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2664 f44792;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14657(C9720 c9720, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, C2664 c2664) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f44791 = c9720;
        this.f44792 = c2664;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f44791.f29458;
        if (zArr != null && zArr[i]) {
            this.f44792.setItemChecked(i, true);
        }
        return view2;
    }
}
