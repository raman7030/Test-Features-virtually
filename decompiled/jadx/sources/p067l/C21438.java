package p067l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 515Z */
/* JADX INFO: loaded from: classes5.dex */
public class C21438 extends C4338 {
    /* JADX INFO: renamed from: ֫ */
    public void mo9744(TextView textView, boolean z) {
    }

    public C21438(Context context) {
        super(R.layout.MT_Protector, context, new ArrayList());
    }

    public C21438(Context context, List list) {
        super(R.layout.MT_Protector, context, list);
    }

    @Override // p067l.C4338, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        mo40605(textView, i, false);
        return textView;
    }

    @Override // p067l.C4338, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(C23223.f72986);
        mo40605(textView, i, true);
        return textView;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo40605(TextView textView, int i, boolean z) {
        mo9744(textView, z);
    }

    public C21438(Context context, Object[] objArr) {
        super(R.layout.MT_Protector, context, Arrays.asList(objArr));
    }
}
