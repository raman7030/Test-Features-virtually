package p067l;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ܳܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C1569 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1324 f47901;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0974 f47902;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569(C1324 c1324, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, C0974 c0974) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f47901 = c1324;
        this.f47902 = c0974;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f47901.f32408;
        if (zArr != null && zArr[i]) {
            this.f47902.setItemChecked(i, true);
        }
        return view2;
    }
}
