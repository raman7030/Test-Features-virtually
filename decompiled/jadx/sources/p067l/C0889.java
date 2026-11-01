package p067l;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֨ۜ */
/* JADX INFO: compiled from: 84KN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0889 extends ListView implements InterfaceC1064, InterfaceC1189, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩹ */
    public static final int[] f6348 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ᩸ */
    public C0994 f6349;

    public C0889(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public C0889(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, f6348, i, 0);
        if (c1970M53129.m53135(0)) {
            setBackgroundDrawable(c1970M53129.m53148(0));
        }
        if (c1970M53129.m53135(1)) {
            setDivider(c1970M53129.m53148(1));
        }
        c1970M53129.m53146();
    }

    @Override // p067l.InterfaceC1189
    public final void initialize(C0994 c0994) {
        this.f6349 = c0994;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // p067l.InterfaceC1064
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5681(C1134 c1134) {
        return this.f6349.performItemAction(c1134, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo5681((C1134) getAdapter().getItem(i));
    }
}
